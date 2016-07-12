package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 子账号基本信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SubAccountInfo extends TaobaoObject {

	private static final long serialVersionUID = 3648651694982349628L;

	/**
	 * 子账号是否参与分流 true:参与分流 false:未参与分流
	 */
	@ApiField("sub_dispatch_status")
	private Boolean subDispatchStatus;

	/**
	 * 子账号Id
	 */
	@ApiField("sub_id")
	private Long subId;

	/**
	 * 子账号用户名
	 */
	@ApiField("sub_nick")
	private String subNick;

	/**
	 * 子账号是否已欠费 true:已欠费 false:未欠费
	 */
	@ApiField("sub_owed_status")
	private Boolean subOwedStatus;

	/**
	 * 子账号当前状态：1正常，2卖家停用，3处罚冻结
	 */
	@ApiField("sub_status")
	private Long subStatus;

	/**
	 * 主账号Id
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 主账号用户名
	 */
	@ApiField("user_nick")
	private String userNick;


	public Boolean getSubDispatchStatus() {
		return this.subDispatchStatus;
	}
	public void setSubDispatchStatus(Boolean subDispatchStatus) {
		this.subDispatchStatus = subDispatchStatus;
	}

	public Long getSubId() {
		return this.subId;
	}
	public void setSubId(Long subId) {
		this.subId = subId;
	}

	public String getSubNick() {
		return this.subNick;
	}
	public void setSubNick(String subNick) {
		this.subNick = subNick;
	}

	public Boolean getSubOwedStatus() {
		return this.subOwedStatus;
	}
	public void setSubOwedStatus(Boolean subOwedStatus) {
		this.subOwedStatus = subOwedStatus;
	}

	public Long getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(Long subStatus) {
		this.subStatus = subStatus;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
