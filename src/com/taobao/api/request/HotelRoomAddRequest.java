package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.HotelRoomAddResponse;

/**
 * TOP API: taobao.hotel.room.add request
 * 
 * @author top auto create
 * @since 1.0, 2015.06.11
 */
public class HotelRoomAddRequest extends BaseTaobaoRequest<HotelRoomAddResponse> implements TaobaoUploadRequest<HotelRoomAddResponse> {

	
	

	/** 
	* 已废弃
	 */
	private String area;

	/** 
	* 已废弃
	 */
	private String bbn;

	/** 
	* 已废弃
	 */
	private String bedType;

	/** 
	* 早餐。A,B,C,D,E。分别代表：A：无早，B：单早，C：双早，D：三早，E：多早
	 */
	private String breakfast;

	/** 
	* 销售渠道。如需开通，需要申请权限。如果有多个用","分。目前制定四种渠道：A-集团协议B-双11促销价C-普通促销价M-无线专享价
	 */
	private String channel;

	/** 
	* 已废弃
	 */
	private Long deposit;

	/** 
	* 宝贝描述。 宝贝描述长度不能超过50000字节
	 */
	private String desc;

	/** 
	* 产品每日结束销售时间
	 */
	private String endTime;

	/** 
	* 已废弃
	 */
	private Long fee;

	/** 
	* 生效截止时间，用来控制此rateplan生效的截止时间，配合字段effective_time一起限定rp的有效期
	 */
	private Date gmtDeadline;

	/** 
	* 生效开始时间，用来控制此rateplan生效的开始时间，配合字段deadline_time一起限定rp的有效期
	 */
	private Date gmtEffective;

	/** 
	* 购买须知。 购买须知长度不能超过600字节
	 */
	private String guide;

	/** 
	* 酒店商品是否提供发票
	 */
	private Boolean hasReceipt;

	/** 
	* 酒店id。必须为数字。
	 */
	private Long hid;

	/** 
	* 最大提前预定小时数，从入住当天的24点往前计算。例如如果这个字段设置了48，代表最多提前两天预定，那么如果想预定24号入住，,必须在23号零点以后下单。
	 */
	private Long maxAdvHours;

	/** 
	* 最大入住天数（1-90）。默认90
	 */
	private Long maxDays;

	/** 
	* 会员等级。如需开通，需要申请权限，取值为：1,2,3,none。
	 */
	private String memberLevel;

	/** 
	* 最小提前预定小时数，从入住当天的24点往前计算。例如如果这个字段设置了48，代表必须至少提前两天预定，那么如果想预定24号入住，,必须在23号零点前下单。
	 */
	private Long minAdvHours;

	/** 
	* 最小入住天数（1-90）。默认1
	 */
	private Long minDays;

	/** 
	* 已废弃
	 */
	private String multiRoomQuotas;

	/** 
	* 支付类型。可选值：A,E,H。分别代表：A：全额预付，E：前台面付，H：信用住
	 */
	private String paymentType;

	/** 
	* 已废弃
	 */
	private FileItem pic;

	/** 
	* 已废弃
	 */
	private String picPath;

	/** 
	* 已废弃
	 */
	private String priceType;

	/** 
	* 发票说明，不能超过100个字
	 */
	private String receiptInfo;

	/** 
	* 发票类型为其他时的发票描述,不能超过30个字
	 */
	private String receiptOtherTypeDesc;

	/** 
	* 发票类型。A,B。分别代表： A:酒店住宿发票,B:其他。注意：B卖家必填该字段，C卖家可选
	 */
	private String receiptType;

	/** 
	* 退订政策字段，是个json串，参考示例值设置改字段的值。允许变更/取消：在XX年XX月XX日XX时前取消收取Y%的手续费，100>Y>=0允许变更/取消：在入住前X小时前取消收取Y%的手续费，100>Y>=0（不超过10条）。1.表示任意退{"cancelPolicyType":1};2.表示不能退{"cancelPolicyType":2};3.从入住当天24点往前推X小时前取消收取Y%手续费，否则不可取消{"t":3,"p":[{"d":15,"r":30},{"d":10,"r":40}]}表示，从入住日24点往前推提前至少15天取消，收取30%的手续费，从入住日24点往前推提前至少10天取消，收取40%的手续费;
	 */
	private String refundPolicyInfo;

	/** 
	* 房型id。必须为数字。
	 */
	private Long rid;

	/** 
	* 房态房价信息。可以传今天开始90天内的房态信息。JSON格式传递。date：代表房态房价日期，格式为YYYY-MM-DD，price：代表房价，0～99999999，存储的单位是分，num：代表当天可售间数，0～999。如：[{"date":2015-01-28,"price":10000, "num":10},{"date":2015-01-29,"price":12000,"num":10}]
	 */
	private String roomQuotas;

	/** 
	* 已废弃
	 */
	private String service;

	/** 
	* 已废弃
	 */
	private String siteParam;

	/** 
	* 已废弃
	 */
	private String size;

	/** 
	* 产品每日开始销售时间
	 */
	private String startTime;

	/** 
	* 已废弃
	 */
	private String storey;

	/** 
	* 酒店商品名称。不能超过60字节
	 */
	private String title;

	public void setArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return this.area;
	}

	public void setBbn(String bbn) {
		this.bbn = bbn;
	}

	public String getBbn() {
		return this.bbn;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public String getBedType() {
		return this.bedType;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getBreakfast() {
		return this.breakfast;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}

	public Long getDeposit() {
		return this.deposit;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}

	public Long getFee() {
		return this.fee;
	}

	public void setGmtDeadline(Date gmtDeadline) {
		this.gmtDeadline = gmtDeadline;
	}

	public Date getGmtDeadline() {
		return this.gmtDeadline;
	}

	public void setGmtEffective(Date gmtEffective) {
		this.gmtEffective = gmtEffective;
	}

	public Date getGmtEffective() {
		return this.gmtEffective;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}

	public String getGuide() {
		return this.guide;
	}

	public void setHasReceipt(Boolean hasReceipt) {
		this.hasReceipt = hasReceipt;
	}

	public Boolean getHasReceipt() {
		return this.hasReceipt;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setMaxAdvHours(Long maxAdvHours) {
		this.maxAdvHours = maxAdvHours;
	}

	public Long getMaxAdvHours() {
		return this.maxAdvHours;
	}

	public void setMaxDays(Long maxDays) {
		this.maxDays = maxDays;
	}

	public Long getMaxDays() {
		return this.maxDays;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getMemberLevel() {
		return this.memberLevel;
	}

	public void setMinAdvHours(Long minAdvHours) {
		this.minAdvHours = minAdvHours;
	}

	public Long getMinAdvHours() {
		return this.minAdvHours;
	}

	public void setMinDays(Long minDays) {
		this.minDays = minDays;
	}

	public Long getMinDays() {
		return this.minDays;
	}

	public void setMultiRoomQuotas(String multiRoomQuotas) {
		this.multiRoomQuotas = multiRoomQuotas;
	}

	public String getMultiRoomQuotas() {
		return this.multiRoomQuotas;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}

	public FileItem getPic() {
		return this.pic;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getPicPath() {
		return this.picPath;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getPriceType() {
		return this.priceType;
	}

	public void setReceiptInfo(String receiptInfo) {
		this.receiptInfo = receiptInfo;
	}

	public String getReceiptInfo() {
		return this.receiptInfo;
	}

	public void setReceiptOtherTypeDesc(String receiptOtherTypeDesc) {
		this.receiptOtherTypeDesc = receiptOtherTypeDesc;
	}

	public String getReceiptOtherTypeDesc() {
		return this.receiptOtherTypeDesc;
	}

	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

	public String getReceiptType() {
		return this.receiptType;
	}

	public void setRefundPolicyInfo(String refundPolicyInfo) {
		this.refundPolicyInfo = refundPolicyInfo;
	}

	public String getRefundPolicyInfo() {
		return this.refundPolicyInfo;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Long getRid() {
		return this.rid;
	}

	public void setRoomQuotas(String roomQuotas) {
		this.roomQuotas = roomQuotas;
	}

	public String getRoomQuotas() {
		return this.roomQuotas;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getService() {
		return this.service;
	}

	public void setSiteParam(String siteParam) {
		this.siteParam = siteParam;
	}

	public String getSiteParam() {
		return this.siteParam;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStorey(String storey) {
		this.storey = storey;
	}

	public String getStorey() {
		return this.storey;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "taobao.hotel.room.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("area", this.area);
		txtParams.put("bbn", this.bbn);
		txtParams.put("bed_type", this.bedType);
		txtParams.put("breakfast", this.breakfast);
		txtParams.put("channel", this.channel);
		txtParams.put("deposit", this.deposit);
		txtParams.put("desc", this.desc);
		txtParams.put("end_time", this.endTime);
		txtParams.put("fee", this.fee);
		txtParams.put("gmt_deadline", this.gmtDeadline);
		txtParams.put("gmt_effective", this.gmtEffective);
		txtParams.put("guide", this.guide);
		txtParams.put("has_receipt", this.hasReceipt);
		txtParams.put("hid", this.hid);
		txtParams.put("max_adv_hours", this.maxAdvHours);
		txtParams.put("max_days", this.maxDays);
		txtParams.put("member_level", this.memberLevel);
		txtParams.put("min_adv_hours", this.minAdvHours);
		txtParams.put("min_days", this.minDays);
		txtParams.put("multi_room_quotas", this.multiRoomQuotas);
		txtParams.put("payment_type", this.paymentType);
		txtParams.put("pic_path", this.picPath);
		txtParams.put("price_type", this.priceType);
		txtParams.put("receipt_info", this.receiptInfo);
		txtParams.put("receipt_other_type_desc", this.receiptOtherTypeDesc);
		txtParams.put("receipt_type", this.receiptType);
		txtParams.put("refund_policy_info", this.refundPolicyInfo);
		txtParams.put("rid", this.rid);
		txtParams.put("room_quotas", this.roomQuotas);
		txtParams.put("service", this.service);
		txtParams.put("site_param", this.siteParam);
		txtParams.put("size", this.size);
		txtParams.put("start_time", this.startTime);
		txtParams.put("storey", this.storey);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<HotelRoomAddResponse> getResponseClass() {
		return HotelRoomAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxLength(area, 1, "area");
		RequestCheckUtils.checkMaxLength(bbn, 1, "bbn");
		RequestCheckUtils.checkNotEmpty(bedType, "bedType");
		RequestCheckUtils.checkMaxLength(bedType, 1, "bedType");
		RequestCheckUtils.checkNotEmpty(breakfast, "breakfast");
		RequestCheckUtils.checkMaxLength(breakfast, 1, "breakfast");
		RequestCheckUtils.checkMaxValue(deposit, 99999900L, "deposit");
		RequestCheckUtils.checkMinValue(deposit, 0L, "deposit");
		RequestCheckUtils.checkNotEmpty(desc, "desc");
		RequestCheckUtils.checkMaxLength(desc, 50000, "desc");
		RequestCheckUtils.checkMaxValue(fee, 99999900L, "fee");
		RequestCheckUtils.checkMinValue(fee, 0L, "fee");
		RequestCheckUtils.checkMaxLength(guide, 300, "guide");
		RequestCheckUtils.checkNotEmpty(hid, "hid");
		RequestCheckUtils.checkNotEmpty(paymentType, "paymentType");
		RequestCheckUtils.checkMaxLength(paymentType, 1, "paymentType");
		RequestCheckUtils.checkMaxLength(priceType, 1, "priceType");
		RequestCheckUtils.checkNotEmpty(rid, "rid");
		RequestCheckUtils.checkMaxLength(siteParam, 100, "siteParam");
		RequestCheckUtils.checkMaxLength(size, 1, "size");
		RequestCheckUtils.checkMaxLength(storey, 8, "storey");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkMaxLength(title, 90, "title");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("pic", this.pic);
		return params;
	}
	
	

}