package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu图片
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:30
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Bigint id;
	/**
	 * spu_id
	 */
	private Bigint spuId;
	/**
	 * 图片名
	 */
	private Varchar imgName;
	/**
	 * 图片地址
	 */
	private Varchar imgUrl;
	/**
	 * 顺序
	 */
	private Int imgSort;
	/**
	 * 是否默认图
	 */
	private Tinyint defaultImg;

}
