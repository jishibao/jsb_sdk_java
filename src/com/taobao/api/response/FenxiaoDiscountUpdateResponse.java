package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.discount.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDiscountUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6235297656825928132L;

	/** 
	 * 成功状态
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
