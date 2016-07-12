package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.TradeRate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.traderates.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TraderatesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3779169933174415473L;

	/** 
	 * 当使用use_has_next时返回信息，如果还有下一页则返回true
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 搜索到的评价总数。相同的查询时间段条件下，最大只能获取总共1500条评价记录。所以当评价大于等于1500时 ISV可以通过start_date及end_date来进行拆分，以保证可以查询到全部数据
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * 评价列表。返回的TradeRate包含的具体信息为入参fields请求的字段信息
	 */
	@ApiListField("trade_rates")
	@ApiField("trade_rate")
	private List<TradeRate> tradeRates;


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

	public void setTradeRates(List<TradeRate> tradeRates) {
		this.tradeRates = tradeRates;
	}
	public List<TradeRate> getTradeRates( ) {
		return this.tradeRates;
	}
	


}
