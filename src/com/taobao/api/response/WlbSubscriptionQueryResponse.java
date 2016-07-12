package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbSellerSubscription;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.subscription.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbSubscriptionQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3115156226773697672L;

	/** 
	 * 卖家定购的服务列表
	 */
	@ApiListField("seller_subscription_list")
	@ApiField("wlb_seller_subscription")
	private List<WlbSellerSubscription> sellerSubscriptionList;

	/** 
	 * 结果总数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setSellerSubscriptionList(List<WlbSellerSubscription> sellerSubscriptionList) {
		this.sellerSubscriptionList = sellerSubscriptionList;
	}
	public List<WlbSellerSubscription> getSellerSubscriptionList( ) {
		return this.sellerSubscriptionList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}
