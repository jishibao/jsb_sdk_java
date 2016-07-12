package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Sku;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.sku.price.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkuPriceUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1755336385385128211L;

	/** 
	 * 商品SKU信息（只包含num_iid和modified）
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
