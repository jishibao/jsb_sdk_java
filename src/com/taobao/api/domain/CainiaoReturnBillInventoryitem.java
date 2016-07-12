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
public class CainiaoReturnBillInventoryitem extends TaobaoObject {

	private static final long serialVersionUID = 4522548568825533433L;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 失效日期，保质期商品使用
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 库存类型1 可销售库存 101残次品
	 */
	@ApiField("inventory_type")
	private Long inventoryType;

	/**
	 * 数量
	 */
	@ApiField("item_qty")
	private Long itemQty;

	/**
	 * 生产地区，仓库采集的商品
	 */
	@ApiField("produce_area")
	private String produceArea;

	/**
	 * 生产编码，同一商品可能因商家不同有不同编码，仓库采集的商品信息，可供保质期商品使用
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 生产日期，保质期商品使用
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

	public Long getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(Long inventoryType) {
		this.inventoryType = inventoryType;
	}

	public Long getItemQty() {
		return this.itemQty;
	}
	public void setItemQty(Long itemQty) {
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
