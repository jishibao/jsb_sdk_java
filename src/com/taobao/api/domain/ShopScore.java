package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 店铺动态评分信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ShopScore extends TaobaoObject {

	private static final long serialVersionUID = 2269312195644973942L;

	/**
	 * 发货速度评分
	 */
	@ApiField("delivery_score")
	private String deliveryScore;

	/**
	 * 商品描述评分
	 */
	@ApiField("item_score")
	private String itemScore;

	/**
	 * 服务态度评分
	 */
	@ApiField("service_score")
	private String serviceScore;


	public String getDeliveryScore() {
		return this.deliveryScore;
	}
	public void setDeliveryScore(String deliveryScore) {
		this.deliveryScore = deliveryScore;
	}

	public String getItemScore() {
		return this.itemScore;
	}
	public void setItemScore(String itemScore) {
		this.itemScore = itemScore;
	}

	public String getServiceScore() {
		return this.serviceScore;
	}
	public void setServiceScore(String serviceScore) {
		this.serviceScore = serviceScore;
	}

}
