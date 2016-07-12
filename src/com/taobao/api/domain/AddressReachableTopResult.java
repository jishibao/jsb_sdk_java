package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 筛单结果集
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AddressReachableTopResult extends TaobaoObject {

	private static final long serialVersionUID = 3662624295295181664L;

	/**
	 * 筛单结果l列表
	 */
	@ApiListField("reachable_result_list")
	@ApiField("address_reachable_result")
	private List<AddressReachableResult> reachableResultList;


	public List<AddressReachableResult> getReachableResultList() {
		return this.reachableResultList;
	}
	public void setReachableResultList(List<AddressReachableResult> reachableResultList) {
		this.reachableResultList = reachableResultList;
	}

}
