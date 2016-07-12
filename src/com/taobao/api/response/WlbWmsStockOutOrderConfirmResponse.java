package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbWmsStockOutOrderConfirmResp;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.stock.out.order.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsStockOutOrderConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6241697759488975943L;

	/** 
	 * 出库单确认
	 */
	@ApiField("result")
	private WlbWmsStockOutOrderConfirmResp result;


	public void setResult(WlbWmsStockOutOrderConfirmResp result) {
		this.result = result;
	}
	public WlbWmsStockOutOrderConfirmResp getResult( ) {
		return this.result;
	}
	


}
