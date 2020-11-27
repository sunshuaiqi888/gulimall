package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌分类关联
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:29
 */
@Data
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Bigint id;
	/**
	 * 品牌id
	 */
	private Bigint brandId;
	/**
	 * 分类id
	 */
	private Bigint catelogId;
	/**
	 * 
	 */
	private Varchar brandName;
	/**
	 * 
	 */
	private Varchar catelogName;

}
