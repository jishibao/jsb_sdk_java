package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbOrderCreateResponse;

/**
 * TOP API: taobao.wlb.order.create request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.04
 */
public class WlbOrderCreateRequest extends BaseTaobaoRequest<WlbOrderCreateResponse> {
	
	

	/** 
	* 支付宝交易号
	 */
	private String alipayNo;

	/** 
	* 该字段暂时保留
	 */
	private String attributes;

	/** 
	* 买家呢称
	 */
	private String buyerNick;

	/** 
	* 期望结束时间，在入库单会使用到
	 */
	private Date expectEndTime;

	/** 
	* 计划开始送达时间  在入库单中可能会使用
	 */
	private Date expectStartTime;

	/** 
	* {"invoince_info": [{"bill_type":"发票类型，必选", "bill_title":"发票抬头，必选", "bill_amount":"发票金额(单位是分)，必选","bill_content":"发票内容，可选"}]}
	 */
	private String invoinceInfo;

	/** 
	* 该物流宝订单是否已完成，如果完成则设置为true，如果为false，则需要等待继续创建订单商品信息。
	 */
	private Boolean isFinished;

	/** 
	* 物流宝订单编号，该接口约定每次最多只能传50条order_item_list，如果一个物流宝订单超过50条商品的时候，需要批量来调用该接口，第一次调用的时候，wlb_order_code为空，如果第一次创建成功，该接口返回wlb_order_code，其后继续再该订单上添加商品条目，需要带上wlb_order_code，out_biz_code，order_item_list,is_finished四个字段。
	 */
	private String orderCode;

	/** 
	* 用字符串格式来表示订单标记列表：比如COD^PRESELL^SPLIT^LIMIT 等，中间用“^”来隔开 ---------------------------------------- 订单标记list（所有字母全部大写）： 1: COD –货到付款 2: LIMIT-限时配送 3: PRESELL-预售 5:COMPLAIN-已投诉 7:SPLIT-拆单， 8:EXCHANGE-换货， 9:VISIT-上门 ， 10: MODIFYTRANSPORT-是否可改配送方式，
: 是否可改配送方式  默认可更改
11 CONSIGN 物流宝代理发货,自动更改发货状态
12: SELLER_AFFORD 是否卖家承担运费 默认是，即没 13: SYNC_RETURN_BILL，同时退回发票
	 */
	private String orderFlag;

	/** 
	* 订单商品列表： {"order_item_list":[{"trade_code":"可选,淘宝交易订单，并且不是赠品，必须要传订单来源编号"," sub_trade_code ":"可选,淘宝子交易号","item_id":"必须,商品Id","item_code":"必须,商家编码","item_name":"可选,物流宝商品名称","item_quantity":"必选,计划数量","item_price":"必选,物品价格,单位为分","owner_user_nick
":"可选,货主nick 代销模式下会存在","flag":"判断是否为赠品0 不是1是","remarks":"可选,备注","batch_remark":"可选，批次描述信息会把这个信息带给WMS，但不会跟物流宝库存相关联"，"inventory_type":"库存类型1 可销售库存 101 类型用来定义残次品 201 冻结类型库存 301 在途库存","picture_url":"图片Url","distributor_user_nick": "分销商NICK",必选"ext_order_item_code":"可选，外部商品的商家编码"]} ======================================== 如果订单中的商品条目数大于50条的时候，我们会校验，不能创建成功，需要你按照50个一批的数量传，需要分批调用该接口，第二次传的时候，需要带上wlb_order_code和is_finished和order_item_list三个字段是必传的，is_finished为true表示传输完毕，为false表示还没完全传完。
	 */
	private String orderItemList;

	/** 
	* 订单子类型：
（1）OTHER： 其他
（2）TAOBAO_TRADE： 淘宝交易
（3）OTHER_TRADE：其他交易
（4）ALLCOATE： 调拨
（5）PURCHASE:采购
	 */
	private String orderSubType;

	/** 
	* 订单类型:
（1）NORMAL_OUT ：正常出库
（2）NORMAL_IN：正常入库
（3）RETURN_IN：退货入库
（4）EXCHANGE_OUT：换货出库
	 */
	private String orderType;

	/** 
	* 外部订单业务ID，该编号在isv中是唯一编号， 用来控制并发，去重用
	 */
	private String outBizCode;

	/** 
	* 包裹件数，入库单和出库单中会用到
	 */
	private Long packageCount;

	/** 
	* 应收金额，cod订单必选
	 */
	private Long payableAmount;

	/** 
	* 源订单编号
	 */
	private String prevOrderCode;

	/** 
	* 收货方信息，必须传， 手机和电话必选其一。
收货方信息：
邮编^^^省^^^市^^^区^^^具体地址^^^收件方名称^^^手机^^^电话

如果某一个字段的数据为空时，必须传NA
	 */
	private String receiverInfo;

	/** 
	* 备注
	 */
	private String remark;

	/** 
	* 投递时间范围要求,格式'15:20'用分号隔开
	 */
	private String scheduleEnd;

	/** 
	* 投递时间范围要求,格式'13:20'用分号隔开
	 */
	private String scheduleStart;

	/** 
	* 投递时延要求: 
（1）INSTANT_ARRIVED： 当日达 
（2）TOMMORROY_MORNING_ARRIVED：次晨达
（3）TOMMORROY_ARRIVED：次日达
（4）工作日：WORK_DAY 
（5）节假日：WEEKED_DAY
	 */
	private String scheduleType;

	/** 
	* 发货方信息，发货方信息必须传， 手机和电话必选其一。 发货方信息：
邮编^^^省^^^市^^^区^^^具体地址^^^收件方名称^^^手机^^^电话
如果某一个字段的数据为空时，必须传NA
	 */
	private String senderInfo;

	/** 
	* cod服务费，只有cod订单的时候，才需要这个字段
	 */
	private Long serviceFee;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	/** 
	* 出库单中可能会用到
运输公司名称^^^运输公司联系人^^^运输公司运单号^^^运输公司电话^^^运输公司联系人身份证号

========================================
如果某一个字段的数据为空时，必须传NA
	 */
	private String tmsInfo;

	/** 
	* 运单编号，退货单时可能会使用
	 */
	private String tmsOrderCode;

	/** 
	* 物流公司编码
	 */
	private String tmsServiceCode;

	/** 
	* 总金额
	 */
	private Long totalAmount;

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getAttributes() {
		return this.attributes;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setExpectEndTime(Date expectEndTime) {
		this.expectEndTime = expectEndTime;
	}

	public Date getExpectEndTime() {
		return this.expectEndTime;
	}

	public void setExpectStartTime(Date expectStartTime) {
		this.expectStartTime = expectStartTime;
	}

	public Date getExpectStartTime() {
		return this.expectStartTime;
	}

	public void setInvoinceInfo(String invoinceInfo) {
		this.invoinceInfo = invoinceInfo;
	}

	public String getInvoinceInfo() {
		return this.invoinceInfo;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Boolean getIsFinished() {
		return this.isFinished;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public String getOrderFlag() {
		return this.orderFlag;
	}

	public void setOrderItemList(String orderItemList) {
		this.orderItemList = orderItemList;
	}

	public String getOrderItemList() {
		return this.orderItemList;
	}

	public void setOrderSubType(String orderSubType) {
		this.orderSubType = orderSubType;
	}

	public String getOrderSubType() {
		return this.orderSubType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}

	public void setPackageCount(Long packageCount) {
		this.packageCount = packageCount;
	}

	public Long getPackageCount() {
		return this.packageCount;
	}

	public void setPayableAmount(Long payableAmount) {
		this.payableAmount = payableAmount;
	}

	public Long getPayableAmount() {
		return this.payableAmount;
	}

	public void setPrevOrderCode(String prevOrderCode) {
		this.prevOrderCode = prevOrderCode;
	}

	public String getPrevOrderCode() {
		return this.prevOrderCode;
	}

	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
	}

	public String getReceiverInfo() {
		return this.receiverInfo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setScheduleEnd(String scheduleEnd) {
		this.scheduleEnd = scheduleEnd;
	}

	public String getScheduleEnd() {
		return this.scheduleEnd;
	}

	public void setScheduleStart(String scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	public String getScheduleStart() {
		return this.scheduleStart;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setSenderInfo(String senderInfo) {
		this.senderInfo = senderInfo;
	}

	public String getSenderInfo() {
		return this.senderInfo;
	}

	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Long getServiceFee() {
		return this.serviceFee;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setTmsInfo(String tmsInfo) {
		this.tmsInfo = tmsInfo;
	}

	public String getTmsInfo() {
		return this.tmsInfo;
	}

	public void setTmsOrderCode(String tmsOrderCode) {
		this.tmsOrderCode = tmsOrderCode;
	}

	public String getTmsOrderCode() {
		return this.tmsOrderCode;
	}

	public void setTmsServiceCode(String tmsServiceCode) {
		this.tmsServiceCode = tmsServiceCode;
	}

	public String getTmsServiceCode() {
		return this.tmsServiceCode;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("alipay_no", this.alipayNo);
		txtParams.put("attributes", this.attributes);
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("expect_end_time", this.expectEndTime);
		txtParams.put("expect_start_time", this.expectStartTime);
		txtParams.put("invoince_info", this.invoinceInfo);
		txtParams.put("is_finished", this.isFinished);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_flag", this.orderFlag);
		txtParams.put("order_item_list", this.orderItemList);
		txtParams.put("order_sub_type", this.orderSubType);
		txtParams.put("order_type", this.orderType);
		txtParams.put("out_biz_code", this.outBizCode);
		txtParams.put("package_count", this.packageCount);
		txtParams.put("payable_amount", this.payableAmount);
		txtParams.put("prev_order_code", this.prevOrderCode);
		txtParams.put("receiver_info", this.receiverInfo);
		txtParams.put("remark", this.remark);
		txtParams.put("schedule_end", this.scheduleEnd);
		txtParams.put("schedule_start", this.scheduleStart);
		txtParams.put("schedule_type", this.scheduleType);
		txtParams.put("sender_info", this.senderInfo);
		txtParams.put("service_fee", this.serviceFee);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("tms_info", this.tmsInfo);
		txtParams.put("tms_order_code", this.tmsOrderCode);
		txtParams.put("tms_service_code", this.tmsServiceCode);
		txtParams.put("total_amount", this.totalAmount);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbOrderCreateResponse> getResponseClass() {
		return WlbOrderCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(buyerNick, 64, "buyerNick");
		RequestCheckUtils.checkNotEmpty(isFinished, "isFinished");
		RequestCheckUtils.checkNotEmpty(orderItemList, "orderItemList");
		RequestCheckUtils.checkNotEmpty(orderSubType, "orderSubType");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkNotEmpty(outBizCode, "outBizCode");
		RequestCheckUtils.checkMaxLength(outBizCode, 128, "outBizCode");
		RequestCheckUtils.checkMaxLength(remark, 4000, "remark");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
		RequestCheckUtils.checkMaxLength(storeCode, 64, "storeCode");
		RequestCheckUtils.checkMaxLength(tmsServiceCode, 64, "tmsServiceCode");
	}
	

}