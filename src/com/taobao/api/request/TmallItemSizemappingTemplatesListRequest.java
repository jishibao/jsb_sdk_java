package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemSizemappingTemplatesListResponse;

/**
 * TOP API: tmall.item.sizemapping.templates.list request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.23
 */
public class TmallItemSizemappingTemplatesListRequest extends BaseTaobaoRequest<TmallItemSizemappingTemplatesListResponse> {
	
	

	public String getApiMethodName() {
		return "tmall.item.sizemapping.templates.list";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemSizemappingTemplatesListResponse> getResponseClass() {
		return TmallItemSizemappingTemplatesListResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}