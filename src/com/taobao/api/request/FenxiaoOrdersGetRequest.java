package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoOrdersGetResponse;

/**
 * TOP API: taobao.fenxiao.orders.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.10
 */
public class FenxiaoOrdersGetRequest extends BaseTaobaoRequest<FenxiaoOrdersGetResponse> {
	
	

	/** 
	* 结束时间 格式 yyyy-MM-dd HH:mm:ss.支持到秒的查询。若不传时分秒，默认为0时0分0秒。若purchase_order_id没传，则此参数必传。
	 */
	private Date endCreated;

	/** 
	* 多个字段用","分隔。<br/><br/>fields<br/>如果为空：返回所有采购单对象(purchase_orders)字段。<br/>如果不为空：返回指定采购单对象(purchase_orders)字段。<br/><br/>例1：<br/>sub_purchase_orders.tc_order_id 表示只返回tc_order_id <br/>例2：<br/>sub_purchase_orders表示只返回子采购单列表
	 */
	private String fields;

	/** 
	* 页码。（大于0的整数。默认为1）
	 */
	private Long pageNo;

	/** 
	* 每页条数。（每页条数不超过50条）
	 */
	private Long pageSize;

	/** 
	* 采购单编号或分销流水号，若其它参数没传，则此参数必传。
	 */
	private Long purchaseOrderId;

	/** 
	* 起始时间 格式 yyyy-MM-dd HH:mm:ss.支持到秒的查询。若不传时分秒，默认为0时0分0秒。若purchase_order_id没传，则此参数必传。
	 */
	private Date startCreated;

	/** 
	* 交易状态，不传默认查询所有采购单根据身份选择自身状态可选值:<br/> *供应商：<br/> WAIT_SELLER_SEND_GOODS(等待发货)<br/> WAIT_SELLER_CONFIRM_PAY(待确认收款)<br/> WAIT_BUYER_PAY(等待付款)<br/> WAIT_BUYER_CONFIRM_GOODS(已发货)<br/> TRADE_REFUNDING(退款中)<br/> TRADE_FINISHED(采购成功)<br/> TRADE_CLOSED(已关闭)<br/> *分销商：<br/> WAIT_BUYER_PAY(等待付款)<br/> WAIT_BUYER_CONFIRM_GOODS(待收货确认)<br/> TRADE_FOR_PAY(已付款)<br/> TRADE_REFUNDING(退款中)<br/> TRADE_FINISHED(采购成功)<br/> TRADE_CLOSED(已关闭)<br/>
	 */
	private String status;

	/** 
	* 采购单下游买家订单id
	 */
	private Long tcOrderId;

	/** 
	* 可选值：trade_time_type(采购单按照成交时间范围查询),update_time_type(采购单按照更新时间范围查询)
	 */
	private String timeType;

	public void setEndCreated(Date endCreated) {
		this.endCreated = endCreated;
	}

	public Date getEndCreated() {
		return this.endCreated;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Long getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setStartCreated(Date startCreated) {
		this.startCreated = startCreated;
	}

	public Date getStartCreated() {
		return this.startCreated;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTcOrderId(Long tcOrderId) {
		this.tcOrderId = tcOrderId;
	}

	public Long getTcOrderId() {
		return this.tcOrderId;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public String getTimeType() {
		return this.timeType;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.orders.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_created", this.endCreated);
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("purchase_order_id", this.purchaseOrderId);
		txtParams.put("start_created", this.startCreated);
		txtParams.put("status", this.status);
		txtParams.put("tc_order_id", this.tcOrderId);
		txtParams.put("time_type", this.timeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoOrdersGetResponse> getResponseClass() {
		return FenxiaoOrdersGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxValue(pageNo, 2147483647L, "pageNo");
		RequestCheckUtils.checkMinValue(pageNo, -21474836478L, "pageNo");
		RequestCheckUtils.checkMaxValue(pageSize, 2147483647L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, -21474836478L, "pageSize");
		RequestCheckUtils.checkMaxValue(purchaseOrderId, 9223372036854775807L, "purchaseOrderId");
		RequestCheckUtils.checkMinValue(purchaseOrderId, -9223372036854775808L, "purchaseOrderId");
	}
	

}