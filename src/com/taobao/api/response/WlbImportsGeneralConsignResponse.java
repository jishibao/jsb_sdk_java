package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.imports.general.consign response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbImportsGeneralConsignResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7381543876619912677L;

	/** 
	 * 是否发货成功,true:成功，false：失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 发货成功后的物流订单编号
	 */
	@ApiField("lgorder_code")
	private String lgorderCode;

	/** 
	 * 业务错误编码
	 */
	@ApiField("result_error_code")
	private String resultErrorCode;

	/** 
	 * 业务错误描述
	 */
	@ApiField("result_error_msg")
	private String resultErrorMsg;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setLgorderCode(String lgorderCode) {
		this.lgorderCode = lgorderCode;
	}
	public String getLgorderCode( ) {
		return this.lgorderCode;
	}

	public void setResultErrorCode(String resultErrorCode) {
		this.resultErrorCode = resultErrorCode;
	}
	public String getResultErrorCode( ) {
		return this.resultErrorCode;
	}

	public void setResultErrorMsg(String resultErrorMsg) {
		this.resultErrorMsg = resultErrorMsg;
	}
	public String getResultErrorMsg( ) {
		return this.resultErrorMsg;
	}
	


}
