package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 面单申请
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillApplyRequest extends TaobaoObject {

	private static final long serialVersionUID = 4223499625832332798L;

	/**
	 * TOP平台请求的ISV APPKEY
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 物流服务商ID
	 */
	@ApiField("cp_code")
	private String cpCode;

	/**
	 * 商家ID
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * 发货地址
	 */
	@ApiField("shipping_address")
	private WaybillAddress shippingAddress;


	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public WaybillAddress getShippingAddress() {
		return this.shippingAddress;
	}
	public void setShippingAddress(WaybillAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
