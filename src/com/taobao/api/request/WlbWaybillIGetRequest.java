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
import com.taobao.api.response.WlbWaybillIGetResponse;

/**
 * TOP API: taobao.wlb.waybill.i.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.24
 */
public class WlbWaybillIGetRequest extends BaseTaobaoRequest<WlbWaybillIGetResponse> {
	
	

	/** 
	* 面单申请
	 */
	private String waybillApplyNewRequest;

	public void setWaybillApplyNewRequest(String waybillApplyNewRequest) {
		this.waybillApplyNewRequest = waybillApplyNewRequest;
	}

	public void setWaybillApplyNewRequest(WaybillApplyNewRequest waybillApplyNewRequest) {
		this.waybillApplyNewRequest = new JSONWriter(false,true).write(waybillApplyNewRequest);
	}

	public String getWaybillApplyNewRequest() {
		return this.waybillApplyNewRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_apply_new_request", this.waybillApplyNewRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillIGetResponse> getResponseClass() {
		return WlbWaybillIGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 收\发货地址
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WaybillAddress extends TaobaoObject {
		private static final long serialVersionUID = 7881642663147124549L;
		/**
		 * 详细地址
		 */
		@ApiField("address_detail")
		private String addressDetail;
		/**
		 * 区名称（三级地址）
		 */
		@ApiField("area")
		private String area;
		/**
		 * 市名称（二级地址）
		 */
		@ApiField("city")
		private String city;
		/**
		 * 省名称（一级地址）
		 */
		@ApiField("province")
		private String province;
		/**
		 * 街道\镇名称（四级地址）
		 */
		@ApiField("town")
		private String town;
	
		public String getAddressDetail() {
			return this.addressDetail;
		}
		public void setAddressDetail(String addressDetail) {
			this.addressDetail = addressDetail;
		}
		public String getArea() {
			return this.area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getProvince() {
			return this.province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public String getTown() {
			return this.town;
		}
		public void setTown(String town) {
			this.town = town;
		}
	}
	
	/**
	 * 包裹里面的商品名称
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PackageItem extends TaobaoObject {
		private static final long serialVersionUID = 7568674513513519152L;
		/**
		 * 商品数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 商品名称
		 */
		@ApiField("item_name")
		private String itemName;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
	}
	
	/**
	 * 物流服务能力集合
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LogisticsService extends TaobaoObject {
		private static final long serialVersionUID = 3245651751632415798L;
		/**
		 * 服务编码
		 */
		@ApiField("service_code")
		private String serviceCode;
		/**
		 * 服务类型值，json格式表示
		 */
		@ApiField("service_value4_json")
		private String serviceValue4Json;
	
		public String getServiceCode() {
			return this.serviceCode;
		}
		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}
		public String getServiceValue4Json() {
			return this.serviceValue4Json;
		}
		public void setServiceValue4Json(String serviceValue4Json) {
			this.serviceValue4Json = serviceValue4Json;
		}
	}
	
	/**
	 * 订单数据
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TradeOrderInfo extends TaobaoObject {
		private static final long serialVersionUID = 3467425871931757587L;
		/**
		 * 收\发货地址
		 */
		@ApiField("consignee_address")
		private WaybillAddress consigneeAddress;
		/**
		 * 收货人
		 */
		@ApiField("consignee_name")
		private String consigneeName;
		/**
		 * 收货人联系方式
		 */
		@ApiField("consignee_phone")
		private String consigneePhone;
		/**
		 * 物流服务能力集合
		 */
		@ApiListField("logistics_service_list")
		@ApiField("logistics_service")
		private List<LogisticsService> logisticsServiceList;
		/**
		 * 订单渠道
		 */
		@ApiField("order_channels_type")
		private String orderChannelsType;
		/**
		 * 包裹号(或者ERP订单号)
		 */
		@ApiField("package_id")
		private String packageId;
		/**
		 * 包裹里面的商品名称
		 */
		@ApiListField("package_items")
		@ApiField("package_item")
		private List<PackageItem> packageItems;
		/**
		 * 快递服务产品类型编码
		 */
		@ApiField("product_type")
		private String productType;
		/**
		 * 使用者ID
		 */
		@ApiField("real_user_id")
		private Long realUserId;
		/**
		 * 发货人姓名
		 */
		@ApiField("send_name")
		private String sendName;
		/**
		 * 发货人联系方式
		 */
		@ApiField("send_phone")
		private String sendPhone;
		/**
		 * 交易订单列表
		 */
		@ApiListField("trade_order_list")
		@ApiField("string")
		private List<String> tradeOrderList;
		/**
		 * 包裹体积（立方厘米）
		 */
		@ApiField("volume")
		private Long volume;
		/**
		 * 包裹重量（克）
		 */
		@ApiField("weight")
		private Long weight;
	
		public WaybillAddress getConsigneeAddress() {
			return this.consigneeAddress;
		}
		public void setConsigneeAddress(WaybillAddress consigneeAddress) {
			this.consigneeAddress = consigneeAddress;
		}
		public String getConsigneeName() {
			return this.consigneeName;
		}
		public void setConsigneeName(String consigneeName) {
			this.consigneeName = consigneeName;
		}
		public String getConsigneePhone() {
			return this.consigneePhone;
		}
		public void setConsigneePhone(String consigneePhone) {
			this.consigneePhone = consigneePhone;
		}
		public List<LogisticsService> getLogisticsServiceList() {
			return this.logisticsServiceList;
		}
		public void setLogisticsServiceList(List<LogisticsService> logisticsServiceList) {
			this.logisticsServiceList = logisticsServiceList;
		}
		public String getOrderChannelsType() {
			return this.orderChannelsType;
		}
		public void setOrderChannelsType(String orderChannelsType) {
			this.orderChannelsType = orderChannelsType;
		}
		public String getPackageId() {
			return this.packageId;
		}
		public void setPackageId(String packageId) {
			this.packageId = packageId;
		}
		public List<PackageItem> getPackageItems() {
			return this.packageItems;
		}
		public void setPackageItems(List<PackageItem> packageItems) {
			this.packageItems = packageItems;
		}
		public String getProductType() {
			return this.productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		public Long getRealUserId() {
			return this.realUserId;
		}
		public void setRealUserId(Long realUserId) {
			this.realUserId = realUserId;
		}
		public String getSendName() {
			return this.sendName;
		}
		public void setSendName(String sendName) {
			this.sendName = sendName;
		}
		public String getSendPhone() {
			return this.sendPhone;
		}
		public void setSendPhone(String sendPhone) {
			this.sendPhone = sendPhone;
		}
		public List<String> getTradeOrderList() {
			return this.tradeOrderList;
		}
		public void setTradeOrderList(List<String> tradeOrderList) {
			this.tradeOrderList = tradeOrderList;
		}
		public Long getVolume() {
			return this.volume;
		}
		public void setVolume(Long volume) {
			this.volume = volume;
		}
		public Long getWeight() {
			return this.weight;
		}
		public void setWeight(Long weight) {
			this.weight = weight;
		}
	}
	
	/**
	 * 面单申请
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WaybillApplyNewRequest extends TaobaoObject {
		private static final long serialVersionUID = 5382992191672755298L;
		/**
		 * 物流服务商编码
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 收\发货地址
		 */
		@ApiField("shipping_address")
		private WaybillAddress shippingAddress;
		/**
		 * 订单数据
		 */
		@ApiListField("trade_order_info_cols")
		@ApiField("trade_order_info")
		private List<TradeOrderInfo> tradeOrderInfoCols;
	
		public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public WaybillAddress getShippingAddress() {
			return this.shippingAddress;
		}
		public void setShippingAddress(WaybillAddress shippingAddress) {
			this.shippingAddress = shippingAddress;
		}
		public List<TradeOrderInfo> getTradeOrderInfoCols() {
			return this.tradeOrderInfoCols;
		}
		public void setTradeOrderInfoCols(List<TradeOrderInfo> tradeOrderInfoCols) {
			this.tradeOrderInfoCols = tradeOrderInfoCols;
		}
	}
	

}