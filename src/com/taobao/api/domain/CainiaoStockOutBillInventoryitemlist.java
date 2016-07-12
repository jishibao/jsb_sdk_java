package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品属性列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockOutBillInventoryitemlist extends TaobaoObject {

	private static final long serialVersionUID = 6351695419456678983L;

	/**
	 * 商品属性
	 */
	@ApiField("inventory_item")
	private CainiaoStockOutBillInventoryitem inventoryItem;


	public CainiaoStockOutBillInventoryitem getInventoryItem() {
		return this.inventoryItem;
	}
	public void setInventoryItem(CainiaoStockOutBillInventoryitem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

}
