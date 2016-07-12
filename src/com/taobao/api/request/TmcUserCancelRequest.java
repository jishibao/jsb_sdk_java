package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmcUserCancelResponse;

/**
 * TOP API: taobao.tmc.user.cancel request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.04
 */
public class TmcUserCancelRequest extends BaseTaobaoRequest<TmcUserCancelResponse> {
	
	

	/** 
	* 用户昵称
	 */
	private String nick;

	/** 
	* 用户所属的平台类型，tbUIC:淘宝用户; icbu: icbu用户
	 */
	private String userPlatform;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setUserPlatform(String userPlatform) {
		this.userPlatform = userPlatform;
	}

	public String getUserPlatform() {
		return this.userPlatform;
	}

	public String getApiMethodName() {
		return "taobao.tmc.user.cancel";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		txtParams.put("user_platform", this.userPlatform);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcUserCancelResponse> getResponseClass() {
		return TmcUserCancelResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nick, "nick");
	}
	

}