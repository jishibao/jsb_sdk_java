package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbOrderitemPageGetResponse;

/**
 * TOP API: taobao.wlb.orderitem.page.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.17
 */
public class WlbOrderitemPageGetRequest extends BaseTaobaoRequest<WlbOrderitemPageGetResponse> {
	
	

	/** 
	* 物流宝订单编码
	 */
	private String orderCode;

	/** 
	* 分页查询参数，指定查询页数，默认为1
	 */
	private Long pageNo;

	/** 
	* 分页查询参数，每页查询数量，默认20，最大值50,大于50时按照50条查询
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
		return "taobao.wlb.orderitem.page.get";
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

	public Class<WlbOrderitemPageGetResponse> getResponseClass() {
		return WlbOrderitemPageGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
	}
	

}