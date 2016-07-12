package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemsWlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 6481387595825211512L;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 失效日期
	 */
	@ApiField("due_date")
	private String dueDate;

	/**
	 * 库存类型 1 可销售库存  101 类型用来定义残次品  201  冻结类型库存 301 在途库存
	 */
	@ApiField("inventory_type")
	private Long inventoryType;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 生产批号
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 生产日期
	 */
	@ApiField("produce_date")
	private String produceDate;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private Long quantity;


	public String getBatchCode() {
		return this.batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Long getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(Long inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getProduceCode() {
		return this.produceCode;
	}
	public void setProduceCode(String produceCode) {
		this.produceCode = produceCode;
	}

	public String getProduceDate() {
		return this.produceDate;
	}
	public void setProduceDate(String produceDate) {
		this.produceDate = produceDate;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
