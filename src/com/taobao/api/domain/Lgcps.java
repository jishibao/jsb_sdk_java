package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 家装物流公司信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Lgcps extends TaobaoObject {

	private static final long serialVersionUID = 3783344134295514314L;

	/**
	 * 公司编码
	 */
	@ApiField("code")
	private String code;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
