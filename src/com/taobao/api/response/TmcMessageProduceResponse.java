package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.message.produce response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessageProduceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5186145811184236686L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 投递目标数
	 */
	@ApiField("total")
	private Long total;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}
	


}
