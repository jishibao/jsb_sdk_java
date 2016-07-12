package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流公司信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Tpdto extends TaobaoObject {

	private static final long serialVersionUID = 4567277748115684184L;

	/**
	 * 公司编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 是否商家绑定的默认安装服务商
	 */
	@ApiField("is_default")
	private Boolean isDefault;

	/**
	 * 公司名称
	 */
	@ApiField("name")
	private String name;


	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsDefault() {
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
