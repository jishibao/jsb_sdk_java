package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Item extends TaobaoObject {

	private static final long serialVersionUID = 5222173544198915588L;

	/**
	 * 售后服务ID,该字段仅在taobao.item.get接口中返回
	 */
	@ApiField("after_sale_id")
	private Long afterSaleId;

	/**
	 * 应用AppKey
	 */
	@ApiField("appkey")
	private String appkey;

	/**
	 * 商品上传后的状态。onsale出售中，instock库中
	 */
	@ApiField("approve_status")
	private String approveStatus;

	/**
	 * 商品的积分返点比例。如:5,表示:返点比例0.5%
	 */
	@ApiField("auction_point")
	private Long auctionPoint;

	/**
	 * 代充商品类型。在代充商品的类目下，不传表示不标记商品类型（交易搜索中就不能通过标记搜到相关的交易了）。可选类型： no_mark(不做类型标记) time_card(点卡软件代充) fee_card(话费软件代充)
	 */
	@ApiField("auto_fill")
	private String autoFill;

	/**
	 * 自动重发,true/false
	 */
	@ApiField("auto_repost")
	private Boolean autoRepost;

	/**
	 * 商品级别的条形码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 应用回调地址
	 */
	@ApiField("callbackUrl")
	private String callbackUrl;

	/**
	 * 基础色数据
	 */
	@ApiField("change_prop")
	private String changeProp;

	/**
	 * 天猫超市扩展字段，天猫超市专用。
	 */
	@ApiField("chaoshi_extends_info")
	private String chaoshiExtendsInfo;

	/**
	 * 商品所属的叶子类目 id
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 货到付款运费模板ID
	 */
	@ApiField("cod_postage_id")
	private Long codPostageId;

	/**
	 * cpv_memo
	 */
	@ApiField("cpv_memo")
	private String cpvMemo;

	/**
	 * Item的发布时间，目前仅供taobao.item.add和taobao.item.get可用
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 村淘特有商品级数据结构
	 */
	@ApiField("cuntao_item_specific")
	private CuntaoItemSpecific cuntaoItemSpecific;

	/**
	 * 定制工具Id
	 */
	@ApiField("custom_made_type_id")
	private String customMadeTypeId;

	/**
	 * 下架时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("delist_time")
	private Date delistTime;

	/**
	 * 发货时间信息
	 */
	@ApiField("delivery_time")
	private DeliveryTime deliveryTime;

	/**
	 * 商品描述, 字数要大于5个字符，小于25000个字符
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 宝贝描述规范化模块锚点信息
	 */
	@ApiField("desc_module_info")
	private DescModuleInfo descModuleInfo;

	/**
	 * 商品描述模块化，模块列表，由List转化成jsonArray存入，后端逻辑验证通过，拼装成模块内容+锚点导航后存入desc中。数据结构具体参见Item_Desc_Module
	 */
	@ApiField("desc_modules")
	private String descModules;

	/**
	 * 商品url
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * ems费用,格式：5.00；单位：元；精确到：分
	 */
	@ApiField("ems_fee")
	private String emsFee;

	/**
	 * 快递费用,格式：5.00；单位：元；精确到：分
	 */
	@ApiField("express_fee")
	private String expressFee;

	/**
	 * 宝贝特征值，只有在Top支持的特征值才能保存到宝贝上
	 */
	@ApiField("features")
	private String features;

	/**
	 * 食品安全信息，包括：生产许可证编号、产品标准号、厂名、厂址等
	 */
	@ApiField("food_security")
	private FoodSecurity foodSecurity;

	/**
	 * 运费承担方式,seller（卖家承担），buyer(买家承担）
	 */
	@ApiField("freight_payer")
	private String freightPayer;

	/**
	 * 全球购商品采购地信息（地区/国家），代表全球购商品的产地信息。
	 */
	@ApiField("global_stock_country")
	private String globalStockCountry;

	/**
	 * 全球购商品发货地，发货地现在有两种类型：&ldquo;国内&rdquo;和&ldquo;海外及港澳台&rdquo;，参数值为1时代表&ldquo;国内&rdquo;，值为2时代表&ldquo;海外及港澳台&rdquo;
	 */
	@ApiField("global_stock_delivery_place")
	private String globalStockDeliveryPlace;

	/**
	 * 全球购商品卖家包税承诺，当值为true时，代表卖家承诺包税。
	 */
	@ApiField("global_stock_tax_free_promise")
	private Boolean globalStockTaxFreePromise;

	/**
	 * 全球购商品采购地信息（库存类型），有两种库存类型：现货和代购;参数值为1时代表现货，值为2时代表代购
	 */
	@ApiField("global_stock_type")
	private String globalStockType;

	/**
	 * 
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 支持会员打折,true/false
	 */
	@ApiField("has_discount")
	private Boolean hasDiscount;

	/**
	 * 是否有发票,true/false
	 */
	@ApiField("has_invoice")
	private Boolean hasInvoice;

	/**
	 * 橱窗推荐,true/false
	 */
	@ApiField("has_showcase")
	private Boolean hasShowcase;

	/**
	 * 是否有保修,true/false
	 */
	@ApiField("has_warranty")
	private Boolean hasWarranty;

	/**
	 * 商品iid
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 加价幅度。如果为0，代表系统代理幅度。在竞拍中，为了超越上一个出价，会员需要在当前出价上增加金额，这个金额就是加价幅度。卖家在发布宝贝的时候可以自定义加价幅度，也可以让系统自动代理加价。系统自动代理加价的加价幅度随着当前出价金额的增加而增加，我们建议会员使用系统自动代理加价，并请买家在出价前看清楚加价幅度的具体金额。另外需要注意是，此功能只适用于拍卖的商品。以下是系统自动代理加价幅度表：当前价（加价幅度 ）1-40（ 1 ）、41-100（ 2 ）、101-200（5 ）、201-500 （10）、501-1001（15）、001-2000（25）、2001-5000（50）、5001-10000（100）10001以上         200
	 */
	@ApiField("increment")
	private String increment;

	/**
	 * 用户内店宝贝装修模板id
	 */
	@ApiField("inner_shop_auction_template_id")
	private Long innerShopAuctionTemplateId;

	/**
	 * 针对当前商品的自定义属性值
	 */
	@ApiField("input_custom_cpv")
	private String inputCustomCpv;

	/**
	 * 用户自行输入的类目属性ID串。结构：&quot;pid1,pid2,pid3&quot;，如：&quot;20000&quot;（表示品牌） 注：通常一个类目下用户可输入的关键属性不超过1个。
	 */
	@ApiField("input_pids")
	private String inputPids;

	/**
	 * 用户自行输入的子属性名和属性值，结构:&quot;父属性值;一级子属性名;一级子属性值;二级子属性名;自定义输入值,....&quot;,如：&ldquo;耐克;耐克系列;科比系列;科比系列;2K5&rdquo;，input_str需要与input_pids一一对应，注：通常一个类目下用户可输入的关键属性不超过1个。所有属性别名加起来不能超过 3999字节。
	 */
	@ApiField("input_str")
	private String inputStr;

	/**
	 * 是否是3D淘宝的商品
	 */
	@ApiField("is_3D")
	private Boolean is3D;

	/**
	 * true:商品是区域限售商品；false:商品不是区域限售商品。
	 */
	@ApiField("is_area_sale")
	private Boolean isAreaSale;

	/**
	 * 是否为达尔文挂接成功了的商品
	 */
	@ApiField("is_cspu")
	private Boolean isCspu;

	/**
	 * 是否在外部网店显示
	 */
	@ApiField("is_ex")
	private Boolean isEx;

	/**
	 * 非分销商品：0，代销：1，经销：2
	 */
	@ApiField("is_fenxiao")
	private Long isFenxiao;

	/**
	 * 是否24小时闪电发货
	 */
	@ApiField("is_lightning_consignment")
	private Boolean isLightningConsignment;

	/**
	 * 是否是线下商品。1：线上商品（默认值）；2：线上或线下商品；3：线下商品。
	 */
	@ApiField("is_offline")
	private String isOffline;

	/**
	 * 商品是否为先行赔付taobao.items.search和taobao.items.vip.search专用
	 */
	@ApiField("is_prepay")
	private Boolean isPrepay;

	/**
	 * 是否在淘宝显示
	 */
	@ApiField("is_taobao")
	private Boolean isTaobao;

	/**
	 * 是否定时上架商品
	 */
	@ApiField("is_timing")
	private Boolean isTiming;

	/**
	 * 虚拟商品的状态字段
	 */
	@ApiField("is_virtual")
	private Boolean isVirtual;

	/**
	 * 标示商品是否为新品。值含义：true-是，false-否。
	 */
	@ApiField("is_xinpin")
	private Boolean isXinpin;

	/**
	 * 商品图片列表(包括主图)。fields中只设置item_img可以返回ItemImg结构体中所有字段，如果设置为item_img.id、item_img.url、item_img.position等形式就只会返回相应的字段
	 */
	@ApiListField("item_imgs")
	@ApiField("item_img")
	private List<ItemImg> itemImgs;

	/**
	 * 表示商品的体积，用于按体积计费的运费模板。该值的单位为立方米（m3）。该值支持两种格式的设置：格式1：bulk:3,单位为立方米(m3),表示直接设置为商品的体积。格式2：weight:10;breadth:10;height:10，单位为米（m）
	 */
	@ApiField("item_size")
	private String itemSize;

	/**
	 * 商品的重量，用于按重量计费的运费模板。注意：单位为kg
	 */
	@ApiField("item_weight")
	private String itemWeight;

	/**
	 * 上架时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("list_time")
	private Date listTime;

	/**
	 * 本地生活电子交易凭证业务，目前此字段只涉及到的信息为有效期:如果有效期为起止日期类型，此值为2012-08-06,2012-08-16如果有效期为【购买成功日 至】类型则格式为2012-08-16如果有效期为天数类型则格式为3
	 */
	@ApiField("locality_life")
	private LocalityLife localityLife;

	/**
	 * 商品所在地
	 */
	@ApiField("location")
	private Location location;

	/**
	 * 物流信息,收货人信息,姓名，电话，地址
	 */
	@ApiField("logistics_info")
	private String logisticsInfo;

	/**
	 * 商品修改时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 宝贝主图视频的数据信息，包括：视频ID，视频缩略图URL，视频时长，视频状态等信息。
	 */
	@ApiField("mpic_video")
	private MpicVideo mpicVideo;

	/**
	 * 家装分阶段价格数据结构
	 */
	@ApiField("ms_payment")
	private String msPayment;

	/**
	 * 是否为新消保法中的7天无理由退货
	 */
	@ApiField("newprepay")
	private String newprepay;

	/**
	 * 卖家昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 商品数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 商品数字id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 是否绑定o2o
	 */
	@ApiField("o2o_bind_service")
	private Boolean o2oBindService;

	/**
	 * 是否淘1站商品
	 */
	@ApiField("one_station")
	private Boolean oneStation;

	/**
	 * open_iid
	 */
	@ApiField("open_iid")
	private String openIid;

	/**
	 * 商家外部编码(可与商家外部系统对接)。需要授权才能获取。
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 用户外店装修模板id
	 */
	@ApiField("outer_shop_auction_template_id")
	private Long outerShopAuctionTemplateId;

	/**
	 * 用于保存拍卖有关的信息
	 */
	@ApiField("paimai_info")
	private PaimaiInfo paimaiInfo;

	/**
	 * 周期销售库存
	 */
	@ApiField("period_sold_quantity")
	private Long periodSoldQuantity;

	/**
	 * 商品主图片地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 平邮费用,格式：5.00；单位：元；精确到：分
	 */
	@ApiField("post_fee")
	private String postFee;

	/**
	 * 宝贝所属的运费模板ID，如果没有返回则说明没有使用运费模板
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * 商品价格，格式：5.00；单位：元；精确到：分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 宝贝所属产品的id(可能为空). 该字段可以通过taobao.products.search 得到
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 消保类型，多个类型以,分割。可取以下值：2：假一赔三；4：7天无理由退换货；taobao.items.search和taobao.items.vip.search专用
	 */
	@ApiField("promoted_service")
	private String promotedService;

	/**
	 * 商品属性图片列表。fields中只设置prop_img可以返回PropImg结构体中所有字段，如果设置为prop_img.id、prop_img.url、prop_img.properties、prop_img.position等形式就只会返回相应的字段
	 */
	@ApiListField("prop_imgs")
	@ApiField("prop_img")
	private List<PropImg> propImgs;

	/**
	 * 属性值别名,比如颜色的自定义名称
	 */
	@ApiField("property_alias")
	private String propertyAlias;

	/**
	 * 商品属性 格式：pid:vid;pid:vid
	 */
	@ApiField("props")
	private String props;

	/**
	 * 商品属性名称。标识着props内容里面的pid和vid所对应的名称。格式为：pid1:vid1:pid_name1:vid_name1;pid2:vid2:pid_name2:vid_name2&hellip;&hellip;(<strong>注：</strong><font color="red">属性名称中的冒号&quot;:&quot;被转换为：&quot;#cln#&quot;;  分号&quot;;&quot;被转换为：&quot;#scln#&quot;</font>)
	 */
	@ApiField("props_name")
	private String propsName;

	/**
	 * 商品资质的信息，用URLEncoder做过转换，使用时，需要URLDecoder转换回来，默认字符集为：UTF-8
	 */
	@ApiField("qualification")
	private String qualification;

	/**
	 * 商品所属卖家的信用等级数，1表示1心，2表示2心&hellip;&hellip;，只有调用商品搜索:taobao.items.get和taobao.items.search的时候才能返回
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 秒杀商品类型。打上秒杀标记的商品，用户只能下架并不能再上架，其他任何编辑或删除操作都不能进行。如果用户想取消秒杀标记，需要联系小二进行操作。如果秒杀结束需要自由编辑请联系活动负责人（小二）去掉秒杀标记。可选类型web_only(只能通过web网络秒杀)wap_only(只能通过wap网络秒杀)web_and_wap(既能通过web秒杀也能通过wap秒杀)
	 */
	@ApiField("second_kill")
	private String secondKill;

	/**
	 * 达尔文数据挂接，第二步保存结果
	 */
	@ApiField("second_result")
	private Boolean secondResult;

	/**
	 * 商品卖点信息，天猫商家使用字段，最长150个字符。
	 */
	@ApiField("sell_point")
	private String sellPoint;

	/**
	 * 是否承诺退换货服务!
	 */
	@ApiField("sell_promise")
	private Boolean sellPromise;

	/**
	 * 商品所属的店铺内卖家自定义类目列表
	 */
	@ApiField("seller_cids")
	private String sellerCids;

	/**
	 * 店铺类型，B：天猫店铺，C：淘宝店铺
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * <a href="http://open.taobao.com/dev/index.php/Sku">Sku</a>列表。fields中只设置sku可以返回Sku结构体中所有字段，如果设置为sku.sku_id、sku.properties、sku.quantity等形式就只会返回相应的字段
	 */
	@ApiListField("skus")
	@ApiField("sku")
	private List<Sku> skus;

	/**
	 * 商品销量
	 */
	@ApiField("sold_quantity")
	private Long soldQuantity;

	/**
	 * 手机类目spu 确认信息字段
	 */
	@ApiField("spu_confirm")
	private Boolean spuConfirm;

	/**
	 * 商品新旧程度(全新:new，闲置:unused，二手：second)
	 */
	@ApiField("stuff_status")
	private String stuffStatus;

	/**
	 * 商品是否支持拍下减库存:1支持;2取消支持(付款减库存);0(默认)不更改 集市卖家默认拍下减库存; 商城卖家默认付款减库存
	 */
	@ApiField("sub_stock")
	private Long subStock;

	/**
	 * 商品的子标题，给商品增加卖点等描述
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 页面模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 商品标题,不能超过60字节
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品类型(fixed:一口价;auction:拍卖)注：取消团购
	 */
	@ApiField("type")
	private String type;

	/**
	 * 有效期,7或者14（默认是7天）
	 */
	@ApiField("valid_thru")
	private Long validThru;

	/**
	 * 该字段废弃，请勿使用。
	 */
	@ApiField("video_id")
	private Long videoId;

	/**
	 * 商品视频列表(目前只支持单个视频关联)。fields中只设置video可以返回Video结构体中所有字段，如果设置为video.id、video.video_id、video.url等形式就只会返回相应的字段
	 */
	@ApiListField("videos")
	@ApiField("video")
	private List<Video> videos;

	/**
	 * 商品是否违规，违规：true , 不违规：false
	 */
	@ApiField("violation")
	private Boolean violation;

	/**
	 * 对应搜索商品列表页的最近成交量,只有调用商品搜索:taobao.items.get和taobao.items.search的时候才能返回
	 */
	@ApiField("volume")
	private Long volume;

	/**
	 * 不带html标签的desc文本信息，该字段只在taobao.item.get接口中返回
	 */
	@ApiField("wap_desc")
	private String wapDesc;

	/**
	 * 适合wap应用的商品详情url ，该字段只在taobao.item.get接口中返回
	 */
	@ApiField("wap_detail_url")
	private String wapDetailUrl;

	/**
	 * 无线的宝贝描述
	 */
	@ApiField("wireless_desc")
	private String wirelessDesc;

	/**
	 * 预扣库存，即付款减库存的商品现在有多少处于未付款状态的订单
	 */
	@ApiField("with_hold_quantity")
	private Long withHoldQuantity;

	/**
	 * 商品所属的商家的旺旺在线状况，taobao.items.search和taobao.items.vip.search专用
	 */
	@ApiField("ww_status")
	private Boolean wwStatus;


	public Long getAfterSaleId() {
		return this.afterSaleId;
	}
	public void setAfterSaleId(Long afterSaleId) {
		this.afterSaleId = afterSaleId;
	}

	public String getAppkey() {
		return this.appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getApproveStatus() {
		return this.approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Long getAuctionPoint() {
		return this.auctionPoint;
	}
	public void setAuctionPoint(Long auctionPoint) {
		this.auctionPoint = auctionPoint;
	}

	public String getAutoFill() {
		return this.autoFill;
	}
	public void setAutoFill(String autoFill) {
		this.autoFill = autoFill;
	}

	public Boolean getAutoRepost() {
		return this.autoRepost;
	}
	public void setAutoRepost(Boolean autoRepost) {
		this.autoRepost = autoRepost;
	}

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getChangeProp() {
		return this.changeProp;
	}
	public void setChangeProp(String changeProp) {
		this.changeProp = changeProp;
	}

	public String getChaoshiExtendsInfo() {
		return this.chaoshiExtendsInfo;
	}
	public void setChaoshiExtendsInfo(String chaoshiExtendsInfo) {
		this.chaoshiExtendsInfo = chaoshiExtendsInfo;
	}

	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getCodPostageId() {
		return this.codPostageId;
	}
	public void setCodPostageId(Long codPostageId) {
		this.codPostageId = codPostageId;
	}

	public String getCpvMemo() {
		return this.cpvMemo;
	}
	public void setCpvMemo(String cpvMemo) {
		this.cpvMemo = cpvMemo;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public CuntaoItemSpecific getCuntaoItemSpecific() {
		return this.cuntaoItemSpecific;
	}
	public void setCuntaoItemSpecific(CuntaoItemSpecific cuntaoItemSpecific) {
		this.cuntaoItemSpecific = cuntaoItemSpecific;
	}

	public String getCustomMadeTypeId() {
		return this.customMadeTypeId;
	}
	public void setCustomMadeTypeId(String customMadeTypeId) {
		this.customMadeTypeId = customMadeTypeId;
	}

	public Date getDelistTime() {
		return this.delistTime;
	}
	public void setDelistTime(Date delistTime) {
		this.delistTime = delistTime;
	}

	public DeliveryTime getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(DeliveryTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public DescModuleInfo getDescModuleInfo() {
		return this.descModuleInfo;
	}
	public void setDescModuleInfo(DescModuleInfo descModuleInfo) {
		this.descModuleInfo = descModuleInfo;
	}

	public String getDescModules() {
		return this.descModules;
	}
	public void setDescModules(String descModules) {
		this.descModules = descModules;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getEmsFee() {
		return this.emsFee;
	}
	public void setEmsFee(String emsFee) {
		this.emsFee = emsFee;
	}

	public String getExpressFee() {
		return this.expressFee;
	}
	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}

	public String getFeatures() {
		return this.features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}

	public FoodSecurity getFoodSecurity() {
		return this.foodSecurity;
	}
	public void setFoodSecurity(FoodSecurity foodSecurity) {
		this.foodSecurity = foodSecurity;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public String getGlobalStockCountry() {
		return this.globalStockCountry;
	}
	public void setGlobalStockCountry(String globalStockCountry) {
		this.globalStockCountry = globalStockCountry;
	}

	public String getGlobalStockDeliveryPlace() {
		return this.globalStockDeliveryPlace;
	}
	public void setGlobalStockDeliveryPlace(String globalStockDeliveryPlace) {
		this.globalStockDeliveryPlace = globalStockDeliveryPlace;
	}

	public Boolean getGlobalStockTaxFreePromise() {
		return this.globalStockTaxFreePromise;
	}
	public void setGlobalStockTaxFreePromise(Boolean globalStockTaxFreePromise) {
		this.globalStockTaxFreePromise = globalStockTaxFreePromise;
	}

	public String getGlobalStockType() {
		return this.globalStockType;
	}
	public void setGlobalStockType(String globalStockType) {
		this.globalStockType = globalStockType;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Boolean getHasDiscount() {
		return this.hasDiscount;
	}
	public void setHasDiscount(Boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}

	public Boolean getHasInvoice() {
		return this.hasInvoice;
	}
	public void setHasInvoice(Boolean hasInvoice) {
		this.hasInvoice = hasInvoice;
	}

	public Boolean getHasShowcase() {
		return this.hasShowcase;
	}
	public void setHasShowcase(Boolean hasShowcase) {
		this.hasShowcase = hasShowcase;
	}

	public Boolean getHasWarranty() {
		return this.hasWarranty;
	}
	public void setHasWarranty(Boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public String getIncrement() {
		return this.increment;
	}
	public void setIncrement(String increment) {
		this.increment = increment;
	}

	public Long getInnerShopAuctionTemplateId() {
		return this.innerShopAuctionTemplateId;
	}
	public void setInnerShopAuctionTemplateId(Long innerShopAuctionTemplateId) {
		this.innerShopAuctionTemplateId = innerShopAuctionTemplateId;
	}

	public String getInputCustomCpv() {
		return this.inputCustomCpv;
	}
	public void setInputCustomCpv(String inputCustomCpv) {
		this.inputCustomCpv = inputCustomCpv;
	}

	public String getInputPids() {
		return this.inputPids;
	}
	public void setInputPids(String inputPids) {
		this.inputPids = inputPids;
	}

	public String getInputStr() {
		return this.inputStr;
	}
	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public Boolean getIs3D() {
		return this.is3D;
	}
	public void setIs3D(Boolean is3D) {
		this.is3D = is3D;
	}

	public Boolean getIsAreaSale() {
		return this.isAreaSale;
	}
	public void setIsAreaSale(Boolean isAreaSale) {
		this.isAreaSale = isAreaSale;
	}

	public Boolean getIsCspu() {
		return this.isCspu;
	}
	public void setIsCspu(Boolean isCspu) {
		this.isCspu = isCspu;
	}

	public Boolean getIsEx() {
		return this.isEx;
	}
	public void setIsEx(Boolean isEx) {
		this.isEx = isEx;
	}

	public Long getIsFenxiao() {
		return this.isFenxiao;
	}
	public void setIsFenxiao(Long isFenxiao) {
		this.isFenxiao = isFenxiao;
	}

	public Boolean getIsLightningConsignment() {
		return this.isLightningConsignment;
	}
	public void setIsLightningConsignment(Boolean isLightningConsignment) {
		this.isLightningConsignment = isLightningConsignment;
	}

	public String getIsOffline() {
		return this.isOffline;
	}
	public void setIsOffline(String isOffline) {
		this.isOffline = isOffline;
	}

	public Boolean getIsPrepay() {
		return this.isPrepay;
	}
	public void setIsPrepay(Boolean isPrepay) {
		this.isPrepay = isPrepay;
	}

	public Boolean getIsTaobao() {
		return this.isTaobao;
	}
	public void setIsTaobao(Boolean isTaobao) {
		this.isTaobao = isTaobao;
	}

	public Boolean getIsTiming() {
		return this.isTiming;
	}
	public void setIsTiming(Boolean isTiming) {
		this.isTiming = isTiming;
	}

	public Boolean getIsVirtual() {
		return this.isVirtual;
	}
	public void setIsVirtual(Boolean isVirtual) {
		this.isVirtual = isVirtual;
	}

	public Boolean getIsXinpin() {
		return this.isXinpin;
	}
	public void setIsXinpin(Boolean isXinpin) {
		this.isXinpin = isXinpin;
	}

	public List<ItemImg> getItemImgs() {
		return this.itemImgs;
	}
	public void setItemImgs(List<ItemImg> itemImgs) {
		this.itemImgs = itemImgs;
	}

	public String getItemSize() {
		return this.itemSize;
	}
	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}

	public String getItemWeight() {
		return this.itemWeight;
	}
	public void setItemWeight(String itemWeight) {
		this.itemWeight = itemWeight;
	}

	public Date getListTime() {
		return this.listTime;
	}
	public void setListTime(Date listTime) {
		this.listTime = listTime;
	}

	public LocalityLife getLocalityLife() {
		return this.localityLife;
	}
	public void setLocalityLife(LocalityLife localityLife) {
		this.localityLife = localityLife;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public String getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(String logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public MpicVideo getMpicVideo() {
		return this.mpicVideo;
	}
	public void setMpicVideo(MpicVideo mpicVideo) {
		this.mpicVideo = mpicVideo;
	}

	public String getMsPayment() {
		return this.msPayment;
	}
	public void setMsPayment(String msPayment) {
		this.msPayment = msPayment;
	}
	public void setMsPaymentString(String msPayment) {
		this.msPayment = msPayment;
	}
	

	public String getNewprepay() {
		return this.newprepay;
	}
	public void setNewprepay(String newprepay) {
		this.newprepay = newprepay;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Boolean getO2oBindService() {
		return this.o2oBindService;
	}
	public void setO2oBindService(Boolean o2oBindService) {
		this.o2oBindService = o2oBindService;
	}

	public Boolean getOneStation() {
		return this.oneStation;
	}
	public void setOneStation(Boolean oneStation) {
		this.oneStation = oneStation;
	}

	public String getOpenIid() {
		return this.openIid;
	}
	public void setOpenIid(String openIid) {
		this.openIid = openIid;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public Long getOuterShopAuctionTemplateId() {
		return this.outerShopAuctionTemplateId;
	}
	public void setOuterShopAuctionTemplateId(Long outerShopAuctionTemplateId) {
		this.outerShopAuctionTemplateId = outerShopAuctionTemplateId;
	}

	public PaimaiInfo getPaimaiInfo() {
		return this.paimaiInfo;
	}
	public void setPaimaiInfo(PaimaiInfo paimaiInfo) {
		this.paimaiInfo = paimaiInfo;
	}

	public Long getPeriodSoldQuantity() {
		return this.periodSoldQuantity;
	}
	public void setPeriodSoldQuantity(Long periodSoldQuantity) {
		this.periodSoldQuantity = periodSoldQuantity;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPostFee() {
		return this.postFee;
	}
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getPromotedService() {
		return this.promotedService;
	}
	public void setPromotedService(String promotedService) {
		this.promotedService = promotedService;
	}

	public List<PropImg> getPropImgs() {
		return this.propImgs;
	}
	public void setPropImgs(List<PropImg> propImgs) {
		this.propImgs = propImgs;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}
	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getPropsName() {
		return this.propsName;
	}
	public void setPropsName(String propsName) {
		this.propsName = propsName;
	}

	public String getQualification() {
		return this.qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getSecondKill() {
		return this.secondKill;
	}
	public void setSecondKill(String secondKill) {
		this.secondKill = secondKill;
	}

	public Boolean getSecondResult() {
		return this.secondResult;
	}
	public void setSecondResult(Boolean secondResult) {
		this.secondResult = secondResult;
	}

	public String getSellPoint() {
		return this.sellPoint;
	}
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}

	public Boolean getSellPromise() {
		return this.sellPromise;
	}
	public void setSellPromise(Boolean sellPromise) {
		this.sellPromise = sellPromise;
	}

	public String getSellerCids() {
		return this.sellerCids;
	}
	public void setSellerCids(String sellerCids) {
		this.sellerCids = sellerCids;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public List<Sku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}

	public Long getSoldQuantity() {
		return this.soldQuantity;
	}
	public void setSoldQuantity(Long soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	public Boolean getSpuConfirm() {
		return this.spuConfirm;
	}
	public void setSpuConfirm(Boolean spuConfirm) {
		this.spuConfirm = spuConfirm;
	}

	public String getStuffStatus() {
		return this.stuffStatus;
	}
	public void setStuffStatus(String stuffStatus) {
		this.stuffStatus = stuffStatus;
	}

	public Long getSubStock() {
		return this.subStock;
	}
	public void setSubStock(Long subStock) {
		this.subStock = subStock;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getValidThru() {
		return this.validThru;
	}
	public void setValidThru(Long validThru) {
		this.validThru = validThru;
	}

	public Long getVideoId() {
		return this.videoId;
	}
	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public List<Video> getVideos() {
		return this.videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public Boolean getViolation() {
		return this.violation;
	}
	public void setViolation(Boolean violation) {
		this.violation = violation;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public String getWapDesc() {
		return this.wapDesc;
	}
	public void setWapDesc(String wapDesc) {
		this.wapDesc = wapDesc;
	}

	public String getWapDetailUrl() {
		return this.wapDetailUrl;
	}
	public void setWapDetailUrl(String wapDetailUrl) {
		this.wapDetailUrl = wapDetailUrl;
	}

	public String getWirelessDesc() {
		return this.wirelessDesc;
	}
	public void setWirelessDesc(String wirelessDesc) {
		this.wirelessDesc = wirelessDesc;
	}

	public Long getWithHoldQuantity() {
		return this.withHoldQuantity;
	}
	public void setWithHoldQuantity(Long withHoldQuantity) {
		this.withHoldQuantity = withHoldQuantity;
	}

	public Boolean getWwStatus() {
		return this.wwStatus;
	}
	public void setWwStatus(Boolean wwStatus) {
		this.wwStatus = wwStatus;
	}

}
