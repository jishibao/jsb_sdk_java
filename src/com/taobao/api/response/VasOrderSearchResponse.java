package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ArticleBizOrder;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.vas.order.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class VasOrderSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2129241447815451419L;

	/** 
	 * 商品订单对象
	 */
	@ApiListField("article_biz_orders")
	@ApiField("article_biz_order")
	private List<ArticleBizOrder> articleBizOrders;

	/** 
	 * 总记录数
	 */
	@ApiField("total_item")
	private Long totalItem;


	public void setArticleBizOrders(List<ArticleBizOrder> articleBizOrders) {
		this.articleBizOrders = articleBizOrders;
	}
	public List<ArticleBizOrder> getArticleBizOrders( ) {
		return this.articleBizOrders;
	}

	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}
	public Long getTotalItem( ) {
		return this.totalItem;
	}
	


}
