package com.taobao.api.response;

import com.taobao.api.domain.SubUserPermission;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercenter.subuser.permissions.roles.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterSubuserPermissionsRolesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5758511178784397935L;

	/** 
	 * 子账号被所拥有的权限
	 */
	@ApiField("subuser_permission")
	private SubUserPermission subuserPermission;


	public void setSubuserPermission(SubUserPermission subuserPermission) {
		this.subuserPermission = subuserPermission;
	}
	public SubUserPermission getSubuserPermission( ) {
		return this.subuserPermission;
	}
	


}
