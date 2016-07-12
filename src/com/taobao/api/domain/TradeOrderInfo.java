package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 订单数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TradeOrderInfo extends TaobaoObject {

	private static final long serialVersionUID = 1274317884973392338L;

	/**
	 * 是否阿里系订单
	 */
	@ApiField("ali_order")
	private Boolean aliOrder;

	/**
	 * 收货人地址
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
	 * 订单渠道
	 */
	@ApiField("order_channels_type")
	private String orderChannelsType;

	/**
	 * 订单渠道来源
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 包裹号(或者ERP订单号)
	 */
	@ApiField("package_id")
	private String packageId;

	/**
	 * 包裹中的商品类型
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
	 * 大头笔
	 */
	@ApiField("short_address")
	private String shortAddress;

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
	 * 面单号
	 */
	@ApiField("waybill_code")
	private String waybillCode;

	/**
	 * 包裹重量（克）
	 */
	@ApiField("weight")
	private Long weight;


	public Boolean getAliOrder() {
		return this.aliOrder;
	}
	public void setAliOrder(Boolean aliOrder) {
		this.aliOrder = aliOrder;
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

	public String getShortAddress() {
		return this.shortAddress;
	}
	public void setShortAddress(String shortAddress) {
		this.shortAddress = shortAddress;
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
