package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TmcGroup;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.tmc.groups.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcGroupsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4857514213357588927L;

	/** 
	 * dasdasd
	 */
	@ApiListField("groups")
	@ApiField("tmc_group")
	private List<TmcGroup> groups;

	/** 
	 * 分组总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setGroups(List<TmcGroup> groups) {
		this.groups = groups;
	}
	public List<TmcGroup> getGroups( ) {
		return this.groups;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
