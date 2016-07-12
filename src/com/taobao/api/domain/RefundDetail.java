package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 采购单子单退款详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class RefundDetail extends TaobaoObject {

	private static final long serialVersionUID = 5243833898287456191L;

	/**
	 * 下游买家的退款信息
	 */
	@ApiField("buyer_refund")
	private BuyerRefund buyerRefund;

	/**
	 * 分销商nick
	 */
	@ApiField("distributor_nick")
	private String distributorNick;

	/**
	 * 是否退货
	 */
	@ApiField("is_return_goods")
	private Boolean isReturnGoods;

	/**
	 * 退款修改时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 支付给供应商的金额
	 */
	@ApiField("pay_sup_fee")
	private String paySupFee;

	/**
	 * 主采购单id
	 */
	@ApiField("purchase_order_id")
	private Long purchaseOrderId;

	/**
	 * 退款创建时间
	 */
	@ApiField("refund_create_time")
	private Date refundCreateTime;

	/**
	 * 退款说明
	 */
	@ApiField("refund_desc")
	private String refundDesc;

	/**
	 * 退款的金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款流程类型：
4：发货前退款；
1：发货后退款不退货；
2：发货后退款退货
	 */
	@ApiField("refund_flow_type")
	private Long refundFlowType;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款状态
1：买家已经申请退款，等待卖家同意
2：卖家已经同意退款，等待买家退货
3：买家已经退货，等待卖家确认收货
4：退款关闭
5：退款成功
6：卖家拒绝退款
12：同意退款，待打款
9：没有申请退款
10：卖家拒绝确认收货
	 */
	@ApiField("refund_status")
	private Long refundStatus;

	/**
	 * 子单id
	 */
	@ApiField("sub_order_id")
	private Long subOrderId;

	/**
	 * 供应商nick
	 */
	@ApiField("supplier_nick")
	private String supplierNick;

	/**
	 * 超时时间
	 */
	@ApiField("timeout")
	private Date timeout;

	/**
	 * 超时类型：
1：供应商同意退款/同意退货超时；
2：供应商确认收货超时
	 */
	@ApiField("to_type")
	private Long toType;


	public BuyerRefund getBuyerRefund() {
		return this.buyerRefund;
	}
	public void setBuyerRefund(BuyerRefund buyerRefund) {
		this.buyerRefund = buyerRefund;
	}

	public String getDistributorNick() {
		return this.distributorNick;
	}
	public void setDistributorNick(String distributorNick) {
		this.distributorNick = distributorNick;
	}

	public Boolean getIsReturnGoods() {
		return this.isReturnGoods;
	}
	public void setIsReturnGoods(Boolean isReturnGoods) {
		this.isReturnGoods = isReturnGoods;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getPaySupFee() {
		return this.paySupFee;
	}
	public void setPaySupFee(String paySupFee) {
		this.paySupFee = paySupFee;
	}

	public Long getPurchaseOrderId() {
		return this.purchaseOrderId;
	}
	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Date getRefundCreateTime() {
		return this.refundCreateTime;
	}
	public void setRefundCreateTime(Date refundCreateTime) {
		this.refundCreateTime = refundCreateTime;
	}

	public String getRefundDesc() {
		return this.refundDesc;
	}
	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getRefundFlowType() {
		return this.refundFlowType;
	}
	public void setRefundFlowType(Long refundFlowType) {
		this.refundFlowType = refundFlowType;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public Long getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(Long refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Long getSubOrderId() {
		return this.subOrderId;
	}
	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public String getSupplierNick() {
		return this.supplierNick;
	}
	public void setSupplierNick(String supplierNick) {
		this.supplierNick = supplierNick;
	}

	public Date getTimeout() {
		return this.timeout;
	}
	public void setTimeout(Date timeout) {
		this.timeout = timeout;
	}

	public Long getToType() {
		return this.toType;
	}
	public void setToType(Long toType) {
		this.toType = toType;
	}

}
