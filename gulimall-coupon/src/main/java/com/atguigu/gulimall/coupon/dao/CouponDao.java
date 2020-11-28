package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author 北城墨白
 * @email 956062927@qq.com
 * @date 2020-11-28 11:43:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
