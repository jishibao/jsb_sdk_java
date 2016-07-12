package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WmsInventoryQueryItem extends TaobaoObject {

	private static final long serialVersionUID = 7259953375485687947L;

	/**
	 * 库存批次号，type=2时字段有返回值。
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 渠道编码，type=3时字段有返回值。（TB 淘系，OTHERS 其他）
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 失效日期，type=2时字段有返回值。
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 库存类型(1 正品 101 残次 102 机损 103 箱损 201 冻结库存 301 在途库存 )
	 */
	@ApiField("inventory_type")
	private Long inventoryType;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 锁库存数量
	 */
	@ApiField("lock_quantity")
	private Long lockQuantity;

	/**
	 * 生产日期，type=2时字段有返回值
	 */
	@ApiField("produce_date")
	private Date produceDate;

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


	public String getBatchCode() {
		return this.batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public Date getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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

	public Long getLockQuantity() {
		return this.lockQuantity;
	}
	public void setLockQuantity(Long lockQuantity) {
		this.lockQuantity = lockQuantity;
	}

	public Date getProduceDate() {
		return this.produceDate;
	}
	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
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

}
