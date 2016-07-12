package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoCooperationUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5786727365773441536L;

	/** 
	 * 更新结果成功失败
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
