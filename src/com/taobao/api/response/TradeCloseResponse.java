package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.close response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeCloseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5391599226472578917L;

	/** 
	 * 关闭交易时返回的Trade信息，可用字段有tid和modified
	 */
	@ApiField("trade")
	private Trade trade;


	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public Trade getTrade( ) {
		return this.trade;
	}
	


}
