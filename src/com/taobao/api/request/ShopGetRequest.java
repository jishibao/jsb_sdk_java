package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ShopGetResponse;

/**
 * TOP API: taobao.shop.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.21
 */
public class ShopGetRequest extends BaseTaobaoRequest<ShopGetResponse> {
	
	

	/** 
	* 需返回的字段列表。可选值：Shop 结构中的所有字段；多个字段之间用逗号(,)分隔
	 */
	private String fields;

	/** 
	* 卖家昵称
	 */
	private String nick;

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

	public String getApiMethodName() {
		return "taobao.shop.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("nick", this.nick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ShopGetResponse> getResponseClass() {
		return ShopGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(nick, "nick");
	}
	

}