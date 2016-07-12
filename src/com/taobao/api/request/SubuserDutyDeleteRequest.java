package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SubuserDutyDeleteResponse;

/**
 * TOP API: taobao.subuser.duty.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class SubuserDutyDeleteRequest extends BaseTaobaoRequest<SubuserDutyDeleteResponse> {
	
	

	/** 
	* 职务ID
	 */
	private Long dutyId;

	/** 
	* 主账号用户名
	 */
	private String userNick;

	public void setDutyId(Long dutyId) {
		this.dutyId = dutyId;
	}

	public Long getDutyId() {
		return this.dutyId;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.subuser.duty.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("duty_id", this.dutyId);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SubuserDutyDeleteResponse> getResponseClass() {
		return SubuserDutyDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dutyId, "dutyId");
		RequestCheckUtils.checkNotEmpty(userNick, "userNick");
	}
	

}