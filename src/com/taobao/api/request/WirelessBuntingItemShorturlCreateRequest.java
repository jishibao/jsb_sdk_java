package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WirelessBuntingItemShorturlCreateResponse;

/**
 * TOP API: taobao.wireless.bunting.item.shorturl.create request
 * 
 * @author top auto create
 * @since 1.0, 2014.07.16
 */
public class WirelessBuntingItemShorturlCreateRequest extends BaseTaobaoRequest<WirelessBuntingItemShorturlCreateResponse> {
	
	

	/** 
	* 商品ID
	 */
	private String itemId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "taobao.wireless.bunting.item.shorturl.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WirelessBuntingItemShorturlCreateResponse> getResponseClass() {
		return WirelessBuntingItemShorturlCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}