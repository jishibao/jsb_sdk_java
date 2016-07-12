package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemCspuMoveResponse;

/**
 * TOP API: taobao.item.cspu.move request
 * 
 * @author top auto create
 * @since 1.0, 2014.07.21
 */
public class ItemCspuMoveRequest extends BaseTaobaoRequest<ItemCspuMoveResponse> {
	
	

	/** 
	* 商品id，必填
	 */
	private Long itemId;

	/** 
	* 如果商品存在sku信息，必须输入sku和cspu的映射关系，可以支持多个skuID对应一个cspuID。“-1”代替删除sku。反之不能填写
	 */
	private String skuCspuMapping;

	/** 
	* 商品有SKU信息并且类目配置了营销属性（如套餐），则必须填写sku和套餐的映射关系。并且sku套餐信息和sku_cspu_mapping传入的sku_id信息保持一致。反之，不需要填写，
	 */
	private String skuMealpropertyMapping;

	/** 
	* 商品需要挂接的目产品ID，如果不填默认不修改产品ID,即商品本身对应的产品ID
	 */
	private Long spuId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setSkuCspuMapping(String skuCspuMapping) {
		this.skuCspuMapping = skuCspuMapping;
	}

	public String getSkuCspuMapping() {
		return this.skuCspuMapping;
	}

	public void setSkuMealpropertyMapping(String skuMealpropertyMapping) {
		this.skuMealpropertyMapping = skuMealpropertyMapping;
	}

	public String getSkuMealpropertyMapping() {
		return this.skuMealpropertyMapping;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public Long getSpuId() {
		return this.spuId;
	}

	public String getApiMethodName() {
		return "taobao.item.cspu.move";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("sku_cspu_mapping", this.skuCspuMapping);
		txtParams.put("sku_mealproperty_mapping", this.skuMealpropertyMapping);
		txtParams.put("spu_id", this.spuId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemCspuMoveResponse> getResponseClass() {
		return ItemCspuMoveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}