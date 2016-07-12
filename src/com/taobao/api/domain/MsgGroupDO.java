package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * MsgGroupDO
 *
 * @author top auto create
 * @since 1.0, null
 */
public class MsgGroupDO extends TaobaoObject {

	private static final long serialVersionUID = 8514775885771479789L;

	/**
	 * 123
	 */
	@ApiField("appkey")
	private String appkey;

	/**
	 * 123
	 */
	@ApiField("description")
	private String description;

	/**
	 * 123
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 123
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 123
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 123
	 */
	@ApiField("name")
	private String name;


	public String getAppkey() {
		return this.appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
