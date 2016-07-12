package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.product.schema.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSchemaUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3696636376891126385L;

	/** 
	 * 产品数据，格式和入参xml_data一致，仅包含产品ID和更新时间
	 */
	@ApiField("update_product_result")
	private String updateProductResult;


	public void setUpdateProductResult(String updateProductResult) {
		this.updateProductResult = updateProductResult;
	}
	public String getUpdateProductResult( ) {
		return this.updateProductResult;
	}
	


}
