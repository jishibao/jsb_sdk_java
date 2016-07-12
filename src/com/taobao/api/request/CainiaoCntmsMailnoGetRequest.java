package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoCntmsMailnoGetResponse;

/**
 * TOP API: cainiao.cntms.mailno.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.11
 */
public class CainiaoCntmsMailnoGetRequest extends BaseTaobaoRequest<CainiaoCntmsMailnoGetResponse> {
	
	

	/** 
	* 获取菜鸟配送电子面单请求参数
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(CnTmsMailnoGetContent content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "cainiao.cntms.mailno.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCntmsMailnoGetResponse> getResponseClass() {
		return CainiaoCntmsMailnoGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
	 * 收件人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CnTmsMailnoReceiverinfo extends TaobaoObject {
		private static final long serialVersionUID = 1166913533331842772L;
		/**
		 * 收件人地址
		 */
		@ApiField("receiver_address")
		private String receiverAddress;
		/**
		 * 收件人区县
		 */
		@ApiField("receiver_area")
		private String receiverArea;
		/**
		 * 收件人城市
		 */
		@ApiField("receiver_city")
		private String receiverCity;
		/**
		 * 收件人手机，手机与电话必须有一值不为空
		 */
		@ApiField("receiver_mobile")
		private String receiverMobile;
		/**
		 * 收件人姓名
		 */
		@ApiField("receiver_name")
		private String receiverName;
		/**
		 * 收件人昵称
		 */
		@ApiField("receiver_nick")
		private String receiverNick;
		/**
		 * 收件人电话，手机与电话必须有一值不为空
		 */
		@ApiField("receiver_phone")
		private String receiverPhone;
		/**
		 * 收件人省份
		 */
		@ApiField("receiver_province")
		private String receiverProvince;
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
		public String getReceiverZipCode() {
			return this.receiverZipCode;
		}
		public void setReceiverZipCode(String receiverZipCode) {
			this.receiverZipCode = receiverZipCode;
		}
	}
	
	/**
	 * 发件人信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CnTmsMailnoSenderinfo extends TaobaoObject {
		private static final long serialVersionUID = 1452249865234388169L;
		/**
		 * 发件人地址
		 */
		@ApiField("sender_address")
		private String senderAddress;
		/**
		 * 发件人区县
		 */
		@ApiField("sender_area")
		private String senderArea;
		/**
		 * 发件人城市
		 */
		@ApiField("sender_city")
		private String senderCity;
		/**
		 * 发件人手机，手机与电话必须有一值不为空
		 */
		@ApiField("sender_mobile")
		private String senderMobile;
		/**
		 * 发件人姓名
		 */
		@ApiField("sender_name")
		private String senderName;
		/**
		 * 发件人电话，手机与电话必须有一值不为空
		 */
		@ApiField("sender_phone")
		private String senderPhone;
		/**
		 * 发件人省份
		 */
		@ApiField("sender_province")
		private String senderProvince;
		/**
		 * 发件人邮编
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
		public String getSenderZipCode() {
			return this.senderZipCode;
		}
		public void setSenderZipCode(String senderZipCode) {
			this.senderZipCode = senderZipCode;
		}
	}
	
	/**
	 * 发货商品信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CnTmsMailnoItem extends TaobaoObject {
		private static final long serialVersionUID = 2388982165882447275L;
		/**
		 * 发货商品名称
		 */
		@ApiField("item_name")
		private String itemName;
		/**
		 * 发货商品数量
		 */
		@ApiField("item_qty")
		private Long itemQty;
	
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public Long getItemQty() {
			return this.itemQty;
		}
		public void setItemQty(Long itemQty) {
			this.itemQty = itemQty;
		}
	}
	
	/**
	 * 获取菜鸟配送电子面单请求参数
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CnTmsMailnoGetContent extends TaobaoObject {
		private static final long serialVersionUID = 1755862769291689935L;
		/**
		 * 拓展字段
		 */
		@ApiField("extend_field")
		private String extendField;
		/**
		 * 发货商品信息
		 */
		@ApiListField("items")
		@ApiField("cn_tms_mailno_item")
		private List<CnTmsMailnoItem> items;
		/**
		 * ERP订单编码
		 */
		@ApiField("order_code")
		private String orderCode;
		/**
		 * 来源渠道（TB 淘宝，JD 京东，TM 天猫，1688 1688（阿里中文站），YHD 1号店，DD 当当，VANCL 凡客，PP 拍拍，YX 易讯，EBAY 易贝ebay，AMAZON 亚马逊，SN 苏宁在线，GM 国美在线，WPH 唯品会，JM 聚美优品，LF 乐蜂网，MGJ 蘑菇街，JS 聚尚网，YG 优购，YT 银泰，YL 邮乐，PX 拍鞋网，POS POS门店，OTHERS 其他）
		 */
		@ApiField("order_source")
		private String orderSource;
		/**
		 * 包裹序号,如果同一订单获取多个包裹时,需要标记当前请求为第几个包裹
		 */
		@ApiField("package_no")
		private Long packageNo;
		/**
		 * 收件人信息
		 */
		@ApiField("receiver_info")
		private CnTmsMailnoReceiverinfo receiverInfo;
		/**
		 * 发件人信息
		 */
		@ApiField("sender_info")
		private CnTmsMailnoSenderinfo senderInfo;
		/**
		 * 店铺编码
		 */
		@ApiField("shop_code")
		private String shopCode;
		/**
		 * 解决方案CODE，由菜鸟提供
		 */
		@ApiField("solutions_code")
		private String solutionsCode;
		/**
		 * 交易单号
		 */
		@ApiField("trade_id")
		private String tradeId;
	
		public String getExtendField() {
			return this.extendField;
		}
		public void setExtendField(String extendField) {
			this.extendField = extendField;
		}
		public List<CnTmsMailnoItem> getItems() {
			return this.items;
		}
		public void setItems(List<CnTmsMailnoItem> items) {
			this.items = items;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getOrderSource() {
			return this.orderSource;
		}
		public void setOrderSource(String orderSource) {
			this.orderSource = orderSource;
		}
		public Long getPackageNo() {
			return this.packageNo;
		}
		public void setPackageNo(Long packageNo) {
			this.packageNo = packageNo;
		}
		public CnTmsMailnoReceiverinfo getReceiverInfo() {
			return this.receiverInfo;
		}
		public void setReceiverInfo(CnTmsMailnoReceiverinfo receiverInfo) {
			this.receiverInfo = receiverInfo;
		}
		public CnTmsMailnoSenderinfo getSenderInfo() {
			return this.senderInfo;
		}
		public void setSenderInfo(CnTmsMailnoSenderinfo senderInfo) {
			this.senderInfo = senderInfo;
		}
		public String getShopCode() {
			return this.shopCode;
		}
		public void setShopCode(String shopCode) {
			this.shopCode = shopCode;
		}
		public String getSolutionsCode() {
			return this.solutionsCode;
		}
		public void setSolutionsCode(String solutionsCode) {
			this.solutionsCode = solutionsCode;
		}
		public String getTradeId() {
			return this.tradeId;
		}
		public void setTradeId(String tradeId) {
			this.tradeId = tradeId;
		}
	}
	

}