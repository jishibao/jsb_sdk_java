package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 订单商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Orderitemwlbwmsstockoutordernotify extends TaobaoObject {

	private static final long serialVersionUID = 5795969563264529861L;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 到货日期
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 订单商品拓展属性数据
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 库存类型
	 */
	@ApiField("inventory_type")
	private Long inventoryType;

	/**
	 * ERP商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品数量
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * ERP主键ID
	 */
	@ApiField("order_item_id")
	private String orderItemId;

	/**
	 * 生产编码，同一商品可能因商家不同有不同编码
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 生产日期
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

	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
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

	public Long getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
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
