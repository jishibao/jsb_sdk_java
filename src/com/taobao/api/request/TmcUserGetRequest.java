package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmcUserGetResponse;

/**
 * TOP API: taobao.tmc.user.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.04
 */
public class TmcUserGetRequest extends BaseTaobaoRequest<TmcUserGetResponse> {
	
	

	/** 
	* 需返回的字段列表，多个字段以半角逗号分隔。可选值：TmcUser结构体中的所有字段，一定要返回topic。
	 */
	private String fields;

	/** 
	* 用户昵称
	 */
	private String nick;

	/** 
	* 用户所属的平台类型，tbUIC:淘宝用户; icbu: icbu用户
	 */
	private String userPlatform;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

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
		return "taobao.tmc.user.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
		txtParams.put("user_platform", this.userPlatform);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcUserGetResponse> getResponseClass() {
		return TmcUserGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(nick, "nick");
		RequestCheckUtils.checkMaxLength(nick, 100, "nick");
	}
	

}