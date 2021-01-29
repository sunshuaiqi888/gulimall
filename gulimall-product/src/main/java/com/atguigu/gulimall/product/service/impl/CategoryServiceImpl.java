package com.atguigu.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    //这是传统的方式注入的
//    @Autowired
//    CategoryDao dao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查出所有商品以及父级分类,返回树形结构
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 1.查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        // 2.组装树形结构
        // 1> 一级分类
        List<CategoryEntity> collect1 = categoryEntities.stream().filter(categoryEntitie ->
             categoryEntitie.getParentCid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildrenList(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort() == null? 0:menu1.getSort()) - (menu2.getSort() == null? 0 : menu2.getSort());
        }).collect(Collectors.toList());


        return collect1;
    }




    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrenList(CategoryEntity root,List<CategoryEntity> all){

        List<CategoryEntity> childrens = all.stream().filter(item -> {
            return item.getParentCid() == root.getCatId();
        }).map(item -> {
            item.setChildren(getChildrenList(item, all));
            return item;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() ==null ? 0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return childrens;
    }


    /**
     * 根据ids删除指定菜单
     * @param longs
     */
    @Override
    public void removeMenuByIds(List<Long> longs) {
        //TODO 检查当前的菜单是否被别的地方所引用
        baseMapper.deleteBatchIds(longs);
    }

}