package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.HotelOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.sold.orders.increment.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HotelSoldOrdersIncrementGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3232568448563846987L;

	/** 
	 * 是否存在下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 多个订单结构，是否返回入住人列表根据参数决定
	 */
	@ApiListField("hotel_orders")
	@ApiField("hotel_order")
	private List<HotelOrder> hotelOrders;

	/** 
	 * 搜索到的交易信息总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setHotelOrders(List<HotelOrder> hotelOrders) {
		this.hotelOrders = hotelOrders;
	}
	public List<HotelOrder> getHotelOrders( ) {
		return this.hotelOrders;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
