package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.product.add.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductAddSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3243586181514646462L;

	/** 
	 * 返回发布产品的规则文档
	 */
	@ApiField("add_product_rule")
	private String addProductRule;


	public void setAddProductRule(String addProductRule) {
		this.addProductRule = addProductRule;
	}
	public String getAddProductRule( ) {
		return this.addProductRule;
	}
	


}
