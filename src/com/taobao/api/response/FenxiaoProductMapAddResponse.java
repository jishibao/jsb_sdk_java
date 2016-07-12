package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.product.map.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProductMapAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2764994889746758245L;

	/** 
	 * 操作结果
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
