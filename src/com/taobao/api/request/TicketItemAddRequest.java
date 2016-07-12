package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TicketItemAddResponse;

/**
 * TOP API: taobao.ticket.item.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.14
 */
public class TicketItemAddRequest extends BaseTaobaoRequest<TicketItemAddResponse> {
	
	

	/** 
	* 门票商品返点比例（只对B卖家开放，单位为%）
	 */
	private String auctionPoint;

	/** 
	* 门票商品状态（onsale：上架，instock：仓库）
	 */
	private String auctionStatus;

	/** 
	* 核销机具提供商
	 */
	private String checkToolMerchant;

	/** 
	* 门票商品所在地-城市
	 */
	private String city;

	/** 
	* 门票宝贝描述
	 */
	private String description;

	/** 
	* 门票商品电子凭证是否关联本地商户-在门票商品为电子凭证时必选
	 */
	private Boolean etcAssociationStatus;

	/** 
	* 门票商品电子凭证的自动退款比例-在门票商品为电子凭证时必选
	 */
	private Long etcAutoRefund;

	/** 
	* 门票商品电子凭证的码商-在门票商品为电子凭证时必选
	 */
	private String etcMerchantId;

	/** 
	* 门票商品电子凭证的码商名-在门票商品为电子凭证时必选
	 */
	private String etcMerchantNick;

	/** 
	* 门票商品电子凭证网店ID-在门票商品为电子凭证时必选
	 */
	private String etcNetworkId;

	/** 
	* 门票商品电子凭证的过期退款比例-在门票商品为电子凭证时必选
	 */
	private Long etcOverduePay;

	/** 
	* 门票商品电子凭证是否核销打款-在门票商品为电子凭证时必选
	 */
	private Boolean etcVerificationPay;

	/** 
	* 门票商品是否有发票（有发票：true，没有发票：false）.
对于B卖家来说只能选择有发票。
	 */
	private Boolean haveInvoice;

	/** 
	* 商品主图-该值来自图片空间接口返回的图片链接（不包含域名和前缀）
	 */
	private String image1;

	/** 
	* 第一张多图-该值来自图片空间接口返回的图片链接（不包含域名和前缀）
	 */
	private String image2;

	/** 
	* 第二张多图-该值来自图片空间接口返回的图片链接（不包含域名和前缀）
	 */
	private String image3;

	/** 
	* 第三张多图-该值来自图片空间接口返回的图片链接（不包含域名和前缀）
	 */
	private String image4;

	/** 
	* 第四张多图-该值来自图片空间接口返回的图片链接（不包含域名和前缀）
	 */
	private String image5;

	/** 
	* 门票商品的上架时间（精确到分，格式为：yyyy-MM-dd HH:mm）
	 */
	private String listTime;

	/** 
	* 门票商品的物流运费模板-在产品规格使用到物流时必选
	 */
	private Long postageId;

	/** 
	* 门票对应产品标识<br>
门票商品只能使用达尔文体系下的产品。该参数可通过taobao.products.search接口获取，注意返回产品的cspu_feature属性，该属性表明是否为达尔文体系下产品。
	 */
	private Long productId;

	/** 
	* 门票商品是否橱窗推荐（橱窗推荐；true，不推荐则可不用设置该值）
	 */
	private Boolean promotedStatus;

	/** 
	* 门票商品所在地-省份
	 */
	private String prov;

	/** 
	* 卖家客服电话。注意有格式校验。可以是手机号或座机号。手机号规则以1开头的11位数字；座机格式：包含两部分，区号（3-4位数字）和电话（7-8位数字），且区号和电话之间使用"-"相连
	 */
	private String sellerCsPhone;

	/** 
	* 门票宝贝所属的店铺分类列表-店铺分类标识请使用店铺相关接口获取获取，多个店铺分类标识之间通过逗号进行分隔，最多包含10个分类标识
	 */
	private String shopCats;

	/** 
	* 门票商品产品规格信息，包括门票的库存价格等信息（产品规格可通过tmall.product.specs.get接口获取）。<br>请通过门票商品使用的产品所对应的产品规格信息进行设置，注意由于产品规格信息比较复杂，所以直接使用json作为传输，请按照约定传入正确的json格式）<br>
格式定义：<br>
<pre>
{
    "SKU": {
        "20890017-121840019_20394-121290067": { // 产品下的某个产品规格的属性属性值信息（pid-vid_pid-vid）
            "effDates": {
                "1": {
                    "type": "0",
                    // 有效期类型，0-非指定日票，1-指定日票，2-年卡
                    "effDate": { // 有效期，如下几块，type已经去掉
                        "startDate": "2013-01-01",
                        // 有效期时间段开始时间,null代表未设置
                        "endDate": "2013-12-31",
                        // 有效期时间段结束时间,null代表未设置
                        "weeks": ["1", "4"],
                        // 有效期周,1~7代表周一到周日，null代表未设置
                        "startHour": "12",
                        // 有效期开始时间小时,null代表未设置
                        "startMinute": "59",
                        // 有效期开始时间分钟,null代表未设置
                        "endHour": "18" // 有效期结束时间小时,null代表未设置
                        "endMinute": "30" // 有效期结束时间分钟,null代表未设置
                        "effDays": "1",
                        // xx后n天内有效的天数，购买后、出票后、开卡后n天内有效,null代表未设置
                    },
                    "timeLimit": { // 入园时间限制数据
                        "limit": {
                            "type": "0",
                            // 入园时间限制类型,0-不限，1-提前n天的n点n分，2-提前n小时n分钟
                            "aheadDays": "3",
                            // 入园时间限制类型为提前n天的n点n分时才使用，入园时间提前n天的天数
                            "aheadAtHour": "12",
                            // 入园时间限制类型为提前n天的n点n分时才使用，入园时间在n点n分之前的小时
                            "aheadAtMinute": "30",
                            // 入园时间限制类型为提前n天的n点n分时才使用，入园时间在n点n分之前的分钟
                            "aheadHours": "48",
                            // 入园时间限制类型为提前n小时n分时才使用，入园时间提前n小时的小时
                            "aheadMinutes": "30",
                            // 入园时间限制类型为提前n小时n分时才使用，入园时间提前n分钟的分钟
                        }
                        "autoActivate": { // 有效期类型为年卡时才使用
                            "type": "0",
                            // 是否有最晚自动开卡时间,0-无，1-有最晚自动开卡
                            "time": "30" // 天数,无最晚自动开发时间时为null
                        }
                    }

                    "price": 10000,
                    "inventory": 100,
                    "outerId": "商家编码"
                },
                "222": {}
            },
            "save": true,
            // 必须，代表是保存的有效数据
            "returnRule": {
                "type": "0",
                // 0,1,2
                "value": "" // type 0:""，1:""，2:"卖家输入的文本"
            },
            "changeRule": {
                "type": "1",
                // 0,1,2
                "value": "" // type 0:""，1:""，2:"卖家输入的文本"
            },
            "oldGuide": "读取商品以前的预定须知文本",
            //商品以前的预定须知，可选，
            "feeDesc": "卖家输入的文本",
            //预定须知-费用包含说明，必选，
            "orderTimeDesc": "卖家输入的文本",
            //预定须知-预定时间说明，必选，
            "checkinValue": "1",
            //入园方式-选项，必选，1,"报验证码换票入园";2, "扫二维码入园";3, "扫身份证入园";4, "报手机号换票入园";5, "使用实体票入园";6, "其他"
            "checkinDesc": "卖家输入的文本",
            //入园方式-补填信息。当checkinValue为6时必选，其他情况可选
            "sellerNoteTip": "卖家输入的文本",
            //预留信息，买家在下单时，卖家留言处的提醒，必选，
            "otherGuide": "卖家输入的文本" //预定须知其他补充说明，可选
        }
    }
}
</pre><br>
	 */
	private String skus;

	/** 
	* 门票商品库存技术方式（拍下减库存：true，付款减库存：false）
	 */
	private Boolean subStockAtBuy;

	/** 
	* 门票商品标题
	 */
	private String title;

	/** 
	* 门票商品视频-视频标识由多媒体中相关接口获取
	 */
	private Long videoId;

	/** 
	* 门票商品是否参与店铺会员打折
	 */
	private Boolean vipPromoted;

	public void setAuctionPoint(String auctionPoint) {
		this.auctionPoint = auctionPoint;
	}

	public String getAuctionPoint() {
		return this.auctionPoint;
	}

	public void setAuctionStatus(String auctionStatus) {
		this.auctionStatus = auctionStatus;
	}

	public String getAuctionStatus() {
		return this.auctionStatus;
	}

	public void setCheckToolMerchant(String checkToolMerchant) {
		this.checkToolMerchant = checkToolMerchant;
	}

	public String getCheckToolMerchant() {
		return this.checkToolMerchant;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setEtcAssociationStatus(Boolean etcAssociationStatus) {
		this.etcAssociationStatus = etcAssociationStatus;
	}

	public Boolean getEtcAssociationStatus() {
		return this.etcAssociationStatus;
	}

	public void setEtcAutoRefund(Long etcAutoRefund) {
		this.etcAutoRefund = etcAutoRefund;
	}

	public Long getEtcAutoRefund() {
		return this.etcAutoRefund;
	}

	public void setEtcMerchantId(String etcMerchantId) {
		this.etcMerchantId = etcMerchantId;
	}

	public String getEtcMerchantId() {
		return this.etcMerchantId;
	}

	public void setEtcMerchantNick(String etcMerchantNick) {
		this.etcMerchantNick = etcMerchantNick;
	}

	public String getEtcMerchantNick() {
		return this.etcMerchantNick;
	}

	public void setEtcNetworkId(String etcNetworkId) {
		this.etcNetworkId = etcNetworkId;
	}

	public String getEtcNetworkId() {
		return this.etcNetworkId;
	}

	public void setEtcOverduePay(Long etcOverduePay) {
		this.etcOverduePay = etcOverduePay;
	}

	public Long getEtcOverduePay() {
		return this.etcOverduePay;
	}

	public void setEtcVerificationPay(Boolean etcVerificationPay) {
		this.etcVerificationPay = etcVerificationPay;
	}

	public Boolean getEtcVerificationPay() {
		return this.etcVerificationPay;
	}

	public void setHaveInvoice(Boolean haveInvoice) {
		this.haveInvoice = haveInvoice;
	}

	public Boolean getHaveInvoice() {
		return this.haveInvoice;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage1() {
		return this.image1;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage2() {
		return this.image2;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage3() {
		return this.image3;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage4() {
		return this.image4;
	}

	public void setImage5(String image5) {
		this.image5 = image5;
	}

	public String getImage5() {
		return this.image5;
	}

	public void setListTime(String listTime) {
		this.listTime = listTime;
	}

	public String getListTime() {
		return this.listTime;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public Long getPostageId() {
		return this.postageId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setPromotedStatus(Boolean promotedStatus) {
		this.promotedStatus = promotedStatus;
	}

	public Boolean getPromotedStatus() {
		return this.promotedStatus;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getProv() {
		return this.prov;
	}

	public void setSellerCsPhone(String sellerCsPhone) {
		this.sellerCsPhone = sellerCsPhone;
	}

	public String getSellerCsPhone() {
		return this.sellerCsPhone;
	}

	public void setShopCats(String shopCats) {
		this.shopCats = shopCats;
	}

	public String getShopCats() {
		return this.shopCats;
	}

	public void setSkus(String skus) {
		this.skus = skus;
	}

	public String getSkus() {
		return this.skus;
	}

	public void setSubStockAtBuy(Boolean subStockAtBuy) {
		this.subStockAtBuy = subStockAtBuy;
	}

	public Boolean getSubStockAtBuy() {
		return this.subStockAtBuy;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public Long getVideoId() {
		return this.videoId;
	}

	public void setVipPromoted(Boolean vipPromoted) {
		this.vipPromoted = vipPromoted;
	}

	public Boolean getVipPromoted() {
		return this.vipPromoted;
	}

	public String getApiMethodName() {
		return "taobao.ticket.item.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("auction_point", this.auctionPoint);
		txtParams.put("auction_status", this.auctionStatus);
		txtParams.put("check_tool_merchant", this.checkToolMerchant);
		txtParams.put("city", this.city);
		txtParams.put("description", this.description);
		txtParams.put("etc.association_status", this.etcAssociationStatus);
		txtParams.put("etc.auto_refund", this.etcAutoRefund);
		txtParams.put("etc.merchant_id", this.etcMerchantId);
		txtParams.put("etc.merchant_nick", this.etcMerchantNick);
		txtParams.put("etc.network_id", this.etcNetworkId);
		txtParams.put("etc.overdue_pay", this.etcOverduePay);
		txtParams.put("etc.verification_pay", this.etcVerificationPay);
		txtParams.put("have_invoice", this.haveInvoice);
		txtParams.put("image_1", this.image1);
		txtParams.put("image_2", this.image2);
		txtParams.put("image_3", this.image3);
		txtParams.put("image_4", this.image4);
		txtParams.put("image_5", this.image5);
		txtParams.put("list_time", this.listTime);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("product_id", this.productId);
		txtParams.put("promoted_status", this.promotedStatus);
		txtParams.put("prov", this.prov);
		txtParams.put("seller_cs_phone", this.sellerCsPhone);
		txtParams.put("shop_cats", this.shopCats);
		txtParams.put("skus", this.skus);
		txtParams.put("sub_stock_at_buy", this.subStockAtBuy);
		txtParams.put("title", this.title);
		txtParams.put("video_id", this.videoId);
		txtParams.put("vip_promoted", this.vipPromoted);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TicketItemAddResponse> getResponseClass() {
		return TicketItemAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(auctionStatus, "auctionStatus");
		RequestCheckUtils.checkMaxLength(auctionStatus, 10, "auctionStatus");
		RequestCheckUtils.checkNotEmpty(checkToolMerchant, "checkToolMerchant");
		RequestCheckUtils.checkNotEmpty(city, "city");
		RequestCheckUtils.checkMaxLength(city, 20, "city");
		RequestCheckUtils.checkNotEmpty(description, "description");
		RequestCheckUtils.checkMaxLength(description, 25000, "description");
		RequestCheckUtils.checkMaxValue(etcAutoRefund, 100L, "etcAutoRefund");
		RequestCheckUtils.checkMinValue(etcAutoRefund, 0L, "etcAutoRefund");
		RequestCheckUtils.checkMaxValue(etcOverduePay, 100L, "etcOverduePay");
		RequestCheckUtils.checkMinValue(etcOverduePay, 0L, "etcOverduePay");
		RequestCheckUtils.checkNotEmpty(image1, "image1");
		RequestCheckUtils.checkMaxLength(listTime, 20, "listTime");
		RequestCheckUtils.checkNotEmpty(productId, "productId");
		RequestCheckUtils.checkNotEmpty(prov, "prov");
		RequestCheckUtils.checkMaxLength(prov, 20, "prov");
		RequestCheckUtils.checkNotEmpty(sellerCsPhone, "sellerCsPhone");
		RequestCheckUtils.checkNotEmpty(skus, "skus");
		RequestCheckUtils.checkNotEmpty(subStockAtBuy, "subStockAtBuy");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkMaxLength(title, 60, "title");
	}
	

}