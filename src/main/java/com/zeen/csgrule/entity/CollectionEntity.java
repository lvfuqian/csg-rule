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
@TableName("COLLECTION")
public class CollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String collectionid;
	/**
	 * $column.comments
	 */
	private String accountid;
	/**
	 * $column.comments
	 */
	private Date updatetime;
	/**
	 * $column.comments
	 */
	private String contentid;

}
