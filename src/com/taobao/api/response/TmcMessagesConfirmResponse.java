package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.messages.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessagesConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2882264456463942238L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
