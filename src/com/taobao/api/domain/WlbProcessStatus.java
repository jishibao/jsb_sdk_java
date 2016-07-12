package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流宝订单流转信息对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbProcessStatus extends TaobaoObject {

	private static final long serialVersionUID = 8528429932983857686L;

	/**
	 * 状态内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private Date operateTime;

	/**
	 * 操作人
	 */
	@ApiField("operater")
	private String operater;

	/**
	 * 物流宝订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 订单操作状态：WMS_ACCEPT;WMS_PRINT;WMS_PICK;WMS_CHECK;WMS_PACKAGE;WMS_CONSIGN;WMS_CANCEL;WMS_UNKNOWN;WMS_CONFIRMED
TMS_ACCEPT;TMS_STATION_IN;TMS_STATION_OUT;TMS_SIGN;TMS_REJECT;TMS_CANCEL;TMS_UNKNOW;SYS_UNKNOWN
	 */
	@ApiField("status_code")
	private String statusCode;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 仓库合作公司编码
	 */
	@ApiField("store_tp_code")
	private String storeTpCode;

	/**
	 * tms合作公司订单编码
	 */
	@ApiField("tms_order_code")
	private String tmsOrderCode;

	/**
	 * tms合作公司编码
	 */
	@ApiField("tms_tp_code")
	private String tmsTpCode;


	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getOperater() {
		return this.operater;
	}
	public void setOperater(String operater) {
		this.operater = operater;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreTpCode() {
		return this.storeTpCode;
	}
	public void setStoreTpCode(String storeTpCode) {
		this.storeTpCode = storeTpCode;
	}

	public String getTmsOrderCode() {
		return this.tmsOrderCode;
	}
	public void setTmsOrderCode(String tmsOrderCode) {
		this.tmsOrderCode = tmsOrderCode;
	}

	public String getTmsTpCode() {
		return this.tmsTpCode;
	}
	public void setTmsTpCode(String tmsTpCode) {
		this.tmsTpCode = tmsTpCode;
	}

}
