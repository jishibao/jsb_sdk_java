package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.RefundGetResponse;

/**
 * TOP API: taobao.refund.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.09
 */
public class RefundGetRequest extends BaseTaobaoRequest<RefundGetResponse> {
	
	

	/** 
	* 需要返回的字段。目前支持有：refund_id, alipay_no, tid, oid, buyer_nick, seller_nick, total_fee, status, created, refund_fee, good_status, has_good_return, payment, reason, desc, num_iid, title, price, num, good_return_time, company_name, sid, address, shipping_type, refund_remind_timeout, refund_phase, refund_version, operation_contraint, attribute, outer_id, sku
	 */
	private String fields;

	/** 
	* 退款单号
	 */
	private Long refundId;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public String getApiMethodName() {
		return "taobao.refund.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("refund_id", this.refundId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RefundGetResponse> getResponseClass() {
		return RefundGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 100, "fields");
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkMaxValue(refundId, 9223372036854775807L, "refundId");
		RequestCheckUtils.checkMinValue(refundId, 1L, "refundId");
	}
	

}