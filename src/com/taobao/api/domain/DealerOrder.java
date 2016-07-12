package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 采购申请和经销采购单
 *
 * @author top auto create
 * @since 1.0, null
 */
public class DealerOrder extends TaobaoObject {

	private static final long serialVersionUID = 4337837729338793251L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 申请时间
	 */
	@ApiField("applied_time")
	private Date appliedTime;

	/**
	 * 分销商nick
	 */
	@ApiField("applier_nick")
	private String applierNick;

	/**
	 * 分销商最后一次确认/申请/拒绝的时间
	 */
	@ApiField("audit_time_applier")
	private Date auditTimeApplier;

	/**
	 * 供应商最后一次审核通过/修改/驳回的时间
	 */
	@ApiField("audit_time_supplier")
	private Date auditTimeSupplier;

	/**
	 * 关闭原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 产品明细
	 */
	@ApiListField("dealer_order_details")
	@ApiField("dealer_order_detail")
	private List<DealerOrderDetail> dealerOrderDetails;

	/**
	 * 经销采购单编号，API发货使用此字段
	 */
	@ApiField("dealer_order_id")
	private Long dealerOrderId;

	/**
	 * 已发货数量
	 */
	@ApiField("delivered_quantity_count")
	private Long deliveredQuantityCount;

	/**
	 * 物流费用(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
	 */
	@ApiField("logistics_fee")
	private String logisticsFee;

	/**
	 * 物流方式：
SELF_PICKUP（自提）、LOGISTICS（物流发货)
	 */
	@ApiField("logistics_type")
	private String logisticsType;

	/**
	 * 修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * WAIT_FOR_SUPPLIER_AUDIT1：分销商提交申请，待供应商审核；
SUPPLIER_REFUSE：供应商驳回申请，待分销商确认；
WAIT_FOR_APPLIER_AUDIT：供应商修改后，待分销商确认；
WAIT_FOR_SUPPLIER_AUDIT2：分销商拒绝修改，待供应商再审核；
BOTH_AGREE_WAIT_PAY：审核通过下单成功，待分销商付款
WAIT_FOR_SUPPLIER_DELIVER：付款成功，待供应商发货；
WAIT_FOR_APPLIER_STORAGE：供应商发货，待分销商收货；
TRADE_FINISHED：分销商收货，交易成功；
TRADE_CLOSED：经销采购单关闭。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 付款时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付方式：
ALIPAY_SURETY（支付宝担保交易）
TRANSFER（线下转账）
PREPAY（预存款）
IMMEDIATELY（即时到账）
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 总采购数量
	 */
	@ApiField("quantity_count")
	private Long quantityCount;

	/**
	 * 收货人信息
	 */
	@ApiField("receiver")
	private Receiver receiver;

	/**
	 * 分销商拒绝供应商修改的原因
	 */
	@ApiField("refuse_reason_applier")
	private String refuseReasonApplier;

	/**
	 * 供应商驳回申请的原因
	 */
	@ApiField("refuse_reason_supplier")
	private String refuseReasonSupplier;

	/**
	 * 供应商备注。
仅供应商可见。
	 */
	@ApiField("supplier_memo")
	private String supplierMemo;

	/**
	 * 供应商备注旗帜。
1:红色 2:黄色 3:绿色 4:蓝色 5:粉红色。
仅供应商可见。
	 */
	@ApiField("supplier_memo_flag")
	private Long supplierMemoFlag;

	/**
	 * 供应商nick
	 */
	@ApiField("supplier_nick")
	private String supplierNick;

	/**
	 * 采购总价(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
	 */
	@ApiField("total_price")
	private String totalPrice;


	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public Date getAppliedTime() {
		return this.appliedTime;
	}
	public void setAppliedTime(Date appliedTime) {
		this.appliedTime = appliedTime;
	}

	public String getApplierNick() {
		return this.applierNick;
	}
	public void setApplierNick(String applierNick) {
		this.applierNick = applierNick;
	}

	public Date getAuditTimeApplier() {
		return this.auditTimeApplier;
	}
	public void setAuditTimeApplier(Date auditTimeApplier) {
		this.auditTimeApplier = auditTimeApplier;
	}

	public Date getAuditTimeSupplier() {
		return this.auditTimeSupplier;
	}
	public void setAuditTimeSupplier(Date auditTimeSupplier) {
		this.auditTimeSupplier = auditTimeSupplier;
	}

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public List<DealerOrderDetail> getDealerOrderDetails() {
		return this.dealerOrderDetails;
	}
	public void setDealerOrderDetails(List<DealerOrderDetail> dealerOrderDetails) {
		this.dealerOrderDetails = dealerOrderDetails;
	}

	public Long getDealerOrderId() {
		return this.dealerOrderId;
	}
	public void setDealerOrderId(Long dealerOrderId) {
		this.dealerOrderId = dealerOrderId;
	}

	public Long getDeliveredQuantityCount() {
		return this.deliveredQuantityCount;
	}
	public void setDeliveredQuantityCount(Long deliveredQuantityCount) {
		this.deliveredQuantityCount = deliveredQuantityCount;
	}

	public String getLogisticsFee() {
		return this.logisticsFee;
	}
	public void setLogisticsFee(String logisticsFee) {
		this.logisticsFee = logisticsFee;
	}

	public String getLogisticsType() {
		return this.logisticsType;
	}
	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Long getQuantityCount() {
		return this.quantityCount;
	}
	public void setQuantityCount(Long quantityCount) {
		this.quantityCount = quantityCount;
	}

	public Receiver getReceiver() {
		return this.receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public String getRefuseReasonApplier() {
		return this.refuseReasonApplier;
	}
	public void setRefuseReasonApplier(String refuseReasonApplier) {
		this.refuseReasonApplier = refuseReasonApplier;
	}

	public String getRefuseReasonSupplier() {
		return this.refuseReasonSupplier;
	}
	public void setRefuseReasonSupplier(String refuseReasonSupplier) {
		this.refuseReasonSupplier = refuseReasonSupplier;
	}

	public String getSupplierMemo() {
		return this.supplierMemo;
	}
	public void setSupplierMemo(String supplierMemo) {
		this.supplierMemo = supplierMemo;
	}

	public Long getSupplierMemoFlag() {
		return this.supplierMemoFlag;
	}
	public void setSupplierMemoFlag(Long supplierMemoFlag) {
		this.supplierMemoFlag = supplierMemoFlag;
	}

	public String getSupplierNick() {
		return this.supplierNick;
	}
	public void setSupplierNick(String supplierNick) {
		this.supplierNick = supplierNick;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

}
