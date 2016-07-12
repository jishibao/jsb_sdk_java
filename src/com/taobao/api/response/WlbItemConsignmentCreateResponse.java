package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.consignment.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemConsignmentCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4281719615267896336L;

	/** 
	 * 代销关系唯一标识
	 */
	@ApiField("consignment_id")
	private Long consignmentId;


	public void setConsignmentId(Long consignmentId) {
		this.consignmentId = consignmentId;
	}
	public Long getConsignmentId( ) {
		return this.consignmentId;
	}
	


}
