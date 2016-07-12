package com.taobao.api.response;

import java.util.Date;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.consign.bill.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsConsignBillGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6841944944425697278L;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("consign_send_info_list")
	@ApiField("consignsendinfolist")
	private List<Consignsendinfolist> consignSendInfoList;


	public void setConsignSendInfoList(List<Consignsendinfolist> consignSendInfoList) {
		this.consignSendInfoList = consignSendInfoList;
	}
	public List<Consignsendinfolist> getConsignSendInfoList( ) {
		return this.consignSendInfoList;
	}
	
	/**
	 * 商品属性列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Inventoryitem extends TaobaoObject {
		private static final long serialVersionUID = 5755933497241932243L;
		/**
		 * 批次号
		 */
		@ApiField("batch_code")
		private String batchCode;
		/**
		 * 商品保质期信息，失效日期
		 */
		@ApiField("due_date")
		private Date dueDate;
		/**
		 * 库存类型：1 可销售库存 (正品) 101 类型用来定义残次品 201 冻结类型库存 301 在途库存
		 */
		@ApiField("inventory_type")
		private Long inventoryType;
		/**
		 * 数量
		 */
		@ApiField("item_qty")
		private Long itemQty;
		/**
		 * 生产地区
		 */
		@ApiField("produce_area")
		private String produceArea;
		/**
		 * 生产编码，同一商品可能因商家不同有不同编码
		 */
		@ApiField("produce_code")
		private String produceCode;
		/**
		 * 商品保质期信息，生产日期
		 */
		@ApiField("produce_date")
		private Date produceDate;
	
		public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public Date getDueDate() {
			return this.dueDate;
		}
		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}
		public Long getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(Long inventoryType) {
			this.inventoryType = inventoryType;
		}
		public Long getItemQty() {
			return this.itemQty;
		}
		public void setItemQty(Long itemQty) {
			this.itemQty = itemQty;
		}
		public String getProduceArea() {
			return this.produceArea;
		}
		public void setProduceArea(String produceArea) {
			this.produceArea = produceArea;
		}
		public String getProduceCode() {
			return this.produceCode;
		}
		public void setProduceCode(String produceCode) {
			this.produceCode = produceCode;
		}
		public Date getProduceDate() {
			return this.produceDate;
		}
		public void setProduceDate(Date produceDate) {
			this.produceDate = produceDate;
		}
	}
	
	/**
	 * 商品属性列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Inventoryitemlist extends TaobaoObject {
		private static final long serialVersionUID = 3816161617571334269L;
		/**
		 * 商品属性列表
		 */
		@ApiField("inventory_item")
		private Inventoryitem inventoryItem;
	
		public Inventoryitem getInventoryItem() {
			return this.inventoryItem;
		}
		public void setInventoryItem(Inventoryitem inventoryItem) {
			this.inventoryItem = inventoryItem;
		}
	}
	
	/**
	 * 订单商品信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Orderitem extends TaobaoObject {
		private static final long serialVersionUID = 3651693752527824278L;
		/**
		 * 商品属性列表
		 */
		@ApiListField("inventory_item_list")
		@ApiField("inventoryitemlist")
		private List<Inventoryitemlist> inventoryItemList;
		/**
		 * 商家编码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 订单明细行编码
		 */
		@ApiField("order_item_id")
		private String orderItemId;
		/**
		 * 交易单号
		 */
		@ApiField("order_source_code")
		private String orderSourceCode;
	
		public List<Inventoryitemlist> getInventoryItemList() {
			return this.inventoryItemList;
		}
		public void setInventoryItemList(List<Inventoryitemlist> inventoryItemList) {
			this.inventoryItemList = inventoryItemList;
		}
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
		public String getOrderItemId() {
			return this.orderItemId;
		}
		public void setOrderItemId(String orderItemId) {
			this.orderItemId = orderItemId;
		}
		public String getOrderSourceCode() {
			return this.orderSourceCode;
		}
		public void setOrderSourceCode(String orderSourceCode) {
			this.orderSourceCode = orderSourceCode;
		}
	}
	
	/**
	 * 订单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Orderitemlist extends TaobaoObject {
		private static final long serialVersionUID = 3261857285661232343L;
		/**
		 * 订单商品信息
		 */
		@ApiField("order_item")
		private Orderitem orderItem;
	
		public Orderitem getOrderItem() {
			return this.orderItem;
		}
		public void setOrderItem(Orderitem orderItem) {
			this.orderItem = orderItem;
		}
	}
	
	/**
	 * 包裹包材信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Packagematerial extends TaobaoObject {
		private static final long serialVersionUID = 8523317363289689137L;
		/**
		 * 包材的数量
		 */
		@ApiField("material_quantity")
		private String materialQuantity;
		/**
		 * 淘宝指定的包材型号
		 */
		@ApiField("material_type")
		private String materialType;
	
		public String getMaterialQuantity() {
			return this.materialQuantity;
		}
		public void setMaterialQuantity(String materialQuantity) {
			this.materialQuantity = materialQuantity;
		}
		public String getMaterialType() {
			return this.materialType;
		}
		public void setMaterialType(String materialType) {
			this.materialType = materialType;
		}
	}
	
	/**
	 * 包材信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Packagemateriallist extends TaobaoObject {
		private static final long serialVersionUID = 7584127675237513819L;
		/**
		 * 包裹包材信息
		 */
		@ApiField("package_material")
		private Packagematerial packageMaterial;
	
		public Packagematerial getPackageMaterial() {
			return this.packageMaterial;
		}
		public void setPackageMaterial(Packagematerial packageMaterial) {
			this.packageMaterial = packageMaterial;
		}
	}
	
	/**
	 * 包裹里面商品
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Tmsitem extends TaobaoObject {
		private static final long serialVersionUID = 2757474273276791313L;
		/**
		 * 商家编码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * ERP商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 此运单里该商品的数量
		 */
		@ApiField("item_qty")
		private Long itemQty;
	
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
		public Long getItemQty() {
			return this.itemQty;
		}
		public void setItemQty(Long itemQty) {
			this.itemQty = itemQty;
		}
	}
	
	/**
	 * 包裹里面的商品信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Tmsitemlist extends TaobaoObject {
		private static final long serialVersionUID = 7195364332213479976L;
		/**
		 * 包裹里面商品
		 */
		@ApiField("tms_item")
		private Tmsitem tmsItem;
	
		public Tmsitem getTmsItem() {
			return this.tmsItem;
		}
		public void setTmsItem(Tmsitem tmsItem) {
			this.tmsItem = tmsItem;
		}
	}
	
	/**
	 * 运单信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Tmsorder extends TaobaoObject {
		private static final long serialVersionUID = 5443142768836794765L;
		/**
		 * 包裹号
		 */
		@ApiField("package_code")
		private String packageCode;
		/**
		 * 包裹高度，单位：毫米
		 */
		@ApiField("package_height")
		private Long packageHeight;
		/**
		 * 包裹长度，单位：毫米
		 */
		@ApiField("package_length")
		private Long packageLength;
		/**
		 * 包材信息
		 */
		@ApiListField("package_material_list")
		@ApiField("packagemateriallist")
		private List<Packagemateriallist> packageMaterialList;
		/**
		 * 包裹重量，单位：克
		 */
		@ApiField("package_weight")
		private Long packageWeight;
		/**
		 * 包裹宽度，单位：毫米
		 */
		@ApiField("package_width")
		private Long packageWidth;
		/**
		 * 快递公司服务编码
		 */
		@ApiField("tms_code")
		private String tmsCode;
		/**
		 * 包裹里面的商品信息列表
		 */
		@ApiListField("tms_item_list")
		@ApiField("tmsitemlist")
		private List<Tmsitemlist> tmsItemList;
		/**
		 * 运单编码
		 */
		@ApiField("tms_order_code")
		private String tmsOrderCode;
	
		public String getPackageCode() {
			return this.packageCode;
		}
		public void setPackageCode(String packageCode) {
			this.packageCode = packageCode;
		}
		public Long getPackageHeight() {
			return this.packageHeight;
		}
		public void setPackageHeight(Long packageHeight) {
			this.packageHeight = packageHeight;
		}
		public Long getPackageLength() {
			return this.packageLength;
		}
		public void setPackageLength(Long packageLength) {
			this.packageLength = packageLength;
		}
		public List<Packagemateriallist> getPackageMaterialList() {
			return this.packageMaterialList;
		}
		public void setPackageMaterialList(List<Packagemateriallist> packageMaterialList) {
			this.packageMaterialList = packageMaterialList;
		}
		public Long getPackageWeight() {
			return this.packageWeight;
		}
		public void setPackageWeight(Long packageWeight) {
			this.packageWeight = packageWeight;
		}
		public Long getPackageWidth() {
			return this.packageWidth;
		}
		public void setPackageWidth(Long packageWidth) {
			this.packageWidth = packageWidth;
		}
		public String getTmsCode() {
			return this.tmsCode;
		}
		public void setTmsCode(String tmsCode) {
			this.tmsCode = tmsCode;
		}
		public List<Tmsitemlist> getTmsItemList() {
			return this.tmsItemList;
		}
		public void setTmsItemList(List<Tmsitemlist> tmsItemList) {
			this.tmsItemList = tmsItemList;
		}
		public String getTmsOrderCode() {
			return this.tmsOrderCode;
		}
		public void setTmsOrderCode(String tmsOrderCode) {
			this.tmsOrderCode = tmsOrderCode;
		}
	}
	
	/**
	 * 运单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Tmsorderlist extends TaobaoObject {
		private static final long serialVersionUID = 3229447776838895881L;
		/**
		 * 运单信息列表
		 */
		@ApiField("tms_order")
		private Tmsorder tmsOrder;
	
		public Tmsorder getTmsOrder() {
			return this.tmsOrder;
		}
		public void setTmsOrder(Tmsorder tmsOrder) {
			this.tmsOrder = tmsOrder;
		}
	}
	
	/**
	 * 发票确认信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Invoinceconfirm extends TaobaoObject {
		private static final long serialVersionUID = 1363194627995377758L;
		/**
		 * Erp发票ID
		 */
		@ApiField("bill_id")
		private String billId;
		/**
		 * 发票代码
		 */
		@ApiField("invoice_code")
		private String invoiceCode;
		/**
		 * 发票号
		 */
		@ApiField("invoice_number")
		private String invoiceNumber;
	
		public String getBillId() {
			return this.billId;
		}
		public void setBillId(String billId) {
			this.billId = billId;
		}
		public String getInvoiceCode() {
			return this.invoiceCode;
		}
		public void setInvoiceCode(String invoiceCode) {
			this.invoiceCode = invoiceCode;
		}
		public String getInvoiceNumber() {
			return this.invoiceNumber;
		}
		public void setInvoiceNumber(String invoiceNumber) {
			this.invoiceNumber = invoiceNumber;
		}
	}
	
	/**
	 * 发票确认信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Invoinceconfirmlist extends TaobaoObject {
		private static final long serialVersionUID = 3876629947193265826L;
		/**
		 * 发票确认信息
		 */
		@ApiField("invoince_confirm")
		private Invoinceconfirm invoinceConfirm;
	
		public Invoinceconfirm getInvoinceConfirm() {
			return this.invoinceConfirm;
		}
		public void setInvoinceConfirm(Invoinceconfirm invoinceConfirm) {
			this.invoinceConfirm = invoinceConfirm;
		}
	}
	
	/**
	 * 物流订单发货信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Consignsendinfo extends TaobaoObject {
		private static final long serialVersionUID = 3754796239294262269L;
		/**
		 * 菜鸟订单编码
		 */
		@ApiField("cn_order_code")
		private String cnOrderCode;
		/**
		 * 仓库订单完成时间
		 */
		@ApiField("confirm_time")
		private Date confirmTime;
		/**
		 * 发票确认信息列表
		 */
		@ApiListField("invoince_confirm_list")
		@ApiField("invoinceconfirmlist")
		private List<Invoinceconfirmlist> invoinceConfirmList;
		/**
		 * ERP订单编码
		 */
		@ApiField("order_code")
		private String orderCode;
		/**
		 * 订单信息
		 */
		@ApiListField("order_item_list")
		@ApiField("orderitemlist")
		private List<Orderitemlist> orderItemList;
		/**
		 * 订单类型 201 销售出库 502 换货出库 503 补发出库
		 */
		@ApiField("order_type")
		private Long orderType;
		/**
		 * 订单状态 WMS_ACCEPT 接单成功 WMS_REJECT 接单失败 WMS_CONFIRMED 仓库生产完成
		 */
		@ApiField("status")
		private String status;
		/**
		 * 仓储编码
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * 运单信息
		 */
		@ApiListField("tms_order_list")
		@ApiField("tmsorderlist")
		private List<Tmsorderlist> tmsOrderList;
	
		public String getCnOrderCode() {
			return this.cnOrderCode;
		}
		public void setCnOrderCode(String cnOrderCode) {
			this.cnOrderCode = cnOrderCode;
		}
		public Date getConfirmTime() {
			return this.confirmTime;
		}
		public void setConfirmTime(Date confirmTime) {
			this.confirmTime = confirmTime;
		}
		public List<Invoinceconfirmlist> getInvoinceConfirmList() {
			return this.invoinceConfirmList;
		}
		public void setInvoinceConfirmList(List<Invoinceconfirmlist> invoinceConfirmList) {
			this.invoinceConfirmList = invoinceConfirmList;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public List<Orderitemlist> getOrderItemList() {
			return this.orderItemList;
		}
		public void setOrderItemList(List<Orderitemlist> orderItemList) {
			this.orderItemList = orderItemList;
		}
		public Long getOrderType() {
			return this.orderType;
		}
		public void setOrderType(Long orderType) {
			this.orderType = orderType;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public List<Tmsorderlist> getTmsOrderList() {
			return this.tmsOrderList;
		}
		public void setTmsOrderList(List<Tmsorderlist> tmsOrderList) {
			this.tmsOrderList = tmsOrderList;
		}
	}
	
	/**
	 * 商品信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Consignsendinfolist extends TaobaoObject {
		private static final long serialVersionUID = 4566983881791616162L;
		/**
		 * 物流订单发货信息
		 */
		@ApiField("consign_send_info")
		private Consignsendinfo consignSendInfo;
	
		public Consignsendinfo getConsignSendInfo() {
			return this.consignSendInfo;
		}
		public void setConsignSendInfo(Consignsendinfo consignSendInfo) {
			this.consignSendInfo = consignSendInfo;
		}
	}
	


}
