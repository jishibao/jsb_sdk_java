package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 取消接口入参
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillApplyCancelRequest extends TaobaoObject {

	private static final long serialVersionUID = 7687342655192286585L;

	/**
	 * TOP平台请求的ISV APPKEY
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * CP快递公司编码
	 */
	@ApiField("cp_code")
	private String cpCode;

	/**
	 * ERP订单号或包裹号
	 */
	@ApiField("package_id")
	private String packageId;

	/**
	 * 面单使用者编号
	 */
	@ApiField("real_user_id")
	private Long realUserId;

	/**
	 * 申请者ID
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * 交易订单列表
	 */
	@ApiListField("trade_order_list")
	@ApiField("string")
	private List<String> tradeOrderList;

	/**
	 * 电子面单号码
	 */
	@ApiField("waybill_code")
	private String waybillCode;


	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getCpCode() {
		return this.cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public Long getRealUserId() {
		return this.realUserId;
	}
	public void setRealUserId(Long realUserId) {
		this.realUserId = realUserId;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public List<String> getTradeOrderList() {
		return this.tradeOrderList;
	}
	public void setTradeOrderList(List<String> tradeOrderList) {
		this.tradeOrderList = tradeOrderList;
	}

	public String getWaybillCode() {
		return this.waybillCode;
	}
	public void setWaybillCode(String waybillCode) {
		this.waybillCode = waybillCode;
	}

}
