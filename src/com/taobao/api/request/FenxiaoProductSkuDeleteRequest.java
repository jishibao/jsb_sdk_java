package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductSkuDeleteResponse;

/**
 * TOP API: taobao.fenxiao.product.sku.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoProductSkuDeleteRequest extends BaseTaobaoRequest<FenxiaoProductSkuDeleteResponse> {
	
	

	/** 
	* 产品id
	 */
	private Long productId;

	/** 
	* sku属性
	 */
	private String properties;

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
		return "taobao.fenxiao.product.sku.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("product_id", this.productId);
		txtParams.put("properties", this.properties);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductSkuDeleteResponse> getResponseClass() {
		return FenxiaoProductSkuDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(productId, "productId");
		RequestCheckUtils.checkNotEmpty(properties, "properties");
	}
	

}