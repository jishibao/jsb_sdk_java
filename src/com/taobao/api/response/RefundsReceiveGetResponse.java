package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Refund;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.refunds.receive.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RefundsReceiveGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2385958734196643188L;

	/** 
	 * 是否存在下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 搜索到的退款信息列表
	 */
	@ApiListField("refunds")
	@ApiField("refund")
	private List<Refund> refunds;

	/** 
	 * 搜索到的退款信息总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setRefunds(List<Refund> refunds) {
		this.refunds = refunds;
	}
	public List<Refund> getRefunds( ) {
		return this.refunds;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
