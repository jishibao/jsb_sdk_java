package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 通道消息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbMessage extends TaobaoObject {

	private static final long serialVersionUID = 3763933827916499494L;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 消息通道ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 通知消息编码： STOCK_IN_NOT_CONSISTENT---入库单不一致 CANCEL_ORDER_SUCCESS---取消订单成功 CANCEL_ORDER_FAILURE---取消订单失败 INVENTORY_CHECK---盘点   INVENTORY_CHECK---盘点消息  ORDER_REJECT--wms拒单  ORDER_CONFIRMED--订单处理成功 WMS_FAILED--wms处理失败
	 */
	@ApiField("msg_code")
	private String msgCode;

	/**
	 * 通知内容：msg_code为STOCK_IN_NOT_CONSISTENT时,msg_content为:orderCode:code;orderItemId:111;itemId:123;planQuantity:10;relQuantity:6; 
msg_code为CANCEL_ORDER_SUCCESS及其它时,msg_content为：orderCode:code;
msg_code为CANCEL_ORDER_SUCCESS及其它时,msg_content为：orderCode:code; msg_code为INVENTORY_CHECK时，msg_content为orderCode:code;
	 */
	@ApiField("msg_content")
	private String msgContent;

	/**
	 * 消息描述
	 */
	@ApiField("msg_description")
	private String msgDescription;

	/**
	 * 消息状态： 不需要确认：NO_NEED_CONFIRM 已确认：CONFIRMED 待确认：TO_BE_CONFIRM
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private Long userId;


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

	public String getMsgCode() {
		return this.msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public String getMsgContent() {
		return this.msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public String getMsgDescription() {
		return this.msgDescription;
	}
	public void setMsgDescription(String msgDescription) {
		this.msgDescription = msgDescription;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
