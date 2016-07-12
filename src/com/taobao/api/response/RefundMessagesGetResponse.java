package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RefundMessage;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refund.messages.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RefundMessagesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6464517132669158878L;

	/** 
	 * 查询到的退款留言/凭证列表
	 */
	@ApiListField("refund_messages")
	@ApiField("refund_message")
	private List<RefundMessage> refundMessages;

	/** 
	 * 查询到的退款留言/凭证总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setRefundMessages(List<RefundMessage> refundMessages) {
		this.refundMessages = refundMessages;
	}
	public List<RefundMessage> getRefundMessages( ) {
		return this.refundMessages;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
