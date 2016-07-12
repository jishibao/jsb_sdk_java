package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductSchemaUpdateResponse;

/**
 * TOP API: tmall.product.schema.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.10.15
 */
public class TmallProductSchemaUpdateRequest extends BaseTaobaoRequest<TmallProductSchemaUpdateResponse> {
	
	

	/** 
	* 产品编号
	 */
	private Long productId;

	/** 
	* 根据tmall.product.update.schema.get生成的产品更新规则入参数据
	 */
	private String xmlData;

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
		return "tmall.product.schema.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("product_id", this.productId);
		txtParams.put("xml_data", this.xmlData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductSchemaUpdateResponse> getResponseClass() {
		return TmallProductSchemaUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(productId, "productId");
		RequestCheckUtils.checkNotEmpty(xmlData, "xmlData");
	}
	

}