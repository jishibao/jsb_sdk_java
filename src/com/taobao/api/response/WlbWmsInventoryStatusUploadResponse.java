package com.taobao.api.response;

import com.taobao.api.domain.WlbWmsInventoryStatusUploadResp;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.status.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsInventoryStatusUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8379124231389811822L;

	/** 
	 * 库存状态调整回告
	 */
	@ApiField("result")
	private WlbWmsInventoryStatusUploadResp result;


	public void setResult(WlbWmsInventoryStatusUploadResp result) {
		this.result = result;
	}
	public WlbWmsInventoryStatusUploadResp getResult( ) {
		return this.result;
	}
	


}
