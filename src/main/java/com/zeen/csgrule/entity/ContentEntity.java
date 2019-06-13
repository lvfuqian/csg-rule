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
@TableName("CONTENT")
public class ContentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String contentid;
	/**
	 * $column.comments
	 */
	private String accountid;
	/**
	 * 内容信息
	 */
	private String content;
	/**
	 * $column.comments
	 */
	private Date updatetime;
	/**
	 * 审核状态（1.已审核，0.未审核）
	 */
	private String state;

}
