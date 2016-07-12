package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.snapshot.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeSnapshotGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6418943381488897285L;

	/** 
	 * 只包含Trade中的tid和snapshot、子订单Order中的oid和snapshot
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
