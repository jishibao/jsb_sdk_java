package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AppstoreSubscribeGetResponse;

/**
 * TOP API: taobao.appstore.subscribe.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class AppstoreSubscribeGetRequest extends BaseTaobaoRequest<AppstoreSubscribeGetResponse> {
	
	

	/** 
	* 插件实例ID
	 */
	private Long leaseId;

	/** 
	* 用户昵称
	 */
	private String nick;

	public void setLeaseId(Long leaseId) {
		this.leaseId = leaseId;
	}

	public Long getLeaseId() {
		return this.leaseId;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public String getApiMethodName() {
		return "taobao.appstore.subscribe.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("lease_id", this.leaseId);
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AppstoreSubscribeGetResponse> getResponseClass() {
		return AppstoreSubscribeGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(nick, "nick");
	}
	

}