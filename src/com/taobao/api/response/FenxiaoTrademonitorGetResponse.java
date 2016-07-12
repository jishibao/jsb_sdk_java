package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TradeMonitor;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.trademonitor.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoTrademonitorGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1536792266791342779L;

	/** 
	 * 搜索到的经销商品订单数量
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * 经销商品订单监控信息
	 */
	@ApiListField("trade_monitors")
	@ApiField("trade_monitor")
	private List<TradeMonitor> tradeMonitors;


	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public void setTradeMonitors(List<TradeMonitor> tradeMonitors) {
		this.tradeMonitors = tradeMonitors;
	}
	public List<TradeMonitor> getTradeMonitors( ) {
		return this.tradeMonitors;
	}
	


}
