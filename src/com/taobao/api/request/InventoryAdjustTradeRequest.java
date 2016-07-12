package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.InventoryAdjustTradeResponse;

/**
 * TOP API: taobao.inventory.adjust.trade request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.14
 */
public class InventoryAdjustTradeRequest extends BaseTaobaoRequest<InventoryAdjustTradeResponse> {
	
	

	/** 
	* 商家外部定单号
	 */
	private String bizUniqueCode;

	/** 
	* 商品初始库存信息： [{ "TBOrderCode”:”淘宝交易号”,"TBSubOrderCode ":"淘宝子交易单号,赠品可以不填","”isGift”:”TRUE或者FALSE,是否赠品”,storeCode":"商家仓库编码"," scItemId ":"商品后端ID","scItemCode":"商品商家编码"," originScItemId ":"原商品ID","inventoryType":"","quantity":"111","isComplete":"TRUE或者FALSE，是否全部确认出库"}]
	 */
	private String items;

	/** 
	* 业务操作时间
	 */
	private Date operateTime;

	/** 
	* 订单类型：B2C、B2B
	 */
	private String tbOrderType;

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

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}

	public void setTbOrderType(String tbOrderType) {
		this.tbOrderType = tbOrderType;
	}

	public String getTbOrderType() {
		return this.tbOrderType;
	}

	public String getApiMethodName() {
		return "taobao.inventory.adjust.trade";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_unique_code", this.bizUniqueCode);
		txtParams.put("items", this.items);
		txtParams.put("operate_time", this.operateTime);
		txtParams.put("tb_order_type", this.tbOrderType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryAdjustTradeResponse> getResponseClass() {
		return InventoryAdjustTradeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizUniqueCode, "bizUniqueCode");
		RequestCheckUtils.checkNotEmpty(items, "items");
		RequestCheckUtils.checkNotEmpty(operateTime, "operateTime");
		RequestCheckUtils.checkNotEmpty(tbOrderType, "tbOrderType");
	}
	

}