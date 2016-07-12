package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SellercenterRoleAddResponse;

/**
 * TOP API: taobao.sellercenter.role.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.08
 */
public class SellercenterRoleAddRequest extends BaseTaobaoRequest<SellercenterRoleAddResponse> {
	
	

	/** 
	* 角色描述
	 */
	private String description;

	/** 
	* 角色名
	 */
	private String name;

	/** 
	* 表示卖家昵称
	 */
	private String nick;

	/** 
	* 需要授权的权限点permission_code列表,以","分割.其code值可以通过调用taobao.sellercenter.user.permissions.get返回，其中permission.is_authorize=1的权限点可以通过本接口授权给对应角色。
	 */
	private String permissionCodes;

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setPermissionCodes(String permissionCodes) {
		this.permissionCodes = permissionCodes;
	}

	public String getPermissionCodes() {
		return this.permissionCodes;
	}

	public String getApiMethodName() {
		return "taobao.sellercenter.role.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("description", this.description);
		txtParams.put("name", this.name);
		txtParams.put("nick", this.nick);
		txtParams.put("permission_codes", this.permissionCodes);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercenterRoleAddResponse> getResponseClass() {
		return SellercenterRoleAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(description, 20, "description");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 20, "name");
		RequestCheckUtils.checkNotEmpty(nick, "nick");
		RequestCheckUtils.checkMaxLength(nick, 500, "nick");
		RequestCheckUtils.checkMaxListSize(permissionCodes, 2000, "permissionCodes");
	}
	

}