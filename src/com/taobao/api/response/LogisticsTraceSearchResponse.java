package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TransitStepInfo;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.trace.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsTraceSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1758469324275495981L;

	/** 
	 * 物流公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * 运单号
	 */
	@ApiField("out_sid")
	private String outSid;

	/** 
	 * 订单的物流状态（仅支持线上发货online订单，线下发货offline发出后直接变为已签收）
* 等候发送给物流公司
*已提交给物流公司,等待物流公司接单
*已经确认消息接收，等待物流公司接单
*物流公司已接单
*物流公司不接单
*物流公司揽收失败
*物流公司揽收成功
*签收失败
*对方已签收
*对方拒绝签收
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易号
	 */
	@ApiField("tid")
	private Long tid;

	/** 
	 * 流转信息列表
	 */
	@ApiListField("trace_list")
	@ApiField("transit_step_info")
	private List<TransitStepInfo> traceList;


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName( ) {
		return this.companyName;
	}

	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}
	public String getOutSid( ) {
		return this.outSid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}
	public Long getTid( ) {
		return this.tid;
	}

	public void setTraceList(List<TransitStepInfo> traceList) {
		this.traceList = traceList;
	}
	public List<TransitStepInfo> getTraceList( ) {
		return this.traceList;
	}
	


}
