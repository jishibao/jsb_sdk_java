package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDistributorItemsGetResponse;

/**
 * TOP API: taobao.fenxiao.distributor.items.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.15
 */
public class FenxiaoDistributorItemsGetRequest extends BaseTaobaoRequest<FenxiaoDistributorItemsGetResponse> {
	
	

	/** 
	* 分销商ID 。
	 */
	private Long distributorId;

	/** 
	* 设置结束时间,空为不设置。
	 */
	private Date endModified;

	/** 
	* 页码（大于0的整数，默认1）
	 */
	private Long pageNo;

	/** 
	* 每页记录数（默认20，最大50）
	 */
	private Long pageSize;

	/** 
	* 产品ID
	 */
	private Long productId;

	/** 
	* 设置开始时间。空为不设置。
	 */
	private Date startModified;

	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public Long getDistributorId() {
		return this.distributorId;
	}

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}

	public Date getEndModified() {
		return this.endModified;
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

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}

	public Date getStartModified() {
		return this.startModified;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.distributor.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("distributor_id", this.distributorId);
		txtParams.put("end_modified", this.endModified);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("product_id", this.productId);
		txtParams.put("start_modified", this.startModified);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDistributorItemsGetResponse> getResponseClass() {
		return FenxiaoDistributorItemsGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}