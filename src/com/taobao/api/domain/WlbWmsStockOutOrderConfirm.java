package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 出库订单确认信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 4486642562176647641L;

	/**
	 * 运输公司名称
	 */
	@ApiField("carriers_name")
	private String carriersName;

	/**
	 * 支持出入库单多次确认 0 最后一次确认或是一次性确认；1 多次确认；当多次确认时，确认的ITEM种类全部被确认时，确认完成默  认值为 0 例如输入2认为是0
	 */
	@ApiField("confirm_type")
	private Long confirmType;

	/**
	 * 仓库订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 订单出库时间
	 */
	@ApiField("order_confirm_time")
	private String orderConfirmTime;

	/**
	 * 订单商品信息
	 */
	@ApiField("order_items")
	private OrderItemsWlbWmsStockOutOrderConfirm orderItems;

	/**
	 * 单据类型301 调拨出库单303 领用出库单901 退供出库单903 其他出库单
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 外部业务编码，消息ID，用于去重一个合作伙伴中要求唯一
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 包裹信息
	 */
	@ApiField("package_infos")
	private PackageInfosWlbWmsStockOutOrderConfirm packageInfos;

	/**
	 * 仓配订单编码
	 */
	@ApiField("store_order_code")
	private String storeOrderCode;

	/**
	 * 运单号或者是托运单号
	 */
	@ApiField("tms_order_code")
	private String tmsOrderCode;

	/**
	 * 总包裹数
	 */
	@ApiField("total_package_qty")
	private Long totalPackageQty;

	/**
	 * 总体积，单位立方厘米
	 */
	@ApiField("total_package_volume")
	private Long totalPackageVolume;

	/**
	 * 总重量，单位克
	 */
	@ApiField("total_package_weight")
	private Long totalPackageWeight;


	public String getCarriersName() {
		return this.carriersName;
	}
	public void setCarriersName(String carriersName) {
		this.carriersName = carriersName;
	}

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

	public OrderItemsWlbWmsStockOutOrderConfirm getOrderItems() {
		return this.orderItems;
	}
	public void setOrderItems(OrderItemsWlbWmsStockOutOrderConfirm orderItems) {
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

	public PackageInfosWlbWmsStockOutOrderConfirm getPackageInfos() {
		return this.packageInfos;
	}
	public void setPackageInfos(PackageInfosWlbWmsStockOutOrderConfirm packageInfos) {
		this.packageInfos = packageInfos;
	}

	public String getStoreOrderCode() {
		return this.storeOrderCode;
	}
	public void setStoreOrderCode(String storeOrderCode) {
		this.storeOrderCode = storeOrderCode;
	}

	public String getTmsOrderCode() {
		return this.tmsOrderCode;
	}
	public void setTmsOrderCode(String tmsOrderCode) {
		this.tmsOrderCode = tmsOrderCode;
	}

	public Long getTotalPackageQty() {
		return this.totalPackageQty;
	}
	public void setTotalPackageQty(Long totalPackageQty) {
		this.totalPackageQty = totalPackageQty;
	}

	public Long getTotalPackageVolume() {
		return this.totalPackageVolume;
	}
	public void setTotalPackageVolume(Long totalPackageVolume) {
		this.totalPackageVolume = totalPackageVolume;
	}

	public Long getTotalPackageWeight() {
		return this.totalPackageWeight;
	}
	public void setTotalPackageWeight(Long totalPackageWeight) {
		this.totalPackageWeight = totalPackageWeight;
	}

}
