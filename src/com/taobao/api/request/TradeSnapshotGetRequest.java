package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TradeSnapshotGetResponse;

/**
 * TOP API: taobao.trade.snapshot.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.22
 */
public class TradeSnapshotGetRequest extends BaseTaobaoRequest<TradeSnapshotGetResponse> {
	
	

	/** 
	* 需要返回的字段列表。现只支持："snapshot"字段
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
		return "taobao.trade.snapshot.get";
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

	public Class<TradeSnapshotGetResponse> getResponseClass() {
		return TradeSnapshotGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}