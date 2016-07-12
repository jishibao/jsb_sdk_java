package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.discount.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDiscountAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4678289875965311534L;

	/** 
	 * 折扣ID
	 */
	@ApiField("discount_id")
	private Long discountId;


	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}
	public Long getDiscountId( ) {
		return this.discountId;
	}
	


}
