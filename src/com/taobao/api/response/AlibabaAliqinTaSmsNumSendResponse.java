package com.taobao.api.response;

import com.taobao.api.domain.BizResult;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alibaba.aliqin.ta.sms.num.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAliqinTaSmsNumSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4761915476812913638L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private BizResult result;


	public void setResult(BizResult result) {
		this.result = result;
	}
	public BizResult getResult( ) {
		return this.result;
	}
	


}
