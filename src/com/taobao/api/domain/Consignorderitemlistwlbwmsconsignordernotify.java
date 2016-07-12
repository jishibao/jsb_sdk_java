package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 仓库物流订单信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Consignorderitemlistwlbwmsconsignordernotify extends TaobaoObject {

	private static final long serialVersionUID = 3887463772998944951L;

	/**
	 * 仓库物流订单信息列表
	 */
	@ApiField("consign_order_item")
	private Consignorderitemwlbwmsconsignordernotify consignOrderItem;


	public Consignorderitemwlbwmsconsignordernotify getConsignOrderItem() {
		return this.consignOrderItem;
	}
	public void setConsignOrderItem(Consignorderitemwlbwmsconsignordernotify consignOrderItem) {
		this.consignOrderItem = consignOrderItem;
	}

}
