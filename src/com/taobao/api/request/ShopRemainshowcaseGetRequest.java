package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ShopRemainshowcaseGetResponse;

/**
 * TOP API: taobao.shop.remainshowcase.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.01.19
 */
public class ShopRemainshowcaseGetRequest extends BaseTaobaoRequest<ShopRemainshowcaseGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.shop.remainshowcase.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ShopRemainshowcaseGetResponse> getResponseClass() {
		return ShopRemainshowcaseGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}