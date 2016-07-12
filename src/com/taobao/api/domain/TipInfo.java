package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 提示信息对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TipInfo extends TaobaoObject {

	private static final long serialVersionUID = 4537527493211677435L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("errro_message")
	private String errroMessage;

	/**
	 * 返回信息
	 */
	@ApiField("info")
	private String info;

	/**
	 * 商品id
	 */
	@ApiField("sc_item_id")
	private String scItemId;

	/**
	 * 子订单编号
	 */
	@ApiField("sub_order_id")
	private String subOrderId;


	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrroMessage() {
		return this.errroMessage;
	}
	public void setErrroMessage(String errroMessage) {
		this.errroMessage = errroMessage;
	}

	public String getInfo() {
		return this.info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	public String getScItemId() {
		return this.scItemId;
	}
	public void setScItemId(String scItemId) {
		this.scItemId = scItemId;
	}

	public String getSubOrderId() {
		return this.subOrderId;
	}
	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}

}
