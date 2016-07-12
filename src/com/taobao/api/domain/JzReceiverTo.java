package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 家装收货人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class JzReceiverTo extends TaobaoObject {

	private static final long serialVersionUID = 2665745147551153656L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 收货人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道
	 */
	@ApiField("street")
	private String street;

	/**
	 * 座机号
	 */
	@ApiField("tele_phone")
	private String telePhone;

	/**
	 * 邮编
	 */
	@ApiField("zip_code")
	private String zipCode;


	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getTelePhone() {
		return this.telePhone;
	}
	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
