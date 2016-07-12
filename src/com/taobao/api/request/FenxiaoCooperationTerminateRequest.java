package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoCooperationTerminateResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.terminate request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoCooperationTerminateRequest extends BaseTaobaoRequest<FenxiaoCooperationTerminateResponse> {
	
	

	/** 
	* 合作编号
	 */
	private Long cooperateId;

	/** 
	* 终止天数，可选1,2,3,5,7,15，在多少天数内终止
	 */
	private Long endRemainDays;

	/** 
	* 终止说明（5-2000字）
	 */
	private String endRemark;

	public void setCooperateId(Long cooperateId) {
		this.cooperateId = cooperateId;
	}

	public Long getCooperateId() {
		return this.cooperateId;
	}

	public void setEndRemainDays(Long endRemainDays) {
		this.endRemainDays = endRemainDays;
	}

	public Long getEndRemainDays() {
		return this.endRemainDays;
	}

	public void setEndRemark(String endRemark) {
		this.endRemark = endRemark;
	}

	public String getEndRemark() {
		return this.endRemark;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.cooperation.terminate";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cooperate_id", this.cooperateId);
		txtParams.put("end_remain_days", this.endRemainDays);
		txtParams.put("end_remark", this.endRemark);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoCooperationTerminateResponse> getResponseClass() {
		return FenxiaoCooperationTerminateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cooperateId, "cooperateId");
		RequestCheckUtils.checkNotEmpty(endRemainDays, "endRemainDays");
		RequestCheckUtils.checkNotEmpty(endRemark, "endRemark");
		RequestCheckUtils.checkMaxLength(endRemark, 2000, "endRemark");
	}
	

}