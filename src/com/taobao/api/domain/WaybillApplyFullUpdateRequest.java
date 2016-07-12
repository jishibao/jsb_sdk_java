package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 更新面单信息请求
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillApplyFullUpdateRequest extends TaobaoObject {

	private static final long serialVersionUID = 7188746871426283273L;

	/**
	 * TOP平台请求的ISV APPKEY
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 收货地址
	 */
	@ApiField("consignee_address")
	private WaybillAddress consigneeAddress;

	/**
	 * 收件人姓名
	 */
	@ApiField("consignee_name")
	private String consigneeName;

	/**
	 * 收件人电话
	 */
	@ApiField("consignee_phone")
	private String consigneePhone;

	/**
	 * 快递服务商CODE
	 */
	@ApiField("cp_code")
	private String cpCode;

	/**
	 * 快递服务商的ID
	 */
	@ApiField("cp_id")
	private Long cpId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 物流服务能力集合
	 */
	@ApiListField("logistics_service_list")
	@ApiField("logistics_service")
	private List<LogisticsService> logisticsServiceList;

	/**
	 * 订单渠道类型
	 */
	@ApiField("order_channels_type")
	private String orderChannelsType;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * ERP 订单号或包裹号
	 */
	@ApiField("package_id")
	private String packageId;

	/**
	 * 包裹内商品类型
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
	 * 申请者ID
	 */
	@ApiField("seller_id")
	private Long sellerId;

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
	 * 发货地址
	 */
	@ApiField("shipping_address")
	private WaybillAddress shippingAddress;

	/**
	 * 交易订单号（组合表示合并订单）
	 */
	@ApiListField("trade_order_list")
	@ApiField("string")
	private List<String> tradeOrderList;

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


	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

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

	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public Long getCpId() {
		return this.cpId;
	}
	public void setCpId(Long cpId) {
		this.cpId = cpId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
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

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
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
