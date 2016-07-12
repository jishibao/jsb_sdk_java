package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * RoomType（房型）结构。各字段详细说明可参考接口定义，如：房型发布接口。
 *
 * @author top auto create
 * @since 1.0, null
 */
public class RoomType extends TaobaoObject {

	private static final long serialVersionUID = 7672168746811856298L;

	/**
	 * 某卖家提供的房型别名(注：该字段将被废弃)
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 房型审核被否决的原因
	 */
	@ApiField("audit_deny_reason")
	private String auditDenyReason;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 酒店id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * 修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 房型名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 房型id
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * 状态。0：待审核，1：正常（审核通过），2：审核否决，3：停售
	 */
	@ApiField("status")
	private Long status;


	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getAuditDenyReason() {
		return this.auditDenyReason;
	}
	public void setAuditDenyReason(String auditDenyReason) {
		this.auditDenyReason = auditDenyReason;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
