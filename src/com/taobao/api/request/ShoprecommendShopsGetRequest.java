package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ShoprecommendShopsGetResponse;

/**
 * TOP API: taobao.shoprecommend.shops.get request
 * 
 * @author top auto create
 * @since 1.0, 2012.03.23
 */
public class ShoprecommendShopsGetRequest extends BaseTaobaoRequest<ShoprecommendShopsGetResponse> {
	
	

	/** 
	* 请求个数，建议获取16个
	 */
	private Long count;

	/** 
	* 额外参数
	 */
	private String ext;

	/** 
	* 请求类型，1：关联店铺推荐。其他值当非法值处理
	 */
	private Long recommendType;

	/** 
	* 传入卖家ID
	 */
	private Long sellerId;

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getCount() {
		return this.count;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getExt() {
		return this.ext;
	}

	public void setRecommendType(Long recommendType) {
		this.recommendType = recommendType;
	}

	public Long getRecommendType() {
		return this.recommendType;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getSellerId() {
		return this.sellerId;
	}

	public String getApiMethodName() {
		return "taobao.shoprecommend.shops.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("count", this.count);
		txtParams.put("ext", this.ext);
		txtParams.put("recommend_type", this.recommendType);
		txtParams.put("seller_id", this.sellerId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ShoprecommendShopsGetResponse> getResponseClass() {
		return ShoprecommendShopsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(count, "count");
		RequestCheckUtils.checkNotEmpty(recommendType, "recommendType");
		RequestCheckUtils.checkNotEmpty(sellerId, "sellerId");
	}
	

}