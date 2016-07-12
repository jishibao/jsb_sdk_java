package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.sku.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsSkuCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7728183527625292375L;

	/** 
	 * 系统自动生成
	 */
	@ApiField("item_id")
	private Long itemId;

	/** 
	 * 错误码
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


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId( ) {
		return this.itemId;
	}

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
