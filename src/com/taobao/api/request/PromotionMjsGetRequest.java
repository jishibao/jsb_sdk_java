package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PromotionMjsGetResponse;

/**
 * TOP API: taobao.promotion.mjs.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class PromotionMjsGetRequest extends BaseTaobaoRequest<PromotionMjsGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.promotion.mjs.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PromotionMjsGetResponse> getResponseClass() {
		return PromotionMjsGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}