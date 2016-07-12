package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SubuserDepartmentAddResponse;

/**
 * TOP API: taobao.subuser.department.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class SubuserDepartmentAddRequest extends BaseTaobaoRequest<SubuserDepartmentAddResponse> {
	
	

	/** 
	* 部门名称
	 */
	private String departmentName;

	/** 
	* 父部门ID 如果是最高部门则传入0
	 */
	private Long parentId;

	/** 
	* 主账号用户名
	 */
	private String userNick;

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.subuser.department.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("department_name", this.departmentName);
		txtParams.put("parent_id", this.parentId);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SubuserDepartmentAddResponse> getResponseClass() {
		return SubuserDepartmentAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(departmentName, "departmentName");
		RequestCheckUtils.checkNotEmpty(parentId, "parentId");
		RequestCheckUtils.checkNotEmpty(userNick, "userNick");
	}
	

}