package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.FavoriteItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.itemrecommend.items.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemrecommendItemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4488766191168481411L;

	/** 
	 * 返回的推荐商品列表结果集
	 */
	@ApiListField("values")
	@ApiField("favorite_item")
	private List<FavoriteItem> values;


	public void setValues(List<FavoriteItem> values) {
		this.values = values;
	}
	public List<FavoriteItem> getValues( ) {
		return this.values;
	}
	


}
