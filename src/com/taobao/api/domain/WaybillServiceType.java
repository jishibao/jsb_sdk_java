package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流服务类型
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillServiceType extends TaobaoObject {

	private static final long serialVersionUID = 8412488432389314224L;

	/**
	 * 物流服务能力编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 物流服务能力名称
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
