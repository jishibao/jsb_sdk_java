package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.BaichuanMessageSendMessageResponse;

/**
 * TOP API: taobao.baichuan.message.sendMessage request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.09
 */
public class BaichuanMessageSendMessageRequest extends BaseTaobaoRequest<BaichuanMessageSendMessageResponse> {
	
	

	/** 
	* 通道类型 UMENG(1, "友盟"), JPUSH(2, "极光"), XG(3, "信鸽"), GETUI(4, "个推"); 默认友盟
	 */
	private Long channel;

	/** 
	* 扩展k/v
	 */
	private String extraMap;

	/** 
	* 消息体
	 */
	private String message;

	/** 
	* 消息描述
	 */
	private String messageDesc;

	/** 
	* 网关保存时间 默认1小时
	 */
	private Long saveTimeout;

	/** 
	* 设备码
	 */
	private String targetDeviceToken;

	public void setChannel(Long channel) {
		this.channel = channel;
	}

	public Long getChannel() {
		return this.channel;
	}

	public void setExtraMap(String extraMap) {
		this.extraMap = extraMap;
	}

	public String getExtraMap() {
		return this.extraMap;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessageDesc(String messageDesc) {
		this.messageDesc = messageDesc;
	}

	public String getMessageDesc() {
		return this.messageDesc;
	}

	public void setSaveTimeout(Long saveTimeout) {
		this.saveTimeout = saveTimeout;
	}

	public Long getSaveTimeout() {
		return this.saveTimeout;
	}

	public void setTargetDeviceToken(String targetDeviceToken) {
		this.targetDeviceToken = targetDeviceToken;
	}

	public String getTargetDeviceToken() {
		return this.targetDeviceToken;
	}

	public String getApiMethodName() {
		return "taobao.baichuan.message.sendMessage";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel", this.channel);
		txtParams.put("extra_map", this.extraMap);
		txtParams.put("message", this.message);
		txtParams.put("message_desc", this.messageDesc);
		txtParams.put("save_timeout", this.saveTimeout);
		txtParams.put("target_device_token", this.targetDeviceToken);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<BaichuanMessageSendMessageResponse> getResponseClass() {
		return BaichuanMessageSendMessageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(message, "message");
		RequestCheckUtils.checkNotEmpty(messageDesc, "messageDesc");
		RequestCheckUtils.checkNotEmpty(targetDeviceToken, "targetDeviceToken");
	}
	

}