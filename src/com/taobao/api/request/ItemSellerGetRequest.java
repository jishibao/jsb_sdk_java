package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemSellerGetResponse;

/**
 * TOP API: taobao.item.seller.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.03
 */
public class ItemSellerGetRequest extends BaseTaobaoRequest<ItemSellerGetResponse> {
	
	

	/** 
	* 需要返回的商品字段列表。可选值：Item商品结构体中所有字段均可返回，多个字段用“,”分隔。
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
		return "taobao.item.seller.get";
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

	public Class<ItemSellerGetResponse> getResponseClass() {
		return ItemSellerGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 1L, "numIid");
	}
	

}