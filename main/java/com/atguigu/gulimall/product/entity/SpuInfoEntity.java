package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:30
 */
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	private Bigint id;
	/**
	 * 商品名称
	 */
	private Varchar spuName;
	/**
	 * 商品描述
	 */
	private Varchar spuDescription;
	/**
	 * 所属分类id
	 */
	private Bigint catalogId;
	/**
	 * 品牌id
	 */
	private Bigint brandId;
	/**
	 * 
	 */
	private Decimal weight;
	/**
	 * 上架状态[0 - 下架，1 - 上架]
	 */
	private Tinyint publishStatus;
	/**
	 * 
	 */
	private Datetime createTime;
	/**
	 * 
	 */
	private Datetime updateTime;

}
