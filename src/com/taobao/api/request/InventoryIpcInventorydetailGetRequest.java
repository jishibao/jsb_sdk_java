package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.InventoryIpcInventorydetailGetResponse;

/**
 * TOP API: taobao.inventory.ipc.inventorydetail.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.06
 */
public class InventoryIpcInventorydetailGetRequest extends BaseTaobaoRequest<InventoryIpcInventorydetailGetResponse> {
	
	

	/** 
	* 主订单号，可选
	 */
	private Long bizOrderId;

	/** 
	* 子订单号，可选
	 */
	private Long bizSubOrderId;

	/** 
	* 当前页数
	 */
	private Long pageIndex;

	/** 
	* 一页显示多少条
	 */
	private Long pageSize;

	/** 
	* 仓储商品id
	 */
	private Long scItemId;

	/** 
	* 1:查询预扣  4：查询占用
	 */
	private Long statusQuery;

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public void setBizSubOrderId(Long bizSubOrderId) {
		this.bizSubOrderId = bizSubOrderId;
	}

	public Long getBizSubOrderId() {
		return this.bizSubOrderId;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setScItemId(Long scItemId) {
		this.scItemId = scItemId;
	}

	public Long getScItemId() {
		return this.scItemId;
	}

	public void setStatusQuery(Long statusQuery) {
		this.statusQuery = statusQuery;
	}

	public Long getStatusQuery() {
		return this.statusQuery;
	}

	public String getApiMethodName() {
		return "taobao.inventory.ipc.inventorydetail.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_order_id", this.bizOrderId);
		txtParams.put("biz_sub_order_id", this.bizSubOrderId);
		txtParams.put("page_index", this.pageIndex);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("sc_item_id", this.scItemId);
		txtParams.put("status_query", this.statusQuery);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryIpcInventorydetailGetResponse> getResponseClass() {
		return InventoryIpcInventorydetailGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMinValue(bizOrderId, 0L, "bizOrderId");
		RequestCheckUtils.checkMinValue(bizSubOrderId, 0L, "bizSubOrderId");
		RequestCheckUtils.checkNotEmpty(pageIndex, "pageIndex");
		RequestCheckUtils.checkMinValue(pageIndex, 0L, "pageIndex");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(scItemId, "scItemId");
		RequestCheckUtils.checkNotEmpty(statusQuery, "statusQuery");
		RequestCheckUtils.checkMinValue(statusQuery, 1L, "statusQuery");
	}
	

}