package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradeFullinfoGetResponse;

/**
 * TOP API: taobao.trade.fullinfo.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.07
 */
public class TradeFullinfoGetRequest extends BaseTaobaoRequest<TradeFullinfoGetResponse> {
	
	

	/** 
	* 需要返回的字段列表，多个字段用半角逗号分隔，可选值为返回示例中能看到的所有字段。
	 */
	private String fields;

	/** 
	* 交易编号
	 */
	private Long tid;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.trade.fullinfo.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeFullinfoGetResponse> getResponseClass() {
		return TradeFullinfoGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
		RequestCheckUtils.checkMaxValue(tid, 9223372036854775807L, "tid");
		RequestCheckUtils.checkMinValue(tid, 1L, "tid");
	}
	

}