package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 中转仓基础信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TranStoreResult extends TaobaoObject {

	private static final long serialVersionUID = 7277415925236928244L;

	/**
	 * 中转仓地址
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 中转仓代码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 中转仓名字
	 */
	@ApiField("store_name")
	private String storeName;


	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
