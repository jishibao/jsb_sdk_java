package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 订单商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockOutBillOrderitem extends TaobaoObject {

	private static final long serialVersionUID = 8419338946611514279L;

	/**
	 * 通知数量
	 */
	@ApiField("apply_qty")
	private Long applyQty;

	/**
	 * 商品属性列表
	 */
	@ApiListField("inventory_item_list")
	@ApiField("cainiao_stock_out_bill_inventoryitemlist")
	private List<CainiaoStockOutBillInventoryitemlist> inventoryItemList;

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
	 * order_item_id
	 */
	@ApiField("order_item_id")
	private String orderItemId;


	public Long getApplyQty() {
		return this.applyQty;
	}
	public void setApplyQty(Long applyQty) {
		this.applyQty = applyQty;
	}

	public List<CainiaoStockOutBillInventoryitemlist> getInventoryItemList() {
		return this.inventoryItemList;
	}
	public void setInventoryItemList(List<CainiaoStockOutBillInventoryitemlist> inventoryItemList) {
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
