package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductSpecGetResponse;

/**
 * TOP API: tmall.product.spec.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.08
 */
public class TmallProductSpecGetRequest extends BaseTaobaoRequest<TmallProductSpecGetResponse> {
	
	

	/** 
	* 要获取信息的产品规格信息。
	 */
	private Long specId;

	public void setSpecId(Long specId) {
		this.specId = specId;
	}

	public Long getSpecId() {
		return this.specId;
	}

	public String getApiMethodName() {
		return "tmall.product.spec.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("spec_id", this.specId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductSpecGetResponse> getResponseClass() {
		return TmallProductSpecGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(specId, "specId");
	}
	

}