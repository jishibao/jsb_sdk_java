package com.taobao.api.request;

import java.util.List;

import com.taobao.api.domain.AddressReachable;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.LogisticsAddressReachablebatchGetResponse;

/**
 * TOP API: taobao.logistics.address.reachablebatch.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.23
 */
public class LogisticsAddressReachablebatchGetRequest extends BaseTaobaoRequest<LogisticsAddressReachablebatchGetResponse> {
	
	

	/** 
	* 筛单用户输入地址结构
	 */
	private String addressList;

	public void setAddressList(String addressList) {
		this.addressList = addressList;
	}

	public void setAddressList(List<AddressReachable> addressList) {
		this.addressList = new JSONWriter(false,true).write(addressList);
	}

	public String getAddressList() {
		return this.addressList;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.reachablebatch.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("address_list", this.addressList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsAddressReachablebatchGetResponse> getResponseClass() {
		return LogisticsAddressReachablebatchGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(addressList, 20, "addressList");
	}
	

}