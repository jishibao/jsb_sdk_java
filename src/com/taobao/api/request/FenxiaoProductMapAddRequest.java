package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductMapAddResponse;

/**
 * TOP API: taobao.fenxiao.product.map.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class FenxiaoProductMapAddRequest extends BaseTaobaoRequest<FenxiaoProductMapAddResponse> {
	
	

	/** 
	* 是否需要校验商家编码，true不校验，false校验。
	 */
	private Boolean notCheckOuterCode;

	/** 
	* 分销产品id。
	 */
	private Long productId;

	/** 
	* 后端商品id（如果当前分销产品没有sku和后端商品时需要指定）。
	 */
	private Long scItemId;

	/** 
	* 在有sku的情况下，与各个sku对应的后端商品id列表。逗号分隔，顺序需要保证与sku_ids一致。
	 */
	private String scItemIds;

	/** 
	* 分销产品的sku id。逗号分隔，顺序需要保证与sc_item_ids一致（没有sku就不传）。
	 */
	private String skuIds;

	public void setNotCheckOuterCode(Boolean notCheckOuterCode) {
		this.notCheckOuterCode = notCheckOuterCode;
	}

	public Boolean getNotCheckOuterCode() {
		return this.notCheckOuterCode;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setScItemId(Long scItemId) {
		this.scItemId = scItemId;
	}

	public Long getScItemId() {
		return this.scItemId;
	}

	public void setScItemIds(String scItemIds) {
		this.scItemIds = scItemIds;
	}

	public String getScItemIds() {
		return this.scItemIds;
	}

	public void setSkuIds(String skuIds) {
		this.skuIds = skuIds;
	}

	public String getSkuIds() {
		return this.skuIds;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.product.map.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("not_check_outer_code", this.notCheckOuterCode);
		txtParams.put("product_id", this.productId);
		txtParams.put("sc_item_id", this.scItemId);
		txtParams.put("sc_item_ids", this.scItemIds);
		txtParams.put("sku_ids", this.skuIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductMapAddResponse> getResponseClass() {
		return FenxiaoProductMapAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(productId, "productId");
	}
	

}