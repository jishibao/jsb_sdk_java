package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.consign response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderConsignResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6489485749829678196L;

	/** 
	 * 修改时间
	 */
	@ApiField("modify_time")
	private Date modifyTime;


	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime( ) {
		return this.modifyTime;
	}
	


}
