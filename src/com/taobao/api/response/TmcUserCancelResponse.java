package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.user.cancel response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcUserCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1263984127525367248L;

	/** 
	 * 是否成功,如果为false并且没有错误码，表示删除的用户不存在。
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
