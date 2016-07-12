package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbNotifyMessageConfirmResponse;

/**
 * TOP API: taobao.wlb.notify.message.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.17
 */
public class WlbNotifyMessageConfirmRequest extends BaseTaobaoRequest<WlbNotifyMessageConfirmResponse> {
	
	

	/** 
	* 物流宝通知消息的id，通过taobao.wlb.notify.message.page.get接口得到的WlbMessage数据结构中的id字段
	 */
	private String messageId;

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.notify.message.confirm";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("message_id", this.messageId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbNotifyMessageConfirmResponse> getResponseClass() {
		return WlbNotifyMessageConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(messageId, "messageId");
	}
	

}