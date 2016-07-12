package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WaybillDetailQueryInfo;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.querydetail response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillIQuerydetailResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4476878362786365378L;

	/** 
	 * 面单查询错误编码
	 */
	@ApiListField("error_codes")
	@ApiField("string")
	private List<String> errorCodes;

	/** 
	 * 不存在的面单号
	 */
	@ApiListField("inexistent_waybill_codes")
	@ApiField("string")
	private List<String> inexistentWaybillCodes;

	/** 
	 * 查询是否成功
	 */
	@ApiField("query_success")
	private Boolean querySuccess;

	/** 
	 * 面单详情
	 */
	@ApiListField("waybill_details")
	@ApiField("waybill_detail_query_info")
	private List<WaybillDetailQueryInfo> waybillDetails;


	public void setErrorCodes(List<String> errorCodes) {
		this.errorCodes = errorCodes;
	}
	public List<String> getErrorCodes( ) {
		return this.errorCodes;
	}

	public void setInexistentWaybillCodes(List<String> inexistentWaybillCodes) {
		this.inexistentWaybillCodes = inexistentWaybillCodes;
	}
	public List<String> getInexistentWaybillCodes( ) {
		return this.inexistentWaybillCodes;
	}

	public void setQuerySuccess(Boolean querySuccess) {
		this.querySuccess = querySuccess;
	}
	public Boolean getQuerySuccess( ) {
		return this.querySuccess;
	}

	public void setWaybillDetails(List<WaybillDetailQueryInfo> waybillDetails) {
		this.waybillDetails = waybillDetails;
	}
	public List<WaybillDetailQueryInfo> getWaybillDetails( ) {
		return this.waybillDetails;
	}
	


}
