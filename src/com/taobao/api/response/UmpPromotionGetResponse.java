package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PromotionDisplayTop;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ump.promotion.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class UmpPromotionGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7148124811642596472L;

	/** 
	 * 优惠详细信息
	 */
	@ApiField("promotions")
	private PromotionDisplayTop promotions;


	public void setPromotions(PromotionDisplayTop promotions) {
		this.promotions = promotions;
	}
	public PromotionDisplayTop getPromotions( ) {
		return this.promotions;
	}
	


}
