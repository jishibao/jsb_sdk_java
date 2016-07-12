package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trades.sold.incrementv.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradesSoldIncrementvGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1246475326178793424L;

	/** 
	 * 是否存在下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 搜索到的交易信息总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * 搜索到的交易信息列表，返回的Trade和Order中包含的具体信息为入参fields请求的字段信息
	 */
	@ApiListField("trades")
	@ApiField("trade")
	private List<Trade> trades;


	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}
	public List<Trade> getTrades( ) {
		return this.trades;
	}
	


}
