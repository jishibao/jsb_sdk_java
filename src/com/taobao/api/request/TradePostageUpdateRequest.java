package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradePostageUpdateResponse;

/**
 * TOP API: taobao.trade.postage.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.10
 */
public class TradePostageUpdateRequest extends BaseTaobaoRequest<TradePostageUpdateResponse> {
	
	

	/** 
	* 邮费价格(邮费单位是元）
	 */
	private String postFee;

	/** 
	* 主订单编号
	 */
	private Long tid;

	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}

	public String getPostFee() {
		return this.postFee;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.trade.postage.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("post_fee", this.postFee);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradePostageUpdateResponse> getResponseClass() {
		return TradePostageUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(postFee, "postFee");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}