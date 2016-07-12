package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ProductSpec;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.product.suitespecs.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSuitespecsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2474623595562835529L;

	/** 
	 * 返回一组产品规格信息。
	 */
	@ApiListField("product_specs")
	@ApiField("product_spec")
	private List<ProductSpec> productSpecs;


	public void setProductSpecs(List<ProductSpec> productSpecs) {
		this.productSpecs = productSpecs;
	}
	public List<ProductSpec> getProductSpecs( ) {
		return this.productSpecs;
	}
	


}
