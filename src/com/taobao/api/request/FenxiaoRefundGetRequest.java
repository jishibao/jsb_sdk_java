package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoRefundGetResponse;

/**
 * TOP API: taobao.fenxiao.refund.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.14
 */
public class FenxiaoRefundGetRequest extends BaseTaobaoRequest<FenxiaoRefundGetResponse> {
	
	

	/** 
	* 是否查询下游买家的退款信息
	 */
	private Boolean querySellerRefund;

	/** 
	* 要查询的退款子单的id
	 */
	private Long subOrderId;

	public void setQuerySellerRefund(Boolean querySellerRefund) {
		this.querySellerRefund = querySellerRefund;
	}

	public Boolean getQuerySellerRefund() {
		return this.querySellerRefund;
	}

	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Long getSubOrderId() {
		return this.subOrderId;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.refund.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("query_seller_refund", this.querySellerRefund);
		txtParams.put("sub_order_id", this.subOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoRefundGetResponse> getResponseClass() {
		return FenxiaoRefundGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(subOrderId, "subOrderId");
	}
	

}