package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RefundMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.message.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RefundMessageAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8445891869735266465L;

	/** 
	 * 退款信息。包含id和created
	 */
	@ApiField("refund_message")
	private RefundMessage refundMessage;


	public void setRefundMessage(RefundMessage refundMessage) {
		this.refundMessage = refundMessage;
	}
	public RefundMessage getRefundMessage( ) {
		return this.refundMessage;
	}
	


}
