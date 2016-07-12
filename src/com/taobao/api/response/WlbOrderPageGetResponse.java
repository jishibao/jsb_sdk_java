package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbOrder;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.page.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderPageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3898815943634169212L;

	/** 
	 * 物流宝订单对象
	 */
	@ApiListField("order_list")
	@ApiField("wlb_order")
	private List<WlbOrder> orderList;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setOrderList(List<WlbOrder> orderList) {
		this.orderList = orderList;
	}
	public List<WlbOrder> getOrderList( ) {
		return this.orderList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}
