package com.taobao.api.request;

import com.taobao.api.domain.WlbWmsStockOutOrderConfirm;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsStockOutOrderConfirmResponse;

/**
 * TOP API: taobao.wlb.wms.stock.out.order.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2015.07.27
 */
public class WlbWmsStockOutOrderConfirmRequest extends BaseTaobaoRequest<WlbWmsStockOutOrderConfirmResponse> {
	
	

	/** 
	* 出库订单确认信息
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(WlbWmsStockOutOrderConfirm content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.stock.out.order.confirm";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsStockOutOrderConfirmResponse> getResponseClass() {
		return WlbWmsStockOutOrderConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}