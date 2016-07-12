package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 面单详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillDetailQueryInfo extends TaobaoObject {

	private static final long serialVersionUID = 4547465216319196551L;

	/**
	 * 收货人地址
	 */
	@ApiField("consignee_address")
	private WaybillAddress consigneeAddress;

	/**
	 * 包裹对应的派件（收件）物流服务商网点（分支机构）代码
	 */
	@ApiField("consignee_branch_code")
	private String consigneeBranchCode;

	/**
	 * 包裹对应的派件（收件）物流服务商网点（分支机构）名称
	 */
	@ApiField("consignee_branch_name")
	private String consigneeBranchName;

	/**
	 * 收件人姓名
	 */
	@ApiField("consignee_name")
	private String consigneeName;

	/**
	 * 收件人联系方式
	 */
	@ApiField("consignee_phone")
	private String consigneePhone;

	/**
	 * 物流商编码CODE
	 */
	@ApiField("cp_code")
	private String cpCode;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 最后一次打印时间
	 */
	@ApiField("last_print_time")
	private Date lastPrintTime;

	/**
	 * 物流服务能力集合
	 */
	@ApiListField("logistics_service_list")
	@ApiField("logistics_service")
	private List<LogisticsService> logisticsServiceList;

	/**
	 * 集包地、目的地中心代码。打印时根据该 code 生成目的地中心的条码，条码生成的算法与对应的电子面单条码一致
	 */
	@ApiField("package_center_code")
	private String packageCenterCode;

	/**
	 * 集包地、目的地中心名称
	 */
	@ApiField("package_center_name")
	private String packageCenterName;

	/**
	 * ERP订单号或包裹号
	 */
	@ApiField("package_id")
	private String packageId;

	/**
	 * 包裹里面的商品类型
	 */
	@ApiListField("package_items")
	@ApiField("package_item")
	private List<PackageItem> packageItems;

	/**
	 * 揽收时间
	 */
	@ApiField("pickup_time")
	private Date pickupTime;

	/**
	 * 打印配置项
	 */
	@ApiField("print_config")
	private String printConfig;

	/**
	 * 打印次数
	 */
	@ApiField("print_count")
	private Long printCount;

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
	 * 发货地址
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
	 * 大头笔信息
	 */
	@ApiField("short_address")
	private String shortAddress;

	/**
	 * 签收时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 面单状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 交易订单列表
	 */
	@ApiListField("trade_order_list")
	@ApiField("string")
	private List<String> tradeOrderList;

	/**
	 * 包裹重量 单位为G(克)
	 */
	@ApiField("volume")
	private Long volume;

	/**
	 * 电子面单信息
	 */
	@ApiField("waybill_code")
	private String waybillCode;

	/**
	 * 包裹体积 单位为ML(毫升)或立方厘米
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

	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastPrintTime() {
		return this.lastPrintTime;
	}
	public void setLastPrintTime(Date lastPrintTime) {
		this.lastPrintTime = lastPrintTime;
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

	public Date getPickupTime() {
		return this.pickupTime;
	}
	public void setPickupTime(Date pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getPrintConfig() {
		return this.printConfig;
	}
	public void setPrintConfig(String printConfig) {
		this.printConfig = printConfig;
	}

	public Long getPrintCount() {
		return this.printCount;
	}
	public void setPrintCount(Long printCount) {
		this.printCount = printCount;
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

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
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
