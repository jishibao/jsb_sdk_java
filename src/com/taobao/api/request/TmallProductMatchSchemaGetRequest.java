package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductMatchSchemaGetResponse;

/**
 * TOP API: tmall.product.match.schema.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class TmallProductMatchSchemaGetRequest extends BaseTaobaoRequest<TmallProductMatchSchemaGetResponse> {
	
	

	/** 
	* 商品发布的目标类目，必须是叶子类目
	 */
	private Long categoryId;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public String getApiMethodName() {
		return "tmall.product.match.schema.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductMatchSchemaGetResponse> getResponseClass() {
		return TmallProductMatchSchemaGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
	}
	

}