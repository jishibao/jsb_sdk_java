package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoRefundQueryResponse;

/**
 * TOP API: taobao.fenxiao.refund.query request
 * 
 * @author top auto create
 * @since 1.0, 2014.04.14
 */
public class FenxiaoRefundQueryRequest extends BaseTaobaoRequest<FenxiaoRefundQueryResponse> {
	
	

	/** 
	* 代销采购退款最迟修改时间。与start_date的最大时间间隔不能超过30天
	 */
	private Date endDate;

	/** 
	* 页码（大于0的整数。无值或小于1的值按默认值1计）
	 */
	private Long pageNo;

	/** 
	* 每页条数（大于0但小于等于50的整数。无值或大于50或小于1的值按默认值50计）
	 */
	private Long pageSize;

	/** 
	* 是否查询下游买家的退款信息
	 */
	private Boolean querySellerRefund;

	/** 
	* 代销采购退款单最早修改时间
	 */
	private Date startDate;

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

	public void setQuerySellerRefund(Boolean querySellerRefund) {
		this.querySellerRefund = querySellerRefund;
	}

	public Boolean getQuerySellerRefund() {
		return this.querySellerRefund;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.refund.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("query_seller_refund", this.querySellerRefund);
		txtParams.put("start_date", this.startDate);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoRefundQueryResponse> getResponseClass() {
		return FenxiaoRefundQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endDate, "endDate");
		RequestCheckUtils.checkNotEmpty(startDate, "startDate");
	}
	

}