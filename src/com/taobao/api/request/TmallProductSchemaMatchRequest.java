package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductSchemaMatchResponse;

/**
 * TOP API: tmall.product.schema.match request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class TmallProductSchemaMatchRequest extends BaseTaobaoRequest<TmallProductSchemaMatchResponse> {
	
	

	/** 
	* 商品发布的目标类目，必须是叶子类目
	 */
	private Long categoryId;

	/** 
	* 根据tmall.product.match.schema.get获取到的模板，ISV将需要的字段填充好相应的值结果XML。
	 */
	private String propvalues;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setPropvalues(String propvalues) {
		this.propvalues = propvalues;
	}

	public String getPropvalues() {
		return this.propvalues;
	}

	public String getApiMethodName() {
		return "tmall.product.schema.match";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("propvalues", this.propvalues);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductSchemaMatchResponse> getResponseClass() {
		return TmallProductSchemaMatchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkNotEmpty(propvalues, "propvalues");
	}
	

}