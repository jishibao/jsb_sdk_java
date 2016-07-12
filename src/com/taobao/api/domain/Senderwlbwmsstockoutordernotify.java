package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 发货方信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Senderwlbwmsstockoutordernotify extends TaobaoObject {

	private static final long serialVersionUID = 6435794999912193956L;

	/**
	 * 发件方地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/**
	 * 发件方区县
	 */
	@ApiField("sender_area")
	private String senderArea;

	/**
	 * 发件方城市
	 */
	@ApiField("sender_city")
	private String senderCity;

	/**
	 * 发件方手机
	 */
	@ApiField("sender_mobile")
	private String senderMobile;

	/**
	 * 发件方名称
	 */
	@ApiField("sender_name")
	private String senderName;

	/**
	 * 发件方电话
	 */
	@ApiField("sender_phone")
	private String senderPhone;

	/**
	 * 发件方省份
	 */
	@ApiField("sender_province")
	private String senderProvince;

	/**
	 * 发件方镇
	 */
	@ApiField("sender_town")
	private String senderTown;

	/**
	 * 发件方邮编
	 */
	@ApiField("sender_zip_code")
	private String senderZipCode;


	public String getSenderAddress() {
		return this.senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderArea() {
		return this.senderArea;
	}
	public void setSenderArea(String senderArea) {
		this.senderArea = senderArea;
	}

	public String getSenderCity() {
		return this.senderCity;
	}
	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getSenderMobile() {
		return this.senderMobile;
	}
	public void setSenderMobile(String senderMobile) {
		this.senderMobile = senderMobile;
	}

	public String getSenderName() {
		return this.senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderPhone() {
		return this.senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getSenderProvince() {
		return this.senderProvince;
	}
	public void setSenderProvince(String senderProvince) {
		this.senderProvince = senderProvince;
	}

	public String getSenderTown() {
		return this.senderTown;
	}
	public void setSenderTown(String senderTown) {
		this.senderTown = senderTown;
	}

	public String getSenderZipCode() {
		return this.senderZipCode;
	}
	public void setSenderZipCode(String senderZipCode) {
		this.senderZipCode = senderZipCode;
	}

}
