package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 子账号所拥有的权限对象(直接赋予的权限和通过角色赋予的权限的总和对象)
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SubUserPermission extends TaobaoObject {

	private static final long serialVersionUID = 8631314153119864575L;

	/**
	 * 子账号被直接赋予的权限点列表
	 */
	@ApiListField("permissions")
	@ApiField("permission")
	private List<Permission> permissions;

	/**
	 * 子账号被赋予的角色信息(Role)列表。列表中的角色对象只有role_id，role_name，permissions信息
	 */
	@ApiListField("roles")
	@ApiField("role")
	private List<Role> roles;


	public List<Permission> getPermissions() {
		return this.permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<Role> getRoles() {
		return this.roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
