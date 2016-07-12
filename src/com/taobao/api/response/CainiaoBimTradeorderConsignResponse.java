package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: cainiao.bim.tradeorder.consign response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoBimTradeorderConsignResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5297285598436591845L;

	/** 
	 * 菜鸟物流订单号,格式为LP开头
	 */
	@ApiField("lg_order_code")
	private String lgOrderCode;

	/** 
	 * 菜鸟仓库作业单据号
	 */
	@ApiField("store_order_code")
	private String storeOrderCode;


	public void setLgOrderCode(String lgOrderCode) {
		this.lgOrderCode = lgOrderCode;
	}
	public String getLgOrderCode( ) {
		return this.lgOrderCode;
	}

	public void setStoreOrderCode(String storeOrderCode) {
		this.storeOrderCode = storeOrderCode;
	}
	public String getStoreOrderCode( ) {
		return this.storeOrderCode;
	}
	


}
