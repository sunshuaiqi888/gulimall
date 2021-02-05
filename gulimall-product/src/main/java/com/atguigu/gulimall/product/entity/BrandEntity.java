package com.atguigu.gulimall.product.entity;

import com.atguigu.common.validate.AddGroupValidate;
import com.atguigu.common.validate.ListValues;
import com.atguigu.common.validate.UpdateGroupValidate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * 品牌
 * 
 * @author 北城墨白
 * @email 956062927@qq.com
 * @date 2020-11-28 10:31:45
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	@NotNull(message = "更新时必须携带ID",groups = {UpdateGroupValidate.class})
	@Null(message = "新增时不能携带id",groups = {AddGroupValidate.class})
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "必须输入品牌名") //至少有一个非空格字符  message自定义提示
	private String name;
	/**
	 * 品牌logo地址
	 */
	@Email
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotNull(message = "不为空",groups = {UpdateGroupValidate.class})
	@ListValues(value = {0,1} ,groups = {UpdateGroupValidate.class})  //自定义注解
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	private String firstLetter;
	/**
	 * 排序
	 */
	private Integer sort;

}
