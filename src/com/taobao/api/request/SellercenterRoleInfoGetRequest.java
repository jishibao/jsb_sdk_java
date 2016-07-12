package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SellercenterRoleInfoGetResponse;

/**
 * TOP API: taobao.sellercenter.role.info.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class SellercenterRoleInfoGetRequest extends BaseTaobaoRequest<SellercenterRoleInfoGetResponse> {
	
	

	/** 
	* 角色id
	 */
	private Long roleId;

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public String getApiMethodName() {
		return "taobao.sellercenter.role.info.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("role_id", this.roleId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercenterRoleInfoGetResponse> getResponseClass() {
		return SellercenterRoleInfoGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(roleId, "roleId");
	}
	

}