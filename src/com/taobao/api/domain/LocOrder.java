package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class LocOrder extends TaobaoObject {

	private static final long serialVersionUID = 2385325956422569973L;

	/**
	 * 物流承运商
	 */
	@ApiField("carrier")
	private String carrier;

	/**
	 * 费用币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 关税
	 */
	@ApiField("customs_fee")
	private Long customsFee;

	/**
	 * 物流订单号
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 运费
	 */
	@ApiField("shipping_fee")
	private Long shippingFee;

	/**
	 * 物流订单状态编码
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 订单状态中文描述
	 */
	@ApiField("status_code_desc")
	private String statusCodeDesc;

	/**
	 * 物流运单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	/**
	 * 交易订单号
	 */
	@ApiField("trade_id")
	private Long tradeId;

	/**
	 * 重量
	 */
	@ApiField("weight")
	private Long weight;

	/**
	 * 重量单位
	 */
	@ApiField("weight_unit")
	private String weightUnit;


	public String getCarrier() {
		return this.carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getCustomsFee() {
		return this.customsFee;
	}
	public void setCustomsFee(Long customsFee) {
		this.customsFee = customsFee;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Long getShippingFee() {
		return this.shippingFee;
	}
	public void setShippingFee(Long shippingFee) {
		this.shippingFee = shippingFee;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusCodeDesc() {
		return this.statusCodeDesc;
	}
	public void setStatusCodeDesc(String statusCodeDesc) {
		this.statusCodeDesc = statusCodeDesc;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

	public Long getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public String getWeightUnit() {
		return this.weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

}
