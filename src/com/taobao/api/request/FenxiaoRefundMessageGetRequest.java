package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoRefundMessageGetResponse;

/**
 * TOP API: taobao.fenxiao.refund.message.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.17
 */
public class FenxiaoRefundMessageGetRequest extends BaseTaobaoRequest<FenxiaoRefundMessageGetResponse> {
	
	

	/** 
	* 页码。（大于0的整数。默认为1）
	 */
	private Long pageNo;

	/** 
	* 每页条数。（默认10）
	 */
	private Long pageSize;

	/** 
	* 子采购单id
	 */
	private Long subOrderId;

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

	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Long getSubOrderId() {
		return this.subOrderId;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.refund.message.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("sub_order_id", this.subOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoRefundMessageGetResponse> getResponseClass() {
		return FenxiaoRefundMessageGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(subOrderId, "subOrderId");
	}
	

}