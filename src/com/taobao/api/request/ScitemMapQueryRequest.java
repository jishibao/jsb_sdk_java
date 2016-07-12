package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ScitemMapQueryResponse;

/**
 * TOP API: taobao.scitem.map.query request
 * 
 * @author top auto create
 * @since 1.0, 2013.04.09
 */
public class ScitemMapQueryRequest extends BaseTaobaoRequest<ScitemMapQueryResponse> {
	
	

	/** 
	* map_type为1：前台ic商品id
map_type为2：分销productid
	 */
	private Long itemId;

	/** 
	* map_type为1：前台ic商品skuid 
map_type为2：分销商品的skuid
	 */
	private Long skuId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public String getApiMethodName() {
		return "taobao.scitem.map.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("sku_id", this.skuId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ScitemMapQueryResponse> getResponseClass() {
		return ScitemMapQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}