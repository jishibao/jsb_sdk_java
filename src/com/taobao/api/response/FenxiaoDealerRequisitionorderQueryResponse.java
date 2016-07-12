package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.DealerOrder;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1614853515668588854L;

	/** 
	 * 经销采购单结果列表
	 */
	@ApiListField("dealer_orders")
	@ApiField("dealer_order")
	private List<DealerOrder> dealerOrders;


	public void setDealerOrders(List<DealerOrder> dealerOrders) {
		this.dealerOrders = dealerOrders;
	}
	public List<DealerOrder> getDealerOrders( ) {
		return this.dealerOrders;
	}
	


}
