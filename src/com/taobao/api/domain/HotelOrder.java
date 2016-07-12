package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * HotelOrder（酒店订单）结构。各字段详细说明可参考接口定义。注意：trade_status，refund_status，logistics_status不是严格准确的，请以交易API，物流API等得到的订单状态、物流状态为准确依据。
 *
 * @author top auto create
 * @since 1.0, null
 */
public class HotelOrder extends TaobaoObject {

	private static final long serialVersionUID = 4123134335737457833L;

	/**
	 * 支付宝交易号，22位字符
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 买家最早到达时间
	 */
	@ApiField("arrive_early")
	private Date arriveEarly;

	/**
	 * 买家最晚到达时间
	 */
	@ApiField("arrive_late")
	private Date arriveLate;

	/**
	 * 买家淘宝账号
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 入住时间
	 */
	@ApiField("checkin_date")
	private Date checkinDate;

	/**
	 * 离店时间
	 */
	@ApiField("checkout_date")
	private Date checkoutDate;

	/**
	 * 备注，存储关于礼品的信息，比如杜蕾斯
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 备用联系人电话
	 */
	@ApiField("contact_phone_bak")
	private String contactPhoneBak;

	/**
	 * 订单创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 商品id
	 */
	@ApiField("gid")
	private Long gid;

	/**
	 * 入住人信息
	 */
	@ApiListField("guests")
	@ApiField("order_guest")
	private List<OrderGuest> guests;

	/**
	 * 酒店id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * 物流状态。STATUS_UNCONSIGNED：未发货 -> 等待卖家发货。STATUS_CONSIGNED：已发货 -> 等待买家确认收货。STATUS_DELIVERED：已收货 -> 交易成功。STATUS_REVERT：已经退货 -> 交易失败。STATUS_DELIVERED_PART：部分发货 -> 交易成功。STATUS_NO_OUT_ORDER：还未创建物流订单
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/**
	 * 买家留言
	 */
	@ApiField("message")
	private String message;

	/**
	 * 订单修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 天数
	 */
	@ApiField("nights")
	private Long nights;

	/**
	 * 酒店订单id
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 合作方订单号,最长250个字符
	 */
	@ApiField("out_oid")
	private String outOid;

	/**
	 * 付款时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 实付款（分）
	 */
	@ApiField("payment")
	private Long payment;

	/**
	 * 下单时每间夜的价格（分）
	 */
	@ApiListField("prices")
	@ApiField("number")
	private List<Long> prices;

	/**
	 * 退款状态。STATUS_WAIT_SELLER_AGREE：买家已经申请退款，等待卖家同意。STATUS_WAIT_BUYER_RETURN_GOODS：卖家已经同意退款，等待买家退货。STATUS_WAIT_SELLER_CONFIRM_GOODS：买家已经退货，等待卖家确认收货。STATUS_CLOSED：退款关闭。STATUS_SUCCESS：退款成功->买家取消预定。STATUS_SELLER_REFUSE_BUYER：卖家拒绝退款。STATUS_WAIT_OUT_PAY_SYSTEM_REFUND：等待外部交易系统退款。STATUS_NO_REFUND：没有申请退款。STATUS_ACTIVE_REFUND：有活动退款。STATUS_END_REFUND：退款结束。
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 房型id
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * 房间数
	 */
	@ApiField("room_number")
	private Long roomNumber;

	/**
	 * 卖家淘宝账号
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 淘宝订单id
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 总房价（分）
	 */
	@ApiField("total_room_price")
	private Long totalRoomPrice;

	/**
	 * 交易状态。WAIT_BUYER_PAY：未冻结/未付款 -> 等待买家付款。WAIT_SELLER_SEND_GOODS：已冻结/已付款 -> 等待卖家发货 -> 等待卖家确认。TRADE_CLOSED：已退款 -> 交易关闭。TRADE_FINISHED：已转交易 -> 交易成功。TRADE_NO_CREATE_PAY：没有创建支付宝交易。TRADE_CLOSED_BY_TAOBAO：交易被淘宝关闭->卖家关闭交易或卖家核实未入住。TRADE_SUCCESS：预定成功（等待卖家核实入住）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 支付类型。A：全额支付。B：灵活支付－手续费。C：灵活支付－订金。D：灵活支付－手续费/间夜
	 */
	@ApiField("type")
	private String type;


	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public Date getArriveEarly() {
		return this.arriveEarly;
	}
	public void setArriveEarly(Date arriveEarly) {
		this.arriveEarly = arriveEarly;
	}

	public Date getArriveLate() {
		return this.arriveLate;
	}
	public void setArriveLate(Date arriveLate) {
		this.arriveLate = arriveLate;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Date getCheckinDate() {
		return this.checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Date getCheckoutDate() {
		return this.checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactPhoneBak() {
		return this.contactPhoneBak;
	}
	public void setContactPhoneBak(String contactPhoneBak) {
		this.contactPhoneBak = contactPhoneBak;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getGid() {
		return this.gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}

	public List<OrderGuest> getGuests() {
		return this.guests;
	}
	public void setGuests(List<OrderGuest> guests) {
		this.guests = guests;
	}

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getNights() {
		return this.nights;
	}
	public void setNights(Long nights) {
		this.nights = nights;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOutOid() {
		return this.outOid;
	}
	public void setOutOid(String outOid) {
		this.outOid = outOid;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Long getPayment() {
		return this.payment;
	}
	public void setPayment(Long payment) {
		this.payment = payment;
	}

	public List<Long> getPrices() {
		return this.prices;
	}
	public void setPrices(List<Long> prices) {
		this.prices = prices;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Long getRoomNumber() {
		return this.roomNumber;
	}
	public void setRoomNumber(Long roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTotalRoomPrice() {
		return this.totalRoomPrice;
	}
	public void setTotalRoomPrice(Long totalRoomPrice) {
		this.totalRoomPrice = totalRoomPrice;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
