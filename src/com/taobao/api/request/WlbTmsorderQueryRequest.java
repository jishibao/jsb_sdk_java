package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbTmsorderQueryResponse;

/**
 * TOP API: taobao.wlb.tmsorder.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class WlbTmsorderQueryRequest extends BaseTaobaoRequest<WlbTmsorderQueryResponse> {
	
	

	/** 
	* 物流订单编号
	 */
	private String orderCode;

	/** 
	* 当前页
	 */
	private Long pageNo;

	/** 
	* 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
	 */
	private Long pageSize;

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
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

	public String getApiMethodName() {
		return "taobao.wlb.tmsorder.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("order_code", this.orderCode);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbTmsorderQueryResponse> getResponseClass() {
		return WlbTmsorderQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkMaxLength(orderCode, 64, "orderCode");
	}
	

}