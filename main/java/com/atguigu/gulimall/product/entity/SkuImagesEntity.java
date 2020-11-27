package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku图片
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:29
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
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
	 * 图片地址
	 */
	private Varchar imgUrl;
	/**
	 * 排序
	 */
	private Int imgSort;
	/**
	 * 默认图[0 - 不是默认图，1 - 是默认图]
	 */
	private Int defaultImg;

}
