package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 下游买家退款信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class BuyerRefund extends TaobaoObject {

	private static final long serialVersionUID = 3138371399354157175L;

	/**
	 * 订单id
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * 下游买家nick
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 货物的状态：
买家已收到货
买家已退货
买家未收到货
	 */
	@ApiField("goods_status_desc")
	private String goodsStatusDesc;

	/**
	 * 退款修改时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 买家是否退货
	 */
	@ApiField("need_return_goods")
	private Boolean needReturnGoods;

	/**
	 * 退款创建时间
	 */
	@ApiField("refund_create_time")
	private Date refundCreateTime;

	/**
	 * 退款说明
	 */
	@ApiField("refund_desc")
	private String refundDesc;

	/**
	 * 交易退款id
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款状态
	 */
	@ApiField("refund_status")
	private Long refundStatus;

	/**
	 * 退还买家的金额
	 */
	@ApiField("return_fee")
	private Long returnFee;

	/**
	 * 采购单子单id
	 */
	@ApiField("sub_order_id")
	private Long subOrderId;

	/**
	 * 支付分销商的金额
	 */
	@ApiField("to_seller_fee")
	private Long toSellerFee;


	public Long getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getGoodsStatusDesc() {
		return this.goodsStatusDesc;
	}
	public void setGoodsStatusDesc(String goodsStatusDesc) {
		this.goodsStatusDesc = goodsStatusDesc;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Boolean getNeedReturnGoods() {
		return this.needReturnGoods;
	}
	public void setNeedReturnGoods(Boolean needReturnGoods) {
		this.needReturnGoods = needReturnGoods;
	}

	public Date getRefundCreateTime() {
		return this.refundCreateTime;
	}
	public void setRefundCreateTime(Date refundCreateTime) {
		this.refundCreateTime = refundCreateTime;
	}

	public String getRefundDesc() {
		return this.refundDesc;
	}
	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public Long getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(Long refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Long getReturnFee() {
		return this.returnFee;
	}
	public void setReturnFee(Long returnFee) {
		this.returnFee = returnFee;
	}

	public Long getSubOrderId() {
		return this.subOrderId;
	}
	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Long getToSellerFee() {
		return this.toSellerFee;
	}
	public void setToSellerFee(Long toSellerFee) {
		this.toSellerFee = toSellerFee;
	}

}
