package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 订单信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OrderItemswlbwmsstockinorderconfirm extends TaobaoObject {

	private static final long serialVersionUID = 8569682932451441133L;

	/**
	 * 是否完成
	 */
	@ApiField("is_completed")
	private Boolean isCompleted;

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
	 * 商品列表
	 */
	@ApiListField("items")
	@ApiField("itemswlbwmsstockinorderconfirmwl")
	private List<Itemswlbwmsstockinorderconfirmwl> items;

	/**
	 * ERP入库单子ID
	 */
	@ApiField("order_item_id")
	private String orderItemId;


	public Boolean getIsCompleted() {
		return this.isCompleted;
	}
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
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

	public List<Itemswlbwmsstockinorderconfirmwl> getItems() {
		return this.items;
	}
	public void setItems(List<Itemswlbwmsstockinorderconfirmwl> items) {
		this.items = items;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

}
