package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemIncrementUpdateSchemaGetResponse;

/**
 * TOP API: taobao.item.increment.update.schema.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.05.06
 */
public class ItemIncrementUpdateSchemaGetRequest extends BaseTaobaoRequest<ItemIncrementUpdateSchemaGetResponse> {
	
	

	/** 
	* 宝贝类目id
	 */
	private Long categoryId;

	/** 
	* 宝贝id
	 */
	private Long itemId;

	/** 
	* 修改字段
	 */
	private String updateFields;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setUpdateFields(String updateFields) {
		this.updateFields = updateFields;
	}

	public String getUpdateFields() {
		return this.updateFields;
	}

	public String getApiMethodName() {
		return "taobao.item.increment.update.schema.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("item_id", this.itemId);
		txtParams.put("update_fields", this.updateFields);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemIncrementUpdateSchemaGetResponse> getResponseClass() {
		return ItemIncrementUpdateSchemaGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}