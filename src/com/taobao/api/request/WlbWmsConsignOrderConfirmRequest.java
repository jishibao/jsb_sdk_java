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
import com.taobao.api.response.WlbWmsConsignOrderConfirmResponse;

/**
 * TOP API: taobao.wlb.wms.consign.order.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.04
 */
public class WlbWmsConsignOrderConfirmRequest extends BaseTaobaoRequest<WlbWmsConsignOrderConfirmResponse> {
	
	

	/** 
	* 发货订单信息
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(WlbWmsConsignOrderConfirm content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.consign.order.confirm";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsConsignOrderConfirmResponse> getResponseClass() {
		return WlbWmsConsignOrderConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TmsItemsWlbWmsConsignOrderConfirm extends TaobaoObject {
		private static final long serialVersionUID = 5497416223462968952L;
		/**
		 * 批次编号
		 */
		@ApiField("batch_code")
		private String batchCode;
		/**
		 * 商品过期日期
		 */
		@ApiField("due_date")
		private String dueDate;
		/**
		 * 后端商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 商品数量，此包裹内商品的数量
		 */
		@ApiField("item_quantity")
		private Long itemQuantity;
		/**
		 * ERP订单明细行号ID
		 */
		@ApiField("order_item_id")
		private String orderItemId;
		/**
		 * 商品生产批号
		 */
		@ApiField("produce_code")
		private String produceCode;
		/**
		 * 商品生产日期
		 */
		@ApiField("product_date")
		private String productDate;
	
		public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getDueDate() {
			return this.dueDate;
		}
		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
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
		public String getOrderItemId() {
			return this.orderItemId;
		}
		public void setOrderItemId(String orderItemId) {
			this.orderItemId = orderItemId;
		}
		public String getProduceCode() {
			return this.produceCode;
		}
		public void setProduceCode(String produceCode) {
			this.produceCode = produceCode;
		}
		public String getProductDate() {
			return this.productDate;
		}
		public void setProductDate(String productDate) {
			this.productDate = productDate;
		}
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PackageMaterialListWlbWmsConsignOrderConfirm extends TaobaoObject {
		private static final long serialVersionUID = 8257535971466643571L;
		/**
		 * 包材的数量
		 */
		@ApiField("material_quantity")
		private Long materialQuantity;
		/**
		 * 包材型号
		 */
		@ApiField("material_type")
		private String materialType;
	
		public Long getMaterialQuantity() {
			return this.materialQuantity;
		}
		public void setMaterialQuantity(Long materialQuantity) {
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
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TmsOrdersWlbWmsConsignOrderConfirm extends TaobaoObject {
		private static final long serialVersionUID = 1376697263648949538L;
		/**
		 * 包裹编号
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
		 * 系统自动生成
		 */
		@ApiListField("package_material_list")
		@ApiField("package_material_list_wlb_wms_consign_order_confirm")
		private List<PackageMaterialListWlbWmsConsignOrderConfirm> packageMaterialList;
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
		 * 快递公司编码
		 */
		@ApiField("tms_code")
		private String tmsCode;
		/**
		 * 系统自动生成
		 */
		@ApiListField("tms_items")
		@ApiField("tms_items_wlb_wms_consign_order_confirm")
		private List<TmsItemsWlbWmsConsignOrderConfirm> tmsItems;
		/**
		 * 运单号
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
		public List<PackageMaterialListWlbWmsConsignOrderConfirm> getPackageMaterialList() {
			return this.packageMaterialList;
		}
		public void setPackageMaterialList(List<PackageMaterialListWlbWmsConsignOrderConfirm> packageMaterialList) {
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
		public List<TmsItemsWlbWmsConsignOrderConfirm> getTmsItems() {
			return this.tmsItems;
		}
		public void setTmsItems(List<TmsItemsWlbWmsConsignOrderConfirm> tmsItems) {
			this.tmsItems = tmsItems;
		}
		public String getTmsOrderCode() {
			return this.tmsOrderCode;
		}
		public void setTmsOrderCode(String tmsOrderCode) {
			this.tmsOrderCode = tmsOrderCode;
		}
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class InvoinceConfirmsWlbWmsConsignOrderConfirm extends TaobaoObject {
		private static final long serialVersionUID = 7146446736573956464L;
		/**
		 * ERP发票ID
		 */
		@ApiField("bill_id")
		private Long billId;
		/**
		 * 发票代码
		 */
		@ApiField("invoice_code")
		private String invoiceCode;
		/**
		 * 发票号码
		 */
		@ApiField("invoice_number")
		private String invoiceNumber;
		/**
		 * 交易号
		 */
		@ApiField("trade_number")
		private String tradeNumber;
	
		public Long getBillId() {
			return this.billId;
		}
		public void setBillId(Long billId) {
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
		public String getTradeNumber() {
			return this.tradeNumber;
		}
		public void setTradeNumber(String tradeNumber) {
			this.tradeNumber = tradeNumber;
		}
	}
	
	/**
	 * 发货订单信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WlbWmsConsignOrderConfirm extends TaobaoObject {
		private static final long serialVersionUID = 6225618481129181625L;
		/**
		 * 支持出入库单多次确认 0 最后一次确认或是一次性确认； 1 多次确认；当多次确认时，确认的ITEM种类全部被确认时，确认完成默认值为 0 例如输入2认为是0
		 */
		@ApiField("confirm_type")
		private Long confirmType;
		/**
		 * 系统自动生成
		 */
		@ApiListField("invoince_confirms")
		@ApiField("invoince_confirms_wlb_wms_consign_order_confirm")
		private List<InvoinceConfirmsWlbWmsConsignOrderConfirm> invoinceConfirms;
		/**
		 * 商家订单编码
		 */
		@ApiField("order_code")
		private String orderCode;
		/**
		 * 订单出库完成时间
		 */
		@ApiField("order_confirm_time")
		private String orderConfirmTime;
		/**
		 * 拆合单信息，如果仓库合并ERP订单后，将多个ERP订单合并在这个字段中；
		 */
		@ApiField("order_join")
		private String orderJoin;
		/**
		 * 单据类型 201 一般交易出库单 202 B2B交易出库单 502 换货出库单 503 补发出库单
		 */
		@ApiField("order_type")
		private Long orderType;
		/**
		 * 外部业务编码，消息ID，用于去重，一个合作伙伴中要求唯一，多次确认时，每次传入要求唯一
		 */
		@ApiField("out_biz_code")
		private String outBizCode;
		/**
		 * 仓储订单编码
		 */
		@ApiField("store_order_code")
		private String storeOrderCode;
		/**
		 * 系统自动生成
		 */
		@ApiListField("tms_orders")
		@ApiField("tms_orders_wlb_wms_consign_order_confirm")
		private List<TmsOrdersWlbWmsConsignOrderConfirm> tmsOrders;
	
		public Long getConfirmType() {
			return this.confirmType;
		}
		public void setConfirmType(Long confirmType) {
			this.confirmType = confirmType;
		}
		public List<InvoinceConfirmsWlbWmsConsignOrderConfirm> getInvoinceConfirms() {
			return this.invoinceConfirms;
		}
		public void setInvoinceConfirms(List<InvoinceConfirmsWlbWmsConsignOrderConfirm> invoinceConfirms) {
			this.invoinceConfirms = invoinceConfirms;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getOrderConfirmTime() {
			return this.orderConfirmTime;
		}
		public void setOrderConfirmTime(String orderConfirmTime) {
			this.orderConfirmTime = orderConfirmTime;
		}
		public String getOrderJoin() {
			return this.orderJoin;
		}
		public void setOrderJoin(String orderJoin) {
			this.orderJoin = orderJoin;
		}
		public Long getOrderType() {
			return this.orderType;
		}
		public void setOrderType(Long orderType) {
			this.orderType = orderType;
		}
		public String getOutBizCode() {
			return this.outBizCode;
		}
		public void setOutBizCode(String outBizCode) {
			this.outBizCode = outBizCode;
		}
		public String getStoreOrderCode() {
			return this.storeOrderCode;
		}
		public void setStoreOrderCode(String storeOrderCode) {
			this.storeOrderCode = storeOrderCode;
		}
		public List<TmsOrdersWlbWmsConsignOrderConfirm> getTmsOrders() {
			return this.tmsOrders;
		}
		public void setTmsOrders(List<TmsOrdersWlbWmsConsignOrderConfirm> tmsOrders) {
			this.tmsOrders = tmsOrders;
		}
	}
	

}