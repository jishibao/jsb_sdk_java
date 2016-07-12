package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shipping;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.offline.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOfflineSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6343165221591427428L;

	/** 
	 * 自己联系的调用结果
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
