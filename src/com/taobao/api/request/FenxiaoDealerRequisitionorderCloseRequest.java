package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDealerRequisitionorderCloseResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.close request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.06
 */
public class FenxiaoDealerRequisitionorderCloseRequest extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderCloseResponse> {
	
	

	/** 
	* 经销采购单编号
	 */
	private Long dealerOrderId;

	/** 
	* 关闭原因：
1：长时间无法联系到分销商，取消交易。
2：分销商错误提交申请，取消交易。
3：缺货，近段时间都无法发货。
4：分销商恶意提交申请单。
5：其他原因。
	 */
	private Long reason;

	/** 
	* 关闭详细原因，字数5-200字
	 */
	private String reasonDetail;

	public void setDealerOrderId(Long dealerOrderId) {
		this.dealerOrderId = dealerOrderId;
	}

	public Long getDealerOrderId() {
		return this.dealerOrderId;
	}

	public void setReason(Long reason) {
		this.reason = reason;
	}

	public Long getReason() {
		return this.reason;
	}

	public void setReasonDetail(String reasonDetail) {
		this.reasonDetail = reasonDetail;
	}

	public String getReasonDetail() {
		return this.reasonDetail;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.dealer.requisitionorder.close";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dealer_order_id", this.dealerOrderId);
		txtParams.put("reason", this.reason);
		txtParams.put("reason_detail", this.reasonDetail);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDealerRequisitionorderCloseResponse> getResponseClass() {
		return FenxiaoDealerRequisitionorderCloseResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dealerOrderId, "dealerOrderId");
		RequestCheckUtils.checkNotEmpty(reason, "reason");
		RequestCheckUtils.checkNotEmpty(reasonDetail, "reasonDetail");
	}
	

}