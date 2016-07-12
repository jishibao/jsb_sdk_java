package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.authorization.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemAuthorizationAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7832197376697468441L;

	/** 
	 * 授权规则ID列表
	 */
	@ApiListField("rule_id_list")
	@ApiField("number")
	private List<Long> ruleIdList;


	public void setRuleIdList(List<Long> ruleIdList) {
		this.ruleIdList = ruleIdList;
	}
	public List<Long> getRuleIdList( ) {
		return this.ruleIdList;
	}
	


}
