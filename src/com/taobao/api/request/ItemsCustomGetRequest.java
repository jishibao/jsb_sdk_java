package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemsCustomGetResponse;

/**
 * TOP API: taobao.items.custom.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.03
 */
public class ItemsCustomGetRequest extends BaseTaobaoRequest<ItemsCustomGetResponse> {
	
	

	/** 
	* 需返回的字段列表，参考：Item商品结构体说明，其中barcode、sku.barcode等条形码字段暂不支持；多个字段之间用“,”分隔。
	 */
	private String fields;

	/** 
	* 商品的外部商品ID，支持批量，最多不超过40个。
	 */
	private String outerId;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public String getApiMethodName() {
		return "taobao.items.custom.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("outer_id", this.outerId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemsCustomGetResponse> getResponseClass() {
		return ItemsCustomGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(outerId, "outerId");
	}
	

}