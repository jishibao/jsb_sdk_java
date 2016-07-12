package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 损益信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoInventoryProfitlossProfitlossinfo extends TaobaoObject {

	private static final long serialVersionUID = 6521632289953172291L;

	/**
	 * 仓库订单编码
	 */
	@ApiField("cn_order_code")
	private String cnOrderCode;

	/**
	 * 单据生成时间
	 */
	@ApiField("created_time")
	private Date createdTime;

	/**
	 * 商品信息列表
	 */
	@ApiListField("order_item_list")
	@ApiField("cainiao_inventory_profitloss_orderitemlist")
	private List<CainiaoInventoryProfitlossOrderitemlist> orderItemList;

	/**
	 * 订单类型： 701 盘点出库 702 盘点入库
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;


	public String getCnOrderCode() {
		return this.cnOrderCode;
	}
	public void setCnOrderCode(String cnOrderCode) {
		this.cnOrderCode = cnOrderCode;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public List<CainiaoInventoryProfitlossOrderitemlist> getOrderItemList() {
		return this.orderItemList;
	}
	public void setOrderItemList(List<CainiaoInventoryProfitlossOrderitemlist> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
