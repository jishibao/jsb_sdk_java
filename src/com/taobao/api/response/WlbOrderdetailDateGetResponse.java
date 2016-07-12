package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbOrderDetail;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.orderdetail.date.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderdetailDateGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6858339876611196981L;

	/** 
	 * 物流宝订单，并且包含订单详情
	 */
	@ApiListField("order_detail_list")
	@ApiField("wlb_order_detail")
	private List<WlbOrderDetail> orderDetailList;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setOrderDetailList(List<WlbOrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	public List<WlbOrderDetail> getOrderDetailList( ) {
		return this.orderDetailList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}
