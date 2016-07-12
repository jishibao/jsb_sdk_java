package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 更新面单数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillApplyUpdateInfo extends TaobaoObject {

	private static final long serialVersionUID = 7545218893192582432L;

	/**
	 * 收货网点信息
	 */
	@ApiField("consignee_branch_code")
	private String consigneeBranchCode;

	/**
	 * 收货网点编码
	 */
	@ApiField("consignee_branch_name")
	private String consigneeBranchName;

	/**
	 * --
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 集包地、目的地中心代码。打印时根据该 code 生成目的地中心的条码，条码生成的算法与对应的电子面单条码一致
	 */
	@ApiField("package_center_code")
	private String packageCenterCode;

	/**
	 * 集包地、目的地中心名称
	 */
	@ApiField("package_center_name")
	private String packageCenterName;

	/**
	 * --
	 */
	@ApiField("result")
	private Long result;

	/**
	 * 挑拣规则（大头笔信息）
	 */
	@ApiField("short_address")
	private String shortAddress;

	/**
	 * --
	 */
	@ApiField("trade_order_info")
	private TradeOrderInfo tradeOrderInfo;

	/**
	 * --
	 */
	@ApiField("waybill_code")
	private String waybillCode;


	public String getConsigneeBranchCode() {
		return this.consigneeBranchCode;
	}
	public void setConsigneeBranchCode(String consigneeBranchCode) {
		this.consigneeBranchCode = consigneeBranchCode;
	}

	public String getConsigneeBranchName() {
		return this.consigneeBranchName;
	}
	public void setConsigneeBranchName(String consigneeBranchName) {
		this.consigneeBranchName = consigneeBranchName;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPackageCenterCode() {
		return this.packageCenterCode;
	}
	public void setPackageCenterCode(String packageCenterCode) {
		this.packageCenterCode = packageCenterCode;
	}

	public String getPackageCenterName() {
		return this.packageCenterName;
	}
	public void setPackageCenterName(String packageCenterName) {
		this.packageCenterName = packageCenterName;
	}

	public Long getResult() {
		return this.result;
	}
	public void setResult(Long result) {
		this.result = result;
	}

	public String getShortAddress() {
		return this.shortAddress;
	}
	public void setShortAddress(String shortAddress) {
		this.shortAddress = shortAddress;
	}

	public TradeOrderInfo getTradeOrderInfo() {
		return this.tradeOrderInfo;
	}
	public void setTradeOrderInfo(TradeOrderInfo tradeOrderInfo) {
		this.tradeOrderInfo = tradeOrderInfo;
	}

	public String getWaybillCode() {
		return this.waybillCode;
	}
	public void setWaybillCode(String waybillCode) {
		this.waybillCode = waybillCode;
	}

}
