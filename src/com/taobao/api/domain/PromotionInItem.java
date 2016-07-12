package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 单品级优惠信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionInItem extends TaobaoObject {

	private static final long serialVersionUID = 6639998226236629268L;

	/**
	 * 优惠描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 优惠结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 优惠折后价格
	 */
	@ApiField("item_promo_price")
	private String itemPromoPrice;

	/**
	 * 优惠展示名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 需要支付附加物，显示为+xxx。如：+20淘金币
	 */
	@ApiField("other_need")
	private String otherNeed;

	/**
	 * 赠送东西。如：送10商城积分
	 */
	@ApiField("other_send")
	private String otherSend;

	/**
	 * idValue的值
	 */
	@ApiField("promotion_id")
	private String promotionId;

	/**
	 * sku价格对应的id（保证二者顺序相同）
	 */
	@ApiListField("sku_id_list")
	@ApiField("string")
	private List<String> skuIdList;

	/**
	 * sku价格列表
	 */
	@ApiListField("sku_price_list")
	@ApiField("price")
	private List<String> skuPriceList;

	/**
	 * 优惠开始时间
	 */
	@ApiField("start_time")
	private Date startTime;


	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getItemPromoPrice() {
		return this.itemPromoPrice;
	}
	public void setItemPromoPrice(String itemPromoPrice) {
		this.itemPromoPrice = itemPromoPrice;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOtherNeed() {
		return this.otherNeed;
	}
	public void setOtherNeed(String otherNeed) {
		this.otherNeed = otherNeed;
	}

	public String getOtherSend() {
		return this.otherSend;
	}
	public void setOtherSend(String otherSend) {
		this.otherSend = otherSend;
	}

	public String getPromotionId() {
		return this.promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public List<String> getSkuIdList() {
		return this.skuIdList;
	}
	public void setSkuIdList(List<String> skuIdList) {
		this.skuIdList = skuIdList;
	}

	public List<String> getSkuPriceList() {
		return this.skuPriceList;
	}
	public void setSkuPriceList(List<String> skuPriceList) {
		this.skuPriceList = skuPriceList;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
