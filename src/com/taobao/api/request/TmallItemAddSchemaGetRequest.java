package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemAddSchemaGetResponse;

/**
 * TOP API: tmall.item.add.schema.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.11
 */
public class TmallItemAddSchemaGetRequest extends BaseTaobaoRequest<TmallItemAddSchemaGetResponse> {
	
	

	/** 
	* 商品发布的目标类目，必须是叶子类目
	 */
	private Long categoryId;

	/** 
	* 正常接口调用时，请忽略这个参数或者填FALSE。这个参数提供给ISV对接Schema时，如果想先获取了解所有字段和规则，可以将此字段设置为true，product_id也就不需要提供了，设置为0即可
	 */
	private Boolean isvInit;

	/** 
	* 商品发布的目标product_id
	 */
	private Long productId;

	/** 
	* 发布商品类型，一口价填“b”，拍卖填"a"
	 */
	private String type;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setIsvInit(Boolean isvInit) {
		this.isvInit = isvInit;
	}

	public Boolean getIsvInit() {
		return this.isvInit;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "tmall.item.add.schema.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("isv_init", this.isvInit);
		txtParams.put("product_id", this.productId);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemAddSchemaGetResponse> getResponseClass() {
		return TmallItemAddSchemaGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
	}
	

}