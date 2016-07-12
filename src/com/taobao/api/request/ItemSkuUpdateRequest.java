package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemSkuUpdateResponse;

/**
 * TOP API: taobao.item.sku.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.04
 */
public class ItemSkuUpdateRequest extends BaseTaobaoRequest<ItemSkuUpdateResponse> {
	
	

	/** 
	* SKU条形码
	 */
	private String barcode;

	/** 
	* 忽略警告提示.
	 */
	private String ignorewarning;

	/** 
	* sku所属商品的价格。当用户更新sku，使商品价格不属于sku价格之间的时候，用于修改商品的价格，使sku能够更新成功
	 */
	private String itemPrice;

	/** 
	* Sku文字的版本。可选值:zh_HK(繁体),zh_CN(简体);默认值:zh_CN
	 */
	private String lang;

	/** 
	* Sku所属商品数字id，可通过 taobao.item.get 获取
	 */
	private Long numIid;

	/** 
	* Sku的商家外部id
	 */
	private String outerId;

	/** 
	* Sku的销售价格。精确到2位小数;单位:元。如:200.07，表示:200元7分。修改后的sku价格要保证商品的价格在所有sku价格所形成的价格区间内（例如：商品价格为6元，sku价格有5元、10元两种，如果要修改5元sku的价格，那么修改的范围只能是0-6元之间；如果要修改10元的sku，那么修改的范围只能是6到无穷大的区间中）
	 */
	private String price;

	/** 
	* Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充。
如果包含自定义属性，则格式为pid:vid;pid2:vid2;$pText:vText , 其中$pText:vText为自定义属性。限制：其中$pText的’$’前缀不能少，且pText和vText文本中不可以存在 冒号:和分号;以及逗号，
	 */
	private String properties;

	/** 
	* Sku的库存数量。sku的总数量应该小于等于商品总数量(Item的NUM)，sku数量变化后item的总数量也会随着变化。取值范围:大于等于零的整数
	 */
	private Long quantity;

	/** 
	* 产品的规格信息。
	 */
	private String specId;

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBarcode() {
		return this.barcode;
	}

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

	public void setSpecId(String specId) {
		this.specId = specId;
	}

	public String getSpecId() {
		return this.specId;
	}

	public String getApiMethodName() {
		return "taobao.item.sku.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("barcode", this.barcode);
		txtParams.put("ignorewarning", this.ignorewarning);
		txtParams.put("item_price", this.itemPrice);
		txtParams.put("lang", this.lang);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("price", this.price);
		txtParams.put("properties", this.properties);
		txtParams.put("quantity", this.quantity);
		txtParams.put("spec_id", this.specId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemSkuUpdateResponse> getResponseClass() {
		return ItemSkuUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
		RequestCheckUtils.checkNotEmpty(properties, "properties");
		RequestCheckUtils.checkMinValue(quantity, 0L, "quantity");
	}
	

}