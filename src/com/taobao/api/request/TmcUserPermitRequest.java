package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmcUserPermitResponse;

/**
 * TOP API: taobao.tmc.user.permit request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.04
 */
public class TmcUserPermitRequest extends BaseTaobaoRequest<TmcUserPermitResponse> {
	
	

	/** 
	* 消息主题列表，用半角逗号分隔。当用户订阅的topic是应用订阅的子集时才需要设置，不设置表示继承应用所订阅的所有topic，一般情况建议不要设置。
	 */
	private String topics;

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getTopics() {
		return this.topics;
	}

	public String getApiMethodName() {
		return "taobao.tmc.user.permit";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("topics", this.topics);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcUserPermitResponse> getResponseClass() {
		return TmcUserPermitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(topics, 100, "topics");
	}
	

}