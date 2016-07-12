package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ProductSpec;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.product.spec.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSpecGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4633828228828775796L;

	/** 
	 * 返回的产品规格信息，注意，这个产品规格信息可能是等待审核的，不一定可用。根据状态判断1：表示审核通过
3：表示等待审核。
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
