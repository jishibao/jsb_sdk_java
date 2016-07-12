package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PromotionActivityGetResponse;

/**
 * TOP API: taobao.promotion.activity.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.17
 */
public class PromotionActivityGetRequest extends BaseTaobaoRequest<PromotionActivityGetResponse> {
	
	

	/** 
	* 活动的id
	 */
	private Long activityId;

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Long getActivityId() {
		return this.activityId;
	}

	public String getApiMethodName() {
		return "taobao.promotion.activity.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("activity_id", this.activityId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PromotionActivityGetResponse> getResponseClass() {
		return PromotionActivityGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}