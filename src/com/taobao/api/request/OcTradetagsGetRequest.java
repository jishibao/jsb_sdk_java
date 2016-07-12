package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.OcTradetagsGetResponse;

/**
 * TOP API: taobao.oc.tradetags.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.20
 */
public class OcTradetagsGetRequest extends BaseTaobaoRequest<OcTradetagsGetResponse> {
	
	

	/** 
	* 是否查询历史标签
	 */
	private Long history;

	/** 
	* 不填，则不做标签名称过滤
	 */
	private String tagNames;

	/** 
	* 不填，则默认只查询1,2。1为官方标，2为自定义标，3为主站只读标签
	 */
	private String tagTypes;

	/** 
	* 交易主订单id
	 */
	private Long tid;

	public void setHistory(Long history) {
		this.history = history;
	}

	public Long getHistory() {
		return this.history;
	}

	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
	}

	public String getTagNames() {
		return this.tagNames;
	}

	public void setTagTypes(String tagTypes) {
		this.tagTypes = tagTypes;
	}

	public String getTagTypes() {
		return this.tagTypes;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.oc.tradetags.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("history", this.history);
		txtParams.put("tag_names", this.tagNames);
		txtParams.put("tag_types", this.tagTypes);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OcTradetagsGetResponse> getResponseClass() {
		return OcTradetagsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(tagNames, 20, "tagNames");
		RequestCheckUtils.checkMaxListSize(tagTypes, 20, "tagTypes");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}