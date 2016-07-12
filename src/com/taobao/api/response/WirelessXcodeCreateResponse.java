package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.XCodeTo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wireless.xcode.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WirelessXcodeCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1638518123345385686L;

	/** 
	 * 创建二维码/短连接 返回信息
	 */
	@ApiField("xcode")
	private XCodeTo xcode;


	public void setXcode(XCodeTo xcode) {
		this.xcode = xcode;
	}
	public XCodeTo getXcode( ) {
		return this.xcode;
	}
	


}
