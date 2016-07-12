package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsItemCombinationDeleteResponse;

/**
 * TOP API: taobao.wlb.wms.item.combination.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.22
 */
public class WlbWmsItemCombinationDeleteRequest extends BaseTaobaoRequest<WlbWmsItemCombinationDeleteResponse> {
	
	

	/** 
	* 组合货品ID
	 */
	private Long itemId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.item.combination.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsItemCombinationDeleteResponse> getResponseClass() {
		return WlbWmsItemCombinationDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}