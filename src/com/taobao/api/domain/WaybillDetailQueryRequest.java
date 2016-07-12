package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 面单查询请求
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WaybillDetailQueryRequest extends TaobaoObject {

	private static final long serialVersionUID = 1628923265195197415L;

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
	 * 0:根据cp_code和waybil_code查询;1:根据订单号查询
	 */
	@ApiField("query_by")
	private Long queryBy;

	/**
	 * 申请者ID
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * 交易订单号
	 */
	@ApiListField("trade_order_list")
	@ApiField("string")
	private List<String> tradeOrderList;

	/**
	 * 电子面单单号
	 */
	@ApiListField("waybill_codes")
	@ApiField("string")
	private List<String> waybillCodes;


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

	public Long getQueryBy() {
		return this.queryBy;
	}
	public void setQueryBy(Long queryBy) {
		this.queryBy = queryBy;
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

	public List<String> getWaybillCodes() {
		return this.waybillCodes;
	}
	public void setWaybillCodes(List<String> waybillCodes) {
		this.waybillCodes = waybillCodes;
	}

}
