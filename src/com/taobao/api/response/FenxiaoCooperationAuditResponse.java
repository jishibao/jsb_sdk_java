package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.audit response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoCooperationAuditResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6273277761564871496L;

	/** 
	 * 操作是否成功
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
