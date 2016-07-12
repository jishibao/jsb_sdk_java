package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 判定服务是否可达的返回结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AddressReachableResult extends TaobaoObject {

	private static final long serialVersionUID = 8233213527758897396L;

	/**
	 * 区域编码
	 */
	@ApiField("division_id")
	private Long divisionId;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 物流公司代号
	 */
	@ApiField("partner_code")
	private String partnerCode;

	/**
	 * 物流公司编码ID
	 */
	@ApiField("partner_id")
	private Long partnerId;

	/**
	 * 物流公司名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 服务是否可达，    0 - 不可达    1 - 可达    2 - 不确定  
	 */
	@ApiField("reachable")
	private Long reachable;

	/**
	 * 服务对应的数字编码，如揽派范围对应88
	 */
	@ApiField("service_type")
	private Long serviceType;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public Long getDivisionId() {
		return this.divisionId;
	}
	public void setDivisionId(Long divisionId) {
		this.divisionId = divisionId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	public Long getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public Long getReachable() {
		return this.reachable;
	}
	public void setReachable(Long reachable) {
		this.reachable = reachable;
	}

	public Long getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
