package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 入库单商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockInBillStockininfo extends TaobaoObject {

	private static final long serialVersionUID = 1736482326189878116L;

	/**
	 * 菜鸟订单编码
	 */
	@ApiField("cn_order_code")
	private String cnOrderCode;

	/**
	 * 仓库订单完成时间
	 */
	@ApiField("confirm_time")
	private Date confirmTime;

	/**
	 * ERP订单号
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 入库单信息
	 */
	@ApiListField("order_item_list")
	@ApiField("cainiao_stock_in_bill_orderitemlist")
	private List<CainiaoStockInBillOrderitemlist> orderItemList;

	/**
	 * 单据类型：  904 普通入库 306 B2B入库单 601 采购入库
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 入库单状态 WMS_ACCEPT 接单成功 WMS_REJECT 接单失败WMS_CONFIRMED 仓库生产完成
	 */
	@ApiField("status")
	private String status;


	public String getCnOrderCode() {
		return this.cnOrderCode;
	}
	public void setCnOrderCode(String cnOrderCode) {
		this.cnOrderCode = cnOrderCode;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public List<CainiaoStockInBillOrderitemlist> getOrderItemList() {
		return this.orderItemList;
	}
	public void setOrderItemList(List<CainiaoStockInBillOrderitemlist> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
