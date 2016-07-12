package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemcatsAuthorizeGetResponse;

/**
 * TOP API: taobao.itemcats.authorize.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.16
 */
public class ItemcatsAuthorizeGetRequest extends BaseTaobaoRequest<ItemcatsAuthorizeGetResponse> {
	
	

	/** 
	* 需要返回的字段。目前支持有：
brand.vid, brand.name, 
item_cat.cid, item_cat.name, item_cat.status,item_cat.sort_order,item_cat.parent_cid,item_cat.is_parent,
xinpin_item_cat.cid, 
xinpin_item_cat.name, 
xinpin_item_cat.status,
xinpin_item_cat.sort_order,
xinpin_item_cat.parent_cid,
xinpin_item_cat.is_parent
	 */
	private String fields;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public String getApiMethodName() {
		return "taobao.itemcats.authorize.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemcatsAuthorizeGetResponse> getResponseClass() {
		return ItemcatsAuthorizeGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
	}
	

}