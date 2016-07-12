package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemUpdateSchemaGetResponse;

/**
 * TOP API: tmall.item.update.schema.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.11
 */
public class TmallItemUpdateSchemaGetRequest extends BaseTaobaoRequest<TmallItemUpdateSchemaGetResponse> {
	
	

	/** 
	* 商品发布的目标类目，必须是叶子类目。如果没有切换类目需求，不需要填写。
	 */
	private Long categoryId;

	/** 
	* 需要编辑的商品ID
	 */
	private Long itemId;

	/** 
	* 商品发布的目标product_id。如果没有切换产品的需求，参数可以不填写。
	 */
	private Long productId;

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

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public String getApiMethodName() {
		return "tmall.item.update.schema.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("item_id", this.itemId);
		txtParams.put("product_id", this.productId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemUpdateSchemaGetResponse> getResponseClass() {
		return TmallItemUpdateSchemaGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}