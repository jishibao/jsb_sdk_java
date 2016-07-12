package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbReplenishStatisticsResponse;

/**
 * TOP API: taobao.wlb.replenish.statistics request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbReplenishStatisticsRequest extends BaseTaobaoRequest<WlbReplenishStatisticsResponse> {
	
	

	/** 
	* 商品编码
	 */
	private String itemCode;

	/** 
	* 商品名称
	 */
	private String name;

	/** 
	* 分页参数，默认第一页
	 */
	private Long pageNo;

	/** 
	* 分页每页页数，默认20，最大50
	 */
	private Long pageSize;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
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
		return "taobao.wlb.replenish.statistics";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_code", this.itemCode);
		txtParams.put("name", this.name);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbReplenishStatisticsResponse> getResponseClass() {
		return WlbReplenishStatisticsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
	}
	

}