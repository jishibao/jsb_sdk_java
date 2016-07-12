package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductSchemaAddResponse;

/**
 * TOP API: tmall.product.schema.add request
 * 
 * @author top auto create
 * @since 1.0, 2015.10.15
 */
public class TmallProductSchemaAddRequest extends BaseTaobaoRequest<TmallProductSchemaAddResponse> {
	
	

	/** 
	* 品牌ID
	 */
	private Long brandId;

	/** 
	* 商品发布的目标类目，必须是叶子类目
	 */
	private Long categoryId;

	/** 
	* 根据tmall.product.add.schema.get生成的产品发布规则入参数据
	 */
	private String xmlData;

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getBrandId() {
		return this.brandId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	public String getXmlData() {
		return this.xmlData;
	}

	public String getApiMethodName() {
		return "tmall.product.schema.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("brand_id", this.brandId);
		txtParams.put("category_id", this.categoryId);
		txtParams.put("xml_data", this.xmlData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductSchemaAddResponse> getResponseClass() {
		return TmallProductSchemaAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkNotEmpty(xmlData, "xmlData");
	}
	

}