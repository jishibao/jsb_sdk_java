package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoOrderMessageAddResponse;

/**
 * TOP API: taobao.fenxiao.order.message.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoOrderMessageAddRequest extends BaseTaobaoRequest<FenxiaoOrderMessageAddResponse> {
	
	

	/** 
	* 留言内容
	 */
	private String message;

	/** 
	* 采购单id
	 */
	private Long purchaseOrderId;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Long getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.order.message.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("message", this.message);
		txtParams.put("purchase_order_id", this.purchaseOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoOrderMessageAddResponse> getResponseClass() {
		return FenxiaoOrderMessageAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(message, "message");
		RequestCheckUtils.checkNotEmpty(purchaseOrderId, "purchaseOrderId");
	}
	

}