package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.add.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemAddSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3469513958165684311L;

	/** 
	 * 返回发布商品的规则文档
	 */
	@ApiField("add_item_result")
	private String addItemResult;


	public void setAddItemResult(String addItemResult) {
		this.addItemResult = addItemResult;
	}
	public String getAddItemResult( ) {
		return this.addItemResult;
	}
	


}
