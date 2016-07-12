package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.products.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ProductsSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7557278258398752494L;

	/** 
	 * 返回具体信息为入参fields请求的字段信息
	 */
	@ApiListField("products")
	@ApiField("product")
	private List<Product> products;

	/** 
	 * 结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Product> getProducts( ) {
		return this.products;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
