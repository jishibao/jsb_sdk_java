package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbWmsConsignOrderConfirmResp;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.consign.order.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsConsignOrderConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7441863727639135272L;

	/** 
	 * 销售订单出库确认
	 */
	@ApiField("result")
	private WlbWmsConsignOrderConfirmResp result;


	public void setResult(WlbWmsConsignOrderConfirmResp result) {
		this.result = result;
	}
	public WlbWmsConsignOrderConfirmResp getResult( ) {
		return this.result;
	}
	


}
