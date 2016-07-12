package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemListWlbWmsInventoryStatusUpload extends TaobaoObject {

	private static final long serialVersionUID = 8584247669647638183L;

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
	 * 调整标示：0 增加 、1减少
	 */
	@ApiField("int_out_flag")
	private Long intOutFlag;

	/**
	 * 库存类型 1 正品，101 残次，102 机损，103 箱损，201 冻结库存，301 在途库存
	 */
	@ApiField("inventory_type")
	private Long inventoryType;

	/**
	 * 后端商品ID
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
	 * 商品生产日期 YYYY-MM-DD
	 */
	@ApiField("product_date")
	private String productDate;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 序列号
	 */
	@ApiField("sn_code")
	private String snCode;


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

	public Long getIntOutFlag() {
		return this.intOutFlag;
	}
	public void setIntOutFlag(Long intOutFlag) {
		this.intOutFlag = intOutFlag;
	}

	public Long getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(Long inventoryType) {
		this.inventoryType = inventoryType;
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

	public String getProductDate() {
		return this.productDate;
	}
	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSnCode() {
		return this.snCode;
	}
	public void setSnCode(String snCode) {
		this.snCode = snCode;
	}

}
