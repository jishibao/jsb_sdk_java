package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.notify.message.page.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbNotifyMessagePageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2564783844234435381L;

	/** 
	 * 2000-01-01 00:00:00
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 通道消息
	 */
	@ApiListField("wlb_messages")
	@ApiField("wlb_message")
	private List<WlbMessage> wlbMessages;


	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setWlbMessages(List<WlbMessage> wlbMessages) {
		this.wlbMessages = wlbMessages;
	}
	public List<WlbMessage> getWlbMessages( ) {
		return this.wlbMessages;
	}
	


}
