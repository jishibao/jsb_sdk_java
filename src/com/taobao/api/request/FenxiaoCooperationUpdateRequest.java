package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoCooperationUpdateResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class FenxiaoCooperationUpdateRequest extends BaseTaobaoRequest<FenxiaoCooperationUpdateResponse> {
	
	

	/** 
	* 分销商ID
	 */
	private Long distributorId;

	/** 
	* 等级ID(0代表取消)
	 */
	private Long gradeId;

	/** 
	* 分销方式(新增)： AGENT(代销)、DEALER(经销)(默认为代销)
	 */
	private String tradeType;

	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public Long getDistributorId() {
		return this.distributorId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getGradeId() {
		return this.gradeId;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeType() {
		return this.tradeType;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.cooperation.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("distributor_id", this.distributorId);
		txtParams.put("grade_id", this.gradeId);
		txtParams.put("trade_type", this.tradeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoCooperationUpdateResponse> getResponseClass() {
		return FenxiaoCooperationUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(distributorId, "distributorId");
		RequestCheckUtils.checkNotEmpty(gradeId, "gradeId");
	}
	

}