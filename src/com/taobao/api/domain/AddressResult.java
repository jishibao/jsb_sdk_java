package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 地址库返回数据信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AddressResult extends TaobaoObject {

	private static final long serialVersionUID = 3485838857844948183L;

	/**
	 * 详细街道地址，不需要重复填写省/市/区
	 */
	@ApiField("addr")
	private String addr;

	/**
	 * 区域ID
	 */
	@ApiField("area_id")
	private Long areaId;

	/**
	 * 是否默认退货地址
	 */
	@ApiField("cancel_def")
	private Boolean cancelDef;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 地址库ID
	 */
	@ApiField("contact_id")
	private Long contactId;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 区、县
	 */
	@ApiField("country")
	private String country;

	/**
	 * 是否默认取货地址
	 */
	@ApiField("get_def")
	private Boolean getDef;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 手机号码，手机与电话必需有一个 
手机号码不能超过20位
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 修改日期时间
	 */
	@ApiField("modify_date")
	private Date modifyDate;

	/**
	 * 电话号码,手机与电话必需有一个
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 公司名称,
	 */
	@ApiField("seller_company")
	private String sellerCompany;

	/**
	 * 是否默认发货地址
	 */
	@ApiField("send_def")
	private Boolean sendDef;

	/**
	 * 地区邮政编码
	 */
	@ApiField("zip_code")
	private String zipCode;


	public String getAddr() {
		return this.addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Long getAreaId() {
		return this.areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Boolean getCancelDef() {
		return this.cancelDef;
	}
	public void setCancelDef(Boolean cancelDef) {
		this.cancelDef = cancelDef;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Long getContactId() {
		return this.contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
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

	public Boolean getGetDef() {
		return this.getDef;
	}
	public void setGetDef(Boolean getDef) {
		this.getDef = getDef;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSellerCompany() {
		return this.sellerCompany;
	}
	public void setSellerCompany(String sellerCompany) {
		this.sellerCompany = sellerCompany;
	}

	public Boolean getSendDef() {
		return this.sendDef;
	}
	public void setSendDef(Boolean sendDef) {
		this.sendDef = sendDef;
	}

	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
