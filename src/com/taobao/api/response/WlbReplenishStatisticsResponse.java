package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.WlbReplenish;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.replenish.statistics response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbReplenishStatisticsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7634431988298287876L;

	/** 
	 * 补货统计列表
	 */
	@ApiListField("replenish_list")
	@ApiField("wlb_replenish")
	private List<WlbReplenish> replenishList;

	/** 
	 * 查询记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setReplenishList(List<WlbReplenish> replenishList) {
		this.replenishList = replenishList;
	}
	public List<WlbReplenish> getReplenishList( ) {
		return this.replenishList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}
