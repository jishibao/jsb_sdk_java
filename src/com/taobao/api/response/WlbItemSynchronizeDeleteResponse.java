package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.synchronize.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemSynchronizeDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4763676651724263495L;

	/** 
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;


	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}
	


}
