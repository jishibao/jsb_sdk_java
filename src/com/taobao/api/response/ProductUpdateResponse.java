package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Product;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.product.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ProductUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4126813762573294652L;

	/** 
	 * 返回product数据结构中的：product_id,modified
	 */
	@ApiField("product")
	private Product product;


	public void setProduct(Product product) {
		this.product = product;
	}
	public Product getProduct( ) {
		return this.product;
	}
	


}
