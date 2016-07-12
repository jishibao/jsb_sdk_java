package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2629345257167218159L;

	/** 
	 * 被删除商品的相关信息
	 */
	@ApiField("item")
	private Item item;


	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem( ) {
		return this.item;
	}
	


}
