package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.InventoryStoreQueryResponse;

/**
 * TOP API: taobao.inventory.store.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.16
 */
public class InventoryStoreQueryRequest extends BaseTaobaoRequest<InventoryStoreQueryResponse> {
	
	

	/** 
	* 商家的仓库编码
	 */
	private String storeCode;

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.inventory.store.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryStoreQueryResponse> getResponseClass() {
		return InventoryStoreQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}