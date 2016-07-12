package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbOrderstatusGetResponse;

/**
 * TOP API: taobao.wlb.orderstatus.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class WlbOrderstatusGetRequest extends BaseTaobaoRequest<WlbOrderstatusGetResponse> {
	
	

	/** 
	* 物流宝订单编码
	 */
	private String orderCode;

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.orderstatus.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("order_code", this.orderCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbOrderstatusGetResponse> getResponseClass() {
		return WlbOrderstatusGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
	}
	

}