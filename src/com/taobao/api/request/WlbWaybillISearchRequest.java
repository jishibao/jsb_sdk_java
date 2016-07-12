package com.taobao.api.request;

import com.taobao.api.domain.WaybillApplyRequest;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWaybillISearchResponse;

/**
 * TOP API: taobao.wlb.waybill.i.search request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.03
 */
public class WlbWaybillISearchRequest extends BaseTaobaoRequest<WlbWaybillISearchResponse> {
	
	

	/** 
	* 查询网点信息
	 */
	private String waybillApplyRequest;

	public void setWaybillApplyRequest(String waybillApplyRequest) {
		this.waybillApplyRequest = waybillApplyRequest;
	}

	public void setWaybillApplyRequest(WaybillApplyRequest waybillApplyRequest) {
		this.waybillApplyRequest = new JSONWriter(false,true).write(waybillApplyRequest);
	}

	public String getWaybillApplyRequest() {
		return this.waybillApplyRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_apply_request", this.waybillApplyRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillISearchResponse> getResponseClass() {
		return WlbWaybillISearchResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}