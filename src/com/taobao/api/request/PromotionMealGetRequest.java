package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.PromotionMealGetResponse;

/**
 * TOP API: taobao.promotion.meal.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.17
 */
public class PromotionMealGetRequest extends BaseTaobaoRequest<PromotionMealGetResponse> {
	
	

	/** 
	* 搭配套餐id
	 */
	private Long mealId;

	/** 
	* 套餐状态。有效：VALID;失效：INVALID(有效套餐为可使用的套餐,无效套餐为套餐中有商品下架或库存为0时)。默认时两种情况都会查询。
	 */
	private String status;

	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}

	public Long getMealId() {
		return this.mealId;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "taobao.promotion.meal.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("meal_id", this.mealId);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<PromotionMealGetResponse> getResponseClass() {
		return PromotionMealGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}