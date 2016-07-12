package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.update.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemUpdateSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4868391695116976928L;

	/** 
	 * 返回发布商品的规则文档
	 */
	@ApiField("update_item_result")
	private String updateItemResult;


	public void setUpdateItemResult(String updateItemResult) {
		this.updateItemResult = updateItemResult;
	}
	public String getUpdateItemResult( ) {
		return this.updateItemResult;
	}
	


}
