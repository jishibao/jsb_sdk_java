package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Orderitemlistwlbwmsstockinordernotifywl extends TaobaoObject {

	private static final long serialVersionUID = 4526481964561597853L;

	/**
	 * 订单商品
	 */
	@ApiField("order_item")
	private Orderitemwlbwmsstockinordernotifywl orderItem;


	public Orderitemwlbwmsstockinordernotifywl getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(Orderitemwlbwmsstockinordernotifywl orderItem) {
		this.orderItem = orderItem;
	}

}
