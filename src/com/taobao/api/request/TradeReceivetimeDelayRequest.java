package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradeReceivetimeDelayResponse;

/**
 * TOP API: taobao.trade.receivetime.delay request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.14
 */
public class TradeReceivetimeDelayRequest extends BaseTaobaoRequest<TradeReceivetimeDelayResponse> {
	
	

	/** 
	* 延长收货的天数，可选值为：3, 5, 7, 10。
	 */
	private Long days;

	/** 
	* 主订单号
	 */
	private Long tid;

	public void setDays(Long days) {
		this.days = days;
	}

	public Long getDays() {
		return this.days;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.trade.receivetime.delay";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("days", this.days);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeReceivetimeDelayResponse> getResponseClass() {
		return TradeReceivetimeDelayResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(days, "days");
		RequestCheckUtils.checkMaxValue(days, 10L, "days");
		RequestCheckUtils.checkMinValue(days, 3L, "days");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}