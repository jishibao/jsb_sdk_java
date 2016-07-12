package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.InventoryInitialResponse;

/**
 * TOP API: taobao.inventory.initial request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.01
 */
public class InventoryInitialRequest extends BaseTaobaoRequest<InventoryInitialResponse> {
	
	

	/** 
	* 商品初始库存信息： [{"scItemId":"商品后端ID，如果有传scItemCode,参数可以为0","scItemCode":"商品商家编码","inventoryType":"库存类型  1：正常,2：损坏,3：冻结,10：质押,11-20:用户自定义","quantity":"数量"}]
	 */
	private String items;

	/** 
	* 商家仓库编码
	 */
	private String storeCode;

	public void setItems(String items) {
		this.items = items;
	}

	public String getItems() {
		return this.items;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.inventory.initial";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("items", this.items);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryInitialResponse> getResponseClass() {
		return InventoryInitialResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(items, "items");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
	}
	

}