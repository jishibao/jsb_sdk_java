package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 销退订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoReturnBillInventoryitemlist extends TaobaoObject {

	private static final long serialVersionUID = 4445525336168135727L;

	/**
	 * 订单详情
	 */
	@ApiField("inventory_item")
	private CainiaoReturnBillInventoryitem inventoryItem;


	public CainiaoReturnBillInventoryitem getInventoryItem() {
		return this.inventoryItem;
	}
	public void setInventoryItem(CainiaoReturnBillInventoryitem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

}
