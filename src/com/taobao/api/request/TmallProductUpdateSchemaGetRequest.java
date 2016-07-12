package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallProductUpdateSchemaGetResponse;

/**
 * TOP API: tmall.product.update.schema.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.29
 */
public class TmallProductUpdateSchemaGetRequest extends BaseTaobaoRequest<TmallProductUpdateSchemaGetResponse> {
	
	

	/** 
	* 产品编号
	 */
	private Long productId;

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public String getApiMethodName() {
		return "tmall.product.update.schema.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("product_id", this.productId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallProductUpdateSchemaGetResponse> getResponseClass() {
		return TmallProductUpdateSchemaGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(productId, "productId");
	}
	

}