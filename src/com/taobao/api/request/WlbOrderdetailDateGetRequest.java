package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbOrderdetailDateGetResponse;

/**
 * TOP API: taobao.wlb.orderdetail.date.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.20
 */
public class WlbOrderdetailDateGetRequest extends BaseTaobaoRequest<WlbOrderdetailDateGetResponse> {
	
	

	/** 
	* 创建时间结束
	 */
	private Date endTime;

	/** 
	* 分页下标
	 */
	private Long pageNo;

	/** 
	* 分页大小
	 */
	private Long pageSize;

	/** 
	* 创建时间起始
	 */
	private Date startTime;

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return this.endTime;
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

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public String getApiMethodName() {
		return "taobao.wlb.orderdetail.date.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_time", this.startTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbOrderdetailDateGetResponse> getResponseClass() {
		return WlbOrderdetailDateGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
	}
	

}