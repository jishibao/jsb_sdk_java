package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shop;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.shop.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShopGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8323714794735233477L;

	/** 
	 * 店铺信息
	 */
	@ApiField("shop")
	private Shop shop;


	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Shop getShop( ) {
		return this.shop;
	}
	


}
