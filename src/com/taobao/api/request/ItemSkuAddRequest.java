package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemSkuAddResponse;

/**
 * TOP API: taobao.item.sku.add request
 * 
 * @author top auto create
 * @since 1.0, 2014.10.20
 */
public class ItemSkuAddRequest extends BaseTaobaoRequest<ItemSkuAddResponse> {
	
	

	/** 
	* 忽略警告提示.
	 */
	private String ignorewarning;

	/** 
	* sku所属商品的价格。当用户新增sku，使商品价格不属于sku价格之间的时候，用于修改商品的价格，使sku能够添加成功
	 */
	private String itemPrice;

	/** 
	* Sku文字的版本。可选值:zh_HK(繁体),zh_CN(简体);默认值:zh_CN
	 */
	private String lang;

	/** 
	* Sku所属商品数字id，可通过 taobao.item.get 获取。必选
	 */
	private Long numIid;

	/** 
	* Sku的商家外部id
	 */
	private String outerId;

	/** 
	* Sku的销售价格。商品的价格要在商品所有的sku的价格之间。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	private String price;

	/** 
	* Sku属性串。格式:pid:vid;pid:vid,如:1627207:3232483;1630696:3284570,表示:机身颜色:军绿色;手机套餐:一电一充。
	 */
	private String properties;

	/** 
	* Sku的库存数量。sku的总数量应该小于等于商品总数量(Item的NUM)。取值范围:大于零的整数
	 */
	private Long quantity;

	/** 
	* 家装建材类目，商品SKU的高度，单位为cm，部分类目必选。天猫商家专用。
可选值为："0-15", "15-25", "25-50", "50-60", "60-80", "80-120", "120-160", "160-200"。
数据和SKU一一对应，用,分隔，如：15-25,25-50,25-50
	 */
	private String skuHdHeight;

	/** 
	* 家装建材类目，商品SKU的灯头数量，正整数，大于等于3，部分类目必选。天猫商家专用。
数据和SKU一一对应，用,分隔，如：3,5,7
	 */
	private String skuHdLampQuantity;

	/** 
	* 家装建材类目，商品SKU的长度，正整数，单位为cm，部分类目必选。天猫商家专用。
数据和SKU一一对应，用,分隔，如：20,30,30
	 */
	private String skuHdLength;

	/** 
	* 产品的规格信息
	 */
	private String specId;

	public void setIgnorewarning(String ignorewarning) {
		this.ignorewarning = ignorewarning;
	}

	public String getIgnorewarning() {
		return this.ignorewarning;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return this.lang;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return this.price;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getProperties() {
		return this.properties;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setSkuHdHeight(String skuHdHeight) {
		this.skuHdHeight = skuHdHeight;
	}

	public String getSkuHdHeight() {
		return this.skuHdHeight;
	}

	public void setSkuHdLampQuantity(String skuHdLampQuantity) {
		this.skuHdLampQuantity = skuHdLampQuantity;
	}

	public String getSkuHdLampQuantity() {
		return this.skuHdLampQuantity;
	}

	public void setSkuHdLength(String skuHdLength) {
		this.skuHdLength = skuHdLength;
	}

	public String getSkuHdLength() {
		return this.skuHdLength;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getSpecId() {
		return this.specId;
	}

	public String getApiMethodName() {
		return "taobao.item.sku.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ignorewarning", this.ignorewarning);
		txtParams.put("item_price", this.itemPrice);
		txtParams.put("lang", this.lang);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("price", this.price);
		txtParams.put("properties", this.properties);
		txtParams.put("quantity", this.quantity);
		txtParams.put("sku_hd_height", this.skuHdHeight);
		txtParams.put("sku_hd_lamp_quantity", this.skuHdLampQuantity);
		txtParams.put("sku_hd_length", this.skuHdLength);
		txtParams.put("spec_id", this.specId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemSkuAddResponse> getResponseClass() {
		return ItemSkuAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
		RequestCheckUtils.checkNotEmpty(price, "price");
		RequestCheckUtils.checkNotEmpty(properties, "properties");
		RequestCheckUtils.checkNotEmpty(quantity, "quantity");
		RequestCheckUtils.checkMinValue(quantity, 0L, "quantity");
	}
	

}