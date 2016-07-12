package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shipping;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.consign.resend response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsConsignResendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1851876435979953736L;

	/** 
	 * 返回发货是否成功is_success
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
