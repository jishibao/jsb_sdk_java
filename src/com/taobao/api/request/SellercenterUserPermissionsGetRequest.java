package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SellercenterUserPermissionsGetResponse;

/**
 * TOP API: taobao.sellercenter.user.permissions.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class SellercenterUserPermissionsGetRequest extends BaseTaobaoRequest<SellercenterUserPermissionsGetResponse> {
	
	

	/** 
	* 用户标识，次入参必须为子账号比如zhangsan:cool。如果只输入主账号zhangsan，将报错。
	 */
	private String nick;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public String getApiMethodName() {
		return "taobao.sellercenter.user.permissions.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercenterUserPermissionsGetResponse> getResponseClass() {
		return SellercenterUserPermissionsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nick, "nick");
	}
	

}