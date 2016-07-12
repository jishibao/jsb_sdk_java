package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.MsgGroupDO;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.jushita.jms.group.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJmsGroupGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7443581938118317993L;

	/** 
	 * 分组信息
	 */
	@ApiListField("groups")
	@ApiField("msg_group_d_o")
	private List<MsgGroupDO> groups;

	/** 
	 * 返回的总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setGroups(List<MsgGroupDO> groups) {
		this.groups = groups;
	}
	public List<MsgGroupDO> getGroups( ) {
		return this.groups;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
