package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemSchemaAddResponse;

/**
 * TOP API: tmall.item.schema.add request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.17
 */
public class TmallItemSchemaAddRequest extends BaseTaobaoRequest<TmallItemSchemaAddResponse> {
	
	

	/** 
	* 商品发布的目标类目，必须是叶子类目
	 */
	private Long categoryId;

	/** 
	* 发布商品的productId，如果tmall.product.match.schema.get获取到得字段为空，这个参数传入0，否则需要通过tmall.product.schema.match查询到得可用productId
	 */
	private Long productId;

	/** 
	* 根据tmall.item.add.schema.get生成的商品发布规则入参数据
	 */
	private String xmlData;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	public String getXmlData() {
		return this.xmlData;
	}

	public String getApiMethodName() {
		return "tmall.item.schema.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("product_id", this.productId);
		txtParams.put("xml_data", this.xmlData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemSchemaAddResponse> getResponseClass() {
		return TmallItemSchemaAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
		RequestCheckUtils.checkNotEmpty(xmlData, "xmlData");
	}
	

}