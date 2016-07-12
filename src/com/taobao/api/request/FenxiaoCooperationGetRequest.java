package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoCooperationGetResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.17
 */
public class FenxiaoCooperationGetRequest extends BaseTaobaoRequest<FenxiaoCooperationGetResponse> {
	
	

	/** 
	* 合作结束时间yyyy-MM-dd HH:mm:ss
	 */
	private Date endDate;

	/** 
	* 页码（大于0的整数，默认1）
	 */
	private Long pageNo;

	/** 
	* 每页记录数（默认20，最大50）
	 */
	private Long pageSize;

	/** 
	* 合作开始时间yyyy-MM-dd HH:mm:ss
	 */
	private Date startDate;

	/** 
	* 合作状态： NORMAL(合作中)、 ENDING(终止中) 、END (终止)
	 */
	private String status;

	/** 
	* 分销方式：AGENT(代销) 、DEALER（经销）
	 */
	private String tradeType;

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeType() {
		return this.tradeType;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.cooperation.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_date", this.startDate);
		txtParams.put("status", this.status);
		txtParams.put("trade_type", this.tradeType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoCooperationGetResponse> getResponseClass() {
		return FenxiaoCooperationGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}