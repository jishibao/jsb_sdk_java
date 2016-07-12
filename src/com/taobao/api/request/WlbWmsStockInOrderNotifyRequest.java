package com.taobao.api.request;

import com.taobao.api.domain.Senderinfowlbwmsstockinordernotifywl;
import java.util.List;
import java.util.Date;
import com.taobao.api.domain.Receiverinfowlbwmsstockinordernotifywl;
import com.taobao.api.domain.Orderitemlistwlbwmsstockinordernotifywl;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsStockInOrderNotifyResponse;

/**
 * TOP API: taobao.wlb.wms.stock.in.order.notify request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.16
 */
public class WlbWmsStockInOrderNotifyRequest extends BaseTaobaoRequest<WlbWmsStockInOrderNotifyResponse> {
	
	

	/** 
	* 预期送达结束时间
	 */
	private String expectEndTime;

	/** 
	* 预期送达开始时间
	 */
	private String expectStartTime;

	/** 
	* 扩展属性, key-value结构，格式要求： 以英文分号“;”分隔每组key-value，以英文冒号“:”分隔key与value。如果value中带有分号，需要转成下划线“_”，如果带有冒号，需要转成中划线“-”
	 */
	private String extendFields;

	/** 
	* 可选择性文本透传至WMS，比如加工归还、委外归还、借出归还、内部归还等
	 */
	private String inboundTypeDesc;

	/** 
	* 入库单据编码
	 */
	private String orderCode;

	/** 
	* 单据创建时间
	 */
	private Date orderCreateTime;

	/** 
	* 订单标记以逗号分隔：  9:上门退货入库 13: 退货时是否收取发票，默认不收取（即没13为多选项，如1,2,8,9）
	 */
	private String orderFlag;

	/** 
	* 系统自动生成
	 */
	private String orderItemList;

	/** 
	* 单据类型 601普通入库单、501销退入库单、302 调拨入库单、904其他入库单、306 B2B入库
	 */
	private Long orderType;

	/** 
	* 来源单据号，如销售退货时填充原销售订单号
	 */
	private String prevOrderCode;

	/** 
	* 系统自动生成
	 */
	private String receiverInfo;

	/** 
	* 备注，销退入库订单需要留言备注填充到此字段
	 */
	private String remark;

	/** 
	* 销退时请提供退货的原因
	 */
	private String returnReason;

	/** 
	* 系统自动生成
	 */
	private String senderInfo;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	/** 
	* 供应商编码，往来单位编码
	 */
	private String supplierCode;

	/** 
	* 供应商名称 ，往来单位名称
	 */
	private String supplierName;

	/** 
	* 运单号&托运单号 1)	入库单支持多运单号录入 2)	销退场景下如果是拒收（非妥投运单）由ERP填充原运单号
	 */
	private String tmsOrderCode;

	/** 
	* 配送公司编码，拒收（非妥投）的销退订单，由ERP填充原单配送公司编码
	 */
	private String tmsServiceCode;

	/** 
	* 快递公司名称
	 */
	private String tmsServiceName;

	public void setExpectEndTime(String expectEndTime) {
		this.expectEndTime = expectEndTime;
	}

	public String getExpectEndTime() {
		return this.expectEndTime;
	}

	public void setExpectStartTime(String expectStartTime) {
		this.expectStartTime = expectStartTime;
	}

	public String getExpectStartTime() {
		return this.expectStartTime;
	}

	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getExtendFields() {
		return this.extendFields;
	}

	public void setInboundTypeDesc(String inboundTypeDesc) {
		this.inboundTypeDesc = inboundTypeDesc;
	}

	public String getInboundTypeDesc() {
		return this.inboundTypeDesc;
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

	public void setOrderItemList(List<Orderitemlistwlbwmsstockinordernotifywl> orderItemList) {
		this.orderItemList = new JSONWriter(false,true).write(orderItemList);
	}

	public String getOrderItemList() {
		return this.orderItemList;
	}

	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public Long getOrderType() {
		return this.orderType;
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

	public void setReceiverInfo(Receiverinfowlbwmsstockinordernotifywl receiverInfo) {
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

	public void setSenderInfo(Senderinfowlbwmsstockinordernotifywl senderInfo) {
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

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierCode() {
		return this.supplierCode;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierName() {
		return this.supplierName;
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
		return "taobao.wlb.wms.stock.in.order.notify";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("expect_end_time", this.expectEndTime);
		txtParams.put("expect_start_time", this.expectStartTime);
		txtParams.put("extend_fields", this.extendFields);
		txtParams.put("inbound_type_desc", this.inboundTypeDesc);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_create_time", this.orderCreateTime);
		txtParams.put("order_flag", this.orderFlag);
		txtParams.put("order_item_list", this.orderItemList);
		txtParams.put("order_type", this.orderType);
		txtParams.put("prev_order_code", this.prevOrderCode);
		txtParams.put("receiver_info", this.receiverInfo);
		txtParams.put("remark", this.remark);
		txtParams.put("return_reason", this.returnReason);
		txtParams.put("sender_info", this.senderInfo);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("supplier_code", this.supplierCode);
		txtParams.put("supplier_name", this.supplierName);
		txtParams.put("tms_order_code", this.tmsOrderCode);
		txtParams.put("tms_service_code", this.tmsServiceCode);
		txtParams.put("tms_service_name", this.tmsServiceName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsStockInOrderNotifyResponse> getResponseClass() {
		return WlbWmsStockInOrderNotifyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkNotEmpty(orderCreateTime, "orderCreateTime");
		RequestCheckUtils.checkObjectMaxListSize(orderItemList, 5000, "orderItemList");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
	}
	

}