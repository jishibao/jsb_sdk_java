package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Orderitemwlbwmsreturnordernotify extends TaobaoObject {

	private static final long serialVersionUID = 4714283327446819696L;

	/**
	 * 扩展属性, key-value结构，格式要求： 以英文分号“;”分隔每组key-value，以英文冒号“:”分隔key与value。如果value中带有分号，需要转成下划线“_”，如果带有冒号，需要转成中划线“-”
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 后端商品ID
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
	 * 平台交易订单编码,淘系交易请传入交易单号
	 */
	@ApiField("order_item_id")
	private String orderItemId;

	/**
	 * 平台交易订单编码,淘系交易请传入交易单号
	 */
	@ApiField("order_source_code")
	private String orderSourceCode;

	/**
	 * 平台交易子订单编码，交易单号传入，子交易编号必填
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
