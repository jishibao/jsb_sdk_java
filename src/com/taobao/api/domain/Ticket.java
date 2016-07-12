package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 产品规格审核信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Ticket extends TaobaoObject {

	private static final long serialVersionUID = 5149521483827231269L;

	/**
	 * 如果产品规格，需要商家审核，为商家审核用户ID
	 */
	@ApiField("audit_seller_id")
	private Long auditSellerId;

	/**
	 * 创建人ID
	 */
	@ApiField("create_user_id")
	private Long createUserId;

	/**
	 * 产品规格申请时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 产品规格审核单最后修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 关于审核原因，更详细的说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 审核原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 产品规格ID
	 */
	@ApiField("spec_id")
	private Long specId;

	/**
	 * 1, "商家确认"
2, "商家拒绝"
3, "小二确认"
4, "小二拒绝"
5, "待商家处理"
6, "商家审核超时"
7, "待小二审核"
9, "品牌商确认"
10, "免审通过"
14, "免审拒绝"
	 */
	@ApiField("status")
	private Long status;


	public Long getAuditSellerId() {
		return this.auditSellerId;
	}
	public void setAuditSellerId(Long auditSellerId) {
		this.auditSellerId = auditSellerId;
	}

	public Long getCreateUserId() {
		return this.createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getSpecId() {
		return this.specId;
	}
	public void setSpecId(Long specId) {
		this.specId = specId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
