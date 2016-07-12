package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.consign.inventory.occupancy response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsConsignInventoryOccupancyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2525125268986724279L;

	/** 
	 * 返回失败时，是否需求重试，为true时，建议系统自动重试
	 */
	@ApiField("is_retry")
	private Boolean isRetry;

	/** 
	 * 库存占用明细列表
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
	 * 错误码
	 */
	@ApiField("wl_error_code")
	private String wlErrorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("wl_error_msg")
	private String wlErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("wl_success")
	private String wlSuccess;


	public void setIsRetry(Boolean isRetry) {
		this.isRetry = isRetry;
	}
	public Boolean getIsRetry( ) {
		return this.isRetry;
	}

	public void setItemInventoryList(List<Iteminventorylist> itemInventoryList) {
		this.itemInventoryList = itemInventoryList;
	}
	public List<Iteminventorylist> getItemInventoryList( ) {
		return this.itemInventoryList;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode( ) {
		return this.orderCode;
	}

	public void setWlErrorCode(String wlErrorCode) {
		this.wlErrorCode = wlErrorCode;
	}
	public String getWlErrorCode( ) {
		return this.wlErrorCode;
	}

	public void setWlErrorMsg(String wlErrorMsg) {
		this.wlErrorMsg = wlErrorMsg;
	}
	public String getWlErrorMsg( ) {
		return this.wlErrorMsg;
	}

	public void setWlSuccess(String wlSuccess) {
		this.wlSuccess = wlSuccess;
	}
	public String getWlSuccess( ) {
		return this.wlSuccess;
	}
	
	/**
	 * 库存占用明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Iteminventory extends TaobaoObject {
		private static final long serialVersionUID = 7191155813834138555L;
		/**
		 * 菜鸟组合货品ID
		 */
		@ApiField("comb_item_id")
		private String combItemId;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 菜鸟货品编码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 菜鸟货品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 占用库存数量
		 */
		@ApiField("item_ocpy_qty")
		private Long itemOcpyQty;
		/**
		 * 交易编码
		 */
		@ApiField("order_source_code")
		private String orderSourceCode;
		/**
		 * 仓库编码
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * 子交易编码
		 */
		@ApiField("sub_source_code")
		private String subSourceCode;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public String getCombItemId() {
			return this.combItemId;
		}
		public void setCombItemId(String combItemId) {
			this.combItemId = combItemId;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
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
		public Long getItemOcpyQty() {
			return this.itemOcpyQty;
		}
		public void setItemOcpyQty(Long itemOcpyQty) {
			this.itemOcpyQty = itemOcpyQty;
		}
		public String getOrderSourceCode() {
			return this.orderSourceCode;
		}
		public void setOrderSourceCode(String orderSourceCode) {
			this.orderSourceCode = orderSourceCode;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public String getSubSourceCode() {
			return this.subSourceCode;
		}
		public void setSubSourceCode(String subSourceCode) {
			this.subSourceCode = subSourceCode;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	
	/**
	 * 库存占用明细列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Iteminventorylist extends TaobaoObject {
		private static final long serialVersionUID = 8719688644635598156L;
		/**
		 * 库存占用明细
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
	


}
