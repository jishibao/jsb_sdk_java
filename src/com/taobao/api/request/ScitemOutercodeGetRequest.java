package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ScitemOutercodeGetResponse;

/**
 * TOP API: taobao.scitem.outercode.get request
 * 
 * @author top auto create
 * @since 1.0, 2012.11.28
 */
public class ScitemOutercodeGetRequest extends BaseTaobaoRequest<ScitemOutercodeGetResponse> {
	
	

	/** 
	* 商品编码
	 */
	private String outerCode;

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public String getOuterCode() {
		return this.outerCode;
	}

	public String getApiMethodName() {
		return "taobao.scitem.outercode.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("outer_code", this.outerCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ScitemOutercodeGetResponse> getResponseClass() {
		return ScitemOutercodeGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(outerCode, "outerCode");
	}
	

}