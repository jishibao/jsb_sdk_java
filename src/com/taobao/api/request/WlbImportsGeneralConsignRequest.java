package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbImportsGeneralConsignResponse;

/**
 * TOP API: taobao.wlb.imports.general.consign request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.27
 */
public class WlbImportsGeneralConsignRequest extends BaseTaobaoRequest<WlbImportsGeneralConsignResponse> {
	
	

	/** 
	* 卖家退货地址库ID；不填写的话取默认退货地址；如果填写的cancelId对应多个地址，取第一个
	 */
	private Long cancelId;

	/** 
	* 第1段物流承运商
	 */
	private String firstLogistics;

	/** 
	* 第1段物流运单号
	 */
	private String firstWaybillno;

	/** 
	* 物流资源ID
	 */
	private Long resourceId;

	/** 
	* 卖家发货地址库ID；不填的话取默认发货地址；如果填写的senderId对应多个地址，取第一个
	 */
	private Long senderId;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	/** 
	* 交易订单id
	 */
	private Long tradeOrderId;

	public void setCancelId(Long cancelId) {
		this.cancelId = cancelId;
	}

	public Long getCancelId() {
		return this.cancelId;
	}

	public void setFirstLogistics(String firstLogistics) {
		this.firstLogistics = firstLogistics;
	}

	public String getFirstLogistics() {
		return this.firstLogistics;
	}

	public void setFirstWaybillno(String firstWaybillno) {
		this.firstWaybillno = firstWaybillno;
	}

	public String getFirstWaybillno() {
		return this.firstWaybillno;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public Long getResourceId() {
		return this.resourceId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public Long getSenderId() {
		return this.senderId;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setTradeOrderId(Long tradeOrderId) {
		this.tradeOrderId = tradeOrderId;
	}

	public Long getTradeOrderId() {
		return this.tradeOrderId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.imports.general.consign";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cancel_id", this.cancelId);
		txtParams.put("first_logistics", this.firstLogistics);
		txtParams.put("first_waybillno", this.firstWaybillno);
		txtParams.put("resource_id", this.resourceId);
		txtParams.put("sender_id", this.senderId);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("trade_order_id", this.tradeOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbImportsGeneralConsignResponse> getResponseClass() {
		return WlbImportsGeneralConsignResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(firstLogistics, "firstLogistics");
		RequestCheckUtils.checkNotEmpty(firstWaybillno, "firstWaybillno");
		RequestCheckUtils.checkNotEmpty(resourceId, "resourceId");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
		RequestCheckUtils.checkNotEmpty(tradeOrderId, "tradeOrderId");
	}
	

}