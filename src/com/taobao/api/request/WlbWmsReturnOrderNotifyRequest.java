package com.taobao.api.request;

import java.util.List;
import java.util.Date;
import com.taobao.api.domain.Orderitemlistwlbwmsreturnordernotify;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.Receiverinfowlbwmsreturnordernotify;
import com.taobao.api.domain.Senderinfowlbwmsreturnordernotify;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsReturnOrderNotifyResponse;

/**
 * TOP API: taobao.wlb.wms.return.order.notify request
 * 
 * @author top auto create
 * @since 1.0, 2015.08.17
 */
public class WlbWmsReturnOrderNotifyRequest extends BaseTaobaoRequest<WlbWmsReturnOrderNotifyResponse> {
	
	

	/** 
	* 买家昵称
	 */
	private String buyerNick;

	/** 
	* 扩展属性, key-value结构，格式要求： 以英文分号“;”分隔每组key-value，以英文冒号“:”分隔key与value。如果value中带有分号，需要转成下划线“_”，如果带有冒号，需要转成中划线“-”
	 */
	private String extendFields;

	/** 
	* ERP单据编码
	 */
	private String orderCode;

	/** 
	* ERP订单创建时间
	 */
	private Date orderCreateTime;

	/** 
	* 用字符串格式来表示订单标记列表：比如VISIT^ SELLER_AFFORD^SYNC_RETURN_BILL 等，中间用“^”来隔开 ----------------------------------------  订单标记list（所有字母全部大写）： 9:VISIT-上门12: SELLER_AFFORD 是否卖家承担运费 默认是，即没 13: SYNC_RETURN_BILL，同时退回发票
	 */
	private String orderFlag;

	/** 
	* 商品信息列表
	 */
	private String orderItemList;

	/** 
	* 订单来源 201 淘宝，202 1688，203 苏宁，204 亚马逊中国，205 当当，206 ebay，207 唯品会，208 1号店，209 国美，210 拍拍，211 聚美优品，212 乐峰，214 京东，301 其他
	 */
	private String orderSource;

	/** 
	* 订单类型 501 销退入库
	 */
	private String orderType;

	/** 
	* 货主ID
	 */
	private String ownerUserId;

	/** 
	* 来源单据号，销售退货时填充原发货的LBX号
	 */
	private String prevOrderCode;

	/** 
	* 收件人信息
	 */
	private String receiverInfo;

	/** 
	* 备注
	 */
	private String remark;

	/** 
	* 销退时请提供退货的原因
	 */
	private String returnReason;

	/** 
	* 发件人信息
	 */
	private String senderInfo;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	/** 
	* 运单号
	 */
	private String tmsOrderCode;

	/** 
	* 快递公司编码
	 */
	private String tmsServiceCode;

	/** 
	* 快递公司名称
	 */
	private String tmsServiceName;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getExtendFields() {
		return this.extendFields;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
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

	public void setOrderItemList(List<Orderitemlistwlbwmsreturnordernotify> orderItemList) {
		this.orderItemList = new JSONWriter(false,true).write(orderItemList);
	}

	public String getOrderItemList() {
		return this.orderItemList;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderSource() {
		return this.orderSource;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
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

	public void setReceiverInfo(Receiverinfowlbwmsreturnordernotify receiverInfo) {
		this.receiverInfo = new JSONWriter(false,true).write(receiverInfo);
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

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public String getReturnReason() {
		return this.returnReason;
	}

	public void setSenderInfo(String senderInfo) {
		this.senderInfo = senderInfo;
	}

	public void setSenderInfo(Senderinfowlbwmsreturnordernotify senderInfo) {
		this.senderInfo = new JSONWriter(false,true).write(senderInfo);
	}

	public String getSenderInfo() {
		return this.senderInfo;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
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

	public void setTmsServiceName(String tmsServiceName) {
		this.tmsServiceName = tmsServiceName;
	}

	public String getTmsServiceName() {
		return this.tmsServiceName;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.return.order.notify";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("extend_fields", this.extendFields);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_create_time", this.orderCreateTime);
		txtParams.put("order_flag", this.orderFlag);
		txtParams.put("order_item_list", this.orderItemList);
		txtParams.put("order_source", this.orderSource);
		txtParams.put("order_type", this.orderType);
		txtParams.put("owner_user_id", this.ownerUserId);
		txtParams.put("prev_order_code", this.prevOrderCode);
		txtParams.put("receiver_info", this.receiverInfo);
		txtParams.put("remark", this.remark);
		txtParams.put("return_reason", this.returnReason);
		txtParams.put("sender_info", this.senderInfo);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("tms_order_code", this.tmsOrderCode);
		txtParams.put("tms_service_code", this.tmsServiceCode);
		txtParams.put("tms_service_name", this.tmsServiceName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsReturnOrderNotifyResponse> getResponseClass() {
		return WlbWmsReturnOrderNotifyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(orderItemList, 50000, "orderItemList");
	}
	

}