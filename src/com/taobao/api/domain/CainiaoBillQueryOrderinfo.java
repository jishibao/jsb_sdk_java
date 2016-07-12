package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoBillQueryOrderinfo extends TaobaoObject {

	private static final long serialVersionUID = 5819513393593812813L;

	/**
	 * 菜鸟订单编码
	 */
	@ApiField("cn_order_code")
	private String cnOrderCode;

	/**
	 * 订单最后修改时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * ERP订单号
	 */
	@ApiField("order_code")
	private String orderCode;

	/**
	 * 订单来源（213 天猫，201 淘宝，214 京东，202 1688 阿里中文站 ，203 苏宁在线，204 亚马逊中国，205 当当，208 1号店，207 唯品会，209 国美在线，210 拍拍，206 易贝ebay，211 聚美优品，212 乐蜂网，215 邮乐，216 凡客，217 优购，218 银泰，219 易讯，221 聚尚网，222 蘑菇街，223 POS门店，301 其他）
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 交易订单号
	 */
	@ApiListField("order_source_codes")
	@ApiField("string")
	private List<String> orderSourceCodes;

	/**
	 * 单据类型 201 销售出库 501 退货入库 502 换货出库 503 补发出库 904 普通入库 903 普通出库单 306 B2B入库单 305 B2B出库单 601 采购入库 901 退供出库单 701 盘点出库 702 盘点入库 711 库存异动单
	 */
	@ApiField("order_type")
	private Long orderType;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 单据状态 WMS_ACCEPT 接单成功 WMS_REJECT 接单失败 WMS_CONFIRMED 仓库生产完成，注：此状态表示单据已经在WMS处理完成，可能通过获取单据详情接口获取单据详细信息。 WMS_CANCEL 取消仓库发货  -- WMS_FAILED 订单发货失败 TMS_SIGN 买家签收 TMS_REJECT 买家拒签 TMS_CANCEL 拦截派送
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;


	public String getCnOrderCode() {
		return this.cnOrderCode;
	}
	public void setCnOrderCode(String cnOrderCode) {
		this.cnOrderCode = cnOrderCode;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
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

	public List<String> getOrderSourceCodes() {
		return this.orderSourceCodes;
	}
	public void setOrderSourceCodes(List<String> orderSourceCodes) {
		this.orderSourceCodes = orderSourceCodes;
	}

	public Long getOrderType() {
		return this.orderType;
	}
	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
