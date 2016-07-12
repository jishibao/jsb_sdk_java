package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 入库订单确认请求
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Requestwlbwmsstockinorderconfirm extends TaobaoObject {

	private static final long serialVersionUID = 7164465436942865878L;

	/**
	 * 支持出入库单多次确认，多次收货后确认时  0 最后一次确认或是一次性确认；1 多次确认；当多次确认时，确认的ITEM种类全部被确认时，确认完成默认值为 0 例如输入2认为是0
	 */
	@ApiField("confirm_type")
	private Long confirmType;

	/**
	 * ERP订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 仓库订单入库时间
	 */
	@ApiField("order_confirm_time")
	private String orderConfirmTime;

	/**
	 * 订单商品列表
	 */
	@ApiListField("order_items")
	@ApiField("order_itemswlbwmsstockinorderconfirm")
	private List<OrderItemswlbwmsstockinorderconfirm> orderItems;

	/**
	 * 单据类型(501销退入库单、504换货入库单、504换货入库单、601采购入库单、904其他入库单）
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 外部业务编码，类似消息ID，多次确认时，每次传入要求唯一；
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 仓配订单编码
	 */
	@ApiField("store_order_code")
	private String storeOrderCode;


	public Long getConfirmType() {
		return this.confirmType;
	}
	public void setConfirmType(Long confirmType) {
		this.confirmType = confirmType;
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

	public List<OrderItemswlbwmsstockinorderconfirm> getOrderItems() {
		return this.orderItems;
	}
	public void setOrderItems(List<OrderItemswlbwmsstockinorderconfirm> orderItems) {
		this.orderItems = orderItems;
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

	public String getStoreOrderCode() {
		return this.storeOrderCode;
	}
	public void setStoreOrderCode(String storeOrderCode) {
		this.storeOrderCode = storeOrderCode;
	}

}
