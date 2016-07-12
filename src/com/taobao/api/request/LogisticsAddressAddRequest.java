package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.LogisticsAddressAddResponse;

/**
 * TOP API: taobao.logistics.address.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class LogisticsAddressAddRequest extends BaseTaobaoRequest<LogisticsAddressAddResponse> {
	
	

	/** 
	* 详细街道地址，不需要重复填写省/市/区
	 */
	private String addr;

	/** 
	* 默认退货地址。<br>
<font color='red'>选择此项(true)，将当前地址设为默认退货地址，撤消原默认退货地址</font>
	 */
	private Boolean cancelDef;

	/** 
	* 所在市
	 */
	private String city;

	/** 
	* 联系人姓名 <font color='red'>长度不可超过20个字节</font>
	 */
	private String contactName;

	/** 
	* 区、县
<br><font color='red'>如果所在地区是海外的可以为空，否则为必参</font>
	 */
	private String country;

	/** 
	* 默认取货地址。<br>
<font color='red'>选择此项(true)，将当前地址设为默认取货地址，撤消原默认取货地址</font>
	 */
	private Boolean getDef;

	/** 
	* 备注,<br><font color='red'>备注不能超过256字节</font>
	 */
	private String memo;

	/** 
	* 手机号码，手机与电话必需有一个
<br><font color='red'>手机号码不能超过20位</font>
	 */
	private String mobilePhone;

	/** 
	* 电话号码,手机与电话必需有一个
	 */
	private String phone;

	/** 
	* 所在省
	 */
	private String province;

	/** 
	* 公司名称,<br><font color="red">公司名称长能不能超过20字节</font>
	 */
	private String sellerCompany;

	/** 
	* 默认发货地址。<br>
<font color='red'>选择此项(true)，将当前地址设为默认发货地址，撤消原默认发货地址</font>
	 */
	private Boolean sendDef;

	/** 
	* 地区邮政编码
<br><font color='red'>如果所在地区是海外的可以为空，否则为必参</font>
	 */
	private String zipCode;

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setCancelDef(Boolean cancelDef) {
		this.cancelDef = cancelDef;
	}

	public Boolean getCancelDef() {
		return this.cancelDef;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setGetDef(Boolean getDef) {
		this.getDef = getDef;
	}

	public Boolean getGetDef() {
		return this.getDef;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvince() {
		return this.province;
	}

	public void setSellerCompany(String sellerCompany) {
		this.sellerCompany = sellerCompany;
	}

	public String getSellerCompany() {
		return this.sellerCompany;
	}

	public void setSendDef(Boolean sendDef) {
		this.sendDef = sendDef;
	}

	public Boolean getSendDef() {
		return this.sendDef;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("addr", this.addr);
		txtParams.put("cancel_def", this.cancelDef);
		txtParams.put("city", this.city);
		txtParams.put("contact_name", this.contactName);
		txtParams.put("country", this.country);
		txtParams.put("get_def", this.getDef);
		txtParams.put("memo", this.memo);
		txtParams.put("mobile_phone", this.mobilePhone);
		txtParams.put("phone", this.phone);
		txtParams.put("province", this.province);
		txtParams.put("seller_company", this.sellerCompany);
		txtParams.put("send_def", this.sendDef);
		txtParams.put("zip_code", this.zipCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsAddressAddResponse> getResponseClass() {
		return LogisticsAddressAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(addr, "addr");
		RequestCheckUtils.checkNotEmpty(city, "city");
		RequestCheckUtils.checkNotEmpty(contactName, "contactName");
		RequestCheckUtils.checkMaxLength(memo, 256, "memo");
		RequestCheckUtils.checkNotEmpty(province, "province");
		RequestCheckUtils.checkMaxLength(sellerCompany, 20, "sellerCompany");
	}
	

}