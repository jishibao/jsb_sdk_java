package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wlborder.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWlborderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1336333354665226539L;

	/** 
	 * 物流宝订单对象
	 */
	@ApiField("wlb_order")
	private WlbOrder wlbOrder;


	public void setWlbOrder(WlbOrder wlbOrder) {
		this.wlbOrder = wlbOrder;
	}
	public WlbOrder getWlbOrder( ) {
		return this.wlbOrder;
	}
	


}
