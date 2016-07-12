package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 新门票类目商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TicketItem extends TaobaoObject {

	private static final long serialVersionUID = 2373878741947585929L;

	/**
	 * 商品返点比例（只对B卖家开放，单位为%）
	 */
	@ApiField("auction_point")
	private String auctionPoint;

	/**
	 * 商品状态（onsale：上架，instock：仓库）
	 */
	@ApiField("auction_status")
	private String auctionStatus;

	/**
	 * 类目标识
	 */
	@ApiField("cat_id")
	private Long catId;

	/**
	 * 核销机具提供商
	 */
	@ApiField("check_tool_merchant")
	private String checkToolMerchant;

	/**
	 * 商品所在地-城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品对应的错误信息。针对get接口使用。
	 */
	@ApiField("err_msg")
	private String errMsg;

	/**
	 * 商品电子凭证信息-在门票商品为电子凭证时必选
	 */
	@ApiField("etc")
	private TicketEtc etc;

	/**
	 * 商品是否有发票（有发票为true，没有发票为false）
	 */
	@ApiField("have_invoice")
	private Boolean haveInvoice;

	/**
	 * 商品主图
	 */
	@ApiField("image_1")
	private String image1;

	/**
	 * 商品第一张多图
	 */
	@ApiField("image_2")
	private String image2;

	/**
	 * 商品第二张多图
	 */
	@ApiField("image_3")
	private String image3;

	/**
	 * 商品第三张多图
	 */
	@ApiField("image_4")
	private String image4;

	/**
	 * 商品第四张多图
	 */
	@ApiField("image_5")
	private String image5;

	/**
	 * 商品的标识
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 商品的上架时间（精确到分，格式为：yyyy-MM-dd HH:mm）
	 */
	@ApiField("list_time")
	private String listTime;

	/**
	 * 商品的物流运费模板-在产品规格使用到物流时必选
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * 产品（具有产品规格的）标识
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 商品是否橱窗推荐（橱窗推荐；true，不推荐：false）
	 */
	@ApiField("promoted_status")
	private Boolean promotedStatus;

	/**
	 * 商品所在地-省份
	 */
	@ApiField("prov")
	private String prov;

	/**
	 * 卖家客服电话
	 */
	@ApiField("seller_cs_phone")
	private String sellerCsPhone;

	/**
	 * 宝贝所属的店铺分类列表-店铺分类标识请使用店铺相关接口获取获取，多个店铺分类标识之间通过逗号进行分隔，最多包含10个分类标识
	 */
	@ApiField("shop_cats")
	private String shopCats;

	/**
	 * 参见taobao.ticket.item.add文档描述
	 */
	@ApiField("skus")
	private String skus;

	/**
	 * 商品是否为拍下减库存（拍下减库存为true，付款减库存为false）
	 */
	@ApiField("sub_stock_at_buy")
	private Boolean subStockAtBuy;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品视频-视频标识由多媒体中相关接口获取
	 */
	@ApiField("video_id")
	private Long videoId;

	/**
	 * 商品是否参与店铺会员打折
	 */
	@ApiField("vip_promoted")
	private Boolean vipPromoted;


	public String getAuctionPoint() {
		return this.auctionPoint;
	}
	public void setAuctionPoint(String auctionPoint) {
		this.auctionPoint = auctionPoint;
	}

	public String getAuctionStatus() {
		return this.auctionStatus;
	}
	public void setAuctionStatus(String auctionStatus) {
		this.auctionStatus = auctionStatus;
	}

	public Long getCatId() {
		return this.catId;
	}
	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getCheckToolMerchant() {
		return this.checkToolMerchant;
	}
	public void setCheckToolMerchant(String checkToolMerchant) {
		this.checkToolMerchant = checkToolMerchant;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getErrMsg() {
		return this.errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public TicketEtc getEtc() {
		return this.etc;
	}
	public void setEtc(TicketEtc etc) {
		this.etc = etc;
	}

	public Boolean getHaveInvoice() {
		return this.haveInvoice;
	}
	public void setHaveInvoice(Boolean haveInvoice) {
		this.haveInvoice = haveInvoice;
	}

	public String getImage1() {
		return this.image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return this.image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return this.image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return this.image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage5() {
		return this.image5;
	}
	public void setImage5(String image5) {
		this.image5 = image5;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getListTime() {
		return this.listTime;
	}
	public void setListTime(String listTime) {
		this.listTime = listTime;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Boolean getPromotedStatus() {
		return this.promotedStatus;
	}
	public void setPromotedStatus(Boolean promotedStatus) {
		this.promotedStatus = promotedStatus;
	}

	public String getProv() {
		return this.prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getSellerCsPhone() {
		return this.sellerCsPhone;
	}
	public void setSellerCsPhone(String sellerCsPhone) {
		this.sellerCsPhone = sellerCsPhone;
	}

	public String getShopCats() {
		return this.shopCats;
	}
	public void setShopCats(String shopCats) {
		this.shopCats = shopCats;
	}

	public String getSkus() {
		return this.skus;
	}
	public void setSkus(String skus) {
		this.skus = skus;
	}

	public Boolean getSubStockAtBuy() {
		return this.subStockAtBuy;
	}
	public void setSubStockAtBuy(Boolean subStockAtBuy) {
		this.subStockAtBuy = subStockAtBuy;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getVideoId() {
		return this.videoId;
	}
	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public Boolean getVipPromoted() {
		return this.vipPromoted;
	}
	public void setVipPromoted(Boolean vipPromoted) {
		this.vipPromoted = vipPromoted;
	}

}
