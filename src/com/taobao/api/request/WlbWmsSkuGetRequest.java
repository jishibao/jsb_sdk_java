package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsSkuGetResponse;

/**
 * TOP API: taobao.wlb.wms.sku.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.24
 */
public class WlbWmsSkuGetRequest extends BaseTaobaoRequest<WlbWmsSkuGetResponse> {
	
	

	/** 
	* 菜鸟商品ID,与itemcode必须有一个值不为空
	 */
	private String itemCode;

	/** 
	* 商家商品编码,与itemid必须有一个值不为空
	 */
	private String itemId;

	/** 
	* 货主ID
	 */
	private String ownerUserId;

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.sku.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_code", this.itemCode);
		txtParams.put("item_id", this.itemId);
		txtParams.put("owner_user_id", this.ownerUserId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsSkuGetResponse> getResponseClass() {
		return WlbWmsSkuGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}