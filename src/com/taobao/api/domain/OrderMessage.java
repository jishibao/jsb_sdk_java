package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 采购单留言列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OrderMessage extends TaobaoObject {

	private static final long serialVersionUID = 3663647797325824469L;

	/**
	 * 留言内容
	 */
	@ApiField("message_content")
	private String messageContent;

	/**
	 * 留言时间
	 */
	@ApiField("message_time")
	private Date messageTime;

	/**
	 * 留言标题，例如：分销商留言，供应商留言，买家留言
	 */
	@ApiField("message_title")
	private String messageTitle;

	/**
	 * 留言时的图片地址
	 */
	@ApiField("pic_url")
	private String picUrl;


	public String getMessageContent() {
		return this.messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public Date getMessageTime() {
		return this.messageTime;
	}
	public void setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
	}

	public String getMessageTitle() {
		return this.messageTitle;
	}
	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

}
