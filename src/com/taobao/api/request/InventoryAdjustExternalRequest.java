package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.InventoryAdjustExternalResponse;

/**
 * TOP API: taobao.inventory.adjust.external request
 * 
 * @author top auto create
 * @since 1.0, 2014.09.24
 */
public class InventoryAdjustExternalRequest extends BaseTaobaoRequest<InventoryAdjustExternalResponse> {
	
	

	/** 
	* 外部订单类型：ALLOCATE:调拨、 RETURN:退货、PURCHACE：采购、BALANCE:盘点、NON_TAOBAO_TRADE：非淘宝交易、OTHERS：其他
	 */
	private String bizType;

	/** 
	* 商家外部定单号
	 */
	private String bizUniqueCode;

	/** 
	* 商品初始库存信息： [{"scItemId":"商品后端ID，如果有传scItemCode,参数可以为0","scItemCode":"商品商家编码","inventoryType":"库存类型  1：正常,”direction”: 1: 盘盈 -1: 盘亏,参数可选,"quantity":"数量(正数)"}]
	 */
	private String items;

	/** 
	* 库存占用返回的操作码.operate_type 为OUTBOUND时，如果是确认事先进行过的库存占用，需要传入当时返回的操作码，并且明细必须与申请时保持一致
	 */
	private String occupyOperateCode;

	/** 
	* 业务操作时间
	 */
	private Date operateTime;

	/** 
	* 库存操作类别：INBOUND：入库 OUTBOUND: 出库BALANCE: 盘点
	 */
	private String operateType;

	/** 
	* 出库时库存扣减类型，operate_type为OUTBOUND时有效。 
AUTO_CALCULATE:自动计算可供扣减，如果库存不够返回失败 ClIENT_FORCE：强制要求最大化扣减，有多少扣多少
	 */
	private String reduceType;

	/** 
	* 商家仓库编码
	 */
	private String storeCode;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizUniqueCode(String bizUniqueCode) {
		this.bizUniqueCode = bizUniqueCode;
	}

	public String getBizUniqueCode() {
		return this.bizUniqueCode;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getItems() {
		return this.items;
	}

	public void setOccupyOperateCode(String occupyOperateCode) {
		this.occupyOperateCode = occupyOperateCode;
	}

	public String getOccupyOperateCode() {
		return this.occupyOperateCode;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setReduceType(String reduceType) {
		this.reduceType = reduceType;
	}

	public String getReduceType() {
		return this.reduceType;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.inventory.adjust.external";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_type", this.bizType);
		txtParams.put("biz_unique_code", this.bizUniqueCode);
		txtParams.put("items", this.items);
		txtParams.put("occupy_operate_code", this.occupyOperateCode);
		txtParams.put("operate_time", this.operateTime);
		txtParams.put("operate_type", this.operateType);
		txtParams.put("reduce_type", this.reduceType);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryAdjustExternalResponse> getResponseClass() {
		return InventoryAdjustExternalResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizType, "bizType");
		RequestCheckUtils.checkNotEmpty(bizUniqueCode, "bizUniqueCode");
		RequestCheckUtils.checkNotEmpty(items, "items");
		RequestCheckUtils.checkNotEmpty(operateTime, "operateTime");
		RequestCheckUtils.checkNotEmpty(operateType, "operateType");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
	}
	

}