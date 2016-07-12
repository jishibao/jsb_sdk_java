package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * Room（酒店商品）结构。各字段详细说明可参考接口定义，如：商品发布接口。
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Room extends TaobaoObject {

	private static final long serialVersionUID = 4477797971231349169L;

	/**
	 * 面积
	 */
	@ApiField("area")
	private String area;

	/**
	 * 宽带服务
	 */
	@ApiField("bbn")
	private String bbn;

	/**
	 * 床型
	 */
	@ApiField("bed_type")
	private String bedType;

	/**
	 * 早餐
	 */
	@ApiField("breakfast")
	private String breakfast;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 订金
	 */
	@ApiField("deposit")
	private Long deposit;

	/**
	 * 商品描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 手续费
	 */
	@ApiField("fee")
	private Long fee;

	/**
	 * 酒店商品id
	 */
	@ApiField("gid")
	private Long gid;

	/**
	 * 购买须知
	 */
	@ApiField("guide")
	private String guide;

	/**
	 * 酒店id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * 酒店信息
	 */
	@ApiField("hotel")
	private Hotel hotel;

	/**
	 * 淘宝商品id
	 */
	@ApiField("iid")
	private Long iid;

	/**
	 * 修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 为到店支付卖家特殊使用，代表多种支付类型的房态
	 */
	@ApiField("multi_room_quotas")
	private String multiRoomQuotas;

	/**
	 * 支付类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 酒店商品图片Url。多个url用逗号隔开
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 价格类型
	 */
	@ApiField("price_type")
	private String priceType;

	/**
	 * 房型id
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * 房态信息。JSON格式串
	 */
	@ApiField("room_quotas")
	private String roomQuotas;

	/**
	 * 房型信息
	 */
	@ApiField("room_type")
	private RoomType roomType;

	/**
	 * 设施服务。JSON格式串
	 */
	@ApiField("service")
	private String service;

	/**
	 * 床宽
	 */
	@ApiField("size")
	private String size;

	/**
	 * 状态。1：上架。2：下架。3：删除
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 楼层
	 */
	@ApiField("storey")
	private String storey;

	/**
	 * 酒店商品名称
	 */
	@ApiField("title")
	private String title;


	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getBbn() {
		return this.bbn;
	}
	public void setBbn(String bbn) {
		this.bbn = bbn;
	}

	public String getBedType() {
		return this.bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public String getBreakfast() {
		return this.breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getDeposit() {
		return this.deposit;
	}
	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getFee() {
		return this.fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}

	public Long getGid() {
		return this.gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}

	public String getGuide() {
		return this.guide;
	}
	public void setGuide(String guide) {
		this.guide = guide;
	}

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Hotel getHotel() {
		return this.hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Long getIid() {
		return this.iid;
	}
	public void setIid(Long iid) {
		this.iid = iid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getMultiRoomQuotas() {
		return this.multiRoomQuotas;
	}
	public void setMultiRoomQuotas(String multiRoomQuotas) {
		this.multiRoomQuotas = multiRoomQuotas;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPriceType() {
		return this.priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getRoomQuotas() {
		return this.roomQuotas;
	}
	public void setRoomQuotas(String roomQuotas) {
		this.roomQuotas = roomQuotas;
	}

	public RoomType getRoomType() {
		return this.roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStorey() {
		return this.storey;
	}
	public void setStorey(String storey) {
		this.storey = storey;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
