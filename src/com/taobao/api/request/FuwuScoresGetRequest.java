package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FuwuScoresGetResponse;

/**
 * TOP API: taobao.fuwu.scores.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FuwuScoresGetRequest extends BaseTaobaoRequest<FuwuScoresGetResponse> {
	
	

	/** 
	* 当前页
	 */
	private Long currentPage;

	/** 
	* 评价日期，查询某一天的评价
	 */
	private Date date;

	/** 
	* 每页获取条数。默认值40，最小值1，最大值100。
	 */
	private Long pageSize;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return this.date;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "taobao.fuwu.scores.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("current_page", this.currentPage);
		txtParams.put("date", this.date);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FuwuScoresGetResponse> getResponseClass() {
		return FuwuScoresGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(currentPage, "currentPage");
		RequestCheckUtils.checkNotEmpty(date, "date");
		RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
	}
	

}