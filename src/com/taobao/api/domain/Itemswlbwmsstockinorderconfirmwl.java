package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Itemswlbwmsstockinorderconfirmwl extends TaobaoObject {

	private static final long serialVersionUID = 2522588845311389224L;

	/**
	 * WMS批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 商品过期日期YYYY-MM-DD
	 */
	@ApiField("due_date")
	private String dueDate;

	/**
	 * 库存类型 1 正品，101 残次，102 机损，103 箱损，201 冻结库存，301 在途库存
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
	 * 商品生产日期 YYYY-MM-DD
	 */
	@ApiField("produce_date")
	private String produceDate;

	/**
	 * 入库数量
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
