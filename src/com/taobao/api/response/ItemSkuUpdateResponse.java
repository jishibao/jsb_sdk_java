package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Sku;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.sku.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkuUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5425542898712388899L;

	/** 
	 * 商品Sku
	 */
	@ApiField("sku")
	private Sku sku;


	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Sku getSku( ) {
		return this.sku;
	}
	


}
