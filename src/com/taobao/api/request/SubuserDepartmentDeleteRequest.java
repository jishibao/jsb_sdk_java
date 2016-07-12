package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SubuserDepartmentDeleteResponse;

/**
 * TOP API: taobao.subuser.department.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class SubuserDepartmentDeleteRequest extends BaseTaobaoRequest<SubuserDepartmentDeleteResponse> {
	
	

	/** 
	* 部门ID
	 */
	private Long departmentId;

	/** 
	* 主账号用户名
	 */
	private String userNick;

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.subuser.department.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("department_id", this.departmentId);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SubuserDepartmentDeleteResponse> getResponseClass() {
		return SubuserDepartmentDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(departmentId, "departmentId");
		RequestCheckUtils.checkNotEmpty(userNick, "userNick");
	}
	

}