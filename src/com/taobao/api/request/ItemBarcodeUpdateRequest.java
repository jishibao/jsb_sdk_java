package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemBarcodeUpdateResponse;

/**
 * TOP API: taobao.item.barcode.update request
 * 
 * @author top auto create
 * @since 1.0, 2014.09.29
 */
public class ItemBarcodeUpdateRequest extends BaseTaobaoRequest<ItemBarcodeUpdateResponse> {
	
	

	/** 
	* 是否强制保存商品条码。
true：强制保存
false ：需要执行条码库校验
	 */
	private Boolean isforce;

	/** 
	* 商品条形码，如果不用更新，可选择不填
	 */
	private String itemBarcode;

	/** 
	* 被更新商品的ID
	 */
	private Long itemId;

	/** 
	* SKU维度的条形码，和sku_ids字段一一对应，中间以英文逗号分隔
	 */
	private String skuBarcodes;

	/** 
	* 被更新SKU的ID列表，中间以英文逗号进行分隔。如果没有SKU或者不需要更新SKU的条形码，不需要设置
	 */
	private String skuIds;

	/** 
	* 访问来源，这字段提供给千牛扫码枪用，
其他调用方，不需要填写
	 */
	private String src;

	public void setIsforce(Boolean isforce) {
		this.isforce = isforce;
	}

	public Boolean getIsforce() {
		return this.isforce;
	}

	public void setItemBarcode(String itemBarcode) {
		this.itemBarcode = itemBarcode;
	}

	public String getItemBarcode() {
		return this.itemBarcode;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setSkuBarcodes(String skuBarcodes) {
		this.skuBarcodes = skuBarcodes;
	}

	public String getSkuBarcodes() {
		return this.skuBarcodes;
	}

	public void setSkuIds(String skuIds) {
		this.skuIds = skuIds;
	}

	public String getSkuIds() {
		return this.skuIds;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getSrc() {
		return this.src;
	}

	public String getApiMethodName() {
		return "taobao.item.barcode.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("isforce", this.isforce);
		txtParams.put("item_barcode", this.itemBarcode);
		txtParams.put("item_id", this.itemId);
		txtParams.put("sku_barcodes", this.skuBarcodes);
		txtParams.put("sku_ids", this.skuIds);
		txtParams.put("src", this.src);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemBarcodeUpdateResponse> getResponseClass() {
		return ItemBarcodeUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}