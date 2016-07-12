package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SubuserDutysGetResponse;

/**
 * TOP API: taobao.subuser.dutys.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class SubuserDutysGetRequest extends BaseTaobaoRequest<SubuserDutysGetResponse> {
	
	

	/** 
	* 主账号用户名
	 */
	private String userNick;

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.subuser.dutys.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SubuserDutysGetResponse> getResponseClass() {
		return SubuserDutysGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(userNick, "userNick");
	}
	

}