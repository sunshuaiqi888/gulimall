package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品属性
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:30
 */
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 属性id
	 */
	@TableId
	private Bigint attrId;
	/**
	 * 属性名
	 */
	private Char attrName;
	/**
	 * 是否需要检索[0-不需要，1-需要]
	 */
	private Tinyint searchType;
	/**
	 * 属性图标
	 */
	private Varchar icon;
	/**
	 * 可选值列表[用逗号分隔]
	 */
	private Char valueSelect;
	/**
	 * 属性类型[0-销售属性，1-基本属性
	 */
	private Tinyint attrType;
	/**
	 * 启用状态[0 - 禁用，1 - 启用]
	 */
	private Bigint enable;
	/**
	 * 所属分类
	 */
	private Bigint catelogId;
	/**
	 * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
	 */
	private Tinyint showDesc;

}
