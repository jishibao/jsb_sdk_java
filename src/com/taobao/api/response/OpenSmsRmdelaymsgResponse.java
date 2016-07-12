package com.taobao.api.response;

import com.taobao.api.domain.BmcResultVoid;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.open.sms.rmdelaymsg response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OpenSmsRmdelaymsgResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8448485188414333932L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private BmcResultVoid result;


	public void setResult(BmcResultVoid result) {
		this.result = result;
	}
	public BmcResultVoid getResult( ) {
		return this.result;
	}
	


}
