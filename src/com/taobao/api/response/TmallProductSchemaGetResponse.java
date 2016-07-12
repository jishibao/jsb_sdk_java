package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.product.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5375269799167428767L;

	/** 
	 * 产品信息数据。schema形式
	 */
	@ApiField("get_product_result")
	private String getProductResult;


	public void setGetProductResult(String getProductResult) {
		this.getProductResult = getProductResult;
	}
	public String getGetProductResult( ) {
		return this.getProductResult;
	}
	


}
