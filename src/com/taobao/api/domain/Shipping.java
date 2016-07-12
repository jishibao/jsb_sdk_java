package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 获取的物流订单详情列表 返回的Shipping包含的具体信息为入参fields请求的字段信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Shipping extends TaobaoObject {

	private static final long serialVersionUID = 7121185263758392213L;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 物流公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 运单创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 预约取货结束时间
	 */
	@ApiField("delivery_end")
	private Date deliveryEnd;

	/**
	 * 预约取货开始时间
	 */
	@ApiField("delivery_start")
	private Date deliveryStart;

	/**
	 * 谁承担运费.可选值:buyer(买家承担),seller(卖家承担运费).
	 */
	@ApiField("freight_payer")
	private String freightPayer;

	/**
	 * 标示为是否快捷COD订单
	 */
	@ApiField("is_quick_cod_order")
	private Boolean isQuickCodOrder;

	/**
	 * 表明是否是拆单，默认值0，1表示拆单
	 */
	@ApiField("is_spilt")
	private Long isSpilt;

	/**
	 * 返回发货是否成功。
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/**
	 * 货物名称
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 收件人地址信息(在传输请求参数Fields字段时，必须使用“receiver_location”才能返回此字段)
	 */
	@ApiField("location")
	private Location location;

	/**
	 * 运单修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 物流订单编号
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 运单号.具体一个物流公司的运单号码.
	 */
	@ApiField("out_sid")
	private String outSid;

	/**
	 * 收件人手机号码
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收件人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件人电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 卖家是否确认发货.可选值:yes(是),no(否).
	 */
	@ApiField("seller_confirm")
	private String sellerConfirm;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 物流订单状态,可选值:CREATED(订单已创建) RECREATED(订单重新创建) CANCELLED(订单已取消) CLOSED(订单关闭) SENDING(等候发送给物流公司) ACCEPTING(已发送给物流公司,等待接单) ACCEPTED(物流公司已接单) REJECTED(物流公司不接单) PICK_UP(物流公司揽收成功) PICK_UP_FAILED(物流公司揽收失败) LOST(物流公司丢单) REJECTED_BY_RECEIVER(对方拒签) ACCEPTED_BY_RECEIVER(发货方式在线下单：对方已签收；自己联系：卖家已发货)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 拆单子订单列表，对应的数据是：该物流订单下的全部子订单
	 */
	@ApiListField("sub_tids")
	@ApiField("number")
	private List<Long> subTids;

	/**
	 * 交易ID
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 物流方式.可选值:free(卖家包邮),post(平邮),express(快递),ems(EMS).
	 */
	@ApiField("type")
	private String type;


	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getDeliveryEnd() {
		return this.deliveryEnd;
	}
	public void setDeliveryEnd(Date deliveryEnd) {
		this.deliveryEnd = deliveryEnd;
	}

	public Date getDeliveryStart() {
		return this.deliveryStart;
	}
	public void setDeliveryStart(Date deliveryStart) {
		this.deliveryStart = deliveryStart;
	}

	public String getFreightPayer() {
		return this.freightPayer;
	}
	public void setFreightPayer(String freightPayer) {
		this.freightPayer = freightPayer;
	}

	public Boolean getIsQuickCodOrder() {
		return this.isQuickCodOrder;
	}
	public void setIsQuickCodOrder(Boolean isQuickCodOrder) {
		this.isQuickCodOrder = isQuickCodOrder;
	}

	public Long getIsSpilt() {
		return this.isSpilt;
	}
	public void setIsSpilt(Long isSpilt) {
		this.isSpilt = isSpilt;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getOrderCode() {
		return this.orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOutSid() {
		return this.outSid;
	}
	public void setOutSid(String outSid) {
		this.outSid = outSid;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getSellerConfirm() {
		return this.sellerConfirm;
	}
	public void setSellerConfirm(String sellerConfirm) {
		this.sellerConfirm = sellerConfirm;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<Long> getSubTids() {
		return this.subTids;
	}
	public void setSubTids(List<Long> subTids) {
		this.subTids = subTids;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
