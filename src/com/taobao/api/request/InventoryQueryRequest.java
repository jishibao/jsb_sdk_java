package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.InventoryQueryResponse;

/**
 * TOP API: taobao.inventory.query request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.17
 */
public class InventoryQueryRequest extends BaseTaobaoRequest<InventoryQueryResponse> {
	
	

	/** 
	* 后端商品的商家编码列表，控制到50个
	 */
	private String scItemCodes;

	/** 
	* 后端商品ID 列表，控制到50个
	 */
	private String scItemIds;

	/** 
	* 卖家昵称
	 */
	private String sellerNick;

	/** 
	* 仓库列表:GLY001^GLY002
	 */
	private String storeCodes;

	public void setScItemCodes(String scItemCodes) {
		this.scItemCodes = scItemCodes;
	}

	public String getScItemCodes() {
		return this.scItemCodes;
	}

	public void setScItemIds(String scItemIds) {
		this.scItemIds = scItemIds;
	}

	public String getScItemIds() {
		return this.scItemIds;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setStoreCodes(String storeCodes) {
		this.storeCodes = storeCodes;
	}

	public String getStoreCodes() {
		return this.storeCodes;
	}

	public String getApiMethodName() {
		return "taobao.inventory.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("sc_item_codes", this.scItemCodes);
		txtParams.put("sc_item_ids", this.scItemIds);
		txtParams.put("seller_nick", this.sellerNick);
		txtParams.put("store_codes", this.storeCodes);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryQueryResponse> getResponseClass() {
		return InventoryQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(scItemIds, "scItemIds");
	}
	

}