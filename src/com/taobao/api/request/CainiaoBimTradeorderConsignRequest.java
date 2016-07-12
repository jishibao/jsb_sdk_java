package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.CainiaoBimTradeorderConsignResponse;

/**
 * TOP API: cainiao.bim.tradeorder.consign request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.01
 */
public class CainiaoBimTradeorderConsignRequest extends BaseTaobaoRequest<CainiaoBimTradeorderConsignResponse> {
	
	

	/** 
	* 仓储编码，ERP指定仓库发货时需要传值，编码由菜鸟提供
	 */
	private String storeCode;

	/** 
	* 交易单号
	 */
	private String tradeId;

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getTradeId() {
		return this.tradeId;
	}

	public String getApiMethodName() {
		return "cainiao.bim.tradeorder.consign";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("store_code", this.storeCode);
		txtParams.put("trade_id", this.tradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoBimTradeorderConsignResponse> getResponseClass() {
		return CainiaoBimTradeorderConsignResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tradeId, "tradeId");
	}
	

}