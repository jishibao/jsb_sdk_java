package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PurchaseOrder;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.orders.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoOrdersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8197986682847424453L;

	/** 
	 * 采购单及子采购单信息。返回 PurchaseOrder 包含的字段信息。
	 */
	@ApiListField("purchase_orders")
	@ApiField("purchase_order")
	private List<PurchaseOrder> purchaseOrders;

	/** 
	 * 搜索到的采购单记录总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}
	public List<PurchaseOrder> getPurchaseOrders( ) {
		return this.purchaseOrders;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
