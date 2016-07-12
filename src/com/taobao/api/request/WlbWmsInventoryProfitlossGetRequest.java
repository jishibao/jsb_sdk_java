package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsInventoryProfitlossGetResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.profitloss.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.09.22
 */
public class WlbWmsInventoryProfitlossGetRequest extends BaseTaobaoRequest<WlbWmsInventoryProfitlossGetResponse> {
	
	

	/** 
	* 菜鸟订单编码
	 */
	private String cnOrderCode;

	public void setCnOrderCode(String cnOrderCode) {
		this.cnOrderCode = cnOrderCode;
	}

	public String getCnOrderCode() {
		return this.cnOrderCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.inventory.profitloss.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cn_order_code", this.cnOrderCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsInventoryProfitlossGetResponse> getResponseClass() {
		return WlbWmsInventoryProfitlossGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cnOrderCode, "cnOrderCode");
	}
	

}