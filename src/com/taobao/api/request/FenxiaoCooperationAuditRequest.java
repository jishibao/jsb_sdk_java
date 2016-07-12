package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoCooperationAuditResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.audit request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoCooperationAuditRequest extends BaseTaobaoRequest<FenxiaoCooperationAuditResponse> {
	
	

	/** 
	* 1:审批通过，审批通过后要加入授权产品线列表；
2:审批拒绝
	 */
	private Long auditResult;

	/** 
	* 当审批通过时需要指定授权产品线id列表(代销)，如果没传则表示不开通，且经销和代销的授权产品线列表至少传入一种，同时传入则表示都开通。
	 */
	private String productLineListAgent;

	/** 
	* 当审批通过时需要指定授权产品线id列表(经销)，如果没传则表示不开通，且经销和代销的授权产品线列表至少传入一种，同时传入则表示都开通。
	 */
	private String productLineListDealer;

	/** 
	* 备注
	 */
	private String remark;

	/** 
	* 合作申请Id
	 */
	private Long requisitionId;

	public void setAuditResult(Long auditResult) {
		this.auditResult = auditResult;
	}

	public Long getAuditResult() {
		return this.auditResult;
	}

	public void setProductLineListAgent(String productLineListAgent) {
		this.productLineListAgent = productLineListAgent;
	}

	public String getProductLineListAgent() {
		return this.productLineListAgent;
	}

	public void setProductLineListDealer(String productLineListDealer) {
		this.productLineListDealer = productLineListDealer;
	}

	public String getProductLineListDealer() {
		return this.productLineListDealer;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRequisitionId(Long requisitionId) {
		this.requisitionId = requisitionId;
	}

	public Long getRequisitionId() {
		return this.requisitionId;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.cooperation.audit";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("audit_result", this.auditResult);
		txtParams.put("product_line_list_agent", this.productLineListAgent);
		txtParams.put("product_line_list_dealer", this.productLineListDealer);
		txtParams.put("remark", this.remark);
		txtParams.put("requisition_id", this.requisitionId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoCooperationAuditResponse> getResponseClass() {
		return FenxiaoCooperationAuditResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(auditResult, "auditResult");
		RequestCheckUtils.checkNotEmpty(remark, "remark");
		RequestCheckUtils.checkNotEmpty(requisitionId, "requisitionId");
	}
	

}