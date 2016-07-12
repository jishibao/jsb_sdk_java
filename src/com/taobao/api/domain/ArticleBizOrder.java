package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 应用订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ArticleBizOrder extends TaobaoObject {

	private static final long serialVersionUID = 2552599333311855926L;

	/**
	 * 应用收费代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的收费代码
	 */
	@ApiField("article_code")
	private String articleCode;

	/**
	 * 商品模型名称
	 */
	@ApiField("article_item_name")
	private String articleItemName;

	/**
	 * 应用名称
	 */
	@ApiField("article_name")
	private String articleName;

	/**
	 * 订单号
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * 订单类型，1=新订 2=续订 3=升级 4=后台赠送 5=后台自动续订 6=订单审核后生成订购关系（暂时用不到）
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 订单创建时间（订购时间）
	 */
	@ApiField("create")
	private Date create;

	/**
	 * 原价（单位为分）
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 收费项目代码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得收费项目代码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 收费项目名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 淘宝会员名
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 订购周期  1表示年 ，2表示月，3表示天。
	 */
	@ApiField("order_cycle")
	private String orderCycle;

	/**
	 * 订购周期结束时间
	 */
	@ApiField("order_cycle_end")
	private Date orderCycleEnd;

	/**
	 * 订购周期开始时间
	 */
	@ApiField("order_cycle_start")
	private Date orderCycleStart;

	/**
	 * 子订单号
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * 优惠（单位为分）
	 */
	@ApiField("prom_fee")
	private String promFee;

	/**
	 * 退款（单位为分；升级时，系统会将升级前老版本按照剩余订购天数退还剩余金额）
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 实付（单位为分）
	 */
	@ApiField("total_pay_fee")
	private String totalPayFee;


	public String getArticleCode() {
		return this.articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleItemName() {
		return this.articleItemName;
	}
	public void setArticleItemName(String articleItemName) {
		this.articleItemName = articleItemName;
	}

	public String getArticleName() {
		return this.articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public Date getCreate() {
		return this.create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getOrderCycle() {
		return this.orderCycle;
	}
	public void setOrderCycle(String orderCycle) {
		this.orderCycle = orderCycle;
	}

	public Date getOrderCycleEnd() {
		return this.orderCycleEnd;
	}
	public void setOrderCycleEnd(Date orderCycleEnd) {
		this.orderCycleEnd = orderCycleEnd;
	}

	public Date getOrderCycleStart() {
		return this.orderCycleStart;
	}
	public void setOrderCycleStart(Date orderCycleStart) {
		this.orderCycleStart = orderCycleStart;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getPromFee() {
		return this.promFee;
	}
	public void setPromFee(String promFee) {
		this.promFee = promFee;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getTotalPayFee() {
		return this.totalPayFee;
	}
	public void setTotalPayFee(String totalPayFee) {
		this.totalPayFee = totalPayFee;
	}

}
