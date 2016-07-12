package com.taobao.api.response;

import com.taobao.api.domain.TicketItemProcessResult;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ticket.item.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TicketItemUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4731627831272684377L;

	/** 
	 * 门票商品操作结果，具体请参见TicketItemProcessResult数据结构
	 */
	@ApiField("ticket_item_process_result")
	private TicketItemProcessResult ticketItemProcessResult;


	public void setTicketItemProcessResult(TicketItemProcessResult ticketItemProcessResult) {
		this.ticketItemProcessResult = ticketItemProcessResult;
	}
	public TicketItemProcessResult getTicketItemProcessResult( ) {
		return this.ticketItemProcessResult;
	}
	


}
