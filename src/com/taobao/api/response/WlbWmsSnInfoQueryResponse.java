package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.sn.info.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsSnInfoQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6624273568881821348L;

	/** 
	 * 接口返回
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
	 * SN信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Sninfo extends TaobaoObject {
		private static final long serialVersionUID = 7563432352543697792L;
		/**
		 * 库存类型（1 可销售库存(正品) 101 残次 102 机损 103 箱损201 冻结库存）
		 */
		@ApiField("inventory_type")
		private Long inventoryType;
		/**
		 * 商家对商品的编码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * sn编码
		 */
		@ApiField("sn_code")
		private String snCode;
	
		public Long getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(Long inventoryType) {
			this.inventoryType = inventoryType;
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
		public String getSnCode() {
			return this.snCode;
		}
		public void setSnCode(String snCode) {
			this.snCode = snCode;
		}
	}
	
	/**
	 * SN信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Sninfolist extends TaobaoObject {
		private static final long serialVersionUID = 1499424848612418267L;
		/**
		 * SN信息
		 */
		@ApiField("sn_info")
		private Sninfo snInfo;
	
		public Sninfo getSnInfo() {
			return this.snInfo;
		}
		public void setSnInfo(Sninfo snInfo) {
			this.snInfo = snInfo;
		}
	}
	
	/**
	 * 接口返回
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 7621145288923351967L;
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
		 * SN信息列表
		 */
		@ApiListField("sn_info_list")
		@ApiField("sninfolist")
		private List<Sninfolist> snInfoList;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
		/**
		 * 总条数
		 */
		@ApiField("total_count")
		private Long totalCount;
	
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
		public List<Sninfolist> getSnInfoList() {
			return this.snInfoList;
		}
		public void setSnInfoList(List<Sninfolist> snInfoList) {
			this.snInfoList = snInfoList;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
		public Long getTotalCount() {
			return this.totalCount;
		}
		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
	}
	


}
