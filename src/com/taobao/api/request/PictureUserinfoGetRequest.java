package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PictureUserinfoGetResponse;

/**
 * TOP API: taobao.picture.userinfo.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class PictureUserinfoGetRequest extends BaseTaobaoRequest<PictureUserinfoGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.picture.userinfo.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PictureUserinfoGetResponse> getResponseClass() {
		return PictureUserinfoGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}