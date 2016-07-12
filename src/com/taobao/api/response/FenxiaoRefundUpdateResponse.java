package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.refund.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoRefundUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1127756925358214954L;

	/** 
	 * 退款是否修改成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
