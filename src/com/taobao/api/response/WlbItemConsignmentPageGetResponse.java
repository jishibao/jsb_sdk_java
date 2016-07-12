package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbConsignMent;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.consignment.page.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemConsignmentPageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3882618369871592995L;

	/** 
	 * 条件查询结果总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 代销关系列表
	 */
	@ApiListField("wlb_consign_ments")
	@ApiField("wlb_consign_ment")
	private List<WlbConsignMent> wlbConsignMents;


	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setWlbConsignMents(List<WlbConsignMent> wlbConsignMents) {
		this.wlbConsignMents = wlbConsignMents;
	}
	public List<WlbConsignMent> getWlbConsignMents( ) {
		return this.wlbConsignMents;
	}
	


}
