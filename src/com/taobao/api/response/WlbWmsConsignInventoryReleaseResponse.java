package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.consign.inventory.release response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsConsignInventoryReleaseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8422721684814872171L;

	/** 
	 * 接口返回model
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}
	
	/**
	 * 库存占用明细
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Iteminventory extends TaobaoObject {
		private static final long serialVersionUID = 4277545375244695665L;
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
		 * 释放库存数量
		 */
		@ApiField("item_release_qty")
		private Long itemReleaseQty;
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
		public Long getItemReleaseQty() {
			return this.itemReleaseQty;
		}
		public void setItemReleaseQty(Long itemReleaseQty) {
			this.itemReleaseQty = itemReleaseQty;
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
		private static final long serialVersionUID = 6648536187854943655L;
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
	
	/**
	 * 接口返回model
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3399337983694287956L;
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
		private Boolean wlSuccess;
	
		public Boolean getIsRetry() {
			return this.isRetry;
		}
		public void setIsRetry(Boolean isRetry) {
			this.isRetry = isRetry;
		}
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
		public String getWlErrorCode() {
			return this.wlErrorCode;
		}
		public void setWlErrorCode(String wlErrorCode) {
			this.wlErrorCode = wlErrorCode;
		}
		public String getWlErrorMsg() {
			return this.wlErrorMsg;
		}
		public void setWlErrorMsg(String wlErrorMsg) {
			this.wlErrorMsg = wlErrorMsg;
		}
		public Boolean getWlSuccess() {
			return this.wlSuccess;
		}
		public void setWlSuccess(Boolean wlSuccess) {
			this.wlSuccess = wlSuccess;
		}
	}
	


}
