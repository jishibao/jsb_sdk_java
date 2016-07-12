package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbInventorySyncResponse;

/**
 * TOP API: taobao.wlb.inventory.sync request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbInventorySyncRequest extends BaseTaobaoRequest<WlbInventorySyncResponse> {
	
	

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 外部实体类型.存如下值 
IC_ITEM --表示IC商品; 
IC_SKU --表示IC最小单位商品;
WLB_ITEM  --表示WLB商品.
若值不在范围内，则按WLB_ITEM处理
	 */
	private String itemType;

	/** 
	* 库存数量
	 */
	private Long quantity;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public String getApiMethodName() {
		return "taobao.wlb.inventory.sync";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("item_type", this.itemType);
		txtParams.put("quantity", this.quantity);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbInventorySyncResponse> getResponseClass() {
		return WlbInventorySyncResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(itemType, "itemType");
		RequestCheckUtils.checkNotEmpty(quantity, "quantity");
	}
	

}