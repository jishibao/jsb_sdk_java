package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 权限信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Permission extends TaobaoObject {

	private static final long serialVersionUID = 5888495533963622973L;

	/**
	 * 1 :允许授权  2：不允许授权 6：不允许授权但默认已有权限
	 */
	@ApiField("is_authorize")
	private Long isAuthorize;

	/**
	 * 父权限code
	 */
	@ApiField("parent_code")
	private String parentCode;

	/**
	 * 注册到权限中心的code值
	 */
	@ApiField("permission_code")
	private String permissionCode;

	/**
	 * 权限名称
	 */
	@ApiField("permission_name")
	private String permissionName;


	public Long getIsAuthorize() {
		return this.isAuthorize;
	}
	public void setIsAuthorize(Long isAuthorize) {
		this.isAuthorize = isAuthorize;
	}

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getPermissionCode() {
		return this.permissionCode;
	}
	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

	public String getPermissionName() {
		return this.permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

}
