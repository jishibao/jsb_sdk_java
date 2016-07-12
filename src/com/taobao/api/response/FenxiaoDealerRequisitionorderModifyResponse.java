package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.modify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderModifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2443913118255948621L;

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
