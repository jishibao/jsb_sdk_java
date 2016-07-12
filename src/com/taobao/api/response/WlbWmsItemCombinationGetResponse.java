package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.item.combination.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsItemCombinationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3777386187899777914L;

	/** 
	 * 接口返回结果
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
	 * 子货品
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubItem extends TaobaoObject {
		private static final long serialVersionUID = 4739177388612767226L;
		/**
		 * 子货品数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 子货品ID
		 */
		@ApiField("sc_item_id")
		private Long scItemId;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Long getScItemId() {
			return this.scItemId;
		}
		public void setScItemId(Long scItemId) {
			this.scItemId = scItemId;
		}
	}
	
	/**
	 * 子货品列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubItemList extends TaobaoObject {
		private static final long serialVersionUID = 8126436922936717621L;
		/**
		 * 子货品
		 */
		@ApiField("sub_item")
		private SubItem subItem;
	
		public SubItem getSubItem() {
			return this.subItem;
		}
		public void setSubItem(SubItem subItem) {
			this.subItem = subItem;
		}
	}
	
	/**
	 * 接口返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Result extends TaobaoObject {
		private static final long serialVersionUID = 3483871742685681847L;
		/**
		 * 子货品列表
		 */
		@ApiListField("sub_item_list")
		@ApiField("sub_item_list")
		private List<SubItemList> subItemList;
		/**
		 * 错误编码
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
	
		public List<SubItemList> getSubItemList() {
			return this.subItemList;
		}
		public void setSubItemList(List<SubItemList> subItemList) {
			this.subItemList = subItemList;
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
