package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAliqinTaSmsNumSendResponse;

/**
 * TOP API: alibaba.aliqin.ta.sms.num.send request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.12
 */
public class AlibabaAliqinTaSmsNumSendRequest extends BaseTaobaoRequest<AlibabaAliqinTaSmsNumSendResponse> {
	
	

	/** 
	* 公共回传参数
	 */
	private String extend;

	/** 
	* 商家自定义扩展码
	 */
	private String extendCode;

	/** 
	* 商家自定义扩展名,例如店铺nick
	 */
	private String extendName;

	/** 
	* 接收号码
	 */
	private String recNum;

	/** 
	* 短信签名
	 */
	private String smsFreeSignName;

	/** 
	* 短信模板变量，AckNum是变量参数
	 */
	private String smsParam;

	/** 
	* 短信模板CODE
	 */
	private String smsTemplateCode;

	/** 
	* 类型，normal：短信
	 */
	private String smsType;

	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtendCode(String extendCode) {
		this.extendCode = extendCode;
	}

	public String getExtendCode() {
		return this.extendCode;
	}

	public void setExtendName(String extendName) {
		this.extendName = extendName;
	}

	public String getExtendName() {
		return this.extendName;
	}

	public void setRecNum(String recNum) {
		this.recNum = recNum;
	}

	public String getRecNum() {
		return this.recNum;
	}

	public void setSmsFreeSignName(String smsFreeSignName) {
		this.smsFreeSignName = smsFreeSignName;
	}

	public String getSmsFreeSignName() {
		return this.smsFreeSignName;
	}

	public void setSmsParam(String smsParam) {
		this.smsParam = smsParam;
	}
	public void setSmsParamString(String smsParam) {
		this.smsParam = smsParam;
	}

	public String getSmsParam() {
		return this.smsParam;
	}

	public void setSmsTemplateCode(String smsTemplateCode) {
		this.smsTemplateCode = smsTemplateCode;
	}

	public String getSmsTemplateCode() {
		return this.smsTemplateCode;
	}

	public void setSmsType(String smsType) {
		this.smsType = smsType;
	}

	public String getSmsType() {
		return this.smsType;
	}

	public String getApiMethodName() {	    
		return "alibaba.aliqin.ta.sms.num.send";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("extend", this.extend);
		txtParams.put("extend_code", this.extendCode);
		txtParams.put("extend_name", this.extendName);
		txtParams.put("rec_num", this.recNum);
		txtParams.put("sms_free_sign_name", this.smsFreeSignName);
		txtParams.put("sms_param", this.smsParam);
		txtParams.put("sms_template_code", this.smsTemplateCode);
		txtParams.put("sms_type", this.smsType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinTaSmsNumSendResponse> getResponseClass() {
		return AlibabaAliqinTaSmsNumSendResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(recNum, "recNum");
		RequestCheckUtils.checkNotEmpty(smsFreeSignName, "smsFreeSignName");
		RequestCheckUtils.checkNotEmpty(smsTemplateCode, "smsTemplateCode");
		RequestCheckUtils.checkNotEmpty(smsType, "smsType");
	}
	

}