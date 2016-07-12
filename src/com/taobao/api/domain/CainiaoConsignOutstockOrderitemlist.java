package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoConsignOutstockOrderitemlist extends TaobaoObject {

	private static final long serialVersionUID = 2399835633145818224L;

	/**
	 * 订单详情
	 */
	@ApiField("order_item")
	private CainiaoConsignOutstockOrderitem orderItem;


	public CainiaoConsignOutstockOrderitem getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(CainiaoConsignOutstockOrderitem orderItem) {
		this.orderItem = orderItem;
	}

}
