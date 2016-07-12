package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemConsignmentCreateResponse;

/**
 * TOP API: taobao.wlb.item.consignment.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbItemConsignmentCreateRequest extends BaseTaobaoRequest<WlbItemConsignmentCreateResponse> {
	
	

	/** 
	* 代销数量
	 */
	private Long number;

	/** 
	* 货主商品id
	 */
	private Long ownerItemId;

	/** 
	* 通过taobao.wlb.item.authorization.add接口创建后得到的rule_id，规则中设定了代销商可以代销的商品数量
	 */
	private Long ruleId;

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getNumber() {
		return this.number;
	}

	public void setOwnerItemId(Long ownerItemId) {
		this.ownerItemId = ownerItemId;
	}

	public Long getOwnerItemId() {
		return this.ownerItemId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.consignment.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("number", this.number);
		txtParams.put("owner_item_id", this.ownerItemId);
		txtParams.put("rule_id", this.ruleId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemConsignmentCreateResponse> getResponseClass() {
		return WlbItemConsignmentCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(number, "number");
		RequestCheckUtils.checkNotEmpty(ownerItemId, "ownerItemId");
		RequestCheckUtils.checkNotEmpty(ruleId, "ruleId");
	}
	

}