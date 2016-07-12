package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.LimitDiscountDetail;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.limitdiscount.detail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionLimitdiscountDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3634794788732832495L;

	/** 
	 * 限时打折对应的商品详情列表。
	 */
	@ApiListField("item_discount_detail_list")
	@ApiField("limit_discount_detail")
	private List<LimitDiscountDetail> itemDiscountDetailList;


	public void setItemDiscountDetailList(List<LimitDiscountDetail> itemDiscountDetailList) {
		this.itemDiscountDetailList = itemDiscountDetailList;
	}
	public List<LimitDiscountDetail> getItemDiscountDetailList( ) {
		return this.itemDiscountDetailList;
	}
	


}
