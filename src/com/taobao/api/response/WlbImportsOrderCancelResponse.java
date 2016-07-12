package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.imports.order.cancel response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbImportsOrderCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4577854625289156643L;

	/** 
	 * 是否取消订单成功，true：成功，false：失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

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
