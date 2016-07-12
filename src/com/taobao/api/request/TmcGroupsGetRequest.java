package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmcGroupsGetResponse;

/**
 * TOP API: taobao.tmc.groups.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.30
 */
public class TmcGroupsGetRequest extends BaseTaobaoRequest<TmcGroupsGetResponse> {
	
	

	/** 
	* 要查询分组的名称，多个分组用半角逗号分隔，不传代表查询所有分组信息，但不会返回组下面的用户信息。如果应用没有设置分组则返回空。组名不能以default开头，default开头是系统默认的组。
	 */
	private String groupNames;

	/** 
	* 页码
	 */
	private Long pageNo;

	/** 
	* 每页返回多少个分组
	 */
	private Long pageSize;

	public void setGroupNames(String groupNames) {
		this.groupNames = groupNames;
	}

	public String getGroupNames() {
		return this.groupNames;
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

	public String getApiMethodName() {
		return "taobao.tmc.groups.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group_names", this.groupNames);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcGroupsGetResponse> getResponseClass() {
		return TmcGroupsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(groupNames, 20, "groupNames");
		RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
		RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
	}
	

}