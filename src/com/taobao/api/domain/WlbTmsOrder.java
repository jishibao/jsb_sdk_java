package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流订单运单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbTmsOrder extends TaobaoObject {

	private static final long serialVersionUID = 2624429141196851786L;

	/**
	 * 运单号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 物流公司编码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 物流订单编号
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 物流订单的所有者ID,货主
	 */
	@ApiField("user_id")
	private Long userId;


	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
