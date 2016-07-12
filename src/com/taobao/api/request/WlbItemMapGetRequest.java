package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemMapGetResponse;

/**
 * TOP API: taobao.wlb.item.map.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.26
 */
public class WlbItemMapGetRequest extends BaseTaobaoRequest<WlbItemMapGetResponse> {
	
	

	/** 
	* 要查询映射关系的物流宝商品id
	 */
	private Long itemId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.map.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemMapGetResponse> getResponseClass() {
		return WlbItemMapGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}