package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SubuserDutyUpdateResponse;

/**
 * TOP API: taobao.subuser.duty.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class SubuserDutyUpdateRequest extends BaseTaobaoRequest<SubuserDutyUpdateResponse> {
	
	

	/** 
	* 职务ID
	 */
	private Long dutyId;

	/** 
	* 职务级别
	 */
	private Long dutyLevel;

	/** 
	* 职务名称
	 */
	private String dutyName;

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

	public void setDutyLevel(Long dutyLevel) {
		this.dutyLevel = dutyLevel;
	}

	public Long getDutyLevel() {
		return this.dutyLevel;
	}

	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}

	public String getDutyName() {
		return this.dutyName;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.subuser.duty.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("duty_id", this.dutyId);
		txtParams.put("duty_level", this.dutyLevel);
		txtParams.put("duty_name", this.dutyName);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SubuserDutyUpdateResponse> getResponseClass() {
		return SubuserDutyUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dutyId, "dutyId");
		RequestCheckUtils.checkNotEmpty(userNick, "userNick");
	}
	

}