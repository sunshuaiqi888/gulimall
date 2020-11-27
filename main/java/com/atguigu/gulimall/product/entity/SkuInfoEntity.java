package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku信息
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:29
 */
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * skuId
	 */
	@TableId
	private Bigint skuId;
	/**
	 * spuId
	 */
	private Bigint spuId;
	/**
	 * sku名称
	 */
	private Varchar skuName;
	/**
	 * sku介绍描述
	 */
	private Varchar skuDesc;
	/**
	 * 所属分类id
	 */
	private Bigint catalogId;
	/**
	 * 品牌id
	 */
	private Bigint brandId;
	/**
	 * 默认图片
	 */
	private Varchar skuDefaultImg;
	/**
	 * 标题
	 */
	private Varchar skuTitle;
	/**
	 * 副标题
	 */
	private Varchar skuSubtitle;
	/**
	 * 价格
	 */
	private Decimal price;
	/**
	 * 销量
	 */
	private Bigint saleCount;

}
