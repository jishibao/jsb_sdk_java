package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbWmsSkuInfoConfirmData;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.sku.info.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsSkuInfoConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7746581399243587487L;

	/** 
	 * 商品回告返回
	 */
	@ApiField("result")
	private WlbWmsSkuInfoConfirmData result;


	public void setResult(WlbWmsSkuInfoConfirmData result) {
		this.result = result;
	}
	public WlbWmsSkuInfoConfirmData getResult( ) {
		return this.result;
	}
	


}
