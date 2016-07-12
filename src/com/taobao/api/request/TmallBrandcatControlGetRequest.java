package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallBrandcatControlGetResponse;

/**
 * TOP API: tmall.brandcat.control.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.17
 */
public class TmallBrandcatControlGetRequest extends BaseTaobaoRequest<TmallBrandcatControlGetResponse> {
	
	

	public String getApiMethodName() {
		return "tmall.brandcat.control.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallBrandcatControlGetResponse> getResponseClass() {
		return TmallBrandcatControlGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}