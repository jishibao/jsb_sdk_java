package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 库存状态调整
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsInventoryStatusUpload extends TaobaoObject {

	private static final long serialVersionUID = 5621846598664249338L;

	/**
	 * 订单商品信息列表
	 */
	@ApiField("item_list")
	private ItemListWlbWmsInventoryStatusUpload itemList;

	/**
	 * 订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 7
	 */
	@ApiField("order_confirm_time")
	private String orderConfirmTime;

	/**
	 * 711
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 000000000123
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * STORE_000001
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * LBX00001
	 */
	@ApiField("store_order_code")
	private String storeOrderCode;


	public ItemListWlbWmsInventoryStatusUpload getItemList() {
		return this.itemList;
	}
	public void setItemList(ItemListWlbWmsInventoryStatusUpload itemList) {
		this.itemList = itemList;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderConfirmTime() {
		return this.orderConfirmTime;
	}
	public void setOrderConfirmTime(String orderConfirmTime) {
		this.orderConfirmTime = orderConfirmTime;
	}

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreOrderCode() {
		return this.storeOrderCode;
	}
	public void setStoreOrderCode(String storeOrderCode) {
		this.storeOrderCode = storeOrderCode;
	}

}
