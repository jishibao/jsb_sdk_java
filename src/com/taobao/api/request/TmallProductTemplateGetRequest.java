package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductTemplateGetResponse;

/**
 * TOP API: tmall.product.template.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class TmallProductTemplateGetRequest extends BaseTaobaoRequest<TmallProductTemplateGetResponse> {
	
	

	/** 
	* 类目ID
	 */
	private Long cid;

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCid() {
		return this.cid;
	}

	public String getApiMethodName() {
		return "tmall.product.template.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cid", this.cid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductTemplateGetResponse> getResponseClass() {
		return TmallProductTemplateGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cid, "cid");
	}
	

}