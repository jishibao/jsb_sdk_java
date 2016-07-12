package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 退款留言
 *
 * @author top auto create
 * @since 1.0, null
 */
public class RefundMessage extends TaobaoObject {

	private static final long serialVersionUID = 5855455435693216367L;

	/**
	 * 留言内容。最大长度: 400个字节
	 */
	@ApiField("content")
	private String content;

	/**
	 * 留言创建时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 留言编号
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 退款类型：NORMAL（普通留言），RETURN_GOODS_APPROVED（卖家留退货地址时留言）；如果为RETURN_GOODS_APPROVED，则退款留言中有卖家收货地址
	 */
	@ApiField("message_type")
	private String messageType;

	/**
	 * 留言者编号
	 */
	@ApiField("owner_id")
	private Long ownerId;

	/**
	 * 留言者昵称
	 */
	@ApiField("owner_nick")
	private String ownerNick;

	/**
	 * 留言者身份1代表买家，2代表卖家，3代表小二
	 */
	@ApiField("owner_role")
	private String ownerRole;

	/**
	 * 凭证附件地址（图片）
	 */
	@ApiListField("pic_urls")
	@ApiField("pic_url")
	private List<PicUrl> picUrls;

	/**
	 * 退款编号。
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * 退款阶段，可选值：onsale（售中）, aftersale（售后）
	 */
	@ApiField("refund_phase")
	private String refundPhase;


	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public Long getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerNick() {
		return this.ownerNick;
	}
	public void setOwnerNick(String ownerNick) {
		this.ownerNick = ownerNick;
	}

	public String getOwnerRole() {
		return this.ownerRole;
	}
	public void setOwnerRole(String ownerRole) {
		this.ownerRole = ownerRole;
	}

	public List<PicUrl> getPicUrls() {
		return this.picUrls;
	}
	public void setPicUrls(List<PicUrl> picUrls) {
		this.picUrls = picUrls;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getRefundPhase() {
		return this.refundPhase;
	}
	public void setRefundPhase(String refundPhase) {
		this.refundPhase = refundPhase;
	}

}
