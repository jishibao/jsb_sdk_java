package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流宝商品库存
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemInventory extends TaobaoObject {

	private static final long serialVersionUID = 3881573762689473417L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 锁定库存数量
	 */
	@ApiField("lock_quantity")
	private Long lockQuantity;

	/**
	 * 库存数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * SELLALBE 可销售库存
DEFECTIVE 残次
JISHUN 机损
XIANGSHUN 箱损
FREEZE 冻结库存
ONROAD 在途库存
	 */
	@ApiField("type")
	private String type;


	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getLockQuantity() {
		return this.lockQuantity;
	}
	public void setLockQuantity(Long lockQuantity) {
		this.lockQuantity = lockQuantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
