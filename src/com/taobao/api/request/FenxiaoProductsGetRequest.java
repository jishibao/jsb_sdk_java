package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductsGetResponse;

/**
 * TOP API: taobao.fenxiao.products.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.12.12
 */
public class FenxiaoProductsGetRequest extends BaseTaobaoRequest<FenxiaoProductsGetResponse> {
	
	

	/** 
	* 结束修改时间
	 */
	private Date endModified;

	/** 
	* 指定查询额外的信息，可选值：skus（sku数据）、images（多图），多个可选值用逗号分割，如果不传，则不查询库存。
	 */
	private String fields;

	/** 
	* 查询产品列表时，查询入参“是否需要授权”<br/>yes:需要授权 <br/>no:不需要授权
	 */
	private String isAuthz;

	/** 
	* 可根据导入的商品ID列表查询，优先级次于产品ID、sku_numbers，高于其他分页查询条件。最大限制20，用逗号分割，例如：“1001,1002,1003,1004,1005”
	 */
	private String itemIds;

	/** 
	* 商家编码
	 */
	private String outerId;

	/** 
	* 页码（大于0的整数，默认1）
	 */
	private Long pageNo;

	/** 
	* 每页记录数（默认20，最大30）
	 */
	private Long pageSize;

	/** 
	* 产品ID列表（最大限制30），用逗号分割，例如：“1001,1002,1003,1004,1005”
	 */
	private String pids;

	/** 
	* 产品线ID
	 */
	private Long productcatId;

	/** 
	* sku商家编码
	 */
	private String skuNumber;

	/** 
	* 开始修改时间
	 */
	private Date startModified;

	/** 
	* 产品状态，可选值：up（上架）、down（下架），不传默认查询所有
	 */
	private String status;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}

	public Date getEndModified() {
		return this.endModified;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setIsAuthz(String isAuthz) {
		this.isAuthz = isAuthz;
	}

	public String getIsAuthz() {
		return this.isAuthz;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public String getItemIds() {
		return this.itemIds;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
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

	public void setPids(String pids) {
		this.pids = pids;
	}

	public String getPids() {
		return this.pids;
	}

	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}

	public Long getProductcatId() {
		return this.productcatId;
	}

	public void setSkuNumber(String skuNumber) {
		this.skuNumber = skuNumber;
	}

	public String getSkuNumber() {
		return this.skuNumber;
	}

	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}

	public Date getStartModified() {
		return this.startModified;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.products.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_modified", this.endModified);
		txtParams.put("fields", this.fields);
		txtParams.put("is_authz", this.isAuthz);
		txtParams.put("item_ids", this.itemIds);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pids", this.pids);
		txtParams.put("productcat_id", this.productcatId);
		txtParams.put("sku_number", this.skuNumber);
		txtParams.put("start_modified", this.startModified);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductsGetResponse> getResponseClass() {
		return FenxiaoProductsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(itemIds, 20, "itemIds");
		RequestCheckUtils.checkMaxListSize(pids, 30, "pids");
	}
	

}