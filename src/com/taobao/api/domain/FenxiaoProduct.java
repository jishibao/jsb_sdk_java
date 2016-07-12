package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 分销产品
 *
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProduct extends TaobaoObject {

	private static final long serialVersionUID = 5411186246458693839L;

	/**
	 * 警戒库存
	 */
	@ApiField("alarm_number")
	private Long alarmNumber;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 所在地：市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 采购价格，单位：元。
	 */
	@ApiField("cost_price")
	private String costPrice;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 经销采购价
	 */
	@ApiField("dealer_cost_price")
	private String dealerCostPrice;

	/**
	 * 产品描述路径，通过http请求获取
	 */
	@ApiField("desc_path")
	private String descPath;

	/**
	 * 产品描述的内容
	 */
	@ApiField("description")
	private String description;

	/**
	 * 折扣ID（新增参数）
	 */
	@ApiField("discount_id")
	private Long discountId;

	/**
	 * 是否有保修，可选值：false（否）、true（是）
	 */
	@ApiField("have_guarantee")
	private Boolean haveGuarantee;

	/**
	 * 是否有发票，可选值：false（否）、true（是）
	 */
	@ApiField("have_invoice")
	private Boolean haveInvoice;

	/**
	 * 产品图片
	 */
	@ApiListField("images")
	@ApiField("fenxiao_image")
	private List<FenxiaoImage> images;

	/**
	 * 自定义属性，格式为pid:value;pid:value
	 */
	@ApiField("input_properties")
	private String inputProperties;

	/**
	 * 查询产品列表时，查询入参增加is_authz:yes|no 
yes:需要授权 
no:不需要授权
	 */
	@ApiField("is_authz")
	private String isAuthz;

	/**
	 * 导入的商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 下载人数
	 */
	@ApiField("items_count")
	private Long itemsCount;

	/**
	 * 更新时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 产品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 累计采购次数
	 */
	@ApiField("orders_count")
	private Long ordersCount;

	/**
	 * 商家编码
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 产品分销商信息
	 */
	@ApiListField("pdus")
	@ApiField("fenxiao_pdu")
	private List<FenxiaoPdu> pdus;

	/**
	 * 产品图片路径
	 */
	@ApiField("pictures")
	private String pictures;

	/**
	 * 产品ID
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * ems费用，单位：元
	 */
	@ApiField("postage_ems")
	private String postageEms;

	/**
	 * 快递费用，单位：元
	 */
	@ApiField("postage_fast")
	private String postageFast;

	/**
	 * 运费模板ID
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * 平邮费用，单位：元
	 */
	@ApiField("postage_ordinary")
	private String postageOrdinary;

	/**
	 * 运费类型，可选值：seller（供应商承担运费）、buyer（分销商承担运费）
	 */
	@ApiField("postage_type")
	private String postageType;

	/**
	 * 产品线ID
	 */
	@ApiField("productcat_id")
	private Long productcatId;

	/**
	 * 产品属性，格式为pid:vid;pid:vid
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 属性别名，格式为pid:vid:alias;pid:vid:alias
	 */
	@ApiField("property_alias")
	private String propertyAlias;

	/**
	 * 所在地：省
	 */
	@ApiField("prov")
	private String prov;

	/**
	 * 产品库存
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 根据商品ID查询时，返回这个产品对应的商品ID，只对分销商查询接口有效
	 */
	@ApiField("query_item_id")
	private Long queryItemId;

	/**
	 * 配额可用库存
	 */
	@ApiField("quota_quantity")
	private Long quotaQuantity;

	/**
	 * 预扣库存
	 */
	@ApiField("reserved_quantity")
	private Long reservedQuantity;

	/**
	 * 最高零售价，单位：分。
	 */
	@ApiField("retail_price_high")
	private String retailPriceHigh;

	/**
	 * 最低零售价，单位：分。
	 */
	@ApiField("retail_price_low")
	private String retailPriceLow;

	/**
	 * 关联的后端商品id
	 */
	@ApiField("scitem_id")
	private Long scitemId;

	/**
	 * sku列表
	 */
	@ApiListField("skus")
	@ApiField("fenxiao_sku")
	private List<FenxiaoSku> skus;

	/**
	 * 产品spu id
	 */
	@ApiField("spu_id")
	private Long spuId;

	/**
	 * 采购基准价，单位：元。
	 */
	@ApiField("standard_price")
	private String standardPrice;

	/**
	 * 零售基准价，单位：元
	 */
	@ApiField("standard_retail_price")
	private String standardRetailPrice;

	/**
	 * 发布状态，可选值：up（上架）、down（下架）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）、ALL（代销和经销都做）
	 */
	@ApiField("trade_type")
	private String tradeType;

	/**
	 * 铺货时间
	 */
	@ApiField("upshelf_time")
	private Date upshelfTime;


	public Long getAlarmNumber() {
		return this.alarmNumber;
	}
	public void setAlarmNumber(Long alarmNumber) {
		this.alarmNumber = alarmNumber;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCostPrice() {
		return this.costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDealerCostPrice() {
		return this.dealerCostPrice;
	}
	public void setDealerCostPrice(String dealerCostPrice) {
		this.dealerCostPrice = dealerCostPrice;
	}

	public String getDescPath() {
		return this.descPath;
	}
	public void setDescPath(String descPath) {
		this.descPath = descPath;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Boolean getHaveGuarantee() {
		return this.haveGuarantee;
	}
	public void setHaveGuarantee(Boolean haveGuarantee) {
		this.haveGuarantee = haveGuarantee;
	}

	public Boolean getHaveInvoice() {
		return this.haveInvoice;
	}
	public void setHaveInvoice(Boolean haveInvoice) {
		this.haveInvoice = haveInvoice;
	}

	public List<FenxiaoImage> getImages() {
		return this.images;
	}
	public void setImages(List<FenxiaoImage> images) {
		this.images = images;
	}

	public String getInputProperties() {
		return this.inputProperties;
	}
	public void setInputProperties(String inputProperties) {
		this.inputProperties = inputProperties;
	}

	public String getIsAuthz() {
		return this.isAuthz;
	}
	public void setIsAuthz(String isAuthz) {
		this.isAuthz = isAuthz;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemsCount() {
		return this.itemsCount;
	}
	public void setItemsCount(Long itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOrdersCount() {
		return this.ordersCount;
	}
	public void setOrdersCount(Long ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public List<FenxiaoPdu> getPdus() {
		return this.pdus;
	}
	public void setPdus(List<FenxiaoPdu> pdus) {
		this.pdus = pdus;
	}

	public String getPictures() {
		return this.pictures;
	}
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPostageEms() {
		return this.postageEms;
	}
	public void setPostageEms(String postageEms) {
		this.postageEms = postageEms;
	}

	public String getPostageFast() {
		return this.postageFast;
	}
	public void setPostageFast(String postageFast) {
		this.postageFast = postageFast;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getPostageOrdinary() {
		return this.postageOrdinary;
	}
	public void setPostageOrdinary(String postageOrdinary) {
		this.postageOrdinary = postageOrdinary;
	}

	public String getPostageType() {
		return this.postageType;
	}
	public void setPostageType(String postageType) {
		this.postageType = postageType;
	}

	public Long getProductcatId() {
		return this.productcatId;
	}
	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}
	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public String getProv() {
		return this.prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQueryItemId() {
		return this.queryItemId;
	}
	public void setQueryItemId(Long queryItemId) {
		this.queryItemId = queryItemId;
	}

	public Long getQuotaQuantity() {
		return this.quotaQuantity;
	}
	public void setQuotaQuantity(Long quotaQuantity) {
		this.quotaQuantity = quotaQuantity;
	}

	public Long getReservedQuantity() {
		return this.reservedQuantity;
	}
	public void setReservedQuantity(Long reservedQuantity) {
		this.reservedQuantity = reservedQuantity;
	}

	public String getRetailPriceHigh() {
		return this.retailPriceHigh;
	}
	public void setRetailPriceHigh(String retailPriceHigh) {
		this.retailPriceHigh = retailPriceHigh;
	}

	public String getRetailPriceLow() {
		return this.retailPriceLow;
	}
	public void setRetailPriceLow(String retailPriceLow) {
		this.retailPriceLow = retailPriceLow;
	}

	public Long getScitemId() {
		return this.scitemId;
	}
	public void setScitemId(Long scitemId) {
		this.scitemId = scitemId;
	}

	public List<FenxiaoSku> getSkus() {
		return this.skus;
	}
	public void setSkus(List<FenxiaoSku> skus) {
		this.skus = skus;
	}

	public Long getSpuId() {
		return this.spuId;
	}
	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public String getStandardPrice() {
		return this.standardPrice;
	}
	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}

	public String getStandardRetailPrice() {
		return this.standardRetailPrice;
	}
	public void setStandardRetailPrice(String standardRetailPrice) {
		this.standardRetailPrice = standardRetailPrice;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public Date getUpshelfTime() {
		return this.upshelfTime;
	}
	public void setUpshelfTime(Date upshelfTime) {
		this.upshelfTime = upshelfTime;
	}

}
