package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemsSellerListGetResponse;

/**
 * TOP API: taobao.items.seller.list.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.03
 */
public class ItemsSellerListGetRequest extends BaseTaobaoRequest<ItemsSellerListGetResponse> {
	
	

	/** 
	* 需要返回的商品字段列表。可选值：点击返回结果中的Item结构体中能展示出来的所有字段，多个字段用“,”分隔。注：返回所有sku信息的字段名称是sku而不是skus。
	 */
	private String fields;

	/** 
	* 商品ID列表，多个ID用半角逗号隔开，一次最多不超过20个。注：获取不存在的商品ID或获取别人的商品都不会报错，但没有商品数据返回。
	 */
	private String numIids;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setNumIids(String numIids) {
		this.numIids = numIids;
	}

	public String getNumIids() {
		return this.numIids;
	}

	public String getApiMethodName() {
		return "taobao.items.seller.list.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("num_iids", this.numIids);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemsSellerListGetResponse> getResponseClass() {
		return ItemsSellerListGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(numIids, "numIids");
		RequestCheckUtils.checkMaxListSize(numIids, 20, "numIids");
	}
	

}