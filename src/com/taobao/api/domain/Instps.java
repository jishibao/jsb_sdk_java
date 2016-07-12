package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 家装安装公司信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Instps extends TaobaoObject {

	private static final long serialVersionUID = 7433483863399259559L;

	/**
	 * 公司编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 是否商家绑定的默认安装公司
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
