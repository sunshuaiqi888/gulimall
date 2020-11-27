package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:30
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	private Bigint brandId;
	/**
	 * 品牌名
	 */
	private Char name;
	/**
	 * 品牌logo地址
	 */
	private Varchar logo;
	/**
	 * 介绍
	 */
	private Longtext descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	private Tinyint showStatus;
	/**
	 * 检索首字母
	 */
	private Char firstLetter;
	/**
	 * 排序
	 */
	private Int sort;

}
