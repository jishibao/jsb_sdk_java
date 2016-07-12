package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.CainiaoBillQueryOrderinfolist;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.cainiao.bill.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsCainiaoBillQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8438583923765776717L;

	/** 
	 * 订单列表信息
	 */
	@ApiListField("order_info_list")
	@ApiField("cainiao_bill_query_orderinfolist")
	private List<CainiaoBillQueryOrderinfolist> orderInfoList;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setOrderInfoList(List<CainiaoBillQueryOrderinfolist> orderInfoList) {
		this.orderInfoList = orderInfoList;
	}
	public List<CainiaoBillQueryOrderinfolist> getOrderInfoList( ) {
		return this.orderInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}
