package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductAddResponse;

/**
 * TOP API: taobao.fenxiao.product.add request
 * 
 * @author top auto create
 * @since 1.0, 2013.11.28
 */
public class FenxiaoProductAddRequest extends BaseTaobaoRequest<FenxiaoProductAddResponse> implements TaobaoUploadRequest<FenxiaoProductAddResponse> {

	
	

	/** 
	* 警戒库存必须是0到29999。
	 */
	private Long alarmNumber;

	/** 
	* 所属类目id，参考Taobao.itemcats.get，不支持成人等类目，输入成人类目id保存提示类目属性错误。
	 */
	private Long categoryId;

	/** 
	* 所在地：市，例：“杭州”
	 */
	private String city;

	/** 
	* 代销采购价格，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
	 */
	private String costPrice;

	/** 
	* 经销采购价，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
	 */
	private String dealerCostPrice;

	/** 
	* 产品描述，长度为5到25000字符。
	 */
	private String desc;

	/** 
	* 折扣ID
	 */
	private Long discountId;

	/** 
	* 是否有保修，可选值：false（否）、true（是），默认false。
	 */
	private String haveGuarantee;

	/** 
	* 是否有发票，可选值：false（否）、true（是），默认false。
	 */
	private String haveInvoice;

	/** 
	* 产品主图，大小不超过500k，格式为gif,jpg,jpeg,png,bmp等图片
	 */
	private FileItem image;

	/** 
	* 自定义属性。格式为pid:value;pid:value
	 */
	private String inputProperties;

	/** 
	* 添加产品时，添加入参isAuthz:yes|no 
yes:需要授权 
no:不需要授权 
默认是需要授权
	 */
	private String isAuthz;

	/** 
	* 导入的商品ID
	 */
	private Long itemId;

	/** 
	* 产品名称，长度不超过60个字节。
	 */
	private String name;

	/** 
	* 商家编码，长度不能超过60个字节。
	 */
	private String outerId;

	/** 
	* 产品主图图片空间相对路径或绝对路径
	 */
	private String picPath;

	/** 
	* ems费用，单位：元。例：“10.56”。 大小为0.00元到999999元之间。
	 */
	private String postageEms;

	/** 
	* 快递费用，单位：元。例：“10.56”。 大小为0.01元到999999元之间。
	 */
	private String postageFast;

	/** 
	* 运费模板ID，参考taobao.postages.get。
	 */
	private Long postageId;

	/** 
	* 平邮费用，单位：元。例：“10.56”。 大小为0.01元到999999元之间。
	 */
	private String postageOrdinary;

	/** 
	* 运费类型，可选值：seller（供应商承担运费）、buyer（分销商承担运费）,默认seller。
	 */
	private String postageType;

	/** 
	* 产品线ID
	 */
	private Long productcatId;

	/** 
	* 产品属性，格式为pid:vid;pid:vid
	 */
	private String properties;

	/** 
	* 属性别名，格式为：pid:vid:alias;pid:vid:alias（alias为别名）
	 */
	private String propertyAlias;

	/** 
	* 所在地：省，例：“浙江”
	 */
	private String prov;

	/** 
	* 产品库存必须是1到999999。
	 */
	private Long quantity;

	/** 
	* 最高零售价，单位：元。例：“10.56”。必须在0.01元到10000000元之间，最高零售价必须大于最低零售价。
	 */
	private String retailPriceHigh;

	/** 
	* 最低零售价，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
	 */
	private String retailPriceLow;

	/** 
	* sku的采购价。如果多个，用逗号分隔，并与其他sku信息保持相同顺序
	 */
	private String skuCostPrices;

	/** 
	* sku的经销采购价。如果多个，用逗号分隔，并与其他sku信息保持相同顺序。其中每个值的单位：元。例：“10.56,12.3”。必须在0.01元到10000000元之间。
	 */
	private String skuDealerCostPrices;

	/** 
	* sku的商家编码。如果多个，用逗号分隔，并与其他sku信息保持相同顺序
	 */
	private String skuOuterIds;

	/** 
	* sku的属性。如果多个，用逗号分隔，并与其他sku信息保持相同顺序
	 */
	private String skuProperties;

	/** 
	* sku的库存。如果多个，用逗号分隔，并与其他sku信息保持相同顺序
	 */
	private String skuQuantitys;

	/** 
	* sku的采购基准价。如果多个，用逗号分隔，并与其他sku信息保持相同顺序
	 */
	private String skuStandardPrices;

	/** 
	* 产品spuID，达尔文产品必须要传spuID，否则不能发布。其他非达尔文产品，看情况传
	 */
	private Long spuId;

	/** 
	* 采购基准价格，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
	 */
	private String standardPrice;

	/** 
	* 零售基准价，单位：元。例：“10.56”。必须在0.01元到10000000元之间。
	 */
	private String standardRetailPrice;

	/** 
	* 分销方式：AGENT（只做代销，默认值）、DEALER（只做经销）、ALL（代销和经销都做）
	 */
	private String tradeType;

	public void setAlarmNumber(Long alarmNumber) {
		this.alarmNumber = alarmNumber;
	}

	public Long getAlarmNumber() {
		return this.alarmNumber;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getCostPrice() {
		return this.costPrice;
	}

	public void setDealerCostPrice(String dealerCostPrice) {
		this.dealerCostPrice = dealerCostPrice;
	}

	public String getDealerCostPrice() {
		return this.dealerCostPrice;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Long getDiscountId() {
		return this.discountId;
	}

	public void setHaveGuarantee(String haveGuarantee) {
		this.haveGuarantee = haveGuarantee;
	}

	public String getHaveGuarantee() {
		return this.haveGuarantee;
	}

	public void setHaveInvoice(String haveInvoice) {
		this.haveInvoice = haveInvoice;
	}

	public String getHaveInvoice() {
		return this.haveInvoice;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public FileItem getImage() {
		return this.image;
	}

	public void setInputProperties(String inputProperties) {
		this.inputProperties = inputProperties;
	}

	public String getInputProperties() {
		return this.inputProperties;
	}

	public void setIsAuthz(String isAuthz) {
		this.isAuthz = isAuthz;
	}

	public String getIsAuthz() {
		return this.isAuthz;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPicPath() {
		return this.picPath;
	}

	public void setPostageEms(String postageEms) {
		this.postageEms = postageEms;
	}

	public String getPostageEms() {
		return this.postageEms;
	}

	public void setPostageFast(String postageFast) {
		this.postageFast = postageFast;
	}

	public String getPostageFast() {
		return this.postageFast;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public Long getPostageId() {
		return this.postageId;
	}

	public void setPostageOrdinary(String postageOrdinary) {
		this.postageOrdinary = postageOrdinary;
	}

	public String getPostageOrdinary() {
		return this.postageOrdinary;
	}

	public void setPostageType(String postageType) {
		this.postageType = postageType;
	}

	public String getPostageType() {
		return this.postageType;
	}

	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}

	public Long getProductcatId() {
		return this.productcatId;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getProperties() {
		return this.properties;
	}

	public void setPropertyAlias(String propertyAlias) {
		this.propertyAlias = propertyAlias;
	}

	public String getPropertyAlias() {
		return this.propertyAlias;
	}

	public void setProv(String prov) {
		this.prov = prov;
	}

	public String getProv() {
		return this.prov;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setRetailPriceHigh(String retailPriceHigh) {
		this.retailPriceHigh = retailPriceHigh;
	}

	public String getRetailPriceHigh() {
		return this.retailPriceHigh;
	}

	public void setRetailPriceLow(String retailPriceLow) {
		this.retailPriceLow = retailPriceLow;
	}

	public String getRetailPriceLow() {
		return this.retailPriceLow;
	}

	public void setSkuCostPrices(String skuCostPrices) {
		this.skuCostPrices = skuCostPrices;
	}

	public String getSkuCostPrices() {
		return this.skuCostPrices;
	}

	public void setSkuDealerCostPrices(String skuDealerCostPrices) {
		this.skuDealerCostPrices = skuDealerCostPrices;
	}

	public String getSkuDealerCostPrices() {
		return this.skuDealerCostPrices;
	}

	public void setSkuOuterIds(String skuOuterIds) {
		this.skuOuterIds = skuOuterIds;
	}

	public String getSkuOuterIds() {
		return this.skuOuterIds;
	}

	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}

	public String getSkuProperties() {
		return this.skuProperties;
	}

	public void setSkuQuantitys(String skuQuantitys) {
		this.skuQuantitys = skuQuantitys;
	}

	public String getSkuQuantitys() {
		return this.skuQuantitys;
	}

	public void setSkuStandardPrices(String skuStandardPrices) {
		this.skuStandardPrices = skuStandardPrices;
	}

	public String getSkuStandardPrices() {
		return this.skuStandardPrices;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public Long getSpuId() {
		return this.spuId;
	}

	public void setStandardPrice(String standardPrice) {
		this.standardPrice = standardPrice;
	}

	public String getStandardPrice() {
		return this.standardPrice;
	}

	public void setStandardRetailPrice(String standardRetailPrice) {
		this.standardRetailPrice = standardRetailPrice;
	}

	public String getStandardRetailPrice() {
		return this.standardRetailPrice;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeType() {
		return this.tradeType;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("alarm_number", this.alarmNumber);
		txtParams.put("category_id", this.categoryId);
		txtParams.put("city", this.city);
		txtParams.put("cost_price", this.costPrice);
		txtParams.put("dealer_cost_price", this.dealerCostPrice);
		txtParams.put("desc", this.desc);
		txtParams.put("discount_id", this.discountId);
		txtParams.put("have_guarantee", this.haveGuarantee);
		txtParams.put("have_invoice", this.haveInvoice);
		txtParams.put("input_properties", this.inputProperties);
		txtParams.put("is_authz", this.isAuthz);
		txtParams.put("item_id", this.itemId);
		txtParams.put("name", this.name);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("pic_path", this.picPath);
		txtParams.put("postage_ems", this.postageEms);
		txtParams.put("postage_fast", this.postageFast);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("postage_ordinary", this.postageOrdinary);
		txtParams.put("postage_type", this.postageType);
		txtParams.put("productcat_id", this.productcatId);
		txtParams.put("properties", this.properties);
		txtParams.put("property_alias", this.propertyAlias);
		txtParams.put("prov", this.prov);
		txtParams.put("quantity", this.quantity);
		txtParams.put("retail_price_high", this.retailPriceHigh);
		txtParams.put("retail_price_low", this.retailPriceLow);
		txtParams.put("sku_cost_prices", this.skuCostPrices);
		txtParams.put("sku_dealer_cost_prices", this.skuDealerCostPrices);
		txtParams.put("sku_outer_ids", this.skuOuterIds);
		txtParams.put("sku_properties", this.skuProperties);
		txtParams.put("sku_quantitys", this.skuQuantitys);
		txtParams.put("sku_standard_prices", this.skuStandardPrices);
		txtParams.put("spu_id", this.spuId);
		txtParams.put("standard_price", this.standardPrice);
		txtParams.put("standard_retail_price", this.standardRetailPrice);
		txtParams.put("trade_type", this.tradeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductAddResponse> getResponseClass() {
		return FenxiaoProductAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(alarmNumber, "alarmNumber");
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkNotEmpty(city, "city");
		RequestCheckUtils.checkNotEmpty(desc, "desc");
		RequestCheckUtils.checkNotEmpty(haveGuarantee, "haveGuarantee");
		RequestCheckUtils.checkNotEmpty(haveInvoice, "haveInvoice");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkNotEmpty(postageType, "postageType");
		RequestCheckUtils.checkNotEmpty(productcatId, "productcatId");
		RequestCheckUtils.checkNotEmpty(prov, "prov");
		RequestCheckUtils.checkNotEmpty(quantity, "quantity");
		RequestCheckUtils.checkNotEmpty(retailPriceHigh, "retailPriceHigh");
		RequestCheckUtils.checkNotEmpty(retailPriceLow, "retailPriceLow");
		RequestCheckUtils.checkNotEmpty(standardPrice, "standardPrice");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}
	
	

}