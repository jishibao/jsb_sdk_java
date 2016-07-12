package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.MaPackcodeCreateResponse;

/**
 * TOP API: taobao.ma.packcode.create request
 * 
 * @author top auto create
 * @since 1.0, 2014.09.09
 */
public class MaPackcodeCreateRequest extends BaseTaobaoRequest<MaPackcodeCreateResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.ma.packcode.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<MaPackcodeCreateResponse> getResponseClass() {
		return MaPackcodeCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}