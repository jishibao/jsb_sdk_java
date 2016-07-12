package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductcatsGetResponse;

/**
 * TOP API: taobao.fenxiao.productcats.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.06
 */
public class FenxiaoProductcatsGetRequest extends BaseTaobaoRequest<FenxiaoProductcatsGetResponse> {
	
	

	/** 
	* 返回字段列表
	 */
	private String fields;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.productcats.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductcatsGetResponse> getResponseClass() {
		return FenxiaoProductcatsGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}