package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SellercenterRolesGetResponse;

/**
 * TOP API: taobao.sellercenter.roles.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class SellercenterRolesGetRequest extends BaseTaobaoRequest<SellercenterRolesGetResponse> {
	
	

	/** 
	* 卖家昵称(只允许查询自己的信息：当前登陆者)
	 */
	private String nick;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public String getApiMethodName() {
		return "taobao.sellercenter.roles.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercenterRolesGetResponse> getResponseClass() {
		return SellercenterRolesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nick, "nick");
		RequestCheckUtils.checkMaxLength(nick, 500, "nick");
	}
	

}