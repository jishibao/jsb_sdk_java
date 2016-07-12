package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 收\发货地址
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillAddress extends TaobaoObject {

	private static final long serialVersionUID = 4539483543533597116L;

	/**
	 * 详细地址
	 */
	@ApiField("address_detail")
	private String addressDetail;

	/**
	 * --
	 */
	@ApiField("address_format")
	private String addressFormat;

	/**
	 * 区名称（三级地址）
	 */
	@ApiField("area")
	private String area;

	/**
	 * 三级地址代码
	 */
	@ApiField("area_code")
	private Long areaCode;

	/**
	 * 市名称（二级地址）
	 */
	@ApiField("city")
	private String city;

	/**
	 * 二级地址代码
	 */
	@ApiField("city_code")
	private Long cityCode;

	/**
	 * 末级地址
	 */
	@ApiField("division_id")
	private Long divisionId;

	/**
	 * 省名称（一级地址）
	 */
	@ApiField("province")
	private String province;

	/**
	 * 一级地址代码
	 */
	@ApiField("province_code")
	private Long provinceCode;

	/**
	 * 街道\镇名称（四级地址）
	 */
	@ApiField("town")
	private String town;

	/**
	 * 四级地址代码
	 */
	@ApiField("town_code")
	private Long townCode;

	/**
	 * waybill 地址记录ID(非地址库ID)
	 */
	@ApiField("waybill_address_id")
	private Long waybillAddressId;


	public String getAddressDetail() {
		return this.addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getAddressFormat() {
		return this.addressFormat;
	}
	public void setAddressFormat(String addressFormat) {
		this.addressFormat = addressFormat;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public Long getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Long getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
	}

	public Long getDivisionId() {
		return this.divisionId;
	}
	public void setDivisionId(Long divisionId) {
		this.divisionId = divisionId;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public Long getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(Long provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getTown() {
		return this.town;
	}
	public void setTown(String town) {
		this.town = town;
	}

	public Long getTownCode() {
		return this.townCode;
	}
	public void setTownCode(Long townCode) {
		this.townCode = townCode;
	}

	public Long getWaybillAddressId() {
		return this.waybillAddressId;
	}
	public void setWaybillAddressId(Long waybillAddressId) {
		this.waybillAddressId = waybillAddressId;
	}

}
