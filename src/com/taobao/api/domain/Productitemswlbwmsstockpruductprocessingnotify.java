package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 成品商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Productitemswlbwmsstockpruductprocessingnotify extends TaobaoObject {

	private static final long serialVersionUID = 4471872481875873523L;

	/**
	 * 商品列表
	 */
	@ApiField("order_item")
	private Orderitemwlbwmsstockpruductprocessingnotify orderItem;


	public Orderitemwlbwmsstockpruductprocessingnotify getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(Orderitemwlbwmsstockpruductprocessingnotify orderItem) {
		this.orderItem = orderItem;
	}

}
