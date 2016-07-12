package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemQuantityUpdateResponse;

/**
 * TOP API: tmall.item.quantity.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.02
 */
public class TmallItemQuantityUpdateRequest extends BaseTaobaoRequest<TmallItemQuantityUpdateResponse> {
	
	

	/** 
	* 商品id
	 */
	private Long itemId;

	/** 
	* 商品库存数；增量编辑方式支持正数、负数
	 */
	private Long itemQuantity;

	/** 
	* 商品库存更新时候的可选参数
	 */
	private String options;

	/** 
	* 更新SKU库存时候的SKU库存对象；如果没有SKU或者不更新SKU库存，可以不填;查找SKU目前支持ID，属性串和商家编码三种模式，建议选用一种最合适的，切勿滥用，一次调用中如果混合使用，更新结果不可预期！
	 */
	private String skuQuantities;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Long getItemQuantity() {
		return this.itemQuantity;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public void setOptions(UpdateItemQuantityOption options) {
		this.options = new JSONWriter(false,true).write(options);
	}

	public String getOptions() {
		return this.options;
	}

	public void setSkuQuantities(String skuQuantities) {
		this.skuQuantities = skuQuantities;
	}

	public void setSkuQuantities(List<UpdateSkuQuantity> skuQuantities) {
		this.skuQuantities = new JSONWriter(false,true).write(skuQuantities);
	}

	public String getSkuQuantities() {
		return this.skuQuantities;
	}

	public String getApiMethodName() {
		return "tmall.item.quantity.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("item_quantity", this.itemQuantity);
		txtParams.put("options", this.options);
		txtParams.put("sku_quantities", this.skuQuantities);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemQuantityUpdateResponse> getResponseClass() {
		return TmallItemQuantityUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(skuQuantities, 20, "skuQuantities");
	}
	
	/**
	 * 更新SKU库存时候的SKU库存对象；如果没有SKU或者不更新SKU库存，可以不填;查找SKU目前支持ID，属性串和商家编码三种模式，建议选用一种最合适的，切勿滥用，一次调用中如果混合使用，更新结果不可预期！
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdateSkuQuantity extends TaobaoObject {
		private static final long serialVersionUID = 4631642155755978199L;
		/**
		 * SkuID，用于指定被修改库存的SKU
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充，用于指定被修改库存的SKU
		 */
		@ApiField("properties")
		private String properties;
		/**
		 * Sku的商家外部id，用于指定被修改库存的SKU
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 属于这个sku的商品的库存；增量编辑方式支持正数、负数
		 */
		@ApiField("sku_id")
		private Long skuId;
	
		public String getOuterId() {
			return this.outerId;
		}
		public void setOuterId(String outerId) {
			this.outerId = outerId;
		}
		public String getProperties() {
			return this.properties;
		}
		public void setProperties(String properties) {
			this.properties = properties;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getSkuId() {
			return this.skuId;
		}
		public void setSkuId(Long skuId) {
			this.skuId = skuId;
		}
	}
	
	/**
	 * 商品库存更新时候的可选参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UpdateItemQuantityOption extends TaobaoObject {
		private static final long serialVersionUID = 4439269629752769822L;
		/**
		 * 增量幂等外部编码
		 */
		@ApiField("outer_biz_key")
		private String outerBizKey;
		/**
		 * 库存更新方式: 1是全量更新 2是增量更新；默认是1。
		 */
		@ApiField("type")
		private Long type;
	
		public String getOuterBizKey() {
			return this.outerBizKey;
		}
		public void setOuterBizKey(String outerBizKey) {
			this.outerBizKey = outerBizKey;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}
	}
	

}