package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.FavoriteShop;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.shoprecommend.shops.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShoprecommendShopsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3359287222594954732L;

	/** 
	 * 返回与店铺关联的店铺集
	 */
	@ApiListField("favorite_shops")
	@ApiField("favorite_shop")
	private List<FavoriteShop> favoriteShops;


	public void setFavoriteShops(List<FavoriteShop> favoriteShops) {
		this.favoriteShops = favoriteShops;
	}
	public List<FavoriteShop> getFavoriteShops( ) {
		return this.favoriteShops;
	}
	


}
