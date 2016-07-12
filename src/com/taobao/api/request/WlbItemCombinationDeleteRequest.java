package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemCombinationDeleteResponse;

/**
 * TOP API: taobao.wlb.item.combination.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbItemCombinationDeleteRequest extends BaseTaobaoRequest<WlbItemCombinationDeleteResponse> {
	
	

	/** 
	* 组合商品的id列表
	 */
	private String destItemList;

	/** 
	* 组合关系的商品id
	 */
	private Long itemId;

	public void setDestItemList(String destItemList) {
		this.destItemList = destItemList;
	}

	public String getDestItemList() {
		return this.destItemList;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.combination.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dest_item_list", this.destItemList);
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemCombinationDeleteResponse> getResponseClass() {
		return WlbItemCombinationDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(destItemList, "destItemList");
		RequestCheckUtils.checkMaxListSize(destItemList, 20, "destItemList");
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}