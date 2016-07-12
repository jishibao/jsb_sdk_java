package com.taobao.api.request;

import java.util.List;
import com.taobao.api.domain.UpdateItemShipTimeOption;
import com.taobao.api.domain.UpdateSkuShipTime;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemShiptimeUpdateResponse;

/**
 * TOP API: tmall.item.shiptime.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.11
 */
public class TmallItemShiptimeUpdateRequest extends BaseTaobaoRequest<TmallItemShiptimeUpdateResponse> {
	
	

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 批量更新商品/SKU发货时间的备选项
	 */
	private String option;

	/** 
	* 被更新发货时间（商品级）；格式和具体设置的发货时间格式相关。绝对发货时间填写yyyy-MM-dd;相对发货时间填写数字。发货时间必须在当前时间后三天。如果设置的绝对时间小于当前时间的三天后，会清除该商品的发货时间设置。如果是相对时间小于3，则会提示出错。如果shiptimeType为0，要清除商品上的发货时间，该字段可以填任意字符,也可以不填。
	 */
	private String shipTime;

	/** 
	* 被更新SKU的发货时间，后台会根据三个子属性去查找匹配的sku，如果找到就默认对sku进行更新，当无匹配sku且更新类型针对sku，会报错。
	 */
	private String skuShipTimes;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public void setOption(UpdateItemShipTimeOption option) {
		this.option = new JSONWriter(false,true).write(option);
	}

	public String getOption() {
		return this.option;
	}

	public void setShipTime(String shipTime) {
		this.shipTime = shipTime;
	}

	public String getShipTime() {
		return this.shipTime;
	}

	public void setSkuShipTimes(String skuShipTimes) {
		this.skuShipTimes = skuShipTimes;
	}

	public void setSkuShipTimes(List<UpdateSkuShipTime> skuShipTimes) {
		this.skuShipTimes = new JSONWriter(false,true).write(skuShipTimes);
	}

	public String getSkuShipTimes() {
		return this.skuShipTimes;
	}

	public String getApiMethodName() {
		return "tmall.item.shiptime.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("option", this.option);
		txtParams.put("ship_time", this.shipTime);
		txtParams.put("sku_ship_times", this.skuShipTimes);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemShiptimeUpdateResponse> getResponseClass() {
		return TmallItemShiptimeUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(skuShipTimes, 20, "skuShipTimes");
	}
	

}