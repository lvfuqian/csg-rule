package com.zeen.csgrule.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ${comments}
 * 
 * @author taemin
 * @email ${email}
 * @date 2019-06-13 16:02:40
 */
@Data
@TableName("ACCOUNT")
public class AccountEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String accountid;
	/**
	 * $column.comments
	 */
	private String compellation;
	/**
	 * $column.comments
	 */
	private String mobile;
	/**
	 * $column.comments
	 */
	private String password;
	/**
	 * $column.comments
	 */
	private String sex;
	/**
	 * $column.comments
	 */
	private String age;
	/**
	 * $column.comments
	 */
	private Date updatetime;
	/**
	 * $column.comments
	 */
	private Date logintime;
	/**
	 * $column.comments
	 */
	private String state;
	/**
	 * $column.comments
	 */
	private String logo;
	/**
	 * $column.comments
	 */
	private String groupid;

}
