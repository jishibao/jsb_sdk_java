package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shipping;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.online.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOnlineConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7643842776672755585L;

	/** 
	 * 只返回is_success：是否成功。
	 */
	@ApiField("shipping")
	private Shipping shipping;


	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Shipping getShipping( ) {
		return this.shipping;
	}
	


}
