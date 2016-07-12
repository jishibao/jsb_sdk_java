package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.Permission;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.sellercenter.user.permissions.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterUserPermissionsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5235412966561261931L;

	/** 
	 * 权限列表
	 */
	@ApiListField("permissions")
	@ApiField("permission")
	private List<Permission> permissions;


	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	public List<Permission> getPermissions( ) {
		return this.permissions;
	}
	


}
