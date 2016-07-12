package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 销退订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoReturnBillReturnorderinfo extends TaobaoObject {

	private static final long serialVersionUID = 1527567399129298125L;

	/**
	 * 仓库订单编码，LBX号
	 */
	@ApiField("cn_order_code")
	private String cnOrderCode;

	/**
	 * 仓库订单完成时间
	 */
	@ApiField("confirm_time")
	private Date confirmTime;

	/**
	 * ERP订单号
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 订单商品信息列表
	 */
	@ApiListField("order_item_list")
	@ApiField("cainiao_return_bill_orderitemlist")
	private List<CainiaoReturnBillOrderitemlist> orderItemList;

	/**
	 * 单据类型： 501 退货入库
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 此销退订单对应原销售订单的菜鸟订单号
	 */
	@ApiField("pre_cn_order_code")
	private String preCnOrderCode;


	public String getCnOrderCode() {
		return this.cnOrderCode;
	}
	public void setCnOrderCode(String cnOrderCode) {
		this.cnOrderCode = cnOrderCode;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public List<CainiaoReturnBillOrderitemlist> getOrderItemList() {
		return this.orderItemList;
	}
	public void setOrderItemList(List<CainiaoReturnBillOrderitemlist> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public String getPreCnOrderCode() {
		return this.preCnOrderCode;
	}
	public void setPreCnOrderCode(String preCnOrderCode) {
		this.preCnOrderCode = preCnOrderCode;
	}

}
