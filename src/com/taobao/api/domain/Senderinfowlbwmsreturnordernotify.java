package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 发件人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Senderinfowlbwmsreturnordernotify extends TaobaoObject {

	private static final long serialVersionUID = 4167851462368543652L;

	/**
	 * 发件人地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/**
	 * 发件人区县
	 */
	@ApiField("sender_area")
	private String senderArea;

	/**
	 * 发件人城市
	 */
	@ApiField("sender_city")
	private String senderCity;

	/**
	 * 发件人手机，手机与电话二选一传入
	 */
	@ApiField("sender_mobile")
	private String senderMobile;

	/**
	 * 发件人姓名
	 */
	@ApiField("sender_name")
	private String senderName;

	/**
	 * 发件人电话
	 */
	@ApiField("sender_phone")
	private String senderPhone;

	/**
	 * 发件人省份
	 */
	@ApiField("sender_province")
	private String senderProvince;

	/**
	 * 发件人镇村
	 */
	@ApiField("sender_town")
	private String senderTown;

	/**
	 * 发件人邮编
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
