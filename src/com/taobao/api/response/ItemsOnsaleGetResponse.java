package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.items.onsale.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemsOnsaleGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7881935946366478739L;

	/** 
	 * 搜索到的商品列表，具体字段根据设定的fields决定，不包括desc字段
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;

	/** 
	 * 搜索到符合条件的结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems( ) {
		return this.items;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
