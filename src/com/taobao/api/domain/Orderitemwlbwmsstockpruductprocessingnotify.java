package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Orderitemwlbwmsstockpruductprocessingnotify extends TaobaoObject {

	private static final long serialVersionUID = 5875675522691353465L;

	/**
	 * 商品失效日期
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 拓展属性
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 库存类型 1 正品 101 残次 102 机损 103 箱损 201 冻结库存 301 在途库存
	 */
	@ApiField("inventory_type")
	private Long inventoryType;

	/**
	 * 后端商品ID，特指原料
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * ERP明细行号
	 */
	@ApiField("order_item_id")
	private String orderItemId;

	/**
	 * 计划数量
	 */
	@ApiField("plan_qty")
	private Long planQty;

	/**
	 * 商品生产批号
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 商品生产日期
	 */
	@ApiField("produce_date")
	private Date produceDate;

	/**
	 * 配比数量
	 */
	@ApiField("ratio_qty")
	private Long ratioQty;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;


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

	public String getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Long getPlanQty() {
		return this.planQty;
	}
	public void setPlanQty(Long planQty) {
		this.planQty = planQty;
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

	public Long getRatioQty() {
		return this.ratioQty;
	}
	public void setRatioQty(Long ratioQty) {
		this.ratioQty = ratioQty;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
