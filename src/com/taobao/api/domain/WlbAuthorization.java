package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 授权关系
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbAuthorization extends TaobaoObject {

	private static final long serialVersionUID = 7197184287349854651L;

	/**
	 * 授权结束时间
	 */
	@ApiField("authorize_end_time")
	private Date authorizeEndTime;

	/**
	 * 授权ID
	 */
	@ApiField("authorize_id")
	private Long authorizeId;

	/**
	 * 授权开始时间
	 */
	@ApiField("authorize_start_time")
	private Date authorizeStartTime;

	/**
	 * 代销人用户ID
	 */
	@ApiField("consign_user_id")
	private Long consignUserId;

	/**
	 * 授权商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 授权名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 货主用户ID
	 */
	@ApiField("owner_user_id")
	private Long ownerUserId;

	/**
	 * 授权数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 授权编码
	 */
	@ApiField("rule_code")
	private String ruleCode;

	/**
	 * 状态：
VALID -- 1 有效
INVALIDATION -- 2 失效
	 */
	@ApiField("status")
	private String status;


	public Date getAuthorizeEndTime() {
		return this.authorizeEndTime;
	}
	public void setAuthorizeEndTime(Date authorizeEndTime) {
		this.authorizeEndTime = authorizeEndTime;
	}

	public Long getAuthorizeId() {
		return this.authorizeId;
	}
	public void setAuthorizeId(Long authorizeId) {
		this.authorizeId = authorizeId;
	}

	public Date getAuthorizeStartTime() {
		return this.authorizeStartTime;
	}
	public void setAuthorizeStartTime(Date authorizeStartTime) {
		this.authorizeStartTime = authorizeStartTime;
	}

	public Long getConsignUserId() {
		return this.consignUserId;
	}
	public void setConsignUserId(Long consignUserId) {
		this.consignUserId = consignUserId;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOwnerUserId() {
		return this.ownerUserId;
	}
	public void setOwnerUserId(Long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
