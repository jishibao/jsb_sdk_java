package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 采购单及子采购单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PurchaseOrder extends TaobaoObject {

	private static final long serialVersionUID = 6133791555379312415L;

	/**
	 * 支付宝交易号。
	 */
	@ApiField("alipay_no")
	private String alipayNo;

	/**
	 * 买家nick，供应商查询不会返回买家昵称，分销商查询才会返回。
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 买家支付给分销商的总金额。注意买家购买的商品可能不是全部来自同一供货商，请同时参考子单上的相关金额。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
	 */
	@ApiField("buyer_payment")
	private String buyerPayment;

	/**
	 * 加密后的买家淘宝ID，长度为32位
	 */
	@ApiField("buyer_taobao_id")
	private String buyerTaobaoId;

	/**
	 * 物流发货时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("consign_time")
	private Date consignTime;

	/**
	 * 采购单创建时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 分销商来源网站（taobao）。
	 */
	@ApiField("distributor_from")
	private String distributorFrom;

	/**
	 * 分销商实付金额。(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
	 */
	@ApiField("distributor_payment")
	private String distributorPayment;

	/**
	 * 分销商在来源网站的帐号名。
	 */
	@ApiField("distributor_username")
	private String distributorUsername;

	/**
	 * 交易结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 主订单属性信息，key-value形式：
orderNovice ：订单发票抬头；
orderNoviceContent ：代表发票明细
	 */
	@ApiListField("features")
	@ApiField("feature")
	private List<Feature> features;

	/**
	 * 分销流水号，分销平台产生的主键
	 */
	@ApiField("fenxiao_id")
	private Long fenxiaoId;

	/**
	 * 供应商交易ID 非采购单ID，如果改发货状态 是需要该ID，ID在用户未付款前为0，付款后有具体值（发货时使用该ID）
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 自定义key
	 */
	@ApiListField("isv_custom_key")
	@ApiField("string")
	private List<String> isvCustomKey;

	/**
	 * 自定义值
	 */
	@ApiListField("isv_custom_value")
	@ApiField("string")
	private List<String> isvCustomValue;

	/**
	 * 物流公司
	 */
	@ApiField("logistics_company_name")
	private String logisticsCompanyName;

	/**
	 * 运单号
	 */
	@ApiField("logistics_id")
	private String logisticsId;

	/**
	 * 采购单留言。（代销模式下信息包括买家留言和分销商留言）
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 交易修改时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 采购单留言列表
	 */
	@ApiListField("order_messages")
	@ApiField("order_message")
	private List<OrderMessage> orderMessages;

	/**
	 * 付款时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付方式：ALIPAY_SURETY（支付宝担保交易）、ALIPAY_CHAIN（分账交易）、TRANSFER（线下转账）、PREPAY（预存款）、IMMEDIATELY（即时到账）、CASHGOODS（先款后货）、ACCOUNT_PERIOD（账期支付）
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 采购单邮费。(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * 买家详细的信息。
	 */
	@ApiField("receiver")
	private Receiver receiver;

	/**
	 * 配送方式，FAST(快速)、EMS、ORDINARY(平邮)、SELLER(卖家包邮)
	 */
	@ApiField("shipping")
	private String shipping;

	/**
	 * 订单快照URL
	 */
	@ApiField("snapshot_url")
	private String snapshotUrl;

	/**
	 * 采购单交易状态。可选值：<br>
WAIT_BUYER_PAY(等待付款)<br>
WAIT_SELLER_SEND_GOODS(已付款，待发货）<br>
WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)<br>
TRADE_FINISHED(交易成功)<br>
TRADE_CLOSED(交易关闭)<br>
WAIT_BUYER_CONFIRM_GOODS_ACOUNTED(已付款（已分账），已发货。只对代销分账支持)<br>
PAY_ACOUNTED_GOODS_CONFIRM （已分账发货成功）<br>
PAY_WAIT_ACOUNT_GOODS_CONFIRM（已付款，确认收货）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子订单的详细信息列表。
	 */
	@ApiListField("sub_purchase_orders")
	@ApiField("sub_purchase_order")
	private List<SubPurchaseOrder> subPurchaseOrders;

	/**
	 * 返回供应商备注旗帜
vlaue在1-5之间。非1-5之间，都采用1作为默认。 1:红色 2:黄色 3:绿色 4:蓝色 5:粉红色
	 */
	@ApiField("supplier_flag")
	private Long supplierFlag;

	/**
	 * 供应商来源网站, values: taobao, alibaba
	 */
	@ApiField("supplier_from")
	private String supplierFrom;

	/**
	 * 供应商备注
	 */
	@ApiField("supplier_memo")
	private String supplierMemo;

	/**
	 * 供应商在来源网站的帐号名。
	 */
	@ApiField("supplier_username")
	private String supplierUsername;

	/**
	 * 主订单ID （经销不显示）
	 */
	@ApiField("tc_order_id")
	private Long tcOrderId;

	/**
	 * 采购单总额（不含邮费,精确到2位小数;单位:元。如:200.07，表示:200元7分 )
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 分销方式：AGENT（代销）、DEALER（经销）
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 采购单类型（代销、零批） values:daixiao,lingpi。
	 */
	@ApiField("type")
	private String type;


	public String getAlipayNo() {
		return this.alipayNo;
	}
	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerPayment() {
		return this.buyerPayment;
	}
	public void setBuyerPayment(String buyerPayment) {
		this.buyerPayment = buyerPayment;
	}

	public String getBuyerTaobaoId() {
		return this.buyerTaobaoId;
	}
	public void setBuyerTaobaoId(String buyerTaobaoId) {
		this.buyerTaobaoId = buyerTaobaoId;
	}

	public Date getConsignTime() {
		return this.consignTime;
	}
	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDistributorFrom() {
		return this.distributorFrom;
	}
	public void setDistributorFrom(String distributorFrom) {
		this.distributorFrom = distributorFrom;
	}

	public String getDistributorPayment() {
		return this.distributorPayment;
	}
	public void setDistributorPayment(String distributorPayment) {
		this.distributorPayment = distributorPayment;
	}

	public String getDistributorUsername() {
		return this.distributorUsername;
	}
	public void setDistributorUsername(String distributorUsername) {
		this.distributorUsername = distributorUsername;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<Feature> getFeatures() {
		return this.features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public Long getFenxiaoId() {
		return this.fenxiaoId;
	}
	public void setFenxiaoId(Long fenxiaoId) {
		this.fenxiaoId = fenxiaoId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getIsvCustomKey() {
		return this.isvCustomKey;
	}
	public void setIsvCustomKey(List<String> isvCustomKey) {
		this.isvCustomKey = isvCustomKey;
	}

	public List<String> getIsvCustomValue() {
		return this.isvCustomValue;
	}
	public void setIsvCustomValue(List<String> isvCustomValue) {
		this.isvCustomValue = isvCustomValue;
	}

	public String getLogisticsCompanyName() {
		return this.logisticsCompanyName;
	}
	public void setLogisticsCompanyName(String logisticsCompanyName) {
		this.logisticsCompanyName = logisticsCompanyName;
	}

	public String getLogisticsId() {
		return this.logisticsId;
	}
	public void setLogisticsId(String logisticsId) {
		this.logisticsId = logisticsId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public List<OrderMessage> getOrderMessages() {
		return this.orderMessages;
	}
	public void setOrderMessages(List<OrderMessage> orderMessages) {
		this.orderMessages = orderMessages;
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

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Receiver getReceiver() {
		return this.receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public String getShipping() {
		return this.shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getSnapshotUrl() {
		return this.snapshotUrl;
	}
	public void setSnapshotUrl(String snapshotUrl) {
		this.snapshotUrl = snapshotUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<SubPurchaseOrder> getSubPurchaseOrders() {
		return this.subPurchaseOrders;
	}
	public void setSubPurchaseOrders(List<SubPurchaseOrder> subPurchaseOrders) {
		this.subPurchaseOrders = subPurchaseOrders;
	}

	public Long getSupplierFlag() {
		return this.supplierFlag;
	}
	public void setSupplierFlag(Long supplierFlag) {
		this.supplierFlag = supplierFlag;
	}

	public String getSupplierFrom() {
		return this.supplierFrom;
	}
	public void setSupplierFrom(String supplierFrom) {
		this.supplierFrom = supplierFrom;
	}

	public String getSupplierMemo() {
		return this.supplierMemo;
	}
	public void setSupplierMemo(String supplierMemo) {
		this.supplierMemo = supplierMemo;
	}

	public String getSupplierUsername() {
		return this.supplierUsername;
	}
	public void setSupplierUsername(String supplierUsername) {
		this.supplierUsername = supplierUsername;
	}

	public Long getTcOrderId() {
		return this.tcOrderId;
	}
	public void setTcOrderId(Long tcOrderId) {
		this.tcOrderId = tcOrderId;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
