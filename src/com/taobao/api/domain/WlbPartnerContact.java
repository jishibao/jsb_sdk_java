package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 联系人联系详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbPartnerContact extends TaobaoObject {

	private static final long serialVersionUID = 8367719715276293174L;

	/**
	 * 仓库联系人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系电话
	 */
	@ApiField("phone")
	private String phone;


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
