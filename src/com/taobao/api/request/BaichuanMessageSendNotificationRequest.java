package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.BaichuanMessageSendNotificationResponse;

/**
 * TOP API: taobao.baichuan.message.sendNotification request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.14
 */
public class BaichuanMessageSendNotificationRequest extends BaseTaobaoRequest<BaichuanMessageSendNotificationResponse> {
	
	

	/** 
	* 通道类型 UMENG(1, "友盟"), JPUSH(2, "极光"),  XG(3, "信鸽"), GETUI(4, "个推");
	 */
	private Long channel;

	/** 
	* 内容
	 */
	private String contentText;

	/** 
	* 扩展k/v
	 */
	private String extraMap;

	/** 
	* 大图标
	 */
	private String largeIcon;

	/** 
	* 消息描述
	 */
	private String messageDesc;

	/** 
	* 手机号码
	 */
	private String mobileNumber;

	/** 
	* 打开页面类型  1 表示打开应用 2 打开native页面 3 打开网页URL 4 打开应用自定义的schema
	 */
	private Long openType;

	/** 
	* 打开页面的URL
	 */
	private String openUrl;

	/** 
	* 网关保存时间
	 */
	private Long saveTimeout;

	/** 
	* 短信传递的变量
	 */
	private String smsContext;

	/** 
	* push超时后发sms（单位秒）
	 */
	private Long smsDelayTime;

	/** 
	* sms_signature_id
	 */
	private Long smsSignatureId;

	/** 
	* sms 模板Id
	 */
	private Long smsTemplateId;

	/** 
	* 摘要
	 */
	private String summary;

	/** 
	* 设备devicetoken
	 */
	private String targetDeviceToken;

	/** 
	* 标题
	 */
	private String title;

	public void setChannel(Long channel) {
		this.channel = channel;
	}

	public Long getChannel() {
		return this.channel;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	public String getContentText() {
		return this.contentText;
	}

	public void setExtraMap(String extraMap) {
		this.extraMap = extraMap;
	}
	public void setExtraMapString(String extraMap) {
		this.extraMap = extraMap;
	}

	public String getExtraMap() {
		return this.extraMap;
	}

	public void setLargeIcon(String largeIcon) {
		this.largeIcon = largeIcon;
	}

	public String getLargeIcon() {
		return this.largeIcon;
	}

	public void setMessageDesc(String messageDesc) {
		this.messageDesc = messageDesc;
	}

	public String getMessageDesc() {
		return this.messageDesc;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setOpenType(Long openType) {
		this.openType = openType;
	}

	public Long getOpenType() {
		return this.openType;
	}

	public void setOpenUrl(String openUrl) {
		this.openUrl = openUrl;
	}

	public String getOpenUrl() {
		return this.openUrl;
	}

	public void setSaveTimeout(Long saveTimeout) {
		this.saveTimeout = saveTimeout;
	}

	public Long getSaveTimeout() {
		return this.saveTimeout;
	}

	public void setSmsContext(String smsContext) {
		this.smsContext = smsContext;
	}
	public void setSmsContextString(String smsContext) {
		this.smsContext = smsContext;
	}

	public String getSmsContext() {
		return this.smsContext;
	}

	public void setSmsDelayTime(Long smsDelayTime) {
		this.smsDelayTime = smsDelayTime;
	}

	public Long getSmsDelayTime() {
		return this.smsDelayTime;
	}

	public void setSmsSignatureId(Long smsSignatureId) {
		this.smsSignatureId = smsSignatureId;
	}

	public Long getSmsSignatureId() {
		return this.smsSignatureId;
	}

	public void setSmsTemplateId(Long smsTemplateId) {
		this.smsTemplateId = smsTemplateId;
	}

	public Long getSmsTemplateId() {
		return this.smsTemplateId;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setTargetDeviceToken(String targetDeviceToken) {
		this.targetDeviceToken = targetDeviceToken;
	}

	public String getTargetDeviceToken() {
		return this.targetDeviceToken;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "taobao.baichuan.message.sendNotification";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("channel", this.channel);
		txtParams.put("content_text", this.contentText);
		txtParams.put("extra_map", this.extraMap);
		txtParams.put("large_icon", this.largeIcon);
		txtParams.put("message_desc", this.messageDesc);
		txtParams.put("mobile_number", this.mobileNumber);
		txtParams.put("open_type", this.openType);
		txtParams.put("open_url", this.openUrl);
		txtParams.put("save_timeout", this.saveTimeout);
		txtParams.put("sms_context", this.smsContext);
		txtParams.put("sms_delay_time", this.smsDelayTime);
		txtParams.put("sms_signature_id", this.smsSignatureId);
		txtParams.put("sms_template_id", this.smsTemplateId);
		txtParams.put("summary", this.summary);
		txtParams.put("target_device_token", this.targetDeviceToken);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<BaichuanMessageSendNotificationResponse> getResponseClass() {
		return BaichuanMessageSendNotificationResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(contentText, "contentText");
		RequestCheckUtils.checkNotEmpty(messageDesc, "messageDesc");
		RequestCheckUtils.checkNotEmpty(targetDeviceToken, "targetDeviceToken");
		RequestCheckUtils.checkNotEmpty(title, "title");
	}
	

}