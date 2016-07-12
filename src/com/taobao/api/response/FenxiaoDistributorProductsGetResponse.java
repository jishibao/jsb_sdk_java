package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.FenxiaoProduct;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.distributor.products.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDistributorProductsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4417222644336167985L;

	/** 
	 * 是否存在下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 产品对象记录集。返回 FenxiaoProduct 包含的字段信息。
	 */
	@ApiListField("products")
	@ApiField("fenxiao_product")
	private List<FenxiaoProduct> products;


	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setProducts(List<FenxiaoProduct> products) {
		this.products = products;
	}
	public List<FenxiaoProduct> getProducts( ) {
		return this.products;
	}
	


}
