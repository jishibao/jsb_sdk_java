package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SubuserInfoUpdateResponse;

/**
 * TOP API: taobao.subuser.info.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class SubuserInfoUpdateRequest extends BaseTaobaoRequest<SubuserInfoUpdateResponse> {
	
	

	/** 
	* 是否停用子账号 true:表示停用该子账号false:表示开启该子账号
	 */
	private Boolean isDisableSubaccount;

	/** 
	* 子账号是否参与分流 true:参与分流 false:不参与分流
	 */
	private Boolean isDispatch;

	/** 
	* 子账号ID
	 */
	private Long subId;

	public void setIsDisableSubaccount(Boolean isDisableSubaccount) {
		this.isDisableSubaccount = isDisableSubaccount;
	}

	public Boolean getIsDisableSubaccount() {
		return this.isDisableSubaccount;
	}

	public void setIsDispatch(Boolean isDispatch) {
		this.isDispatch = isDispatch;
	}

	public Boolean getIsDispatch() {
		return this.isDispatch;
	}

	public void setSubId(Long subId) {
		this.subId = subId;
	}

	public Long getSubId() {
		return this.subId;
	}

	public String getApiMethodName() {
		return "taobao.subuser.info.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("is_disable_subaccount", this.isDisableSubaccount);
		txtParams.put("is_dispatch", this.isDispatch);
		txtParams.put("sub_id", this.subId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SubuserInfoUpdateResponse> getResponseClass() {
		return SubuserInfoUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(subId, "subId");
	}
	

}