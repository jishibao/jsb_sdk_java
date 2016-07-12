package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJmsGroupAddResponse;

/**
 * TOP API: taobao.jushita.jms.group.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.13
 */
public class JushitaJmsGroupAddRequest extends BaseTaobaoRequest<JushitaJmsGroupAddResponse> {
	
	

	/** 
	* 分组名称，同一个应用下需要保证唯一性，最长32个字符。添加分组后，消息通道会为用户的消息分配独立分组，但之前的消息还是存储于默认分组中。不能以default开头，default开头为系统默认组。
	 */
	private String groupName;

	/** 
	* 用户昵称列表，以半角逗号分隔，支持子账号，支持增量添加用户
	 */
	private String userNicks;

	/** 
	* 用户所属于的平台类型，tbUIC:淘宝用户; icbu: icbu用户
	 */
	private String userPlatform;

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setUserNicks(String userNicks) {
		this.userNicks = userNicks;
	}

	public String getUserNicks() {
		return this.userNicks;
	}

	public void setUserPlatform(String userPlatform) {
		this.userPlatform = userPlatform;
	}

	public String getUserPlatform() {
		return this.userPlatform;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jms.group.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group_name", this.groupName);
		txtParams.put("user_nicks", this.userNicks);
		txtParams.put("user_platform", this.userPlatform);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJmsGroupAddResponse> getResponseClass() {
		return JushitaJmsGroupAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupName, "groupName");
		RequestCheckUtils.checkNotEmpty(userNicks, "userNicks");
		RequestCheckUtils.checkMaxListSize(userNicks, 20, "userNicks");
	}
	

}