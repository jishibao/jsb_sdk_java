package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.price.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemPriceUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5721456399271683571L;

	/** 
	 * 商品结构里的num_iid，modified
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
