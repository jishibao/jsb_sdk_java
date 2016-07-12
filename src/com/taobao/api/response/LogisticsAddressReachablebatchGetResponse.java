package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AddressReachableTopResult;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.reachablebatch.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsAddressReachablebatchGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3259165465652338948L;

	/** 
	 * 物流是否可达结果列表
	 */
	@ApiListField("reachable_results")
	@ApiField("address_reachable_top_result")
	private List<AddressReachableTopResult> reachableResults;


	public void setReachableResults(List<AddressReachableTopResult> reachableResults) {
		this.reachableResults = reachableResults;
	}
	public List<AddressReachableTopResult> getReachableResults( ) {
		return this.reachableResults;
	}
	


}
