package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 发货参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public class JzTopArgs extends TaobaoObject {

	private static final long serialVersionUID = 5629484848821298884L;

	/**
	 * 运单号
	 */
	@ApiField("mail_no")
	private String mailNo;

	/**
	 * 包裹数量
	 */
	@ApiField("package_number")
	private String packageNumber;

	/**
	 * 包裹备注
	 */
	@ApiField("package_remark")
	private String packageRemark;

	/**
	 * 包裹体积
	 */
	@ApiField("package_volume")
	private String packageVolume;

	/**
	 * 包裹重量
	 */
	@ApiField("package_weight")
	private String packageWeight;

	/**
	 * 自有物流公司名称
	 */
	@ApiField("zy_company")
	private String zyCompany;

	/**
	 * 自有物流发货时间
	 */
	@ApiField("zy_consign_time")
	private String zyConsignTime;

	/**
	 * 自有物流公司电话
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

	public String getZyPhoneNumber() {
		return this.zyPhoneNumber;
	}
	public void setZyPhoneNumber(String zyPhoneNumber) {
		this.zyPhoneNumber = zyPhoneNumber;
	}

}
