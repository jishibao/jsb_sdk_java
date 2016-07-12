package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流宝补货统计对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbReplenish extends TaobaoObject {

	private static final long serialVersionUID = 5222687737396765212L;

	/**
	 * 根据历史统计值计算出来的预期值
WarnByLast3Days=1; ByLast3Days=3;
ByLast10Days=10;
ByLast30Days=30;
ByLast90Days=90
WarnByLast3Days为按照过去3天的发出的件数来统计的达到安全库存的天数；其它4项分别为按照过去3、10、30、90天发出的商品件数，现有库存可以维持的天数
	 */
	@ApiField("estimate_value")
	private String estimateValue;

	/**
	 * 订单历史统计值
Last3DaysTotal=3; Last10DaysTotal=10;
Last30DaysTotal=30; Last90DaysTotal=90
分别为过去3、10、30、90天发出的商品件数
	 */
	@ApiField("history_value")
	private String historyValue;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 补货周期（单位：天）
	 */
	@ApiField("retrieval_count")
	private Long retrievalCount;

	/**
	 * 可销售库存数
	 */
	@ApiField("sell_count")
	private Long sellCount;

	/**
	 * 仓库编码
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 在途库存数
	 */
	@ApiField("transport_count")
	private Long transportCount;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 安全库存
	 */
	@ApiField("warn_count")
	private Long warnCount;


	public String getEstimateValue() {
		return this.estimateValue;
	}
	public void setEstimateValue(String estimateValue) {
		this.estimateValue = estimateValue;
	}

	public String getHistoryValue() {
		return this.historyValue;
	}
	public void setHistoryValue(String historyValue) {
		this.historyValue = historyValue;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getRetrievalCount() {
		return this.retrievalCount;
	}
	public void setRetrievalCount(Long retrievalCount) {
		this.retrievalCount = retrievalCount;
	}

	public Long getSellCount() {
		return this.sellCount;
	}
	public void setSellCount(Long sellCount) {
		this.sellCount = sellCount;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Long getTransportCount() {
		return this.transportCount;
	}
	public void setTransportCount(Long transportCount) {
		this.transportCount = transportCount;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getWarnCount() {
		return this.warnCount;
	}
	public void setWarnCount(Long warnCount) {
		this.warnCount = warnCount;
	}

}
