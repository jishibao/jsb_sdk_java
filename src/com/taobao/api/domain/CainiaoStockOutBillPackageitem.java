package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 包裹里面的商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockOutBillPackageitem extends TaobaoObject {

	private static final long serialVersionUID = 2242775528525616969L;

	/**
	 * 库存类型1 可销售库存 101残次品
	 */
	@ApiField("inventory_type")
	private Long inventoryType;

	/**
	 * ERP商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 菜鸟商品编码
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 数量
	 */
	@ApiField("item_qty")
	private Long itemQty;

	/**
	 * ERP订单明细ID
	 */
	@ApiField("order_item_id")
	private String orderItemId;


	public Long getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(Long inventoryType) {
		this.inventoryType = inventoryType;
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

	public Long getItemQty() {
		return this.itemQty;
	}
	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

}
