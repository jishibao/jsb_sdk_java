package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.BmcResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.open.sms.checkvercode response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OpenSmsCheckvercodeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6814639195352186974L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private BmcResult result;


	public void setResult(BmcResult result) {
		this.result = result;
	}
	public BmcResult getResult( ) {
		return this.result;
	}
	


}
