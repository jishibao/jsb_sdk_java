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
import com.taobao.api.response.WlbWmsUnknownPackageUploadResponse;

/**
 * TOP API: taobao.wlb.wms.unknown.package.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.25
 */
public class WlbWmsUnknownPackageUploadRequest extends BaseTaobaoRequest<WlbWmsUnknownPackageUploadResponse> {
	
	

	/** 
	* null
	 */
	private String request;

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRequest(Struct request) {
		this.request = new JSONWriter(false,true).write(request);
	}

	public String getRequest() {
		return this.request;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.unknown.package.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("request", this.request);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsUnknownPackageUploadResponse> getResponseClass() {
		return WlbWmsUnknownPackageUploadResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 包裹商品列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PackageItem extends TaobaoObject {
		private static final long serialVersionUID = 2459288347942834757L;
		/**
		 * 商家商品编码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 货品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 包裹内商品数量
		 */
		@ApiField("item_qty")
		private String itemQty;
	
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
		public String getItemQty() {
			return this.itemQty;
		}
		public void setItemQty(String itemQty) {
			this.itemQty = itemQty;
		}
	}
	
	/**
	 * null
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Struct extends TaobaoObject {
		private static final long serialVersionUID = 8149553573119531725L;
		/**
		 * 创建时间
		 */
		@ApiField("create_time")
		private String createTime;
		/**
		 * 发货的运单号
		 */
		@ApiField("mail_no")
		private String mailNo;
		/**
		 * 包裹对应的原ERP订单号
		 */
		@ApiField("order_code")
		private String orderCode;
		/**
		 * 消息唯一标识
		 */
		@ApiField("package_id")
		private String packageId;
		/**
		 * 包裹商品列表
		 */
		@ApiListField("package_item_list")
		@ApiField("package_item")
		private List<PackageItem> packageItemList;
		/**
		 * 收到包裹仓库的仓库编码
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * 包裹对应的原仓库作业订单
		 */
		@ApiField("store_order_code")
		private String storeOrderCode;
		/**
		 * 发货的配送公司
		 */
		@ApiField("tms_code")
		private String tmsCode;
	
		public String getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
		public String getMailNo() {
			return this.mailNo;
		}
		public void setMailNo(String mailNo) {
			this.mailNo = mailNo;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getPackageId() {
			return this.packageId;
		}
		public void setPackageId(String packageId) {
			this.packageId = packageId;
		}
		public List<PackageItem> getPackageItemList() {
			return this.packageItemList;
		}
		public void setPackageItemList(List<PackageItem> packageItemList) {
			this.packageItemList = packageItemList;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public String getStoreOrderCode() {
			return this.storeOrderCode;
		}
		public void setStoreOrderCode(String storeOrderCode) {
			this.storeOrderCode = storeOrderCode;
		}
		public String getTmsCode() {
			return this.tmsCode;
		}
		public void setTmsCode(String tmsCode) {
			this.tmsCode = tmsCode;
		}
	}
	

}