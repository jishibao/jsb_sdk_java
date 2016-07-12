package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductSpecsTicketGetResponse;

/**
 * TOP API: tmall.product.specs.ticket.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class TmallProductSpecsTicketGetRequest extends BaseTaobaoRequest<TmallProductSpecsTicketGetResponse> {
	
	

	/** 
	* 产品规格ID，多个用逗号分隔
	 */
	private String specIds;

	public void setSpecIds(String specIds) {
		this.specIds = specIds;
	}

	public String getSpecIds() {
		return this.specIds;
	}

	public String getApiMethodName() {
		return "tmall.product.specs.ticket.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("spec_ids", this.specIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductSpecsTicketGetResponse> getResponseClass() {
		return TmallProductSpecsTicketGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(specIds, "specIds");
	}
	

}