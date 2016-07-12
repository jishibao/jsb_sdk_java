package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemSkuDeleteResponse;

/**
 * TOP API: taobao.item.sku.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class ItemSkuDeleteRequest extends BaseTaobaoRequest<ItemSkuDeleteResponse> {
	
	

	/** 
	* 忽略警告提示.
	 */
	private String ignorewarning;

	/** 
	* sku所属商品的数量,大于0的整数。当用户删除sku，使商品数量不等于sku数量之和时候，用于修改商品的数量，使sku能够删除成功。特别是删除最后一个sku的时候，一定要设置商品数量到正常的值，否则删除失败
	 */
	private Long itemNum;

	/** 
	* sku所属商品的价格。当用户删除sku，使商品价格不属于sku价格之间的时候，用于修改商品的价格，使sku能够删除成功
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
	* Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充
	 */
	private String properties;

	public void setIgnorewarning(String ignorewarning) {
		this.ignorewarning = ignorewarning;
	}

	public String getIgnorewarning() {
		return this.ignorewarning;
	}

	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}

	public Long getItemNum() {
		return this.itemNum;
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

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getProperties() {
		return this.properties;
	}

	public String getApiMethodName() {
		return "taobao.item.sku.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ignorewarning", this.ignorewarning);
		txtParams.put("item_num", this.itemNum);
		txtParams.put("item_price", this.itemPrice);
		txtParams.put("lang", this.lang);
		txtParams.put("num_iid", this.numIid);
		txtParams.put("properties", this.properties);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemSkuDeleteResponse> getResponseClass() {
		return ItemSkuDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkNotEmpty(properties, "properties");
	}
	

}