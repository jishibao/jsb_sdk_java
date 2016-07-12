package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.agree response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderAgreeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4748293866397111847L;

	/** 
	 * 操作是否成功。true：成功；false：失败。
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
