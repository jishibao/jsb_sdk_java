package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsSnInfoQueryResponse;

/**
 * TOP API: taobao.wlb.wms.sn.info.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.15
 */
public class WlbWmsSnInfoQueryRequest extends BaseTaobaoRequest<WlbWmsSnInfoQueryResponse> {
	
	

	/** 
	* 订单编码
	 */
	private String orderCode;

	/** 
	* 订单类型（1:仓配订单 10：配送扫码 20：增值扫码 40:ERP单号; 50：交易订单 ）
	 */
	private Long orderCodeType;

	/** 
	* 页数，默认每页50条
	 */
	private Long pageIndex;

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCodeType(Long orderCodeType) {
		this.orderCodeType = orderCodeType;
	}

	public Long getOrderCodeType() {
		return this.orderCodeType;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.sn.info.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_code_type", this.orderCodeType);
		txtParams.put("page_index", this.pageIndex);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsSnInfoQueryResponse> getResponseClass() {
		return WlbWmsSnInfoQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkNotEmpty(orderCodeType, "orderCodeType");
		RequestCheckUtils.checkNotEmpty(pageIndex, "pageIndex");
	}
	

}