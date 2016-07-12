package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbWmsInventoryQueryResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.query request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.16
 */
public class WlbWmsInventoryQueryRequest extends BaseTaobaoRequest<WlbWmsInventoryQueryResponse> {
	
	

	/** 
	* 库存批次号，type=2时字段传值有效。 商品设置为批次管理时，商品产生批次库存。当商品为批次管理时，此字段不传值，返回所有批次库存信息。
	 */
	private String batchCode;

	/** 
	* 渠道编码，type=3时字段传值有效。（TB 淘系， OTHERS 其他）
	 */
	private String channelCode;

	/** 
	* 失效日期，type=2时字段传值有效。
	 */
	private Date dueDate;

	/** 
	* 库存类型。 (1 正品 101 残次 102 机损 103 箱损 201 冻结库存 301 在途库存 )
	 */
	private Long inventoryType;

	/** 
	* 菜鸟商品ID
	 */
	private String itemId;

	/** 
	* 分页的第几页
	 */
	private Long pageNo;

	/** 
	* 每页多少条，最大50条
	 */
	private Long pageSize;

	/** 
	* 生产日期，type=2时字段传值有效。
	 */
	private Date produceDate;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	/** 
	* 库存查询类型 1-	汇总库存，不区分批次和渠道 2-	批次库存，库存按商品批次维度划分 3-	渠道库存，库存按渠道维度划分 （当前业务不支持批次库存和渠道库存共存，批次库存无渠道属性，渠道库存无批次属性）
	 */
	private Long type;

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getBatchCode() {
		return this.batchCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setInventoryType(Long inventoryType) {
		this.inventoryType = inventoryType;
	}

	public Long getInventoryType() {
		return this.inventoryType;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return this.itemId;
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

	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}

	public Date getProduceDate() {
		return this.produceDate;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.inventory.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("batch_code", this.batchCode);
		txtParams.put("channel_code", this.channelCode);
		txtParams.put("due_date", this.dueDate);
		txtParams.put("inventory_type", this.inventoryType);
		txtParams.put("item_id", this.itemId);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("produce_date", this.produceDate);
		txtParams.put("store_code", this.storeCode);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsInventoryQueryResponse> getResponseClass() {
		return WlbWmsInventoryQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}