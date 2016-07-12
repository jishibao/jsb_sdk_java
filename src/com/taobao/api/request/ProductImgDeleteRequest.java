package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ProductImgDeleteResponse;

/**
 * TOP API: taobao.product.img.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class ProductImgDeleteRequest extends BaseTaobaoRequest<ProductImgDeleteResponse> {
	
	

	/** 
	* 非主图ID
	 */
	private Long id;

	/** 
	* 产品ID.Product的id,通过taobao.product.add接口新增产品的时候会返回id.
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
		return "taobao.product.img.delete";
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

	public Class<ProductImgDeleteResponse> getResponseClass() {
		return ProductImgDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(id, "id");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
	}
	

}