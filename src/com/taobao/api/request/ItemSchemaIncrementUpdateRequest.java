package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemSchemaIncrementUpdateResponse;

/**
 * TOP API: taobao.item.schema.increment.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.05.07
 */
public class ItemSchemaIncrementUpdateRequest extends BaseTaobaoRequest<ItemSchemaIncrementUpdateResponse> {
	
	

	/** 
	* 商品类目id
	 */
	private Long categoryId;

	/** 
	* 商品id
	 */
	private Long itemId;

	/** 
	* 修改字段
	 */
	private String parameters;

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

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getParameters() {
		return this.parameters;
	}

	public String getApiMethodName() {
		return "taobao.item.schema.increment.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("item_id", this.itemId);
		txtParams.put("parameters", this.parameters);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemSchemaIncrementUpdateResponse> getResponseClass() {
		return ItemSchemaIncrementUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(parameters, "parameters");
	}
	

}