package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku销售属性&值
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:29
 */
@Data
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Bigint id;
	/**
	 * sku_id
	 */
	private Bigint skuId;
	/**
	 * attr_id
	 */
	private Bigint attrId;
	/**
	 * 销售属性名
	 */
	private Varchar attrName;
	/**
	 * 销售属性值
	 */
	private Varchar attrValue;
	/**
	 * 顺序
	 */
	private Int attrSort;

}
