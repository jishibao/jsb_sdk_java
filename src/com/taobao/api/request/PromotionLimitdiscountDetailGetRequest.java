package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PromotionLimitdiscountDetailGetResponse;

/**
 * TOP API: taobao.promotion.limitdiscount.detail.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class PromotionLimitdiscountDetailGetRequest extends BaseTaobaoRequest<PromotionLimitdiscountDetailGetResponse> {
	
	

	/** 
	* 限时打折ID。这个针对查询唯一限时打折情况。
	 */
	private Long limitDiscountId;

	public void setLimitDiscountId(Long limitDiscountId) {
		this.limitDiscountId = limitDiscountId;
	}

	public Long getLimitDiscountId() {
		return this.limitDiscountId;
	}

	public String getApiMethodName() {
		return "taobao.promotion.limitdiscount.detail.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("limit_discount_id", this.limitDiscountId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PromotionLimitdiscountDetailGetResponse> getResponseClass() {
		return PromotionLimitdiscountDetailGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(limitDiscountId, "limitDiscountId");
	}
	

}