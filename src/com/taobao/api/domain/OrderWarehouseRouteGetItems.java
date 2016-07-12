package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 对象item
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OrderWarehouseRouteGetItems extends TaobaoObject {

	private static final long serialVersionUID = 6363913824658777671L;

	/**
	 * 商品信息
	 */
	@ApiField("item")
	private OrderWarehouseRouteGetItem item;


	public OrderWarehouseRouteGetItem getItem() {
		return this.item;
	}
	public void setItem(OrderWarehouseRouteGetItem item) {
		this.item = item;
	}

}
