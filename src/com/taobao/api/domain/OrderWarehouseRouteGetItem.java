package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OrderWarehouseRouteGetItem extends TaobaoObject {

	private static final long serialVersionUID = 5877929825919992499L;

	/**
	 * 菜鸟订单编码 当订单路由到菜鸟仓发货时，生成此单号。等待路由仓或由商家仓发货的订单，此单号为空。格式LBX+数字
	 */
	@ApiField("cn_order_code")
	private String cnOrderCode;

	/**
	 * 通知仓库此订单明细的商品应发数量
	 */
	@ApiField("item_qty")
	private Long itemQty;

	/**
	 * ERP订单明细编码或者子交易单号
	 */
	@ApiField("order_item_id")
	private String orderItemId;

	/**
	 * 订单路由状态 状态值： WAIT_ROUTE 待路由仓 ROUTE_TO_CN 路由到菜鸟仓发货 ROUTE_TO_ERP 路由到商家仓发货。 STOP_ROUTE 终止分仓，如订单已取消时，不再发货。 注：待路由仓状态表示未做路由，不确定由哪个仓库发货，可与5分钟后再次查询
	 */
	@ApiField("rout_status")
	private String routStatus;

	/**
	 * 仓库编码 当订单路由到菜鸟仓发货时输出菜鸟仓编码。等待路由仓或由商家仓发货的订单，此内容为空。
	 */
	@ApiField("store_code")
	private String storeCode;


	public String getCnOrderCode() {
		return this.cnOrderCode;
	}
	public void setCnOrderCode(String cnOrderCode) {
		this.cnOrderCode = cnOrderCode;
	}

	public Long getItemQty() {
		return this.itemQty;
	}
	public void setItemQty(Long itemQty) {
		this.itemQty = itemQty;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}
	public void setOrderItemIdString(String orderItemId) {
		this.orderItemId = orderItemId;
	}
	

	public String getRoutStatus() {
		return this.routStatus;
	}
	public void setRoutStatus(String routStatus) {
		this.routStatus = routStatus;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
