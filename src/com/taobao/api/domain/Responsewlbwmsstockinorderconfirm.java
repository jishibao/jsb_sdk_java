package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 入库订单确认返回
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Responsewlbwmsstockinorderconfirm extends TaobaoObject {

	private static final long serialVersionUID = 2327913711283878636L;

	/**
	 * 错误编码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误详细
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
