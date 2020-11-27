package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评价
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:29
 */
@Data
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
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
	 * spu_id
	 */
	private Bigint spuId;
	/**
	 * 商品名字
	 */
	private Varchar spuName;
	/**
	 * 会员昵称
	 */
	private Varchar memberNickName;
	/**
	 * 星级
	 */
	private Tinyint star;
	/**
	 * 会员ip
	 */
	private Varchar memberIp;
	/**
	 * 创建时间
	 */
	private Datetime createTime;
	/**
	 * 显示状态[0-不显示，1-显示]
	 */
	private Tinyint showStatus;
	/**
	 * 购买时属性组合
	 */
	private Varchar spuAttributes;
	/**
	 * 点赞数
	 */
	private Int likesCount;
	/**
	 * 回复数
	 */
	private Int replyCount;
	/**
	 * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
	 */
	private Varchar resources;
	/**
	 * 内容
	 */
	private Text content;
	/**
	 * 用户头像
	 */
	private Varchar memberIcon;
	/**
	 * 评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
	 */
	private Tinyint commentType;

}
