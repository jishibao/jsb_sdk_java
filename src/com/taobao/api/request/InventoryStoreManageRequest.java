package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.InventoryStoreManageResponse;

/**
 * TOP API: taobao.inventory.store.manage request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.23
 */
public class InventoryStoreManageRequest extends BaseTaobaoRequest<InventoryStoreManageResponse> {
	
	

	/** 
	* 仓库的物理地址，可更新
	 */
	private String address;

	/** 
	* 仓库区域名，可更新
	 */
	private String addressAreaName;

	/** 
	* 仓库简称，可更新
	 */
	private String aliasName;

	/** 
	* 联系人，可更新
	 */
	private String contact;

	/** 
	* 参数定义，ADD：新建; UPDATE：更新
	 */
	private String operateType;

	/** 
	* 联系电话，可更新
	 */
	private String phone;

	/** 
	* 邮编，可更新
	 */
	private Long postcode;

	/** 
	* 商家的仓库编码，不允许重复，不允许更新
	 */
	private String storeCode;

	/** 
	* 商家的仓库名称，可更新
	 */
	private String storeName;

	/** 
	* 仓库类型，可更新。目前只支持自有仓，TYPE_OWN：自有物理仓
	 */
	private String storeType;

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddressAreaName(String addressAreaName) {
		this.addressAreaName = addressAreaName;
	}

	public String getAddressAreaName() {
		return this.addressAreaName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getAliasName() {
		return this.aliasName;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContact() {
		return this.contact;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPostcode(Long postcode) {
		this.postcode = postcode;
	}

	public Long getPostcode() {
		return this.postcode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getStoreType() {
		return this.storeType;
	}

	public String getApiMethodName() {
		return "taobao.inventory.store.manage";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("address", this.address);
		txtParams.put("address_area_name", this.addressAreaName);
		txtParams.put("alias_name", this.aliasName);
		txtParams.put("contact", this.contact);
		txtParams.put("operate_type", this.operateType);
		txtParams.put("phone", this.phone);
		txtParams.put("postcode", this.postcode);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("store_name", this.storeName);
		txtParams.put("store_type", this.storeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryStoreManageResponse> getResponseClass() {
		return InventoryStoreManageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(address, "address");
		RequestCheckUtils.checkNotEmpty(addressAreaName, "addressAreaName");
		RequestCheckUtils.checkNotEmpty(operateType, "operateType");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
		RequestCheckUtils.checkNotEmpty(storeName, "storeName");
		RequestCheckUtils.checkNotEmpty(storeType, "storeType");
	}
	

}