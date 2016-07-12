package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbOrderJzpartnerQueryResponse;

/**
 * TOP API: taobao.wlb.order.jzpartner.query request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.13
 */
public class WlbOrderJzpartnerQueryRequest extends BaseTaobaoRequest<WlbOrderJzpartnerQueryResponse> {
	
	

	/** 
	* serviceType表示查询所有的支持服务类型的服务商。 家装干线服务     11 家装干支服务     12 家装干支装服务   13 卫浴大件干线     14 卫浴大件干支     15 卫浴大件安装     16 地板干线         17 地板干支         18 地板安装         19 灯具安装         20 卫浴小件安装     21 （注：同一个服务商针对不同类型的serviceType是具有不同的tpCode的）
	 */
	private Long serviceType;

	/** 
	* 淘宝交易订单号，如果不填写Tid则必须填写serviceType。如果填写Tid，则表明只需要查询对应订单的服务商。
	 */
	private Long taobaoTradeId;

	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public Long getServiceType() {
		return this.serviceType;
	}

	public void setTaobaoTradeId(Long taobaoTradeId) {
		this.taobaoTradeId = taobaoTradeId;
	}

	public Long getTaobaoTradeId() {
		return this.taobaoTradeId;
	}

	public String getApiMethodName() {
		return "taobao.wlb.order.jzpartner.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("service_type", this.serviceType);
		txtParams.put("taobao_trade_id", this.taobaoTradeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbOrderJzpartnerQueryResponse> getResponseClass() {
		return WlbOrderJzpartnerQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}