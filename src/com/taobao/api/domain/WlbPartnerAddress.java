package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 联系人地址信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbPartnerAddress extends TaobaoObject {

	private static final long serialVersionUID = 5127516376448569956L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 区
	 */
	@ApiField("borough")
	private String borough;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 邮编
	 */
	@ApiField("zip")
	private String zip;


	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBorough() {
		return this.borough;
	}
	public void setBorough(String borough) {
		this.borough = borough;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
