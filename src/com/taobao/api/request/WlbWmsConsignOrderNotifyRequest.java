package com.taobao.api.request;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsConsignOrderNotifyResponse;

/**
 * TOP API: taobao.wlb.wms.consign.order.notify request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.07
 */
public class WlbWmsConsignOrderNotifyRequest extends BaseTaobaoRequest<WlbWmsConsignOrderNotifyResponse> {
	
	

	/** 
	* 废弃，支付宝交易号
	 */
	private String alipayNo;

	/** 
	* 订单应收金额，消费者还需要付的金额，单位分
	 */
	private Long arAmount;

	/** 
	* 废弃，车牌号
	 */
	private String carNo;

	/** 
	* 废弃，承运商名称
	 */
	private String carriersName;

	/** 
	* 配送要求
	 */
	private String deliverRequirements;

	/** 
	* 订单优惠金额，整单优惠金额，单位分
	 */
	private Long discountAmount;

	/** 
	* 拓展属性
	 */
	private String extendFields;

	/** 
	* 订单已付金额，消费者已经支付的金额，单位分
	 */
	private Long gotAmount;

	/** 
	* 发票信息列表
	 */
	private String invoiceInfoList;

	/** 
	* 订单总金额,=总商品金额-订单优惠金额+快递费用，单位分
	 */
	private Long orderAmount;

	/** 
	* ERP订单号
	 */
	private String orderCode;

	/** 
	* 订单创建时间,ERP创建订单时间
	 */
	private Date orderCreateTime;

	/** 
	* 订单审核时间,ERP创建支付时间
	 */
	private Date orderExaminationTime;

	/** 
	* 订单标识 (1: cod –货到付款，4:invoiceinfo-需要发票)
	 */
	private String orderFlag;

	/** 
	* 订单商品信息列表
	 */
	private String orderItemList;

	/** 
	* 订单支付时间
	 */
	private Date orderPayTime;

	/** 
	* 废弃，订单优先级0 -10，根据订单作业优先级设置，数字越大，优先级越高
	 */
	private Long orderPriority;

	/** 
	* 下单时间，订单在交易平台创建时间
	 */
	private Date orderShopCreateTime;

	/** 
	* 订单来源（213 天猫，201 淘宝，214 京东，202 1688 阿里中文站 ，203 苏宁在线，204 亚马逊中国，205 当当，208 1号店，207 唯品会，209 国美在线，210 拍拍，206 易贝ebay，211 聚美优品，212 乐蜂网，215 邮乐，216 凡客，217 优购，218 银泰，219 易讯，221 聚尚网，222 蘑菇街，223 POS门店，301 其他）
	 */
	private Long orderSource;

	/** 
	* 废弃，交易内部来源，文本透传 WAP(手机);HITAO(嗨淘);TOP(TOP平台);TAOBAO(普通淘宝);JHS(聚划算) 一笔订单可能同时有以上多个标记，则以逗号分隔
	 */
	private String orderSubSource;

	/** 
	* 单据类型 201 一般交易出库单 202 B2B交易出库单 502 换货出库单 503 补发出库单
	 */
	private Long orderType;

	/** 
	* 废弃，取件人电话
	 */
	private String pickerCall;

	/** 
	* 废弃，取件人身份证
	 */
	private String pickerId;

	/** 
	* 废弃，取件人姓名
	 */
	private String pickerName;

	/** 
	* 快递费用，单位分
	 */
	private Long postfee;

	/** 
	* 前物流订单号，订单类型为502 换货出库单 503 补发出库单时，需求传入此内容
	 */
	private String prevOrderCode;

	/** 
	* 收件人信息
	 */
	private String receiverInfo;

	/** 
	* 备注
	 */
	private String remark;

	/** 
	* 发货方信息
	 */
	private String senderInfo;

	/** 
	* COD服务费，单位分
	 */
	private Long serviceFee;

	/** 
	* 仓库编码，此字段为空时，由菜鸟路由仓库发货
	 */
	private String storeCode;

	/** 
	* 快递公司编码，此字段为空时，由菜鸟选择快递配送
	 */
	private String tmsServiceCode;

	/** 
	* 快递公司名称
	 */
	private String tmsServiceName;

	/** 
	* 废弃，出库方式（自提，快递，销毁）
	 */
	private String transportMode;

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}

	public String getAlipayNo() {
		return this.alipayNo;
	}

	public void setArAmount(Long arAmount) {
		this.arAmount = arAmount;
	}

	public Long getArAmount() {
		return this.arAmount;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCarNo() {
		return this.carNo;
	}

	public void setCarriersName(String carriersName) {
		this.carriersName = carriersName;
	}

	public String getCarriersName() {
		return this.carriersName;
	}

	public void setDeliverRequirements(String deliverRequirements) {
		this.deliverRequirements = deliverRequirements;
	}

	public void setDeliverRequirements(Deliverrequirementswlbwmsconsignordernotify deliverRequirements) {
		this.deliverRequirements = new JSONWriter(false,true).write(deliverRequirements);
	}

	public String getDeliverRequirements() {
		return this.deliverRequirements;
	}

	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Long getDiscountAmount() {
		return this.discountAmount;
	}

	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getExtendFields() {
		return this.extendFields;
	}

	public void setGotAmount(Long gotAmount) {
		this.gotAmount = gotAmount;
	}

	public Long getGotAmount() {
		return this.gotAmount;
	}

	public void setInvoiceInfoList(String invoiceInfoList) {
		this.invoiceInfoList = invoiceInfoList;
	}

	public void setInvoiceInfoList(List<Invoicelistwlbwmsconsignordernotify> invoiceInfoList) {
		this.invoiceInfoList = new JSONWriter(false,true).write(invoiceInfoList);
	}

	public String getInvoiceInfoList() {
		return this.invoiceInfoList;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Long getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}

	public void setOrderExaminationTime(Date orderExaminationTime) {
		this.orderExaminationTime = orderExaminationTime;
	}

	public Date getOrderExaminationTime() {
		return this.orderExaminationTime;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public String getOrderFlag() {
		return this.orderFlag;
	}

	public void setOrderItemList(String orderItemList) {
		this.orderItemList = orderItemList;
	}

	public void setOrderItemList(List<Orderitemlistwlbwmsconsignordernotify> orderItemList) {
		this.orderItemList = new JSONWriter(false,true).write(orderItemList);
	}

	public String getOrderItemList() {
		return this.orderItemList;
	}

	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public Date getOrderPayTime() {
		return this.orderPayTime;
	}

	public void setOrderPriority(Long orderPriority) {
		this.orderPriority = orderPriority;
	}

	public Long getOrderPriority() {
		return this.orderPriority;
	}

	public void setOrderShopCreateTime(Date orderShopCreateTime) {
		this.orderShopCreateTime = orderShopCreateTime;
	}

	public Date getOrderShopCreateTime() {
		return this.orderShopCreateTime;
	}

	public void setOrderSource(Long orderSource) {
		this.orderSource = orderSource;
	}

	public Long getOrderSource() {
		return this.orderSource;
	}

	public void setOrderSubSource(String orderSubSource) {
		this.orderSubSource = orderSubSource;
	}

	public String getOrderSubSource() {
		return this.orderSubSource;
	}

	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public Long getOrderType() {
		return this.orderType;
	}

	public void setPickerCall(String pickerCall) {
		this.pickerCall = pickerCall;
	}

	public String getPickerCall() {
		return this.pickerCall;
	}

	public void setPickerId(String pickerId) {
		this.pickerId = pickerId;
	}

	public String getPickerId() {
		return this.pickerId;
	}

	public void setPickerName(String pickerName) {
		this.pickerName = pickerName;
	}

	public String getPickerName() {
		return this.pickerName;
	}

	public void setPostfee(Long postfee) {
		this.postfee = postfee;
	}

	public Long getPostfee() {
		return this.postfee;
	}

	public void setPrevOrderCode(String prevOrderCode) {
		this.prevOrderCode = prevOrderCode;
	}

	public String getPrevOrderCode() {
		return this.prevOrderCode;
	}

	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
	}

	public void setReceiverInfo(Receiverwlbwmsconsignordernotify receiverInfo) {
		this.receiverInfo = new JSONWriter(false,true).write(receiverInfo);
	}

	public String getReceiverInfo() {
		return this.receiverInfo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setSenderInfo(String senderInfo) {
		this.senderInfo = senderInfo;
	}

	public void setSenderInfo(Senderwlbwmsconsignordernotify senderInfo) {
		this.senderInfo = new JSONWriter(false,true).write(senderInfo);
	}

	public String getSenderInfo() {
		return this.senderInfo;
	}

	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Long getServiceFee() {
		return this.serviceFee;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setTmsServiceCode(String tmsServiceCode) {
		this.tmsServiceCode = tmsServiceCode;
	}

	public String getTmsServiceCode() {
		return this.tmsServiceCode;
	}

	public void setTmsServiceName(String tmsServiceName) {
		this.tmsServiceName = tmsServiceName;
	}

	public String getTmsServiceName() {
		return this.tmsServiceName;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public String getTransportMode() {
		return this.transportMode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.consign.order.notify";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("alipay_no", this.alipayNo);
		txtParams.put("ar_amount", this.arAmount);
		txtParams.put("car_no", this.carNo);
		txtParams.put("carriers_name", this.carriersName);
		txtParams.put("deliver_requirements", this.deliverRequirements);
		txtParams.put("discount_amount", this.discountAmount);
		txtParams.put("extend_fields", this.extendFields);
		txtParams.put("got_amount", this.gotAmount);
		txtParams.put("invoice_info_list", this.invoiceInfoList);
		txtParams.put("order_amount", this.orderAmount);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_create_time", this.orderCreateTime);
		txtParams.put("order_examination_time", this.orderExaminationTime);
		txtParams.put("order_flag", this.orderFlag);
		txtParams.put("order_item_list", this.orderItemList);
		txtParams.put("order_pay_time", this.orderPayTime);
		txtParams.put("order_priority", this.orderPriority);
		txtParams.put("order_shop_create_time", this.orderShopCreateTime);
		txtParams.put("order_source", this.orderSource);
		txtParams.put("order_sub_source", this.orderSubSource);
		txtParams.put("order_type", this.orderType);
		txtParams.put("picker_call", this.pickerCall);
		txtParams.put("picker_id", this.pickerId);
		txtParams.put("picker_name", this.pickerName);
		txtParams.put("postfee", this.postfee);
		txtParams.put("prev_order_code", this.prevOrderCode);
		txtParams.put("receiver_info", this.receiverInfo);
		txtParams.put("remark", this.remark);
		txtParams.put("sender_info", this.senderInfo);
		txtParams.put("service_fee", this.serviceFee);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("tms_service_code", this.tmsServiceCode);
		txtParams.put("tms_service_name", this.tmsServiceName);
		txtParams.put("transport_mode", this.transportMode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsConsignOrderNotifyResponse> getResponseClass() {
		return WlbWmsConsignOrderNotifyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMinValue(arAmount, 0L, "arAmount");
		RequestCheckUtils.checkMinValue(gotAmount, 0L, "gotAmount");
		RequestCheckUtils.checkObjectMaxListSize(invoiceInfoList, 1000, "invoiceInfoList");
		RequestCheckUtils.checkMinValue(orderAmount, 0L, "orderAmount");
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkObjectMaxListSize(orderItemList, 1000, "orderItemList");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkMinValue(serviceFee, 0L, "serviceFee");
	}
	
	/**
	 * 配送要求
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Deliverrequirementswlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 6495115229277726136L;
		/**
		 * 配送类型： PTPS-常温配送 LLPS-冷链配送
		 */
		@ApiField("delivery_type")
		private String deliveryType;
		/**
		 * 送达日期
		 */
		@ApiField("schedule_day")
		private String scheduleDay;
		/**
		 * 送达结束时间
		 */
		@ApiField("schedule_end")
		private String scheduleEnd;
		/**
		 * 送达开始时间
		 */
		@ApiField("schedule_start")
		private String scheduleStart;
		/**
		 * 投递时延要求:  1-工作日 2-节假日 101,当日达102次晨达103次日达 111 活动标  104 预约达
		 */
		@ApiField("schedule_type")
		private Long scheduleType;
	
		public String getDeliveryType() {
			return this.deliveryType;
		}
		public void setDeliveryType(String deliveryType) {
			this.deliveryType = deliveryType;
		}
		public String getScheduleDay() {
			return this.scheduleDay;
		}
		public void setScheduleDay(String scheduleDay) {
			this.scheduleDay = scheduleDay;
		}
		public String getScheduleEnd() {
			return this.scheduleEnd;
		}
		public void setScheduleEnd(String scheduleEnd) {
			this.scheduleEnd = scheduleEnd;
		}
		public String getScheduleStart() {
			return this.scheduleStart;
		}
		public void setScheduleStart(String scheduleStart) {
			this.scheduleStart = scheduleStart;
		}
		public Long getScheduleType() {
			return this.scheduleType;
		}
		public void setScheduleType(Long scheduleType) {
			this.scheduleType = scheduleType;
		}
	}
	
	/**
	 * 收件人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Receiverwlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 3856542334282788293L;
		/**
		 * 收件方地址
		 */
		@ApiField("receiver_address")
		private String receiverAddress;
		/**
		 * 收件方区县
		 */
		@ApiField("receiver_area")
		private String receiverArea;
		/**
		 * 收件方城市
		 */
		@ApiField("receiver_city")
		private String receiverCity;
		/**
		 * 收件人手机
		 */
		@ApiField("receiver_mobile")
		private String receiverMobile;
		/**
		 * 收件人名称
		 */
		@ApiField("receiver_name")
		private String receiverName;
		/**
		 * 收件人Nick
		 */
		@ApiField("receiver_nick")
		private String receiverNick;
		/**
		 * 收件人电话
		 */
		@ApiField("receiver_phone")
		private String receiverPhone;
		/**
		 * 收件方省份
		 */
		@ApiField("receiver_province")
		private String receiverProvince;
		/**
		 * 收件方街道
		 */
		@ApiField("receiver_town")
		private String receiverTown;
		/**
		 * 收件方邮编
		 */
		@ApiField("receiver_zip_code")
		private String receiverZipCode;
	
		public String getReceiverAddress() {
			return this.receiverAddress;
		}
		public void setReceiverAddress(String receiverAddress) {
			this.receiverAddress = receiverAddress;
		}
		public String getReceiverArea() {
			return this.receiverArea;
		}
		public void setReceiverArea(String receiverArea) {
			this.receiverArea = receiverArea;
		}
		public String getReceiverCity() {
			return this.receiverCity;
		}
		public void setReceiverCity(String receiverCity) {
			this.receiverCity = receiverCity;
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
		public String getReceiverNick() {
			return this.receiverNick;
		}
		public void setReceiverNick(String receiverNick) {
			this.receiverNick = receiverNick;
		}
		public String getReceiverPhone() {
			return this.receiverPhone;
		}
		public void setReceiverPhone(String receiverPhone) {
			this.receiverPhone = receiverPhone;
		}
		public String getReceiverProvince() {
			return this.receiverProvince;
		}
		public void setReceiverProvince(String receiverProvince) {
			this.receiverProvince = receiverProvince;
		}
		public String getReceiverTown() {
			return this.receiverTown;
		}
		public void setReceiverTown(String receiverTown) {
			this.receiverTown = receiverTown;
		}
		public String getReceiverZipCode() {
			return this.receiverZipCode;
		}
		public void setReceiverZipCode(String receiverZipCode) {
			this.receiverZipCode = receiverZipCode;
		}
	}
	
	/**
	 * 发货方信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Senderwlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 3625293232519521432L;
		/**
		 * 发件方地址
		 */
		@ApiField("sender_address")
		private String senderAddress;
		/**
		 * 发件方区县
		 */
		@ApiField("sender_area")
		private String senderArea;
		/**
		 * 发件方城市
		 */
		@ApiField("sender_city")
		private String senderCity;
		/**
		 * 发件方手机
		 */
		@ApiField("sender_mobile")
		private String senderMobile;
		/**
		 * 发件方名称
		 */
		@ApiField("sender_name")
		private String senderName;
		/**
		 * 发件方电话
		 */
		@ApiField("sender_phone")
		private String senderPhone;
		/**
		 * 发件方省份
		 */
		@ApiField("sender_province")
		private String senderProvince;
		/**
		 * 发件方镇
		 */
		@ApiField("sender_town")
		private String senderTown;
		/**
		 * 发件方邮编
		 */
		@ApiField("sender_zip_code")
		private String senderZipCode;
	
		public String getSenderAddress() {
			return this.senderAddress;
		}
		public void setSenderAddress(String senderAddress) {
			this.senderAddress = senderAddress;
		}
		public String getSenderArea() {
			return this.senderArea;
		}
		public void setSenderArea(String senderArea) {
			this.senderArea = senderArea;
		}
		public String getSenderCity() {
			return this.senderCity;
		}
		public void setSenderCity(String senderCity) {
			this.senderCity = senderCity;
		}
		public String getSenderMobile() {
			return this.senderMobile;
		}
		public void setSenderMobile(String senderMobile) {
			this.senderMobile = senderMobile;
		}
		public String getSenderName() {
			return this.senderName;
		}
		public void setSenderName(String senderName) {
			this.senderName = senderName;
		}
		public String getSenderPhone() {
			return this.senderPhone;
		}
		public void setSenderPhone(String senderPhone) {
			this.senderPhone = senderPhone;
		}
		public String getSenderProvince() {
			return this.senderProvince;
		}
		public void setSenderProvince(String senderProvince) {
			this.senderProvince = senderProvince;
		}
		public String getSenderTown() {
			return this.senderTown;
		}
		public void setSenderTown(String senderTown) {
			this.senderTown = senderTown;
		}
		public String getSenderZipCode() {
			return this.senderZipCode;
		}
		public void setSenderZipCode(String senderZipCode) {
			this.senderZipCode = senderZipCode;
		}
	}
	
	/**
	 * 订单商品信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Orderitemwlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 2137788754999428332L;
		/**
		 * 商品成交价格=销售价格-优惠金额
		 */
		@ApiField("actual_price")
		private Long actualPrice;
		/**
		 * 商品优惠金额
		 */
		@ApiField("discount_amount")
		private Long discountAmount;
		/**
		 * 订单商品拓展属性数据
		 */
		@ApiField("extend_fields")
		private String extendFields;
		/**
		 * 库存类型
		 */
		@ApiField("inventory_type")
		private Long inventoryType;
		/**
		 * 交易平台商品编码
		 */
		@ApiField("item_ext_code")
		private String itemExtCode;
		/**
		 * ERP商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 商品名称
		 */
		@ApiField("item_name")
		private String itemName;
		/**
		 * 销售价格
		 */
		@ApiField("item_price")
		private Long itemPrice;
		/**
		 * 商品数量
		 */
		@ApiField("item_quantity")
		private Long itemQuantity;
		/**
		 * ERP订单明细行号ID，数字类型
		 */
		@ApiField("order_item_id")
		private String orderItemId;
		/**
		 * 平台交易订单编码，如果不传入淘系交易订单，子订单系统自动标示此商品为赠品；
		 */
		@ApiField("order_source_code")
		private String orderSourceCode;
		/**
		 * 货主ID
		 */
		@ApiField("owner_user_id")
		private String ownerUserId;
		/**
		 * 货主名称
		 */
		@ApiField("owner_user_name")
		private String ownerUserName;
		/**
		 * 平台子交易编码
		 */
		@ApiField("sub_source_code")
		private String subSourceCode;
		/**
		 * 店铺ID
		 */
		@ApiField("user_id")
		private String userId;
		/**
		 * 店铺名称
		 */
		@ApiField("user_name")
		private String userName;
	
		public Long getActualPrice() {
			return this.actualPrice;
		}
		public void setActualPrice(Long actualPrice) {
			this.actualPrice = actualPrice;
		}
		public Long getDiscountAmount() {
			return this.discountAmount;
		}
		public void setDiscountAmount(Long discountAmount) {
			this.discountAmount = discountAmount;
		}
		public String getExtendFields() {
			return this.extendFields;
		}
		public void setExtendFields(String extendFields) {
			this.extendFields = extendFields;
		}
		public Long getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(Long inventoryType) {
			this.inventoryType = inventoryType;
		}
		public String getItemExtCode() {
			return this.itemExtCode;
		}
		public void setItemExtCode(String itemExtCode) {
			this.itemExtCode = itemExtCode;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public Long getItemPrice() {
			return this.itemPrice;
		}
		public void setItemPrice(Long itemPrice) {
			this.itemPrice = itemPrice;
		}
		public Long getItemQuantity() {
			return this.itemQuantity;
		}
		public void setItemQuantity(Long itemQuantity) {
			this.itemQuantity = itemQuantity;
		}
		public String getOrderItemId() {
			return this.orderItemId;
		}
		public void setOrderItemId(String orderItemId) {
			this.orderItemId = orderItemId;
		}
		public String getOrderSourceCode() {
			return this.orderSourceCode;
		}
		public void setOrderSourceCode(String orderSourceCode) {
			this.orderSourceCode = orderSourceCode;
		}
		public String getOwnerUserId() {
			return this.ownerUserId;
		}
		public void setOwnerUserId(String ownerUserId) {
			this.ownerUserId = ownerUserId;
		}
		public String getOwnerUserName() {
			return this.ownerUserName;
		}
		public void setOwnerUserName(String ownerUserName) {
			this.ownerUserName = ownerUserName;
		}
		public String getSubSourceCode() {
			return this.subSourceCode;
		}
		public void setSubSourceCode(String subSourceCode) {
			this.subSourceCode = subSourceCode;
		}
		public String getUserId() {
			return this.userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return this.userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
	}
	
	/**
	 * 订单商品信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Orderitemlistwlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 1577476315221641364L;
		/**
		 * 订单商品信息
		 */
		@ApiField("order_item")
		private Orderitemwlbwmsconsignordernotify orderItem;
	
		public Orderitemwlbwmsconsignordernotify getOrderItem() {
			return this.orderItem;
		}
		public void setOrderItem(Orderitemwlbwmsconsignordernotify orderItem) {
			this.orderItem = orderItem;
		}
	}
	
	/**
	 * 发票信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Itemdetailwlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 1194612919865474636L;
		/**
		 * 金额
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 商品名称
		 */
		@ApiField("item_name")
		private String itemName;
		/**
		 * 商品价格
		 */
		@ApiField("price")
		private String price;
		/**
		 * 商品数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 单位
		 */
		@ApiField("unit")
		private String unit;
	
		public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
	}
	
	/**
	 * 发票明细列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Detaillistwlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 5512357263296546378L;
		/**
		 * 发票信息
		 */
		@ApiField("item_detail")
		private Itemdetailwlbwmsconsignordernotify itemDetail;
	
		public Itemdetailwlbwmsconsignordernotify getItemDetail() {
			return this.itemDetail;
		}
		public void setItemDetail(Itemdetailwlbwmsconsignordernotify itemDetail) {
			this.itemDetail = itemDetail;
		}
	}
	
	/**
	 * 发票信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Invoicewlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 7592766418458822916L;
		/**
		 * 发票金额
		 */
		@ApiField("bill_account")
		private String billAccount;
		/**
		 * 发票内容
		 */
		@ApiField("bill_content")
		private String billContent;
		/**
		 * Erp发票ID
		 */
		@ApiField("bill_id")
		private Long billId;
		/**
		 * 发票抬头
		 */
		@ApiField("bill_title")
		private String billTitle;
		/**
		 * 发票类型(VINVOICE - 增值税普通发票， EVINVOICE - 电子增票，电子发票仓库不打印)
		 */
		@ApiField("bill_type")
		private String billType;
		/**
		 * 发票明细列表
		 */
		@ApiListField("detail_list")
		@ApiField("detaillistwlbwmsconsignordernotify")
		private List<Detaillistwlbwmsconsignordernotify> detailList;
	
		public String getBillAccount() {
			return this.billAccount;
		}
		public void setBillAccount(String billAccount) {
			this.billAccount = billAccount;
		}
		public String getBillContent() {
			return this.billContent;
		}
		public void setBillContent(String billContent) {
			this.billContent = billContent;
		}
		public Long getBillId() {
			return this.billId;
		}
		public void setBillId(Long billId) {
			this.billId = billId;
		}
		public String getBillTitle() {
			return this.billTitle;
		}
		public void setBillTitle(String billTitle) {
			this.billTitle = billTitle;
		}
		public String getBillType() {
			return this.billType;
		}
		public void setBillType(String billType) {
			this.billType = billType;
		}
		public List<Detaillistwlbwmsconsignordernotify> getDetailList() {
			return this.detailList;
		}
		public void setDetailList(List<Detaillistwlbwmsconsignordernotify> detailList) {
			this.detailList = detailList;
		}
	}
	
	/**
	 * 发票信息列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class Invoicelistwlbwmsconsignordernotify extends TaobaoObject {
		private static final long serialVersionUID = 7533777693732911965L;
		/**
		 * 发票信息
		 */
		@ApiField("invoice_info")
		private Invoicewlbwmsconsignordernotify invoiceInfo;
	
		public Invoicewlbwmsconsignordernotify getInvoiceInfo() {
			return this.invoiceInfo;
		}
		public void setInvoiceInfo(Invoicewlbwmsconsignordernotify invoiceInfo) {
			this.invoiceInfo = invoiceInfo;
		}
	}
	

}