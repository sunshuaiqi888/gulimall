package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性分组
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:30
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分组id
	 */
	@TableId
	private Bigint attrGroupId;
	/**
	 * 组名
	 */
	private Char attrGroupName;
	/**
	 * 排序
	 */
	private Int sort;
	/**
	 * 描述
	 */
	private Varchar descript;
	/**
	 * 组图标
	 */
	private Varchar icon;
	/**
	 * 所属分类id
	 */
	private Bigint catelogId;

}
