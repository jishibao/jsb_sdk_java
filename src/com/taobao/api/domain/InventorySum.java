package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品库存对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class InventorySum extends TaobaoObject {

	private static final long serialVersionUID = 5182647863628932452L;

	/**
	 * 库存类型：
1：正常 
2：损坏 
3：冻结 
10：质押 
11-20:商家自定义
	 */
	@ApiField("inventory_type")
	private Long inventoryType;

	/**
	 * 库存类型名称
	 */
	@ApiField("inventory_type_name")
	private String inventoryTypeName;

	/**
	 * 总占用数量
	 */
	@ApiField("occupy_quantity")
	private Long occupyQuantity;

	/**
	 * 总物理库存数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 总预扣数量
	 */
	@ApiField("reserve_quantity")
	private Long reserveQuantity;

	/**
	 * 商品商家编码
	 */
	@ApiField("sc_item_code")
	private String scItemCode;

	/**
	 * 商品后端ID，如果有传sc_item_code,参数可以为0
	 */
	@ApiField("sc_item_id")
	private Long scItemId;

	/**
	 * 商家仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;


	public Long getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(Long inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getInventoryTypeName() {
		return this.inventoryTypeName;
	}
	public void setInventoryTypeName(String inventoryTypeName) {
		this.inventoryTypeName = inventoryTypeName;
	}

	public Long getOccupyQuantity() {
		return this.occupyQuantity;
	}
	public void setOccupyQuantity(Long occupyQuantity) {
		this.occupyQuantity = occupyQuantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getReserveQuantity() {
		return this.reserveQuantity;
	}
	public void setReserveQuantity(Long reserveQuantity) {
		this.reserveQuantity = reserveQuantity;
	}

	public String getScItemCode() {
		return this.scItemCode;
	}
	public void setScItemCode(String scItemCode) {
		this.scItemCode = scItemCode;
	}

	public Long getScItemId() {
		return this.scItemId;
	}
	public void setScItemId(Long scItemId) {
		this.scItemId = scItemId;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
