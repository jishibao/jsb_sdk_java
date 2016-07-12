package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.skus.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkusGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8788582251251238751L;

	/** 
	 * Sku列表
	 */
	@ApiListField("skus")
	@ApiField("sku")
	private List<Sku> skus;


	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}
	public List<Sku> getSkus( ) {
		return this.skus;
	}
	


}
