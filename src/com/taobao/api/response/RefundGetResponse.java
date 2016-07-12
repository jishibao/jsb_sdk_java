package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Refund;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RefundGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6448287398939797698L;

	/** 
	 * 退款详情
	 */
	@ApiField("refund")
	private Refund refund;


	public void setRefund(Refund refund) {
		this.refund = refund;
	}
	public Refund getRefund( ) {
		return this.refund;
	}
	


}
