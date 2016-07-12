package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbImportsOrderCancelResponse;

/**
 * TOP API: taobao.wlb.imports.order.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.27
 */
public class WlbImportsOrderCancelRequest extends BaseTaobaoRequest<WlbImportsOrderCancelResponse> {
	
	

	/** 
	* 物流订单编号
	 */
	private String lgorderCode;

	public void setLgorderCode(String lgorderCode) {
		this.lgorderCode = lgorderCode;
	}

	public String getLgorderCode() {
		return this.lgorderCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.imports.order.cancel";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("lgorder_code", this.lgorderCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbImportsOrderCancelResponse> getResponseClass() {
		return WlbImportsOrderCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(lgorderCode, "lgorderCode");
	}
	

}