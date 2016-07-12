package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.delivery.template.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryTemplateUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5747965734766627546L;

	/** 
	 * 表示修改是否成功
	 */
	@ApiField("complete")
	private Boolean complete;


	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
	public Boolean getComplete( ) {
		return this.complete;
	}
	


}
