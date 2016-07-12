package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.gradeprice.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProductGradepriceUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2318232279915226173L;

	/** 
	 * 返回操作结果：成功或失败
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
