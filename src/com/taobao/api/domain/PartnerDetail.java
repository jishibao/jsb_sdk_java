package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流公司详细信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PartnerDetail extends TaobaoObject {

	private static final long serialVersionUID = 6582168818213288962L;

	/**
	 * 物流公司支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 物流公司代码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 物流公司id
	 */
	@ApiField("company_id")
	private Long companyId;

	/**
	 * 物流公司简称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 物流公司全名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 运单号验证正则表达式
	 */
	@ApiField("reg_mail_no")
	private String regMailNo;

	/**
	 * 旺旺id
	 */
	@ApiField("wangwang_id")
	private String wangwangId;


	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Long getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRegMailNo() {
		return this.regMailNo;
	}
	public void setRegMailNo(String regMailNo) {
		this.regMailNo = regMailNo;
	}

	public String getWangwangId() {
		return this.wangwangId;
	}
	public void setWangwangId(String wangwangId) {
		this.wangwangId = wangwangId;
	}

}
