package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.baichuan.message.sendNotification response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class BaichuanMessageSendNotificationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7287123378175576988L;

	/** 
	 * 返回的数据
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 状态吗
	 */
	@ApiField("status_code")
	private Long statusCode;

	/** 
	 * 返回状态的描述
	 */
	@ApiField("status_message")
	private String statusMessage;

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

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}
	public Long getStatusCode( ) {
		return this.statusCode;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getStatusMessage( ) {
		return this.statusMessage;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}
	public Boolean getSuccessful( ) {
		return this.successful;
	}
	


}
