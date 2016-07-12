package com.taobao.api.response;

import com.taobao.api.domain.TicketItem;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ticket.item.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TicketItemGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6145228788119816971L;

	/** 
	 * 参见TicketItem数据结构文档
	 */
	@ApiField("ticket_item")
	private TicketItem ticketItem;


	public void setTicketItem(TicketItem ticketItem) {
		this.ticketItem = ticketItem;
	}
	public TicketItem getTicketItem( ) {
		return this.ticketItem;
	}
	


}
