package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 库存变更记录
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemInventoryLog extends TaobaoObject {

	private static final long serialVersionUID = 7454698236943667264L;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 业务单据号
	 */
	@ApiField("biz_order_code")
	private String bizOrderCode;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 库存变更ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * VENDIBLE  1-可销售;FREEZE  201-冻结库存;ONWAY  301-在途库存;DEFECT  101-残存品;ENGINE_DAMAGE 102-机损;BOX_DAMAGE 103-箱损
	 */
	@ApiField("invent_type")
	private String inventType;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 库存操作作类型CHU_KU 1-出库RU_KU 2-入库FREEZE 3-冻结THAW 4-解冻CHECK_FREEZE 5-冻结确认CHANGE_KU 6-库存类型变更
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 库存操作者ID
	 */
	@ApiField("op_user_id")
	private Long opUserId;

	/**
	 * 订单号
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 订单商品ID
	 */
	@ApiField("order_item_id")
	private Long orderItemId;

	/**
	 * 处理数量变化值
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 结果值
	 */
	@ApiField("result_quantity")
	private Long resultQuantity;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private Long userId;


	public String getBatchCode() {
		return this.batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getBizOrderCode() {
		return this.bizOrderCode;
	}
	public void setBizOrderCode(String bizOrderCode) {
		this.bizOrderCode = bizOrderCode;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getInventType() {
		return this.inventType;
	}
	public void setInventType(String inventType) {
		this.inventType = inventType;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public Long getOpUserId() {
		return this.opUserId;
	}
	public void setOpUserId(Long opUserId) {
		this.opUserId = opUserId;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Long getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getResultQuantity() {
		return this.resultQuantity;
	}
	public void setResultQuantity(Long resultQuantity) {
		this.resultQuantity = resultQuantity;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
