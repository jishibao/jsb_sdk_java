package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductMapDeleteResponse;

/**
 * TOP API: taobao.fenxiao.product.map.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoProductMapDeleteRequest extends BaseTaobaoRequest<FenxiaoProductMapDeleteResponse> {
	
	

	/** 
	* 分销产品id。
	 */
	private Long productId;

	/** 
	* 分销产品的sku id列表，逗号分隔，在有sku时需要指定。
	 */
	private String skuIds;

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setSkuIds(String skuIds) {
		this.skuIds = skuIds;
	}

	public String getSkuIds() {
		return this.skuIds;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.map.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("product_id", this.productId);
		txtParams.put("sku_ids", this.skuIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductMapDeleteResponse> getResponseClass() {
		return FenxiaoProductMapDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(productId, "productId");
	}
	

}