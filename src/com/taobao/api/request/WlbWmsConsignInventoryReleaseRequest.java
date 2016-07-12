package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsConsignInventoryReleaseResponse;

/**
 * TOP API: taobao.wlb.wms.consign.inventory.release request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.25
 */
public class WlbWmsConsignInventoryReleaseRequest extends BaseTaobaoRequest<WlbWmsConsignInventoryReleaseResponse> {
	
	

	/** 
	* 库存释放
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(Content content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.consign.inventory.release";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsConsignInventoryReleaseResponse> getResponseClass() {
		return WlbWmsConsignInventoryReleaseResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 订单商品
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Iteminventory extends TaobaoObject {
		private static final long serialVersionUID = 4546575772832575688L;
		/**
		 * 菜鸟商品编码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 菜鸟商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 交易编码
		 */
		@ApiField("order_source_code")
		private String orderSourceCode;
		/**
		 * 子交易编码
		 */
		@ApiField("sub_source_code")
		private String subSourceCode;
	
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getOrderSourceCode() {
			return this.orderSourceCode;
		}
		public void setOrderSourceCode(String orderSourceCode) {
			this.orderSourceCode = orderSourceCode;
		}
		public String getSubSourceCode() {
			return this.subSourceCode;
		}
		public void setSubSourceCode(String subSourceCode) {
			this.subSourceCode = subSourceCode;
		}
	}
	
	/**
	 * 订单商品列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Iteminventorylist extends TaobaoObject {
		private static final long serialVersionUID = 4841348979621465632L;
		/**
		 * 订单商品
		 */
		@ApiField("item_inventory")
		private Iteminventory itemInventory;
	
		public Iteminventory getItemInventory() {
			return this.itemInventory;
		}
		public void setItemInventory(Iteminventory itemInventory) {
			this.itemInventory = itemInventory;
		}
	}
	
	/**
	 * 库存释放
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Content extends TaobaoObject {
		private static final long serialVersionUID = 1484857591153325731L;
		/**
		 * 订单商品列表
		 */
		@ApiListField("item_inventory_list")
		@ApiField("iteminventorylist")
		private List<Iteminventorylist> itemInventoryList;
		/**
		 * ERP订单编码
		 */
		@ApiField("order_code")
		private String orderCode;
		/**
		 * 订单来源（213 天猫，201 淘宝，214 京东，202 1688 阿里中文站 ，203 苏宁在线，204 亚马逊中国，205 当当，208 1号店，207 唯品会，209 国美在线，210 拍拍，206 易贝ebay，211 聚美优品，212 乐蜂网，215 邮乐，216 凡客，217 优购，218 银泰，219 易讯，221 聚尚网，222 蘑菇街，223 POS门店，301 其他）
		 */
		@ApiField("order_source")
		private Long orderSource;
	
		public List<Iteminventorylist> getItemInventoryList() {
			return this.itemInventoryList;
		}
		public void setItemInventoryList(List<Iteminventorylist> itemInventoryList) {
			this.itemInventoryList = itemInventoryList;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public Long getOrderSource() {
			return this.orderSource;
		}
		public void setOrderSource(Long orderSource) {
			this.orderSource = orderSource;
		}
	}
	

}