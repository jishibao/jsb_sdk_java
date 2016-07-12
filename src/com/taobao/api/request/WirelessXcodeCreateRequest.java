package com.taobao.api.request;

import com.taobao.api.domain.QrCodeStyle;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WirelessXcodeCreateResponse;

/**
 * TOP API: taobao.wireless.xcode.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.06
 */
public class WirelessXcodeCreateRequest extends BaseTaobaoRequest<WirelessXcodeCreateResponse> {
	
	

	/** 
	* 码平台开放的业务code
	 */
	private String bizCode;

	/** 
	* 原始内容/原始地址
	 */
	private String content;

	/** 
	* 普通二维码样式参数
	 */
	private String style;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public void setStyle(QrCodeStyle style) {
		this.style = new JSONWriter(false,true).write(style);
	}

	public String getStyle() {
		return this.style;
	}

	public String getApiMethodName() {
		return "taobao.wireless.xcode.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_code", this.bizCode);
		txtParams.put("content", this.content);
		txtParams.put("style", this.style);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WirelessXcodeCreateResponse> getResponseClass() {
		return WirelessXcodeCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(content, "content");
	}
	

}