package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Orderitemlistwlbwmsreturnordernotify extends TaobaoObject {

	private static final long serialVersionUID = 8113881255725844943L;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * 1
	 */
	@ApiField("order_item")
	private Orderitemwlbwmsreturnordernotify orderItem;

	/**
	 * 订单商品ID
	 */
	@ApiField("order_item_id")
	private String orderItemId;

	/**
	 * 交易编码
	 */
	@ApiField("order_source_code")
	private String orderSourceCode;

	/**
	 * 子交易编码
	 */
	@ApiField("sub_source_code")
	private String subSourceCode;


	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Orderitemwlbwmsreturnordernotify getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(Orderitemwlbwmsreturnordernotify orderItem) {
		this.orderItem = orderItem;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getOrderSourceCode() {
		return this.orderSourceCode;
	}
	public void setOrderSourceCode(String orderSourceCode) {
		this.orderSourceCode = orderSourceCode;
	}

	public String getSubSourceCode() {
		return this.subSourceCode;
	}
	public void setSubSourceCode(String subSourceCode) {
		this.subSourceCode = subSourceCode;
	}

}
