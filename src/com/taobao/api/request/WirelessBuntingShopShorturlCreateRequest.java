package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WirelessBuntingShopShorturlCreateResponse;

/**
 * TOP API: taobao.wireless.bunting.shop.shorturl.create request
 * 
 * @author top auto create
 * @since 1.0, 2014.07.22
 */
public class WirelessBuntingShopShorturlCreateRequest extends BaseTaobaoRequest<WirelessBuntingShopShorturlCreateResponse> {
	
	

	/** 
	* 商店id
	 */
	private String shopId;

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopId() {
		return this.shopId;
	}

	public String getApiMethodName() {
		return "taobao.wireless.bunting.shop.shorturl.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("shop_id", this.shopId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WirelessBuntingShopShorturlCreateResponse> getResponseClass() {
		return WirelessBuntingShopShorturlCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}