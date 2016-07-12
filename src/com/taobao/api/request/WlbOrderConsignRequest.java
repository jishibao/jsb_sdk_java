package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbOrderConsignResponse;

/**
 * TOP API: taobao.wlb.order.consign request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbOrderConsignRequest extends BaseTaobaoRequest<WlbOrderConsignResponse> {
	
	

	/** 
	* 物流宝订单编号
	 */
	private String wlbOrderCode;

	public void setWlbOrderCode(String wlbOrderCode) {
		this.wlbOrderCode = wlbOrderCode;
	}

	public String getWlbOrderCode() {
		return this.wlbOrderCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.consign";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("wlb_order_code", this.wlbOrderCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbOrderConsignResponse> getResponseClass() {
		return WlbOrderConsignResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(wlbOrderCode, "wlbOrderCode");
		RequestCheckUtils.checkMaxLength(wlbOrderCode, 64, "wlbOrderCode");
	}
	

}