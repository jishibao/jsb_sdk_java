package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemSynchronizeDeleteResponse;

/**
 * TOP API: taobao.wlb.item.synchronize.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class WlbItemSynchronizeDeleteRequest extends BaseTaobaoRequest<WlbItemSynchronizeDeleteResponse> {
	
	

	/** 
	* 外部实体ID
	 */
	private Long extEntityId;

	/** 
	* 外部实体类型.存如下值 IC_ITEM --表示IC商品; IC_SKU --表示IC最小单位商品;若输入其他值，则按IC_ITEM处理
	 */
	private String extEntityType;

	/** 
	* 物流宝商品ID
	 */
	private Long itemId;

	public void setExtEntityId(Long extEntityId) {
		this.extEntityId = extEntityId;
	}

	public Long getExtEntityId() {
		return this.extEntityId;
	}

	public void setExtEntityType(String extEntityType) {
		this.extEntityType = extEntityType;
	}

	public String getExtEntityType() {
		return this.extEntityType;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.synchronize.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ext_entity_id", this.extEntityId);
		txtParams.put("ext_entity_type", this.extEntityType);
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemSynchronizeDeleteResponse> getResponseClass() {
		return WlbItemSynchronizeDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(extEntityId, "extEntityId");
		RequestCheckUtils.checkNotEmpty(extEntityType, "extEntityType");
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}