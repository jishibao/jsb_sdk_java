package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 验证验证码
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CheckVerCodeRequest extends TaobaoObject {

	private static final long serialVersionUID = 6639927741456275334L;

	/**
	 * app key
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 最多验证错误几次
	 */
	@ApiField("check_fail_limit")
	private Long checkFailLimit;

	/**
	 * 最多验证成功几次
	 */
	@ApiField("check_success_limit")
	private Long checkSuccessLimit;

	/**
	 * 短信验证码域
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * isv user id
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 验证码
	 */
	@ApiField("ver_code")
	private String verCode;


	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Long getCheckFailLimit() {
		return this.checkFailLimit;
	}
	public void setCheckFailLimit(Long checkFailLimit) {
		this.checkFailLimit = checkFailLimit;
	}

	public Long getCheckSuccessLimit() {
		return this.checkSuccessLimit;
	}
	public void setCheckSuccessLimit(Long checkSuccessLimit) {
		this.checkSuccessLimit = checkSuccessLimit;
	}

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getVerCode() {
		return this.verCode;
	}
	public void setVerCode(String verCode) {
		this.verCode = verCode;
	}

}
