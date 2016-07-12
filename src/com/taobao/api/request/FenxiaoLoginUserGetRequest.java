package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoLoginUserGetResponse;

/**
 * TOP API: taobao.fenxiao.login.user.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class FenxiaoLoginUserGetRequest extends BaseTaobaoRequest<FenxiaoLoginUserGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.fenxiao.login.user.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoLoginUserGetResponse> getResponseClass() {
		return FenxiaoLoginUserGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}