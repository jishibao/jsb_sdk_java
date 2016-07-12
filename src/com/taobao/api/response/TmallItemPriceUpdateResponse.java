package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.price.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemPriceUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3324835517869421354L;

	/** 
	 * 价格更新结果
	 */
	@ApiField("price_update_result")
	private String priceUpdateResult;


	public void setPriceUpdateResult(String priceUpdateResult) {
		this.priceUpdateResult = priceUpdateResult;
	}
	public String getPriceUpdateResult( ) {
		return this.priceUpdateResult;
	}
	


}
