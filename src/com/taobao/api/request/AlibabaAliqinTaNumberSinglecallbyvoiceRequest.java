package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAliqinTaNumberSinglecallbyvoiceResponse;

/**
 * TOP API: alibaba.aliqin.ta.number.singlecallbyvoice request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.02
 */
public class AlibabaAliqinTaNumberSinglecallbyvoiceRequest extends BaseTaobaoRequest<AlibabaAliqinTaNumberSinglecallbyvoiceResponse> {
	
	

	/** 
	* 单呼号码
	 */
	private String calledNum;

	/** 
	* 显示号码
	 */
	private String calledShowNum;

	/** 
	* 上下文参数 示例:{"extend":"回传参数"} extend为扩展信息作为回传参数的key
	 */
	private String params;

	/** 
	* 语音文件code
	 */
	private String voiceCode;

	public void setCalledNum(String calledNum) {
		this.calledNum = calledNum;
	}

	public String getCalledNum() {
		return this.calledNum;
	}

	public void setCalledShowNum(String calledShowNum) {
		this.calledShowNum = calledShowNum;
	}

	public String getCalledShowNum() {
		return this.calledShowNum;
	}

	public void setParams(String params) {
		this.params = params;
	}
	public void setParamsString(String params) {
		this.params = params;
	}

	public String getParams() {
		return this.params;
	}

	public void setVoiceCode(String voiceCode) {
		this.voiceCode = voiceCode;
	}

	public String getVoiceCode() {
		return this.voiceCode;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.ta.number.singlecallbyvoice";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("called_num", this.calledNum);
		txtParams.put("called_show_num", this.calledShowNum);
		txtParams.put("params", this.params);
		txtParams.put("voice_code", this.voiceCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinTaNumberSinglecallbyvoiceResponse> getResponseClass() {
		return AlibabaAliqinTaNumberSinglecallbyvoiceResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(calledNum, "calledNum");
		RequestCheckUtils.checkNotEmpty(calledShowNum, "calledShowNum");
		RequestCheckUtils.checkNotEmpty(voiceCode, "voiceCode");
	}
	

}