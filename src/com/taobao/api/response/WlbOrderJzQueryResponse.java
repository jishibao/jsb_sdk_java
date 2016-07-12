package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.JzTopDto;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.jz.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderJzQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5539799344475943784L;

	/** 
	 * 结果信息
	 */
	@ApiField("result")
	private JzTopDto result;

	/** 
	 * 错误编码
	 */
	@ApiField("result_error_code")
	private String resultErrorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("result_error_msg")
	private String resultErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("result_success")
	private Boolean resultSuccess;


	public void setResult(JzTopDto result) {
		this.result = result;
	}
	public JzTopDto getResult( ) {
		return this.result;
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

	public void setResultSuccess(Boolean resultSuccess) {
		this.resultSuccess = resultSuccess;
	}
	public Boolean getResultSuccess( ) {
		return this.resultSuccess;
	}
	


}
