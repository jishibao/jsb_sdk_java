package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WaybillProductType;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.waybill.i.product response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWaybillIProductResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8892356998196642723L;

	/** 
	 * 产品类型返回
	 */
	@ApiListField("product_types")
	@ApiField("waybill_product_type")
	private List<WaybillProductType> productTypes;


	public void setProductTypes(List<WaybillProductType> productTypes) {
		this.productTypes = productTypes;
	}
	public List<WaybillProductType> getProductTypes( ) {
		return this.productTypes;
	}
	


}
