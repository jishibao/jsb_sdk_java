package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 订单状态回传请求数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsOrderStatusUpload extends TaobaoObject {

	private static final long serialVersionUID = 4899536786125332311L;

	/**
	 * 操作内容：物流详情显示
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展属性
	 */
	@ApiField("features")
	private String features;

	/**
	 * 操作时间
	 */
	@ApiField("operate_date")
	private String operateDate;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作人联系方式
	 */
	@ApiField("operator_contact")
	private String operatorContact;

	/**
	 * 仓库订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 仓库订单类型：201 交易出库单（销售出库） 502 换货出库单 503 补发出库单 302 调拨入库单 501退货入库单 （销退入库单 ） 504换货入库 601 采购入库单 901 退供出库单 301 调拨出库单
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 单据状态（WMS_ACCEPT 接单成功，WMS_REJECT 接单失败，WMS_CONFIRMED 仓库生产完成, WMS_CANCEL 取消仓库发货，WMS_ ARRIVALREGISTER 到货登记, WMS_ONSALE 上架完成,WMS_RECEIVED 收货完成, WMS_PICKED 拣货完成, WMS_CHECKED 复核完成, WMS_PACKAGED 打包完成,TMS_SIGN 买家签收，TMS_REJECT 买家拒签）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库订单编码
	 */
	@ApiField("store_order_code")
	private String storeOrderCode;


	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getFeatures() {
		return this.features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}

	public String getOperateDate() {
		return this.operateDate;
	}
	public void setOperateDate(String operateDate) {
		this.operateDate = operateDate;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorContact() {
		return this.operatorContact;
	}
	public void setOperatorContact(String operatorContact) {
		this.operatorContact = operatorContact;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreOrderCode() {
		return this.storeOrderCode;
	}
	public void setStoreOrderCode(String storeOrderCode) {
		this.storeOrderCode = storeOrderCode;
	}

}
