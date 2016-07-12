package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WmsInventoryQueryItemlist extends TaobaoObject {

	private static final long serialVersionUID = 7872415983584163177L;

	/**
	 * 商品详情
	 */
	@ApiField("item")
	private WmsInventoryQueryItem item;


	public WmsInventoryQueryItem getItem() {
		return this.item;
	}
	public void setItem(WmsInventoryQueryItem item) {
		this.item = item;
	}

}
