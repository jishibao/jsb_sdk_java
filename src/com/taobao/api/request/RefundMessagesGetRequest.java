package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.RefundMessagesGetResponse;

/**
 * TOP API: taobao.refund.messages.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.01.19
 */
public class RefundMessagesGetRequest extends BaseTaobaoRequest<RefundMessagesGetResponse> {
	
	

	/** 
	* 需返回的字段列表。可选值：RefundMessage结构体中的所有字段，以半角逗号(,)分隔。
	 */
	private String fields;

	/** 
	* 页码
	 */
	private Long pageNo;

	/** 
	* 每页条数
	 */
	private Long pageSize;

	/** 
	* 退款单号
	 */
	private Long refundId;

	/** 
	* 退款阶段，可选值：onsale（售中），aftersale（售后），天猫退款为必传。
	 */
	private String refundPhase;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefundPhase(String refundPhase) {
		this.refundPhase = refundPhase;
	}

	public String getRefundPhase() {
		return this.refundPhase;
	}

	public String getApiMethodName() {
		return "taobao.refund.messages.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("refund_id", this.refundId);
		txtParams.put("refund_phase", this.refundPhase);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RefundMessagesGetResponse> getResponseClass() {
		return RefundMessagesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 100, "fields");
		RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
		RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkMinValue(refundId, 1L, "refundId");
	}
	

}