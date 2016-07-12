package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoInventoryProfitlossOrderitemlist extends TaobaoObject {

	private static final long serialVersionUID = 7283195871187668174L;

	/**
	 * 损益详情
	 */
	@ApiField("order_item")
	private CainiaoInventoryProfitlossOrderitem orderItem;


	public CainiaoInventoryProfitlossOrderitem getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(CainiaoInventoryProfitlossOrderitem orderItem) {
		this.orderItem = orderItem;
	}

}
