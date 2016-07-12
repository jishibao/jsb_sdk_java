package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SellercenterSubusersGetResponse;

/**
 * TOP API: taobao.sellercenter.subusers.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.19
 */
public class SellercenterSubusersGetRequest extends BaseTaobaoRequest<SellercenterSubusersGetResponse> {
	
	

	/** 
	* 表示卖家昵称
	 */
	private String nick;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public String getApiMethodName() {
		return "taobao.sellercenter.subusers.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercenterSubusersGetResponse> getResponseClass() {
		return SellercenterSubusersGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nick, "nick");
	}
	

}