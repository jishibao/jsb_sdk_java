package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Cooperation;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoCooperationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6316448374397485633L;

	/** 
	 * 合作分销关系
	 */
	@ApiListField("cooperations")
	@ApiField("cooperation")
	private List<Cooperation> cooperations;

	/** 
	 * 结果记录数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setCooperations(List<Cooperation> cooperations) {
		this.cooperations = cooperations;
	}
	public List<Cooperation> getCooperations( ) {
		return this.cooperations;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
