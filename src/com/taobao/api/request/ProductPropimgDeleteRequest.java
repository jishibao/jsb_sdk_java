package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ProductPropimgDeleteResponse;

/**
 * TOP API: taobao.product.propimg.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class ProductPropimgDeleteRequest extends BaseTaobaoRequest<ProductPropimgDeleteResponse> {
	
	

	/** 
	* 属性图片ID
	 */
	private Long id;

	/** 
	* 产品ID.Product的id.
	 */
	private Long productId;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public String getApiMethodName() {
		return "taobao.product.propimg.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("product_id", this.productId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ProductPropimgDeleteResponse> getResponseClass() {
		return ProductPropimgDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(id, "id");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
	}
	

}