package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import com.atguigu.gulimall.product.dao.AttrAttrgroupRelationDao;
import com.atguigu.gulimall.product.dao.AttrDao;
import com.atguigu.gulimall.product.dao.AttrGroupDao;
import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.atguigu.gulimall.product.entity.AttrEntity;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.AttrService;
import com.atguigu.gulimall.product.vo.AttrRespVo;
import com.atguigu.gulimall.product.vo.AttrVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Autowired(required = false)
    AttrAttrgroupRelationDao attrAttrgroupRelationDao;

    @Autowired(required = false)
    AttrGroupDao attrGroupDao;

    @Autowired(required = false)
    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 保存属性信息及关联信息
     * @param attr
     */
    @Transactional//事务注解
    @Override
    public void saveAttr(AttrVo attr) {


        AttrEntity attrPo = new AttrEntity();
        BeanUtils.copyProperties(attr,attrPo);
        //1.保存基本数据
        this.save(attrPo);

        //2.保存关联分组信息
        AttrAttrgroupRelationEntity attrAttrgroupRelationEntity = new AttrAttrgroupRelationEntity();
        attrAttrgroupRelationEntity.setAttrGroupId(attr.getAttrGroupId());
        attrAttrgroupRelationEntity.setAttrId(attrPo.getAttrId());
        attrAttrgroupRelationDao.insert(attrAttrgroupRelationEntity);

    }

    /**
     * 获取分组列表
     * @param params
     * @param catelogId
     * @return
     */
    @Override
    public PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId) {

        QueryWrapper<AttrEntity> queryWrapper = new QueryWrapper<>();
        if (catelogId != 0){
            queryWrapper.eq("catelog_id",catelogId);
        }

        String key = (String) params.get("key");
        if (!StringUtils.isEmpty(key)){
            queryWrapper.and((wrapper)->{
                wrapper.eq("catelog_id",key).or().like("attr_name",key);
            });
        }

        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                queryWrapper
        );

        PageUtils data = new PageUtils(page);
        List<AttrEntity> records = page.getRecords();
        //使用lambda处理业务,将数据库返回的list逐个新增两个业务数据
        List<AttrRespVo> new_records = records.stream().map((attrEntity) -> {
            AttrRespVo attrRespVo = new AttrRespVo();
            BeanUtils.copyProperties(attrEntity, attrRespVo);

            //给前端返回的数据中添加分类名字和分组名字
            AttrAttrgroupRelationEntity attrAttrgroupRelationEntity =
                    attrAttrgroupRelationDao.selectOne(new QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", attrRespVo.getAttrId()));
            if (null != attrAttrgroupRelationEntity) {
                attrRespVo.setGroupName(attrGroupDao.selectById(attrAttrgroupRelationEntity.getAttrGroupId()).getAttrGroupName());
            }

            CategoryEntity categoryEntity = categoryDao.selectById(attrRespVo.getCatelogId());
            if (null != categoryEntity) {
                attrRespVo.setCatelogName(categoryEntity.getName());
            }

            return attrRespVo;
        }).collect(Collectors.toList());

        data.setList(new_records);
        return data;
    }

    /**
     * 获取分组的完整路径
     * @param attrId
     * @return
     */
    @Override
    public AttrRespVo getAttrInfo(Long attrId) {

        AttrRespVo attrRespVo = new AttrRespVo();
        AttrEntity attrEntity = this.getById(attrId);
        BeanUtils.copyProperties(attrEntity,attrRespVo);

        return null;
    }

}