package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 买家收货地信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ReciverAddressDo extends TaobaoObject {

	private static final long serialVersionUID = 5397484762263964264L;

	/**
	 * 市级别
	 */
	@ApiField("city")
	private String city;

	/**
	 * 国级别
	 */
	@ApiField("country")
	private String country;

	/**
	 * 详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 区、县级别
	 */
	@ApiField("district")
	private String district;

	/**
	 * 省级别
	 */
	@ApiField("province")
	private String province;

	/**
	 * 街道
	 */
	@ApiField("street")
	private String street;


	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
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

}
