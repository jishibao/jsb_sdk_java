package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 推荐的关联商品
 *
 * @author top auto create
 * @since 1.0, null
 */
public class FavoriteItem extends TaobaoObject {

	private static final long serialVersionUID = 7165346928585919982L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品图片地址
	 */
	@ApiField("item_pictrue")
	private String itemPictrue;

	/**
	 * 商品价格
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 商品的详情页面地址
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * 促销价格
	 */
	@ApiField("promotion_price")
	private String promotionPrice;

	/**
	 * 商品销售次数
	 */
	@ApiField("sell_count")
	private Long sellCount;

	/**
	 * 商品id（具有跟踪效果）代替原来的item_id  <a href="http://dev.open.taobao.com/bbs/read.php?tid=24323">详细说明</a>
	 */
	@ApiField("track_iid")
	private String trackIid;


	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPictrue() {
		return this.itemPictrue;
	}
	public void setItemPictrue(String itemPictrue) {
		this.itemPictrue = itemPictrue;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public String getPromotionPrice() {
		return this.promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Long getSellCount() {
		return this.sellCount;
	}
	public void setSellCount(Long sellCount) {
		this.sellCount = sellCount;
	}

	public String getTrackIid() {
		return this.trackIid;
	}
	public void setTrackIid(String trackIid) {
		this.trackIid = trackIid;
	}

}
