package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.cancel response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillICancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5182111476782995465L;

	/** 
	 * 调用取消是否成功
	 */
	@ApiField("cancel_result")
	private Boolean cancelResult;


	public void setCancelResult(Boolean cancelResult) {
		this.cancelResult = cancelResult;
	}
	public Boolean getCancelResult( ) {
		return this.cancelResult;
	}
	


}
