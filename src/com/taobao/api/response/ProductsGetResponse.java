package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.products.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ProductsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2797228648156428336L;

	/** 
	 * 返回具体信息为入参fields请求的字段信息
	 */
	@ApiListField("products")
	@ApiField("product")
	private List<Product> products;


	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Product> getProducts( ) {
		return this.products;
	}
	


}
