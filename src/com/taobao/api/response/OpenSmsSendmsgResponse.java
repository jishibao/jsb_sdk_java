package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.BmcResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.open.sms.sendmsg response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OpenSmsSendmsgResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1768849237118433752L;

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
