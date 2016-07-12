package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TmcMessage;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.messages.consume response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessagesConsumeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4375986457625959915L;

	/** 
	 * 消息列表
	 */
	@ApiListField("messages")
	@ApiField("tmc_message")
	private List<TmcMessage> messages;


	public void setMessages(List<TmcMessage> messages) {
		this.messages = messages;
	}
	public List<TmcMessage> getMessages( ) {
		return this.messages;
	}
	


}
