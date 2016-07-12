package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlipayXiaodaiUserPermitResponse;

/**
 * TOP API: alipay.xiaodai.user.permit request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.17
 */
public class AlipayXiaodaiUserPermitRequest extends BaseTaobaoRequest<AlipayXiaodaiUserPermitResponse> {
	
	

	/** 
	* 用户数字ID
	 */
	private Long userId;

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "alipay.xiaodai.user.permit";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlipayXiaodaiUserPermitResponse> getResponseClass() {
		return AlipayXiaodaiUserPermitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(userId, "userId");
	}
	

}