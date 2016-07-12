package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.UpdateSkuPrice;
import com.taobao.api.domain.UpdateItemPriceOption;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemPriceUpdateResponse;

/**
 * TOP API: tmall.item.price.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.10.15
 */
public class TmallItemPriceUpdateRequest extends BaseTaobaoRequest<TmallItemPriceUpdateResponse> {
	
	

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 被更新商品价格
	 */
	private String itemPrice;

	/** 
	* 商品价格更新时候的可选参数
	 */
	private String options;

	/** 
	* 更新SKU价格时候的SKU价格对象；如果没有SKU或者不更新SKU价格，可以不填;查找SKU目前支持ID，属性串和商家编码三种模式，建议选用一种最合适的，切勿滥用，一次调用中如果混合使用，更新结果不可预期！
	 */
	private String skuPrices;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public void setOptions(UpdateItemPriceOption options) {
		this.options = new JSONWriter(false,true).write(options);
	}

	public String getOptions() {
		return this.options;
	}

	public void setSkuPrices(String skuPrices) {
		this.skuPrices = skuPrices;
	}

	public void setSkuPrices(List<UpdateSkuPrice> skuPrices) {
		this.skuPrices = new JSONWriter(false,true).write(skuPrices);
	}

	public String getSkuPrices() {
		return this.skuPrices;
	}

	public String getApiMethodName() {
		return "tmall.item.price.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("item_price", this.itemPrice);
		txtParams.put("options", this.options);
		txtParams.put("sku_prices", this.skuPrices);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemPriceUpdateResponse> getResponseClass() {
		return TmallItemPriceUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(skuPrices, 999999, "skuPrices");
	}
	

}