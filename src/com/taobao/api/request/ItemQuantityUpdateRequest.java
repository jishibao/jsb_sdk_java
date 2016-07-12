package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemQuantityUpdateResponse;

/**
 * TOP API: taobao.item.quantity.update request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.04
 */
public class ItemQuantityUpdateRequest extends BaseTaobaoRequest<ItemQuantityUpdateResponse> {
	
	

	/** 
	* 商品数字ID，必填参数
	 */
	private Long numIid;

	/** 
	* SKU的商家编码，可选参数。如果不填则默认修改宝贝的库存，如果填了则按照商家编码搜索出对应的SKU并修改库存。当sku_id和本字段都填写时以sku_id为准搜索对应SKU
	 */
	private String outerId;

	/** 
	* 库存修改值，必选。当全量更新库存时，quantity必须为大于等于0的正整数；当增量更新库存时，quantity为整数，可小于等于0。若增量更新时传入的库存为负数，则负数与实际库存之和不能小于0。比如当前实际库存为1，传入增量更新quantity=-1，库存改为0
	 */
	private Long quantity;

	/** 
	* 要操作的SKU的数字ID，可选。如果不填默认修改宝贝的库存，如果填上则修改该SKU的库存
	 */
	private Long skuId;

	/** 
	* 库存更新方式，可选。1为全量更新，2为增量更新。如果不填，默认为全量更新
	 */
	private Long type;

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.item.quantity.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("num_iid", this.numIid);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("quantity", this.quantity);
		txtParams.put("sku_id", this.skuId);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemQuantityUpdateResponse> getResponseClass() {
		return ItemQuantityUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkNotEmpty(quantity, "quantity");
	}
	

}