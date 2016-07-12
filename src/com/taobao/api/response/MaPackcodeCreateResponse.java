package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ma.packcode.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class MaPackcodeCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4626571187287996934L;

	/** 
	 * 生成包裹码二维码图片链接
	 */
	@ApiField("qrcodeurl")
	private String qrcodeurl;


	public void setQrcodeurl(String qrcodeurl) {
		this.qrcodeurl = qrcodeurl;
	}
	public String getQrcodeurl( ) {
		return this.qrcodeurl;
	}
	


}
