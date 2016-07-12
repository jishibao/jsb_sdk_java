package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TopResultCode extends TaobaoObject {

	private static final long serialVersionUID = 6378387685889134789L;

	/**
	 * code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 描述
	 */
	@ApiField("msg")
	private String msg;


	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
