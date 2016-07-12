package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 仓库物流订单信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Consignorderitemwlbwmsconsignordernotify extends TaobaoObject {

	private static final long serialVersionUID = 8379343185183644371L;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品数量
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * ERP订单明细行号ID
	 */
	@ApiField("order_item_id")
	private String orderItemId;


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

	public Long getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

}
