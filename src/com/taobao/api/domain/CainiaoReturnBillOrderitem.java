package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 销退订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoReturnBillOrderitem extends TaobaoObject {

	private static final long serialVersionUID = 1682352378816341834L;

	/**
	 * 商品信息
	 */
	@ApiListField("inventory_item_list")
	@ApiField("cainiao_return_bill_inventoryitemlist")
	private List<CainiaoReturnBillInventoryitemlist> inventoryItemList;

	/**
	 * 商家编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品ID
	 */
	@ApiField("order_item_id")
	private String orderItemId;


	public List<CainiaoReturnBillInventoryitemlist> getInventoryItemList() {
		return this.inventoryItemList;
	}
	public void setInventoryItemList(List<CainiaoReturnBillInventoryitemlist> inventoryItemList) {
		this.inventoryItemList = inventoryItemList;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

}
