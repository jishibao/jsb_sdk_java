package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1159379494757561398L;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Boolean gmtModified;


	public void setGmtModified(Boolean gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Boolean getGmtModified( ) {
		return this.gmtModified;
	}
	


}
