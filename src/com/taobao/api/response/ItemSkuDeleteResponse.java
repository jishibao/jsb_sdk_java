package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Sku;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.sku.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkuDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4124849851554354917L;

	/** 
	 * Sku结构
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
