package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemGetResponse;

/**
 * TOP API: taobao.item.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.30
 */
public class ItemGetRequest extends BaseTaobaoRequest<ItemGetResponse> {
	
	

	/** 
	* 需要返回的商品对象字段，如title,price,desc_modules等，。可选值：Item商品结构体中所有字段均可返回（除sold_quantity）；多个字段用“,”分隔。<br>新增返回字段：item_weight(商品的重量，格式为数字，包含小数)、item_size(商品的体积，格式为数字，包含小数)、change_prop（商品基础色数据）
	 */
	private String fields;

	/** 
	* 商品数字ID
	 */
	private Long numIid;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public String getApiMethodName() {
		return "taobao.item.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("num_iid", this.numIid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemGetResponse> getResponseClass() {
		return ItemGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMinValue(numIid, 1L, "numIid");
	}
	

}