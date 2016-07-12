package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 仓库收货商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockInBillInventoryitemlist extends TaobaoObject {

	private static final long serialVersionUID = 1311334382255834479L;

	/**
	 * 仓库收货商品信息
	 */
	@ApiField("inventory_item")
	private CainiaoStockInBillInventoryitem inventoryItem;


	public CainiaoStockInBillInventoryitem getInventoryItem() {
		return this.inventoryItem;
	}
	public void setInventoryItem(CainiaoStockInBillInventoryitem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

}
