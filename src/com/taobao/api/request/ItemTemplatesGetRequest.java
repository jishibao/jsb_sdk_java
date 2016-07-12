package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemTemplatesGetResponse;

/**
 * TOP API: taobao.item.templates.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class ItemTemplatesGetRequest extends BaseTaobaoRequest<ItemTemplatesGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.item.templates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemTemplatesGetResponse> getResponseClass() {
		return ItemTemplatesGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}