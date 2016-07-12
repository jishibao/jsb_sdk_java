package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FuwuSaleLinkGenResponse;

/**
 * TOP API: taobao.fuwu.sale.link.gen request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.12
 */
public class FuwuSaleLinkGenRequest extends BaseTaobaoRequest<FuwuSaleLinkGenResponse> {
	
	

	/** 
	* 用户需要营销的目标人群中的用户nick
	 */
	private String nick;

	/** 
	* 从服务商后台，营销链接功能中生成的参数串直接复制使用。不要修改，否则抛错。
	 */
	private String paramStr;

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return this.nick;
	}

	public void setParamStr(String paramStr) {
		this.paramStr = paramStr;
	}

	public String getParamStr() {
		return this.paramStr;
	}

	public String getApiMethodName() {
		return "taobao.fuwu.sale.link.gen";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		txtParams.put("param_str", this.paramStr);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FuwuSaleLinkGenResponse> getResponseClass() {
		return FuwuSaleLinkGenResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(paramStr, "paramStr");
	}
	

}