package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 订单信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoBillQueryOrderinfolist extends TaobaoObject {

	private static final long serialVersionUID = 8837465881764617165L;

	/**
	 * 订单信息
	 */
	@ApiField("order_info")
	private CainiaoBillQueryOrderinfo orderInfo;


	public CainiaoBillQueryOrderinfo getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(CainiaoBillQueryOrderinfo orderInfo) {
		this.orderInfo = orderInfo;
	}

}
