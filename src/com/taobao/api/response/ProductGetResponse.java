package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Product;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.product.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ProductGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1277476763137421519L;

	/** 
	 * 返回具体信息为入参fields请求的字段信息
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
