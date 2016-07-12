package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbProcessStatus;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.orderstatus.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderstatusGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7551713266526674134L;

	/** 
	 * 订单流转信息状态列表
	 */
	@ApiListField("wlb_order_status")
	@ApiField("wlb_process_status")
	private List<WlbProcessStatus> wlbOrderStatus;


	public void setWlbOrderStatus(List<WlbProcessStatus> wlbOrderStatus) {
		this.wlbOrderStatus = wlbOrderStatus;
	}
	public List<WlbProcessStatus> getWlbOrderStatus( ) {
		return this.wlbOrderStatus;
	}
	


}
