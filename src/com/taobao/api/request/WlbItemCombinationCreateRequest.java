package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemCombinationCreateResponse;

/**
 * TOP API: taobao.wlb.item.combination.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbItemCombinationCreateRequest extends BaseTaobaoRequest<WlbItemCombinationCreateResponse> {
	
	

	/** 
	* 组合商品的id列表
	 */
	private String destItemList;

	/** 
	* 要建立组合关系的商品id
	 */
	private Long itemId;

	/** 
	* 组成组合商品的比例列表，描述组合商品的组合比例，默认为1,1,1
	 */
	private String proportionList;

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

	public void setProportionList(String proportionList) {
		this.proportionList = proportionList;
	}

	public String getProportionList() {
		return this.proportionList;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.combination.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dest_item_list", this.destItemList);
		txtParams.put("item_id", this.itemId);
		txtParams.put("proportion_list", this.proportionList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemCombinationCreateResponse> getResponseClass() {
		return WlbItemCombinationCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(destItemList, "destItemList");
		RequestCheckUtils.checkMaxListSize(destItemList, 20, "destItemList");
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkMaxListSize(proportionList, 20, "proportionList");
	}
	

}