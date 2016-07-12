package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 打印返回信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillApplyPrintCheckInfo extends TaobaoObject {

	private static final long serialVersionUID = 5433861775128563477L;

	/**
	 * 打印提示信息编码
	 */
	@ApiField("notice_code")
	private String noticeCode;

	/**
	 * 打印提示信息
	 */
	@ApiField("notice_message")
	private String noticeMessage;

	/**
	 * 打印次数
	 */
	@ApiField("print_quantity")
	private Long printQuantity;

	/**
	 * 电子面单号
	 */
	@ApiField("waybill_code")
	private String waybillCode;


	public String getNoticeCode() {
		return this.noticeCode;
	}
	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}

	public String getNoticeMessage() {
		return this.noticeMessage;
	}
	public void setNoticeMessage(String noticeMessage) {
		this.noticeMessage = noticeMessage;
	}

	public Long getPrintQuantity() {
		return this.printQuantity;
	}
	public void setPrintQuantity(Long printQuantity) {
		this.printQuantity = printQuantity;
	}

	public String getWaybillCode() {
		return this.waybillCode;
	}
	public void setWaybillCode(String waybillCode) {
		this.waybillCode = waybillCode;
	}

}
