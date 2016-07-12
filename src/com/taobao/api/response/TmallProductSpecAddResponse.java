package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ProductSpec;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.product.spec.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSpecAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5861247743596194964L;

	/** 
	 * 产品规格对象
	 */
	@ApiField("product_spec")
	private ProductSpec productSpec;


	public void setProductSpec(ProductSpec productSpec) {
		this.productSpec = productSpec;
	}
	public ProductSpec getProductSpec( ) {
		return this.productSpec;
	}
	


}
