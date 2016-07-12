package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 家装物流发货参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public class JzConsignArgsNew extends TaobaoObject {

	private static final long serialVersionUID = 1855284592848417534L;

	/**
	 * 快递运单号，serviceType=20 和serviceType=21时必填
	 */
	@ApiField("mail_no")
	private String mailNo;

	/**
	 * 包裹数目
	 */
	@ApiField("package_number")
	private String packageNumber;

	/**
	 * 包裹备注信息
	 */
	@ApiField("package_remark")
	private String packageRemark;

	/**
	 * 包裹体积m3
	 */
	@ApiField("package_volume")
	private String packageVolume;

	/**
	 * 包裹重量kg
	 */
	@ApiField("package_weight")
	private String packageWeight;

	/**
	 * 物流公司名称，tmsPartner.virualType=true时必填
	 */
	@ApiField("zy_company")
	private String zyCompany;

	/**
	 * 发货时间，tmsPartner.virualType=true时必填
	 */
	@ApiField("zy_consign_time")
	private String zyConsignTime;

	/**
	 * 运单号，tmsPartner.virualType=true时必填
	 */
	@ApiField("zy_mail_no")
	private String zyMailNo;

	/**
	 * 物流公司电话，tmsPartner.virualType=true时必填
	 */
	@ApiField("zy_phone_number")
	private String zyPhoneNumber;


	public String getMailNo() {
		return this.mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

	public String getPackageNumber() {
		return this.packageNumber;
	}
	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}

	public String getPackageRemark() {
		return this.packageRemark;
	}
	public void setPackageRemark(String packageRemark) {
		this.packageRemark = packageRemark;
	}

	public String getPackageVolume() {
		return this.packageVolume;
	}
	public void setPackageVolume(String packageVolume) {
		this.packageVolume = packageVolume;
	}

	public String getPackageWeight() {
		return this.packageWeight;
	}
	public void setPackageWeight(String packageWeight) {
		this.packageWeight = packageWeight;
	}

	public String getZyCompany() {
		return this.zyCompany;
	}
	public void setZyCompany(String zyCompany) {
		this.zyCompany = zyCompany;
	}

	public String getZyConsignTime() {
		return this.zyConsignTime;
	}
	public void setZyConsignTime(String zyConsignTime) {
		this.zyConsignTime = zyConsignTime;
	}

	public String getZyMailNo() {
		return this.zyMailNo;
	}
	public void setZyMailNo(String zyMailNo) {
		this.zyMailNo = zyMailNo;
	}

	public String getZyPhoneNumber() {
		return this.zyPhoneNumber;
	}
	public void setZyPhoneNumber(String zyPhoneNumber) {
		this.zyPhoneNumber = zyPhoneNumber;
	}

}
