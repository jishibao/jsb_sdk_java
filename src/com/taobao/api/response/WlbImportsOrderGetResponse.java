package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.LocOrder;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.imports.order.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbImportsOrderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3889352962565522451L;

	/** 
	 * 物流订单信息
	 */
	@ApiListField("orders")
	@ApiField("loc_order")
	private List<LocOrder> orders;

	/** 
	 * 搜索到的总数量
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setOrders(List<LocOrder> orders) {
		this.orders = orders;
	}
	public List<LocOrder> getOrders( ) {
		return this.orders;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
