package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RefundDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.refund.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoRefundGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6778678441555879241L;

	/** 
	 * 退款详情
	 */
	@ApiField("refund_detail")
	private RefundDetail refundDetail;


	public void setRefundDetail(RefundDetail refundDetail) {
		this.refundDetail = refundDetail;
	}
	public RefundDetail getRefundDetail( ) {
		return this.refundDetail;
	}
	


}
