package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 仓库物流订单信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Consignorderlist extends TaobaoObject {

	private static final long serialVersionUID = 3825626626472522819L;

	/**
	 * 发货订单信息
	 */
	@ApiField("consign_order")
	private Consignorder consignOrder;


	public Consignorder getConsignOrder() {
		return this.consignOrder;
	}
	public void setConsignOrder(Consignorder consignOrder) {
		this.consignOrder = consignOrder;
	}

}
