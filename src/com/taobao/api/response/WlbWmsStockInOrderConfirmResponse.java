package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Responsewlbwmsstockinorderconfirm;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.stock.in.order.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsStockInOrderConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5139751517528398479L;

	/** 
	 * 服务出参
	 */
	@ApiField("result")
	private Responsewlbwmsstockinorderconfirm result;


	public void setResult(Responsewlbwmsstockinorderconfirm result) {
		this.result = result;
	}
	public Responsewlbwmsstockinorderconfirm getResult( ) {
		return this.result;
	}
	


}
