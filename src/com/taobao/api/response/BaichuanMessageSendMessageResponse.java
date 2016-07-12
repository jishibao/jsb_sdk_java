package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.baichuan.message.sendMessage response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class BaichuanMessageSendMessageResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8134257447696288196L;

	/** 
	 * 返回的数据
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 返回状态的描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 状态吗
	 */
	@ApiField("status_code")
	private Long statusCode;

	/** 
	 * 是否成功
	 */
	@ApiField("successful")
	private Boolean successful;


	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}
	public Long getStatusCode( ) {
		return this.statusCode;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}
	public Boolean getSuccessful( ) {
		return this.successful;
	}
	


}
