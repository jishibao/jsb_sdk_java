package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.jzwithins.consign response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderJzwithinsConsignResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6459119689132774555L;

	/** 
	 * 发货成功或者失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 发货返回信息，如果发货错误则报出对应错误
	 */
	@ApiField("result_info")
	private String resultInfo;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
	public String getResultInfo( ) {
		return this.resultInfo;
	}
	


}
