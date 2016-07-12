package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wireless.bunting.item.shorturl.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WirelessBuntingItemShorturlCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5281944411496927795L;

	/** 
	 * 短地址
	 */
	@ApiField("shorturl")
	private String shorturl;


	public void setShorturl(String shorturl) {
		this.shorturl = shorturl;
	}
	public String getShorturl( ) {
		return this.shorturl;
	}
	


}
