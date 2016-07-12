package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.JushitaJmsGroupDeleteResponse;

/**
 * TOP API: taobao.jushita.jms.group.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.13
 */
public class JushitaJmsGroupDeleteRequest extends BaseTaobaoRequest<JushitaJmsGroupDeleteResponse> {
	
	

	/** 
	* 分组名称，分组删除后，用户的消息将会存储于默认分组中。警告：由于分组已经删除，用户之前未消费的消息将无法再获取。不能以default开头，default开头为系统默认组。
	 */
	private String groupName;

	/** 
	* 用户列表，不传表示删除整个分组，如果用户全部删除后，也会自动删除整个分组
	 */
	private String nicks;

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

	public void setNicks(String nicks) {
		this.nicks = nicks;
	}

	public String getNicks() {
		return this.nicks;
	}

	public void setUserPlatform(String userPlatform) {
		this.userPlatform = userPlatform;
	}

	public String getUserPlatform() {
		return this.userPlatform;
	}

	public String getApiMethodName() {
		return "taobao.jushita.jms.group.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group_name", this.groupName);
		txtParams.put("nicks", this.nicks);
		txtParams.put("user_platform", this.userPlatform);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<JushitaJmsGroupDeleteResponse> getResponseClass() {
		return JushitaJmsGroupDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(groupName, "groupName");
		RequestCheckUtils.checkMaxListSize(nicks, 20, "nicks");
	}
	

}