package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ProductPropImg;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.product.propimg.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ProductPropimgDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5666635937228979782L;

	/** 
	 * 返回product_prop_img数据结构中的：product_id,id
	 */
	@ApiField("product_prop_img")
	private ProductPropImg productPropImg;


	public void setProductPropImg(ProductPropImg productPropImg) {
		this.productPropImg = productPropImg;
	}
	public ProductPropImg getProductPropImg( ) {
		return this.productPropImg;
	}
	


}
