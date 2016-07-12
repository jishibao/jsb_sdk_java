package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.imports.waybill.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbImportsWaybillGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2179948297149885729L;

	/** 
	 * 电子面单链接地址
	 */
	@ApiField("waybillurl")
	private String waybillurl;


	public void setWaybillurl(String waybillurl) {
		this.waybillurl = waybillurl;
	}
	public String getWaybillurl( ) {
		return this.waybillurl;
	}
	


}
