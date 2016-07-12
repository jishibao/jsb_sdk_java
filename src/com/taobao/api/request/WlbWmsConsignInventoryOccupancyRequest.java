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
import com.taobao.api.response.WlbWmsConsignInventoryOccupancyResponse;

/**
 * TOP API: taobao.wlb.wms.consign.inventory.occupancy request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.25
 */
public class WlbWmsConsignInventoryOccupancyRequest extends BaseTaobaoRequest<WlbWmsConsignInventoryOccupancyResponse> {
	
	

	/** 
	* 库存占用
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
		return "taobao.wlb.wms.consign.inventory.occupancy";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsConsignInventoryOccupancyResponse> getResponseClass() {
		return WlbWmsConsignInventoryOccupancyResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 收件人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Receiverinfo extends TaobaoObject {
		private static final long serialVersionUID = 6338183487877836436L;
		/**
		 * 收件方区县
		 */
		@ApiField("receiver_area")
		private String receiverArea;
		/**
		 * 收件方城市
		 */
		@ApiField("receiver_city")
		private String receiverCity;
		/**
		 * 收件方省份
		 */
		@ApiField("receiver_province")
		private String receiverProvince;
		/**
		 * 收件方镇
		 */
		@ApiField("receiver_town")
		private String receiverTown;
		/**
		 * 收件方邮编
		 */
		@ApiField("receiver_zip_code")
		private String receiverZipCode;
	
		public String getReceiverArea() {
			return this.receiverArea;
		}
		public void setReceiverArea(String receiverArea) {
			this.receiverArea = receiverArea;
		}
		public String getReceiverCity() {
			return this.receiverCity;
		}
		public void setReceiverCity(String receiverCity) {
			this.receiverCity = receiverCity;
		}
		public String getReceiverProvince() {
			return this.receiverProvince;
		}
		public void setReceiverProvince(String receiverProvince) {
			this.receiverProvince = receiverProvince;
		}
		public String getReceiverTown() {
			return this.receiverTown;
		}
		public void setReceiverTown(String receiverTown) {
			this.receiverTown = receiverTown;
		}
		public String getReceiverZipCode() {
			return this.receiverZipCode;
		}
		public void setReceiverZipCode(String receiverZipCode) {
			this.receiverZipCode = receiverZipCode;
		}
	}
	
	/**
	 * 商品信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Iteminventory extends TaobaoObject {
		private static final long serialVersionUID = 4486832393676198767L;
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
		 * 商品数量
		 */
		@ApiField("item_quantity")
		private Long itemQuantity;
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
		public Long getItemQuantity() {
			return this.itemQuantity;
		}
		public void setItemQuantity(Long itemQuantity) {
			this.itemQuantity = itemQuantity;
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
	 * 商品信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Iteminventorylist extends TaobaoObject {
		private static final long serialVersionUID = 2885243656576956954L;
		/**
		 * 商品信息
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
	 * 库存占用
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Content extends TaobaoObject {
		private static final long serialVersionUID = 1527173442858259363L;
		/**
		 * 商品信息列表
		 */
		@ApiListField("item_inventory_list")
		@ApiField("iteminventorylist")
		private List<Iteminventorylist> itemInventoryList;
		/**
		 * 当一个仓库不满足库存时，是否允许占用多个仓库库存，如果允许，需要指定最大分仓数量，但不能拆分订单明细。 0：不限个数，只要满足发货，不限分占几个仓库 1：默认值，只能单仓发 >1:最大占用数量
		 */
		@ApiField("max_store_num")
		private String maxStoreNum;
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
		/**
		 * 收件人信息
		 */
		@ApiField("receiver_info")
		private Receiverinfo receiverInfo;
		/**
		 * 仓库编码
		 */
		@ApiField("store_code")
		private String storeCode;
	
		public List<Iteminventorylist> getItemInventoryList() {
			return this.itemInventoryList;
		}
		public void setItemInventoryList(List<Iteminventorylist> itemInventoryList) {
			this.itemInventoryList = itemInventoryList;
		}
		public String getMaxStoreNum() {
			return this.maxStoreNum;
		}
		public void setMaxStoreNum(String maxStoreNum) {
			this.maxStoreNum = maxStoreNum;
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
		public Receiverinfo getReceiverInfo() {
			return this.receiverInfo;
		}
		public void setReceiverInfo(Receiverinfo receiverInfo) {
			this.receiverInfo = receiverInfo;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
	}
	

}