package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.quantity.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemQuantityUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8356539963257965568L;

	/** 
	 * 库存更新结果，商品id
	 */
	@ApiField("quantity_update_result")
	private String quantityUpdateResult;


	public void setQuantityUpdateResult(String quantityUpdateResult) {
		this.quantityUpdateResult = quantityUpdateResult;
	}
	public String getQuantityUpdateResult( ) {
		return this.quantityUpdateResult;
	}
	


}
