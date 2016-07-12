package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 交易订单的帐务信息详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TradeAmount extends TaobaoObject {

	private static final long serialVersionUID = 6225419264194592299L;

	/**
	 * 支付宝交易号，如：2009112081173831
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 买家货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
	 */
	@ApiField("buyer_cod_fee")
	private String buyerCodFee;

	/**
	 * 买家获得积分,返点的积分。格式:100;单位:个
	 */
	@ApiField("buyer_obtain_point_fee")
	private String buyerObtainPointFee;

	/**
	 * 货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
	 */
	@ApiField("cod_fee")
	private String codFee;

	/**
	 * 交易佣金。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("commission_fee")
	private String commissionFee;

	/**
	 * 交易创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 交易成功时间(更新交易状态为成功的同时更新)/确认收货时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 快递代收款。精确到2位小数;单位:元。如:212.07，表示:212元7分
	 */
	@ApiField("express_agency_fee")
	private String expressAgencyFee;

	/**
	 * 子订单的帐务金额详情列表
	 */
	@ApiListField("order_amounts")
	@ApiField("order_amount")
	private List<OrderAmount> orderAmounts;

	/**
	 * 付款时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 主订单实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分，计算公式如下：如果主订单只有一笔子订单 payment = 子订单的实付金额 + 货到付款服务费(如果是货到付款订单) - 主订单的系统级优惠；如果主订单有多笔子订单 payment = 各子订单的实付金额之和 + 货到付款服务费(如果是货到付款订单) + 邮费 - 主订单的系统级优惠
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分。目前只提供整笔交易的邮费，暂不提供各子订单的邮费
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * 主交易订单的系统级优惠详情
	 */
	@ApiListField("promotion_details")
	@ApiField("promotion_detail")
	private List<PromotionDetail> promotionDetails;

	/**
	 * 卖家货到付款服务费。精确到2位小数;单位:元。如:12.07，表示:12元7分
	 */
	@ApiField("seller_cod_fee")
	private String sellerCodFee;

	/**
	 * 交易主订单编号
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 主订单的商品金额（各子订单中商品price * num的和，不包括任何优惠信息）。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("total_fee")
	private String totalFee;


	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBuyerCodFee() {
		return this.buyerCodFee;
	}
	public void setBuyerCodFee(String buyerCodFee) {
		this.buyerCodFee = buyerCodFee;
	}

	public String getBuyerObtainPointFee() {
		return this.buyerObtainPointFee;
	}
	public void setBuyerObtainPointFee(String buyerObtainPointFee) {
		this.buyerObtainPointFee = buyerObtainPointFee;
	}

	public String getCodFee() {
		return this.codFee;
	}
	public void setCodFee(String codFee) {
		this.codFee = codFee;
	}

	public String getCommissionFee() {
		return this.commissionFee;
	}
	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExpressAgencyFee() {
		return this.expressAgencyFee;
	}
	public void setExpressAgencyFee(String expressAgencyFee) {
		this.expressAgencyFee = expressAgencyFee;
	}

	public List<OrderAmount> getOrderAmounts() {
		return this.orderAmounts;
	}
	public void setOrderAmounts(List<OrderAmount> orderAmounts) {
		this.orderAmounts = orderAmounts;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public List<PromotionDetail> getPromotionDetails() {
		return this.promotionDetails;
	}
	public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
		this.promotionDetails = promotionDetails;
	}

	public String getSellerCodFee() {
		return this.sellerCodFee;
	}
	public void setSellerCodFee(String sellerCodFee) {
		this.sellerCodFee = sellerCodFee;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
