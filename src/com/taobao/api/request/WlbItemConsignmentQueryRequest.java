package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemConsignmentQueryResponse;

/**
 * TOP API: taobao.wlb.item.consignment.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbItemConsignmentQueryRequest extends BaseTaobaoRequest<WlbItemConsignmentQueryResponse> {
	
	

	/** 
	* 授权结束时间
	 */
	private Date authorizeEndTime;

	/** 
	* 授权开始时间
	 */
	private Date authorizeStartTime;

	/** 
	* 货主的用户昵称，未设置则查询全部
	 */
	private String ownerUserNick;

	/** 
	* 当前页
	 */
	private Long pageNo;

	/** 
	* 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
	 */
	private Long pageSize;

	public void setAuthorizeEndTime(Date authorizeEndTime) {
		this.authorizeEndTime = authorizeEndTime;
	}

	public Date getAuthorizeEndTime() {
		return this.authorizeEndTime;
	}

	public void setAuthorizeStartTime(Date authorizeStartTime) {
		this.authorizeStartTime = authorizeStartTime;
	}

	public Date getAuthorizeStartTime() {
		return this.authorizeStartTime;
	}

	public void setOwnerUserNick(String ownerUserNick) {
		this.ownerUserNick = ownerUserNick;
	}

	public String getOwnerUserNick() {
		return this.ownerUserNick;
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
		return "taobao.wlb.item.consignment.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("authorize_end_time", this.authorizeEndTime);
		txtParams.put("authorize_start_time", this.authorizeStartTime);
		txtParams.put("owner_user_nick", this.ownerUserNick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemConsignmentQueryResponse> getResponseClass() {
		return WlbItemConsignmentQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}