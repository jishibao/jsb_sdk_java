package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5276788882869587634L;

	/** 
	 * 经销采购申请编号
	 */
	@ApiField("dealer_order_id")
	private Long dealerOrderId;


	public void setDealerOrderId(Long dealerOrderId) {
		this.dealerOrderId = dealerOrderId;
	}
	public Long getDealerOrderId( ) {
		return this.dealerOrderId;
	}
	


}
