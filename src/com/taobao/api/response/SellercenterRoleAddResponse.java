package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Role;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercenter.role.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterRoleAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4434482455163594188L;

	/** 
	 * 子账号角色
	 */
	@ApiField("role")
	private Role role;


	public void setRole(Role role) {
		this.role = role;
	}
	public Role getRole( ) {
		return this.role;
	}
	


}
