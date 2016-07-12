package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.jz.consign response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderJzConsignResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5821969416973488577L;

	/** 
	 * 错误码
	 */
	@ApiField("result_error_code")
	private String resultErrorCode;

	/** 
	 * 错误信息描述
	 */
	@ApiField("result_error_msg")
	private String resultErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("result_success")
	private Boolean resultSuccess;


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

	public void setResultSuccess(Boolean resultSuccess) {
		this.resultSuccess = resultSuccess;
	}
	public Boolean getResultSuccess( ) {
		return this.resultSuccess;
	}
	


}
