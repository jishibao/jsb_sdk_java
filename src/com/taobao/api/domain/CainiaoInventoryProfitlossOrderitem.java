package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoInventoryProfitlossOrderitem extends TaobaoObject {

	private static final long serialVersionUID = 6772762328254279589L;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 商品保质期信息，失效日期
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 库存类型 1 可销售库存（正品）  101 残次
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 商家对商品的编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品数量
	 */
	@ApiField("item_qty")
	private String itemQty;

	/**
	 * 生产地区
	 */
	@ApiField("produce_area")
	private String produceArea;

	/**
	 * 生产编码，同一商品可能因商家不同有不同编码
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 商品保质期信息，生产日期
	 */
	@ApiField("produce_date")
	private Date produceDate;


	public String getBatchCode() {
		return this.batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public Date getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemQty() {
		return this.itemQty;
	}
	public void setItemQty(String itemQty) {
		this.itemQty = itemQty;
	}

	public String getProduceArea() {
		return this.produceArea;
	}
	public void setProduceArea(String produceArea) {
		this.produceArea = produceArea;
	}

	public String getProduceCode() {
		return this.produceCode;
	}
	public void setProduceCode(String produceCode) {
		this.produceCode = produceCode;
	}

	public Date getProduceDate() {
		return this.produceDate;
	}
	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}

}
