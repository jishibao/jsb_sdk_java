package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Order;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.ordersku.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeOrderskuUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3785954794164978911L;

	/** 
	 * 只返回oid和modified
	 */
	@ApiField("order")
	private Order order;


	public void setOrder(Order order) {
		this.order = order;
	}
	public Order getOrder( ) {
		return this.order;
	}
	


}
