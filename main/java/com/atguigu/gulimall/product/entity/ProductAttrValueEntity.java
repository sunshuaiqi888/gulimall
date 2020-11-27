package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu属性值
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:29
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Bigint id;
	/**
	 * 商品id
	 */
	private Bigint spuId;
	/**
	 * 属性id
	 */
	private Bigint attrId;
	/**
	 * 属性名
	 */
	private Varchar attrName;
	/**
	 * 属性值
	 */
	private Varchar attrValue;
	/**
	 * 顺序
	 */
	private Int attrSort;
	/**
	 * 快速展示【是否展示在介绍上；0-否 1-是】
	 */
	private Tinyint quickShow;

}
