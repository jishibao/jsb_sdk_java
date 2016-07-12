package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsOrderCancelNotifyResponse;

/**
 * TOP API: taobao.wlb.wms.order.cancel.notify request
 * 
 * @author top auto create
 * @since 1.0, 2015.08.17
 */
public class WlbWmsOrderCancelNotifyRequest extends BaseTaobaoRequest<WlbWmsOrderCancelNotifyResponse> {
	
	

	/** 
	* 订单类型
	 */
	private String orderCode;

	/** 
	* 单据类型 601普通入库单、501销退入库单、302 调拨入库单、904其他入库单、301 调拨出库单、901普通出库单、903 其他出库单、201 一般交易出库单 202 B2B交易出库单 502 换货出库单 503 补发出库单、1102 仓内加工作业单、 701 盘亏单、702盘盈单、711 库存状态调整单
	 */
	private String orderType;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.order.cancel.notify";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_type", this.orderType);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsOrderCancelNotifyResponse> getResponseClass() {
		return WlbWmsOrderCancelNotifyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
	}
	

}