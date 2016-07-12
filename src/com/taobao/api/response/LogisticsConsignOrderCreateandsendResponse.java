package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.consign.order.createandsend response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsConsignOrderCreateandsendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8341784717745488764L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 订单ID
	 */
	@ApiField("order_id")
	private Long orderId;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getOrderId( ) {
		return this.orderId;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}
	


}
