package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemBatchQueryResponse;

/**
 * TOP API: taobao.wlb.item.batch.query request
 * 
 * @author top auto create
 * @since 1.0, 2014.11.04
 */
public class WlbItemBatchQueryRequest extends BaseTaobaoRequest<WlbItemBatchQueryResponse> {
	
	

	/** 
	* 需要查询的商品ID列表，以字符串表示，ID间以;隔开
	 */
	private String itemIds;

	/** 
	* 分页查询参数，指定查询页数，默认为1
	 */
	private Long pageNo;

	/** 
	* 分页查询参数，每页查询数量，默认20，最大值50,大于50时按照50条查询
	 */
	private Long pageSize;

	/** 
	* 仓库编号
	 */
	private String storeCode;

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public String getItemIds() {
		return this.itemIds;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.batch.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_ids", this.itemIds);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemBatchQueryResponse> getResponseClass() {
		return WlbItemBatchQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemIds, "itemIds");
	}
	

}