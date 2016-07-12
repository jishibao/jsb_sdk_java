package com.taobao.api.request;

import java.util.List;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.OpenSmsBatchsendmsgResponse;

/**
 * TOP API: taobao.open.sms.batchsendmsg request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.17
 */
public class OpenSmsBatchsendmsgRequest extends BaseTaobaoRequest<OpenSmsBatchsendmsgResponse> {
	
	

	/** 
	* 参数列表
	 */
	private String params;

	public void setParams(String params) {
		this.params = params;
	}

	public void setParams(List<SendMessageRequest> params) {
		this.params = new JSONWriter(false,true).write(params);
	}

	public String getParams() {
		return this.params;
	}

	public String getApiMethodName() {
		return "taobao.open.sms.batchsendmsg";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("params", this.params);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OpenSmsBatchsendmsgResponse> getResponseClass() {
		return OpenSmsBatchsendmsgResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(params, 30, "params");
	}
	
	/**
	 * 参数列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SendMessageRequest extends TaobaoObject {
		private static final long serialVersionUID = 7799532652243521658L;
		/**
		 * 模板上下文
		 */
		@ApiField("context")
		private String context;
		/**
		 * 延迟多少时间发送，单位毫秒
		 */
		@ApiField("delay_time")
		private Long delayTime;
		/**
		 * 设备ID
		 */
		@ApiField("device_id")
		private String deviceId;
		/**
		 * 设备级别发送次数限制
		 */
		@ApiField("device_limit")
		private Long deviceLimit;
		/**
		 * 多少秒内，设备级别发送次数限制，如100秒内一个设备发送次数不超过5次
		 */
		@ApiField("device_limit_in_time")
		private Long deviceLimitInTime;
		/**
		 * 域
		 */
		@ApiField("domain")
		private String domain;
		/**
		 * 外部ID
		 */
		@ApiField("external_id")
		private String externalId;
		/**
		 * 手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 手机号级别发送次数限制
		 */
		@ApiField("mobile_limit")
		private Long mobileLimit;
		/**
		 * 多少秒内，手机号级别发送次数限制
		 */
		@ApiField("mobile_limit_in_time")
		private Long mobileLimitInTime;
		/**
		 * 会话ID
		 */
		@ApiField("session_id")
		private String sessionId;
		/**
		 * 会话级别发送次数限制
		 */
		@ApiField("session_limit")
		private Long sessionLimit;
		/**
		 * 会话级别发送次数限制
		 */
		@ApiField("session_limit_in_time")
		private Long sessionLimitInTime;
		/**
		 * 签名
		 */
		@ApiField("signature")
		private String signature;
		/**
		 * 签名ID
		 */
		@ApiField("signature_id")
		private Long signatureId;
		/**
		 * 模板ID
		 */
		@ApiField("template_id")
		private Long templateId;
	
		public String getContext() {
			return this.context;
		}
		public void setContext(String context) {
			this.context = context;
		}
		public void setContextString(String context) {
			this.context = context;
		}
		
		public Long getDelayTime() {
			return this.delayTime;
		}
		public void setDelayTime(Long delayTime) {
			this.delayTime = delayTime;
		}
		public String getDeviceId() {
			return this.deviceId;
		}
		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
		public Long getDeviceLimit() {
			return this.deviceLimit;
		}
		public void setDeviceLimit(Long deviceLimit) {
			this.deviceLimit = deviceLimit;
		}
		public Long getDeviceLimitInTime() {
			return this.deviceLimitInTime;
		}
		public void setDeviceLimitInTime(Long deviceLimitInTime) {
			this.deviceLimitInTime = deviceLimitInTime;
		}
		public String getDomain() {
			return this.domain;
		}
		public void setDomain(String domain) {
			this.domain = domain;
		}
		public String getExternalId() {
			return this.externalId;
		}
		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public Long getMobileLimit() {
			return this.mobileLimit;
		}
		public void setMobileLimit(Long mobileLimit) {
			this.mobileLimit = mobileLimit;
		}
		public Long getMobileLimitInTime() {
			return this.mobileLimitInTime;
		}
		public void setMobileLimitInTime(Long mobileLimitInTime) {
			this.mobileLimitInTime = mobileLimitInTime;
		}
		public String getSessionId() {
			return this.sessionId;
		}
		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}
		public Long getSessionLimit() {
			return this.sessionLimit;
		}
		public void setSessionLimit(Long sessionLimit) {
			this.sessionLimit = sessionLimit;
		}
		public Long getSessionLimitInTime() {
			return this.sessionLimitInTime;
		}
		public void setSessionLimitInTime(Long sessionLimitInTime) {
			this.sessionLimitInTime = sessionLimitInTime;
		}
		public String getSignature() {
			return this.signature;
		}
		public void setSignature(String signature) {
			this.signature = signature;
		}
		public Long getSignatureId() {
			return this.signatureId;
		}
		public void setSignatureId(Long signatureId) {
			this.signatureId = signatureId;
		}
		public Long getTemplateId() {
			return this.templateId;
		}
		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}
	}
	

}