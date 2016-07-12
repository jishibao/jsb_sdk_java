package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAliqinTaNumberSinglecallbyttsResponse;

/**
 * TOP API: alibaba.aliqin.ta.number.singlecallbytts request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.02
 */
public class AlibabaAliqinTaNumberSinglecallbyttsRequest extends BaseTaobaoRequest<AlibabaAliqinTaNumberSinglecallbyttsResponse> {
	
	

	/** 
	* 被叫号码
	 */
	private String calledNum;

	/** 
	* 显示号码
	 */
	private String calledShowNum;

	/** 
	* 上下文参数,tts模板含有变量的, 此参数需填写。示例:{"date":"2015年 " ,"name":"测试","extend":"回传参数"} date、name 为模板里的变量名作为key,extend为扩展信息作为回传参数的key
	 */
	private String params;

	/** 
	* tts文本模板code
	 */
	private String ttsCode;

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

	public void setTtsCode(String ttsCode) {
		this.ttsCode = ttsCode;
	}

	public String getTtsCode() {
		return this.ttsCode;
	}

	public String getApiMethodName() {
		return "alibaba.aliqin.ta.number.singlecallbytts";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("called_num", this.calledNum);
		txtParams.put("called_show_num", this.calledShowNum);
		txtParams.put("params", this.params);
		txtParams.put("tts_code", this.ttsCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAliqinTaNumberSinglecallbyttsResponse> getResponseClass() {
		return AlibabaAliqinTaNumberSinglecallbyttsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(calledNum, "calledNum");
		RequestCheckUtils.checkNotEmpty(calledShowNum, "calledShowNum");
		RequestCheckUtils.checkNotEmpty(ttsCode, "ttsCode");
	}
	

}