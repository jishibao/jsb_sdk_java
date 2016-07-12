package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shop;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.shop.remainshowcase.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShopRemainshowcaseGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6799843627394243122L;

	/** 
	 * 支持返回剩余橱窗数量，已用橱窗数量，总橱窗数量
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
