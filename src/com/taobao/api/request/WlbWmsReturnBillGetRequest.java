package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsReturnBillGetResponse;

/**
 * TOP API: taobao.wlb.wms.return.bill.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.10.08
 */
public class WlbWmsReturnBillGetRequest extends BaseTaobaoRequest<WlbWmsReturnBillGetResponse> {
	
	

	/** 
	* 菜鸟订单编码，查询单个订单时orderCode与cnOrderCode必须有一个参数值不为空，两个参数都赋值时，以cnOrderCode值检索数据
	 */
	private String cnOrderCode;

	/** 
	* ERP订单编码，查询单个订单时orderCode与cnOrderCode必须有一个参数值不为空，两个参数都赋值时，以cnOrderCode值检索数据
	 */
	private String orderCode;

	public void setCnOrderCode(String cnOrderCode) {
		this.cnOrderCode = cnOrderCode;
	}

	public String getCnOrderCode() {
		return this.cnOrderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.return.bill.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cn_order_code", this.cnOrderCode);
		txtParams.put("order_code", this.orderCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsReturnBillGetResponse> getResponseClass() {
		return WlbWmsReturnBillGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}