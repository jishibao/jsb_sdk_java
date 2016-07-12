package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.FavoriteItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.userrecommend.items.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class UserrecommendItemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2478826737993133347L;

	/** 
	 * 返回用户相关的关联宝贝集合
	 */
	@ApiListField("favorite_items")
	@ApiField("favorite_item")
	private List<FavoriteItem> favoriteItems;


	public void setFavoriteItems(List<FavoriteItem> favoriteItems) {
		this.favoriteItems = favoriteItems;
	}
	public List<FavoriteItem> getFavoriteItems( ) {
		return this.favoriteItems;
	}
	


}
