package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author ±±³ÇÄ«°×
 * @email 956062927@qq.com
 * @date 2020-11-27 15:59:29
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Bigint id;
	/**
	 * 
	 */
	private Bigint branchId;
	/**
	 * 
	 */
	private Varchar xid;
	/**
	 * 
	 */
	private Varchar context;
	/**
	 * 
	 */
	private Longblob rollbackInfo;
	/**
	 * 
	 */
	private Int logStatus;
	/**
	 * 
	 */
	private Datetime logCreated;
	/**
	 * 
	 */
	private Datetime logModified;
	/**
	 * 
	 */
	private Varchar ext;

}
