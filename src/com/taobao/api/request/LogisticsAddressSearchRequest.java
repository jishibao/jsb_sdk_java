package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.LogisticsAddressSearchResponse;

/**
 * TOP API: taobao.logistics.address.search request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.17
 */
public class LogisticsAddressSearchRequest extends BaseTaobaoRequest<LogisticsAddressSearchResponse> {
	
	

	/** 
	* 可选，参数列表如下：<br><font color='red'>no_def:查询非默认地址<br>get_def:查询默认取货地址，也即对应卖家后台地址库中发货地址（send_def暂不起作用）<br>cancel_def:查询默认退货地址<br>缺省此参数时，查询所有当前用户的地址库</font>
	 */
	private String rdef;

	public void setRdef(String rdef) {
		this.rdef = rdef;
	}

	public String getRdef() {
		return this.rdef;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("rdef", this.rdef);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsAddressSearchResponse> getResponseClass() {
		return LogisticsAddressSearchResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}