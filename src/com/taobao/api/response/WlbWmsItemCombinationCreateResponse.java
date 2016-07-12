package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.item.combination.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsItemCombinationCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8859887247175197279L;

	/** 
	 * 错误编码
	 */
	@ApiField("wl_error_code")
	private String wlErrorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("wl_error_msg")
	private String wlErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("wl_success")
	private Boolean wlSuccess;


	public void setWlErrorCode(String wlErrorCode) {
		this.wlErrorCode = wlErrorCode;
	}
	public String getWlErrorCode( ) {
		return this.wlErrorCode;
	}

	public void setWlErrorMsg(String wlErrorMsg) {
		this.wlErrorMsg = wlErrorMsg;
	}
	public String getWlErrorMsg( ) {
		return this.wlErrorMsg;
	}

	public void setWlSuccess(Boolean wlSuccess) {
		this.wlSuccess = wlSuccess;
	}
	public Boolean getWlSuccess( ) {
		return this.wlSuccess;
	}
	


}
