package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 店铺级优惠信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionInShop extends TaobaoObject {

	private static final long serialVersionUID = 5372465341344792412L;

	/**
	 * 优惠活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 优惠详情描述。
	 */
	@ApiField("promotion_detail_desc")
	private String promotionDetailDesc;

	/**
	 * idValue值
	 */
	@ApiField("promotion_id")
	private String promotionId;


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPromotionDetailDesc() {
		return this.promotionDetailDesc;
	}
	public void setPromotionDetailDesc(String promotionDetailDesc) {
		this.promotionDetailDesc = promotionDetailDesc;
	}

	public String getPromotionId() {
		return this.promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

}
