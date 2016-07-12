package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoGradesGetResponse;

/**
 * TOP API: taobao.fenxiao.grades.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoGradesGetRequest extends BaseTaobaoRequest<FenxiaoGradesGetResponse> {
	
	

	public String getApiMethodName() {
		return "taobao.fenxiao.grades.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoGradesGetResponse> getResponseClass() {
		return FenxiaoGradesGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}