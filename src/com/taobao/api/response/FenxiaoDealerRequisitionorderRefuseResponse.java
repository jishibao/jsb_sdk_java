package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.refuse response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderRefuseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3466843349683528653L;

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
