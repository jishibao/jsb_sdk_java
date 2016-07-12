package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.LogisticsTraceSearchResponse;

/**
 * TOP API: taobao.logistics.trace.search request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.14
 */
public class LogisticsTraceSearchRequest extends BaseTaobaoRequest<LogisticsTraceSearchResponse> {
	
	

	/** 
	* 表明是否是拆单，默认值0，1表示拆单
	 */
	private Long isSplit;

	/** 
	* 卖家昵称
	 */
	private String sellerNick;

	/** 
	* 拆单子订单列表，当is_split=1时，需要传人；对应的数据是：子订单号的列表。
	 */
	private String subTid;

	/** 
	* 淘宝交易号，请勿传非淘宝交易号
	 */
	private Long tid;

	public void setIsSplit(Long isSplit) {
		this.isSplit = isSplit;
	}

	public Long getIsSplit() {
		return this.isSplit;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSubTid(String subTid) {
		this.subTid = subTid;
	}

	public String getSubTid() {
		return this.subTid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public String getApiMethodName() {
		return "taobao.logistics.trace.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("is_split", this.isSplit);
		txtParams.put("seller_nick", this.sellerNick);
		txtParams.put("sub_tid", this.subTid);
		txtParams.put("tid", this.tid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsTraceSearchResponse> getResponseClass() {
		return LogisticsTraceSearchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(sellerNick, "sellerNick");
		RequestCheckUtils.checkMaxListSize(subTid, 50, "subTid");
		RequestCheckUtils.checkNotEmpty(tid, "tid");
	}
	

}