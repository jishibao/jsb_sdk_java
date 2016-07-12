package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercats.list.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercatsListGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5565328796823322568L;

	/** 
	 * 卖家自定义类目
	 */
	@ApiListField("seller_cats")
	@ApiField("seller_cat")
	private List<SellerCat> sellerCats;


	public void setSellerCats(List<SellerCat> sellerCats) {
		this.sellerCats = sellerCats;
	}
	public List<SellerCat> getSellerCats( ) {
		return this.sellerCats;
	}
	


}
