package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbSubscriptionQueryResponse;

/**
 * TOP API: taobao.wlb.subscription.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.31
 */
public class WlbSubscriptionQueryRequest extends BaseTaobaoRequest<WlbSubscriptionQueryResponse> {
	
	

	/** 
	* 当前页
	 */
	private Long pageNo;

	/** 
	* 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
	 */
	private Long pageSize;

	/** 
	* 状态 
AUDITING 1-待审核; 
CANCEL 2-撤销 ;
CHECKED 3-审核通过 ;
FAILED 4-审核未通过 ;
SYNCHRONIZING 5-同步中;
只允许输入上面指定的值，且可以为空，为空时查询所有状态。若输错了，则按AUDITING处理。
	 */
	private String status;

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

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "taobao.wlb.subscription.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbSubscriptionQueryResponse> getResponseClass() {
		return WlbSubscriptionQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}