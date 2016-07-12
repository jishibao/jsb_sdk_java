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
import com.taobao.api.response.CainiaoWaybillIiUpdateResponse;

/**
 * TOP API: cainiao.waybill.ii.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.07
 */
public class CainiaoWaybillIiUpdateRequest extends BaseTaobaoRequest<CainiaoWaybillIiUpdateResponse> {
	
	

	/** 
	* 更新请求信息
	 */
	private String paramWaybillCloudPrintUpdateRequest;

	public void setParamWaybillCloudPrintUpdateRequest(String paramWaybillCloudPrintUpdateRequest) {
		this.paramWaybillCloudPrintUpdateRequest = paramWaybillCloudPrintUpdateRequest;
	}

	public void setParamWaybillCloudPrintUpdateRequest(WaybillCloudPrintUpdateRequest paramWaybillCloudPrintUpdateRequest) {
		this.paramWaybillCloudPrintUpdateRequest = new JSONWriter(false,true).write(paramWaybillCloudPrintUpdateRequest);
	}

	public String getParamWaybillCloudPrintUpdateRequest() {
		return this.paramWaybillCloudPrintUpdateRequest;
	}

	public String getApiMethodName() {
		return "cainiao.waybill.ii.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_waybill_cloud_print_update_request", this.paramWaybillCloudPrintUpdateRequest);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillIiUpdateResponse> getResponseClass() {
		return CainiaoWaybillIiUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 商品
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Item extends TaobaoObject {
		private static final long serialVersionUID = 8123185929298893961L;
		/**
		 * 数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 名称
		 */
		@ApiField("name")
		private String name;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	/**
	 * 包裹信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class PackageInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 7474687782463925165L;
		/**
		 * 商品
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
		/**
		 * 体积
		 */
		@ApiField("volume")
		private Long volume;
		/**
		 * 重量
		 */
		@ApiField("weight")
		private Long weight;
	
		public List<Item> getItems() {
			return this.items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
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
	 * 地址
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class AddressDto extends TaobaoObject {
		private static final long serialVersionUID = 4532236117799172479L;
		/**
		 * 城市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 详细地址
		 */
		@ApiField("detail")
		private String detail;
		/**
		 * 区地址
		 */
		@ApiField("district")
		private String district;
		/**
		 * 省
		 */
		@ApiField("province")
		private String province;
		/**
		 * 街道
		 */
		@ApiField("town")
		private String town;
	
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDetail() {
			return this.detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getDistrict() {
			return this.district;
		}
		public void setDistrict(String district) {
			this.district = district;
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
	 * 收件信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class UserInfoDto extends TaobaoObject {
		private static final long serialVersionUID = 8373665682289727257L;
		/**
		 * 地址
		 */
		@ApiField("address")
		private AddressDto address;
		/**
		 * 手机号码
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 固定电话
		 */
		@ApiField("phone")
		private String phone;
	
		public AddressDto getAddress() {
			return this.address;
		}
		public void setAddress(AddressDto address) {
			this.address = address;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
	}
	
	/**
	 * 更新请求信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class WaybillCloudPrintUpdateRequest extends TaobaoObject {
		private static final long serialVersionUID = 3269351796343989954L;
		/**
		 * 物流公司CODE
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 物流服务内容
		 */
		@ApiField("logistics_services")
		private String logisticsServices;
		/**
		 * x
		 */
		@ApiField("object_id")
		private String objectId;
		/**
		 * 包裹信息
		 */
		@ApiField("package_info")
		private PackageInfoDto packageInfo;
		/**
		 * 收件信息
		 */
		@ApiField("recipient")
		private UserInfoDto recipient;
		/**
		 * 发件信息
		 */
		@ApiField("sender")
		private UserInfoDto sender;
		/**
		 * 模板URL
		 */
		@ApiField("template_url")
		private String templateUrl;
		/**
		 * 面单号
		 */
		@ApiField("waybill_code")
		private String waybillCode;
	
		public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public String getLogisticsServices() {
			return this.logisticsServices;
		}
		public void setLogisticsServices(String logisticsServices) {
			this.logisticsServices = logisticsServices;
		}
		public String getObjectId() {
			return this.objectId;
		}
		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}
		public PackageInfoDto getPackageInfo() {
			return this.packageInfo;
		}
		public void setPackageInfo(PackageInfoDto packageInfo) {
			this.packageInfo = packageInfo;
		}
		public UserInfoDto getRecipient() {
			return this.recipient;
		}
		public void setRecipient(UserInfoDto recipient) {
			this.recipient = recipient;
		}
		public UserInfoDto getSender() {
			return this.sender;
		}
		public void setSender(UserInfoDto sender) {
			this.sender = sender;
		}
		public String getTemplateUrl() {
			return this.templateUrl;
		}
		public void setTemplateUrl(String templateUrl) {
			this.templateUrl = templateUrl;
		}
		public String getWaybillCode() {
			return this.waybillCode;
		}
		public void setWaybillCode(String waybillCode) {
			this.waybillCode = waybillCode;
		}
	}
	

}