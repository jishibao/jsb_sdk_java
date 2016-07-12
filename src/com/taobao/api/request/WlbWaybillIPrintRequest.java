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
import com.taobao.api.response.WlbWaybillIPrintResponse;

/**
 * TOP API: taobao.wlb.waybill.i.print request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.22
 */
public class WlbWaybillIPrintRequest extends BaseTaobaoRequest<WlbWaybillIPrintResponse> {
	
	

	/** 
	* 打印请求
	 */
	private String waybillApplyPrintCheckRequest;

	public void setWaybillApplyPrintCheckRequest(String waybillApplyPrintCheckRequest) {
		this.waybillApplyPrintCheckRequest = waybillApplyPrintCheckRequest;
	}

	public void setWaybillApplyPrintCheckRequest(WaybillApplyPrintCheckRequest waybillApplyPrintCheckRequest) {
		this.waybillApplyPrintCheckRequest = new JSONWriter(false,true).write(waybillApplyPrintCheckRequest);
	}

	public String getWaybillApplyPrintCheckRequest() {
		return this.waybillApplyPrintCheckRequest;
	}

	public String getApiMethodName() {
		return "taobao.wlb.waybill.i.print";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("waybill_apply_print_check_request", this.waybillApplyPrintCheckRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWaybillIPrintResponse> getResponseClass() {
		return WlbWaybillIPrintResponse.class;
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
		private static final long serialVersionUID = 3378947761354158574L;
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
		 * 末级地址
		 */
		@ApiField("division_id")
		private Long divisionId;
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
		public Long getDivisionId() {
			return this.divisionId;
		}
		public void setDivisionId(Long divisionId) {
			this.divisionId = divisionId;
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
	 * 物流服务能力集合
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class LogisticsService extends TaobaoObject {
		private static final long serialVersionUID = 6896174654937567667L;
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
	 * 面单详情信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PrintCheckInfo extends TaobaoObject {
		private static final long serialVersionUID = 3236787657354227359L;
		/**
		 * 收\发货地址
		 */
		@ApiField("consignee_address")
		private WaybillAddress consigneeAddress;
		/**
		 * 收货网点编码
		 */
		@ApiField("consignee_branch_code")
		private String consigneeBranchCode;
		/**
		 * 收货网点信息
		 */
		@ApiField("consignee_branch_name")
		private String consigneeBranchName;
		/**
		 * 收件人姓名
		 */
		@ApiField("consignee_name")
		private String consigneeName;
		/**
		 * consigneePhone
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
		 * 集包地、目的地中心代码。打 印时根据该 code 生成目的地 中心的条码，条码生成的算法 与对应的电子面单条码一致
		 */
		@ApiField("package_center_code")
		private String packageCenterCode;
		/**
		 * 集包地、目的地中心名称
		 */
		@ApiField("package_center_name")
		private String packageCenterName;
		/**
		 * 打标设置字段，直接传给ali-lodop。不用管具体含义。
		 */
		@ApiField("print_config")
		private String printConfig;
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
		 * 发件人姓名
		 */
		@ApiField("send_name")
		private String sendName;
		/**
		 * 发件人联系方式
		 */
		@ApiField("send_phone")
		private String sendPhone;
		/**
		 * 收\发货地址
		 */
		@ApiField("shipping_address")
		private WaybillAddress shippingAddress;
		/**
		 * 发货网点编码
		 */
		@ApiField("shipping_branch_code")
		private String shippingBranchCode;
		/**
		 * 发货网点信息
		 */
		@ApiField("shipping_branch_name")
		private String shippingBranchName;
		/**
		 * 拣货规则（大头笔信息）
		 */
		@ApiField("short_address")
		private String shortAddress;
		/**
		 * 包裹体积 单位为ML(毫升)或立方厘米
		 */
		@ApiField("volume")
		private Long volume;
		/**
		 * 电子面单单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
		/**
		 * 包裹重量 单位为G(克)
		 */
		@ApiField("weight")
		private Long weight;
	
		public WaybillAddress getConsigneeAddress() {
			return this.consigneeAddress;
		}
		public void setConsigneeAddress(WaybillAddress consigneeAddress) {
			this.consigneeAddress = consigneeAddress;
		}
		public String getConsigneeBranchCode() {
			return this.consigneeBranchCode;
		}
		public void setConsigneeBranchCode(String consigneeBranchCode) {
			this.consigneeBranchCode = consigneeBranchCode;
		}
		public String getConsigneeBranchName() {
			return this.consigneeBranchName;
		}
		public void setConsigneeBranchName(String consigneeBranchName) {
			this.consigneeBranchName = consigneeBranchName;
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
		public String getPackageCenterCode() {
			return this.packageCenterCode;
		}
		public void setPackageCenterCode(String packageCenterCode) {
			this.packageCenterCode = packageCenterCode;
		}
		public String getPackageCenterName() {
			return this.packageCenterName;
		}
		public void setPackageCenterName(String packageCenterName) {
			this.packageCenterName = packageCenterName;
		}
		public String getPrintConfig() {
			return this.printConfig;
		}
		public void setPrintConfig(String printConfig) {
			this.printConfig = printConfig;
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
		public WaybillAddress getShippingAddress() {
			return this.shippingAddress;
		}
		public void setShippingAddress(WaybillAddress shippingAddress) {
			this.shippingAddress = shippingAddress;
		}
		public String getShippingBranchCode() {
			return this.shippingBranchCode;
		}
		public void setShippingBranchCode(String shippingBranchCode) {
			this.shippingBranchCode = shippingBranchCode;
		}
		public String getShippingBranchName() {
			return this.shippingBranchName;
		}
		public void setShippingBranchName(String shippingBranchName) {
			this.shippingBranchName = shippingBranchName;
		}
		public String getShortAddress() {
			return this.shortAddress;
		}
		public void setShortAddress(String shortAddress) {
			this.shortAddress = shortAddress;
		}
		public Long getVolume() {
			return this.volume;
		}
		public void setVolume(Long volume) {
			this.volume = volume;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}
		public Long getWeight() {
			return this.weight;
		}
		public void setWeight(Long weight) {
			this.weight = weight;
		}
	}
	
	/**
	 * 打印请求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WaybillApplyPrintCheckRequest extends TaobaoObject {
		private static final long serialVersionUID = 3484336511755795677L;
		/**
		 * 物流服务商Code
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 面单详情信息
		 */
		@ApiListField("print_check_info_cols")
		@ApiField("print_check_info")
		private List<PrintCheckInfo> printCheckInfoCols;
	
		public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public List<PrintCheckInfo> getPrintCheckInfoCols() {
			return this.printCheckInfoCols;
		}
		public void setPrintCheckInfoCols(List<PrintCheckInfo> printCheckInfoCols) {
			this.printCheckInfoCols = printCheckInfoCols;
		}
	}
	

}