package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDealerRequisitionorderRemarkUpdateResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.remark.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class FenxiaoDealerRequisitionorderRemarkUpdateRequest extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderRemarkUpdateResponse> {
	
	

	/** 
	* 经销采购单ID
	 */
	private Long dealerOrderId;

	/** 
	* 备注留言，可为空
	 */
	private String supplierMemo;

	/** 
	* 旗子的标记，必选。
1-5之间的数字。
非1-5之间，都采用1作为默认。
1:红色
2:黄色
3:绿色
4:蓝色
5:粉红色
	 */
	private Long supplierMemoFlag;

	public void setDealerOrderId(Long dealerOrderId) {
		this.dealerOrderId = dealerOrderId;
	}

	public Long getDealerOrderId() {
		return this.dealerOrderId;
	}

	public void setSupplierMemo(String supplierMemo) {
		this.supplierMemo = supplierMemo;
	}

	public String getSupplierMemo() {
		return this.supplierMemo;
	}

	public void setSupplierMemoFlag(Long supplierMemoFlag) {
		this.supplierMemoFlag = supplierMemoFlag;
	}

	public Long getSupplierMemoFlag() {
		return this.supplierMemoFlag;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.dealer.requisitionorder.remark.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("dealer_order_id", this.dealerOrderId);
		txtParams.put("supplier_memo", this.supplierMemo);
		txtParams.put("supplier_memo_flag", this.supplierMemoFlag);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDealerRequisitionorderRemarkUpdateResponse> getResponseClass() {
		return FenxiaoDealerRequisitionorderRemarkUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(dealerOrderId, "dealerOrderId");
		RequestCheckUtils.checkNotEmpty(supplierMemoFlag, "supplierMemoFlag");
		RequestCheckUtils.checkMaxValue(supplierMemoFlag, 5L, "supplierMemoFlag");
		RequestCheckUtils.checkMinValue(supplierMemoFlag, 1L, "supplierMemoFlag");
	}
	

}