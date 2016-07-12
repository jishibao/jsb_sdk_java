package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 子账号角色
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Role extends TaobaoObject {

	private static final long serialVersionUID = 7345281196547225256L;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 角色描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 所拥有权限
	 */
	@ApiListField("permissions")
	@ApiField("permission")
	private List<Permission> permissions;

	/**
	 * 角色id
	 */
	@ApiField("role_id")
	private Long roleId;

	/**
	 * 角色名
	 */
	@ApiField("role_name")
	private String roleName;

	/**
	 * 卖家Id
	 */
	@ApiField("seller_id")
	private Long sellerId;


	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public List<Permission> getPermissions() {
		return this.permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

}
