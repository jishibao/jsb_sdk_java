package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 出库单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockOutBillStockoutinfo extends TaobaoObject {

	private static final long serialVersionUID = 4382531234927187137L;

	/**
	 * 仓库订单编码，LBX号
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
	 * 订单商品列表
	 */
	@ApiListField("order_item_list")
	@ApiField("cainiao_stock_out_bill_orderitemlist")
	private List<CainiaoStockOutBillOrderitemlist> orderItemList;

	/**
	 * 单据类型 903 普通出库单 305 B2B出库单 901 退供出库单
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 包裹信息列表，包含每个包裹使用的快递信息
	 */
	@ApiListField("package_info_list")
	@ApiField("cainiao_stock_out_bill_packageinfolist")
	private List<CainiaoStockOutBillPackageinfolist> packageInfoList;

	/**
	 * 入库单状态
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

	public List<CainiaoStockOutBillOrderitemlist> getOrderItemList() {
		return this.orderItemList;
	}
	public void setOrderItemList(List<CainiaoStockOutBillOrderitemlist> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public List<CainiaoStockOutBillPackageinfolist> getPackageInfoList() {
		return this.packageInfoList;
	}
	public void setPackageInfoList(List<CainiaoStockOutBillPackageinfolist> packageInfoList) {
		this.packageInfoList = packageInfoList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
