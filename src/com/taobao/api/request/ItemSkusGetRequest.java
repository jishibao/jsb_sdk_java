package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemSkusGetResponse;

/**
 * TOP API: taobao.item.skus.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.04
 */
public class ItemSkusGetRequest extends BaseTaobaoRequest<ItemSkusGetResponse> {
	
	

	/** 
	* 需返回的字段列表。可选值：Sku结构体中的所有字段；字段之间用“,”分隔。
	 */
	private String fields;

	/** 
	* sku所属商品数字id，必选。num_iid个数不能超过40个
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
		return "taobao.item.skus.get";
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

	public Class<ItemSkusGetResponse> getResponseClass() {
		return ItemSkusGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(numIids, "numIids");
	}
	

}