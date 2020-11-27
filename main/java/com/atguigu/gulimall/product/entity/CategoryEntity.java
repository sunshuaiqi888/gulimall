package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品三级分类
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:30
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分类id
	 */
	@TableId
	private Bigint catId;
	/**
	 * 分类名称
	 */
	private Char name;
	/**
	 * 父分类id
	 */
	private Bigint parentCid;
	/**
	 * 层级
	 */
	private Int catLevel;
	/**
	 * 是否显示[0-不显示，1显示]
	 */
	private Tinyint showStatus;
	/**
	 * 排序
	 */
	private Int sort;
	/**
	 * 图标地址
	 */
	private Char icon;
	/**
	 * 计量单位
	 */
	private Char productUnit;
	/**
	 * 商品数量
	 */
	private Int productCount;

}
