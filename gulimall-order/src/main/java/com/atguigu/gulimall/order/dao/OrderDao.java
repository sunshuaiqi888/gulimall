package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author 北城墨白
 * @email 956062927@qq.com
 * @date 2020-11-28 12:11:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
