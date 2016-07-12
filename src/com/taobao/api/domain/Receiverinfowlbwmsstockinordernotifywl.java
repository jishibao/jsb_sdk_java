package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Receiverinfowlbwmsstockinordernotifywl extends TaobaoObject {

	private static final long serialVersionUID = 6437813378638435781L;

	/**
	 * 收件方地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 收件人区县
	 */
	@ApiField("receiver_area")
	private String receiverArea;

	/**
	 * 收件人城市
	 */
	@ApiField("receiver_city")
	private String receiverCity;

	/**
	 * 收件人手机
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收件人名称
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件人手机
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 收件人省份
	 */
	@ApiField("receiver_province")
	private String receiverProvince;

	/**
	 * 收件人镇
	 */
	@ApiField("receiver_town")
	private String receiverTown;

	/**
	 * 收件人邮编
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

	public String getReceiverTown() {
		return this.receiverTown;
	}
	public void setReceiverTown(String receiverTown) {
		this.receiverTown = receiverTown;
	}

	public String getReceiverZipCode() {
		return this.receiverZipCode;
	}
	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}

}
