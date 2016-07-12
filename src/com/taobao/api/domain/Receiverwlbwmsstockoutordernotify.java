package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 收件人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Receiverwlbwmsstockoutordernotify extends TaobaoObject {

	private static final long serialVersionUID = 2124536744526615667L;

	/**
	 * 收件方地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 收件方区县
	 */
	@ApiField("receiver_area")
	private String receiverArea;

	/**
	 * 收件方城市
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * 退供场景ECP填充供应商编码，调拨出库单ECP填充调拨入仓库编码, B2B出库单填写分销商ID(无分销ID的null)
	 */
	@ApiField("receiver_code")
	private String receiverCode;

	/**
	 * 收件方手机
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收件方名称
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件方电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 收件方省份
	 */
	@ApiField("receiver_province")
	private String receiverProvince;

	/**
	 * 收件方邮编
	 */
	@ApiField("receiver_zip_code")
	private String receiverZipCode;


	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverArea() {
		return this.receiverArea;
	}
	public void setReceiverArea(String receiverArea) {
		this.receiverArea = receiverArea;
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getReceiverCode() {
		return this.receiverCode;
	}
	public void setReceiverCode(String receiverCode) {
		this.receiverCode = receiverCode;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverProvince() {
		return this.receiverProvince;
	}
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}

	public String getReceiverZipCode() {
		return this.receiverZipCode;
	}
	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}

}
