package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流宝订单对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrder extends TaobaoObject {

	private static final long serialVersionUID = 6585527438321839614L;

	/**
	 * 买家nick
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 订单取消状态：
1-取消中； 
2-取消失败；
3-取消完成
	 */
	@ApiField("cancel_order_status")
	private Long cancelOrderStatus;

	/**
	 * 确认状态：
(1)不需要确认：NO_NEED_CONFIRM
(2)等待确认：WAIT_CONFIRM
(3)已确认:CONFIRMED
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	/**
	 * 计划送达结束时间
	 */
	@ApiField("expect_end_time")
	private Date expectEndTime;

	/**
	 * 计划送达开始时间
	 */
	@ApiField("expect_start_time")
	private Date expectStartTime;

	/**
	 * 
	 */
	@ApiField("ext_order_id")
	private Long extOrderId;

	/**
	 * 发票信息
	 */
	@ApiField("invoice_info")
	private String invoiceInfo;

	/**
	 * 
	 */
	@ApiField("is_completed")
	private Boolean isCompleted;

	/**
	 * 物流宝订单中的商品种类数量
	 */
	@ApiField("item_kinds_count")
	private Long itemKindsCount;

	/**
	 * 出库或者入库，IN表示入库，OUT表示出库
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 第1位:COD,2:限时配送,3:预售,4:需要发票,5:已投诉,第6位:合单,第7位:拆单 第8位：EXCHANGE-换货， 第9位:VISIT-上门 ， 第10位: MODIFYTRANSPORT-是否可改配送方式，第11位：是否物流代理确认发货
	 */
	@ApiField("order_flag")
	private Long orderFlag;

	/**
	 * 订单来源:
产生物流订单的原因，比如:

订单来源:1:TAOBAO;2:EXT;3:ERP;4:WMS
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 对应创建物流宝订单top接口中的的out_biz_code字段，主要是用来去重用
	 */
	@ApiField("order_source_code")
	private String orderSourceCode;

	/**
	 * 物流状态，
订单已创建：0
订单已取消: -1
订单关闭:-3
下发中: 10
已下发: 11
TMS拒签 :-100
接收方拒签：-200
已发货:100
签收成功:200
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 卖家取消,仓库取消标识
	 */
	@ApiField("order_status_reason")
	private String orderStatusReason;

	/**
	 * (1)其它:    OTHER
(2)淘宝交易: TAOBAO
(3)301:调拨: ALLOCATION
(4)401:盘点:CHECK
(5)501:销售采购:PRUCHASE
	 */
	@ApiField("order_sub_type")
	private String orderSubType;

	/**
	 * 1:正常订单: NORMAL
2:退货订单: RETURN
3:换货订单: CHANGE
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 原订单编码
	 */
	@ApiField("prev_order_code")
	private String prevOrderCode;

	/**
	 * 实际入库的种类数量
	 */
	@ApiField("real_kinds_count")
	private Long realKindsCount;

	/**
	 * 应收金额
	 */
	@ApiField("receivable_amount")
	private Long receivableAmount;

	/**
	 * 收件人具体地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 区或者县
	 */
	@ApiField("receiver_area")
	private String receiverArea;

	/**
	 * 收件人城市
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * 
	 */
	@ApiField("receiver_email")
	private String receiverEmail;

	/**
	 * 接收人电子邮箱
	 */
	@ApiField("receiver_mail")
	private String receiverMail;

	/**
	 * 接收人手机号码
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 接收人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 接收人固定电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 收件人省份
	 */
	@ApiField("receiver_province")
	private String receiverProvince;

	/**
	 * 接收人旺旺
	 */
	@ApiField("receiver_wangwang")
	private String receiverWangwang;

	/**
	 * 收件人邮编
	 */
	@ApiField("receiver_zip_code")
	private String receiverZipCode;

	/**
	 * 订单备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 发货日期:
(1)1 为工作日
(2)2 为节假日
	 */
	@ApiField("schedule_day")
	private String scheduleDay;

	/**
	 * 配送结束时间通常是HH:MM格式
	 */
	@ApiField("schedule_end")
	private String scheduleEnd;

	/**
	 * 发货速度  ，
101-当日达，
102-次晨达，
103-次日达
	 */
	@ApiField("schedule_speed")
	private Long scheduleSpeed;

	/**
	 * 配送开始时间通常是HH:MM格式
	 */
	@ApiField("schedule_start")
	private String scheduleStart;

	/**
	 * 发件人地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/**
	 * 发件人所在区
	 */
	@ApiField("sender_area")
	private String senderArea;

	/**
	 * 发件人城市
	 */
	@ApiField("sender_city")
	private String senderCity;

	/**
	 * 发件人电子邮箱
	 */
	@ApiField("sender_email")
	private String senderEmail;

	/**
	 * 发件人移动电话
	 */
	@ApiField("sender_mobile")
	private String senderMobile;

	/**
	 * 发件人姓名
	 */
	@ApiField("sender_name")
	private String senderName;

	/**
	 * 发件人联系电话
	 */
	@ApiField("sender_phone")
	private String senderPhone;

	/**
	 * 发件人所在省份
	 */
	@ApiField("sender_province")
	private String senderProvince;

	/**
	 * 发件人邮编
	 */
	@ApiField("sender_zip_code")
	private String senderZipCode;

	/**
	 * cod服务费
	 */
	@ApiField("service_fee")
	private Long serviceFee;

	/**
	 * 物流运输方式：
MAIL-平邮
EXPRESS-快递
EMS-EMS
OTHER-其他
	 */
	@ApiField("shipping_type")
	private String shippingType;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 发货物流公司编码，STO,YTO,EMS等
	 */
	@ApiField("tms_tp_code")
	private String tmsTpCode;

	/**
	 * 订单总价
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 卖家ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 卖家NICK
	 */
	@ApiField("user_nick")
	private String userNick;


	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getCancelOrderStatus() {
		return this.cancelOrderStatus;
	}
	public void setCancelOrderStatus(Long cancelOrderStatus) {
		this.cancelOrderStatus = cancelOrderStatus;
	}

	public String getConfirmStatus() {
		return this.confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public Date getExpectEndTime() {
		return this.expectEndTime;
	}
	public void setExpectEndTime(Date expectEndTime) {
		this.expectEndTime = expectEndTime;
	}

	public Date getExpectStartTime() {
		return this.expectStartTime;
	}
	public void setExpectStartTime(Date expectStartTime) {
		this.expectStartTime = expectStartTime;
	}

	public Long getExtOrderId() {
		return this.extOrderId;
	}
	public void setExtOrderId(Long extOrderId) {
		this.extOrderId = extOrderId;
	}

	public String getInvoiceInfo() {
		return this.invoiceInfo;
	}
	public void setInvoiceInfo(String invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

	public Boolean getIsCompleted() {
		return this.isCompleted;
	}
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Long getItemKindsCount() {
		return this.itemKindsCount;
	}
	public void setItemKindsCount(Long itemKindsCount) {
		this.itemKindsCount = itemKindsCount;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Long getOrderFlag() {
		return this.orderFlag;
	}
	public void setOrderFlag(Long orderFlag) {
		this.orderFlag = orderFlag;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderSourceCode() {
		return this.orderSourceCode;
	}
	public void setOrderSourceCode(String orderSourceCode) {
		this.orderSourceCode = orderSourceCode;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusReason() {
		return this.orderStatusReason;
	}
	public void setOrderStatusReason(String orderStatusReason) {
		this.orderStatusReason = orderStatusReason;
	}

	public String getOrderSubType() {
		return this.orderSubType;
	}
	public void setOrderSubType(String orderSubType) {
		this.orderSubType = orderSubType;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPrevOrderCode() {
		return this.prevOrderCode;
	}
	public void setPrevOrderCode(String prevOrderCode) {
		this.prevOrderCode = prevOrderCode;
	}

	public Long getRealKindsCount() {
		return this.realKindsCount;
	}
	public void setRealKindsCount(Long realKindsCount) {
		this.realKindsCount = realKindsCount;
	}

	public Long getReceivableAmount() {
		return this.receivableAmount;
	}
	public void setReceivableAmount(Long receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverArea() {
		return this.receiverArea;
	}
	public void setReceiverArea(String receiverArea) {
		this.receiverArea = receiverArea;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverEmail() {
		return this.receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getReceiverMail() {
		return this.receiverMail;
	}
	public void setReceiverMail(String receiverMail) {
		this.receiverMail = receiverMail;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverProvince() {
		return this.receiverProvince;
	}
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public String getReceiverWangwang() {
		return this.receiverWangwang;
	}
	public void setReceiverWangwang(String receiverWangwang) {
		this.receiverWangwang = receiverWangwang;
	}

	public String getReceiverZipCode() {
		return this.receiverZipCode;
	}
	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getScheduleDay() {
		return this.scheduleDay;
	}
	public void setScheduleDay(String scheduleDay) {
		this.scheduleDay = scheduleDay;
	}

	public String getScheduleEnd() {
		return this.scheduleEnd;
	}
	public void setScheduleEnd(String scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
	}

	public Long getScheduleSpeed() {
		return this.scheduleSpeed;
	}
	public void setScheduleSpeed(Long scheduleSpeed) {
		this.scheduleSpeed = scheduleSpeed;
	}

	public String getScheduleStart() {
		return this.scheduleStart;
	}
	public void setScheduleStart(String scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	public String getSenderAddress() {
		return this.senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderArea() {
		return this.senderArea;
	}
	public void setSenderArea(String senderArea) {
		this.senderArea = senderArea;
	}

	public String getSenderCity() {
		return this.senderCity;
	}
	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getSenderEmail() {
		return this.senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getSenderMobile() {
		return this.senderMobile;
	}
	public void setSenderMobile(String senderMobile) {
		this.senderMobile = senderMobile;
	}

	public String getSenderName() {
		return this.senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderPhone() {
		return this.senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getSenderProvince() {
		return this.senderProvince;
	}
	public void setSenderProvince(String senderProvince) {
		this.senderProvince = senderProvince;
	}

	public String getSenderZipCode() {
		return this.senderZipCode;
	}
	public void setSenderZipCode(String senderZipCode) {
		this.senderZipCode = senderZipCode;
	}

	public Long getServiceFee() {
		return this.serviceFee;
	}
	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getTmsTpCode() {
		return this.tmsTpCode;
	}
	public void setTmsTpCode(String tmsTpCode) {
		this.tmsTpCode = tmsTpCode;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
