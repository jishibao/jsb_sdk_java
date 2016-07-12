package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流宝订单商品
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbOrderItem extends TaobaoObject {

	private static final long serialVersionUID = 7737127199349719219L;

	/**
	 * 批次号备注
	 */
	@ApiField("batch_remark")
	private String batchRemark;

	/**
	 * 物流宝订单确认状态：
NO_NEED_CONFIRM--不需要确认
WAIT_CONFIRM--待确认
CONFIRMED--已确认
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	/**
	 * 外部实体id
	 */
	@ApiField("ext_entity_id")
	private String extEntityId;

	/**
	 * 外部实体类型
	 */
	@ApiField("ext_entity_type")
	private String extEntityType;

	/**
	 * 第一位标示是否为赠品
	 */
	@ApiField("flag")
	private Long flag;

	/**
	 * 订单商品id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * INVENTORY_TYPE_SELL 可销库存
INVENTORY_TYPE_IMPERFECTIONS 残次库存
INVENTORY_TYPE_FREEZE 冻结库存
INVENTORY_TYPE_ON_PASSAGE 在途库存
INVENTORY_TYPE_ENGINE_DAMAGE 机损
INVENTORY_TYPE_BOX_DAMAGE 箱损
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 订单商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 物流宝订单商品的物流宝商品id
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 订单商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品价格
	 */
	@ApiField("item_price")
	private Long itemPrice;

	/**
	 * 物流宝订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 物流宝订单id
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * 
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 子交易号
	 */
	@ApiField("order_sub_2code")
	private String orderSub2code;

	/**
	 * 订单号
	 */
	@ApiField("order_sub_code")
	private String orderSubCode;

	/**
	 * (1)其它: OTHER (2)淘宝交易: TAOBAO (3)调拨: ALLOCATION (4)盘点:CHECK (5)销售采购:PRUCHASE(6)其它交易：OTHER_TRADE
	 */
	@ApiField("order_sub_type")
	private String orderSubType;

	/**
	 * 订单商品图片url
	 */
	@ApiField("picture_url")
	private String pictureUrl;

	/**
	 * 计划数量
	 */
	@ApiField("plan_quantity")
	private Long planQuantity;

	/**
	 * 货主id
	 */
	@ApiField("provider_tp_id")
	private Long providerTpId;

	/**
	 * 货主nick
	 */
	@ApiField("provider_tp_nick")
	private String providerTpNick;

	/**
	 * 商品发布版本号
	 */
	@ApiField("publish_version")
	private Long publishVersion;

	/**
	 * 实际数量
	 */
	@ApiField("real_quantity")
	private Long realQuantity;

	/**
	 * 订单商品备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 订单商品用户id
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 订单商品用户昵称
	 */
	@ApiField("user_nick")
	private String userNick;


	public String getBatchRemark() {
		return this.batchRemark;
	}
	public void setBatchRemark(String batchRemark) {
		this.batchRemark = batchRemark;
	}

	public String getConfirmStatus() {
		return this.confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public String getExtEntityId() {
		return this.extEntityId;
	}
	public void setExtEntityId(String extEntityId) {
		this.extEntityId = extEntityId;
	}

	public String getExtEntityType() {
		return this.extEntityType;
	}
	public void setExtEntityType(String extEntityType) {
		this.extEntityType = extEntityType;
	}

	public Long getFlag() {
		return this.flag;
	}
	public void setFlag(Long flag) {
		this.flag = flag;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderSub2code() {
		return this.orderSub2code;
	}
	public void setOrderSub2code(String orderSub2code) {
		this.orderSub2code = orderSub2code;
	}

	public String getOrderSubCode() {
		return this.orderSubCode;
	}
	public void setOrderSubCode(String orderSubCode) {
		this.orderSubCode = orderSubCode;
	}

	public String getOrderSubType() {
		return this.orderSubType;
	}
	public void setOrderSubType(String orderSubType) {
		this.orderSubType = orderSubType;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public Long getPlanQuantity() {
		return this.planQuantity;
	}
	public void setPlanQuantity(Long planQuantity) {
		this.planQuantity = planQuantity;
	}

	public Long getProviderTpId() {
		return this.providerTpId;
	}
	public void setProviderTpId(Long providerTpId) {
		this.providerTpId = providerTpId;
	}

	public String getProviderTpNick() {
		return this.providerTpNick;
	}
	public void setProviderTpNick(String providerTpNick) {
		this.providerTpNick = providerTpNick;
	}

	public Long getPublishVersion() {
		return this.publishVersion;
	}
	public void setPublishVersion(Long publishVersion) {
		this.publishVersion = publishVersion;
	}

	public Long getRealQuantity() {
		return this.realQuantity;
	}
	public void setRealQuantity(Long realQuantity) {
		this.realQuantity = realQuantity;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
