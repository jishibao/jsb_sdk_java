package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.ReciverAddressDo;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbImportsResourceGetResponse;

/**
 * TOP API: taobao.wlb.imports.resource.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.27
 */
public class WlbImportsResourceGetRequest extends BaseTaobaoRequest<WlbImportsResourceGetResponse> {
	
	

	/** 
	* 卖家发货地区域ID
	 */
	private Long fromId;

	/** 
	* 买家收货地信息
	 */
	private String toAddress;

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	public Long getFromId() {
		return this.fromId;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public void setToAddress(ReciverAddressDo toAddress) {
		this.toAddress = new JSONWriter(false,true).write(toAddress);
	}

	public String getToAddress() {
		return this.toAddress;
	}

	public String getApiMethodName() {
		return "taobao.wlb.imports.resource.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("from_id", this.fromId);
		txtParams.put("to_address", this.toAddress);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbImportsResourceGetResponse> getResponseClass() {
		return WlbImportsResourceGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fromId, "fromId");
	}
	

}