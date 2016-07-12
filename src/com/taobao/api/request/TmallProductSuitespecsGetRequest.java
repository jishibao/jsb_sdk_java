package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductSuitespecsGetResponse;

/**
 * TOP API: tmall.product.suitespecs.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class TmallProductSuitespecsGetRequest extends BaseTaobaoRequest<TmallProductSuitespecsGetResponse> {
	
	

	/** 
	* 类目的ID号，该id必须和properties同时传入。
而且只有当product_id不传入的时候才起效果。
	 */
	private Long catId;

	/** 
	* 产品的ID。这个不能和properties和cat_id同时起效果
	 */
	private Long productId;

	/** 
	* 关键属性的字符串，pid:vid;pid:vid
该字段必须和cat_id同时传入才起效果。 而且只有当product_id不传入的时候才起效果。
	 */
	private String properties;

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public Long getCatId() {
		return this.catId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getProperties() {
		return this.properties;
	}

	public String getApiMethodName() {
		return "tmall.product.suitespecs.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cat_id", this.catId);
		txtParams.put("product_id", this.productId);
		txtParams.put("properties", this.properties);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductSuitespecsGetResponse> getResponseClass() {
		return TmallProductSuitespecsGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}