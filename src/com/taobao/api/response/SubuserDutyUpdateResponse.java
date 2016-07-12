package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.subuser.duty.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SubuserDutyUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1583547272729191957L;

	/** 
	 * 操作是否成功 true:操作成功; false:操作失败
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
