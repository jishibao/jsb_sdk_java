package com.taobao.api.request;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.Productitemswlbwmsstockpruductprocessingnotify;
import com.taobao.api.domain.Materialitemswlbwmsstockpruductprocessingnotify;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsStockPruductProcessingNotifyResponse;

/**
 * TOP API: taobao.wlb.wms.stock.pruduct.processing.notify request
 * 
 * @author top auto create
 * @since 1.0, 2015.08.17
 */
public class WlbWmsStockPruductProcessingNotifyRequest extends BaseTaobaoRequest<WlbWmsStockPruductProcessingNotifyResponse> {
	
	

	/** 
	* 拓展属性，key-value结构，格式要求： 以英文分号“;”分隔每组key-value，以英文冒号“:”分隔key与value。如果value中带有分号，需要转成下划线“_”，如果带有冒号，需要转成中划线“-”
	 */
	private String extendFields;

	/** 
	* 原料商品列表
	 */
	private String materialItems;

	/** 
	* ERP单据编码
	 */
	private String orderCode;

	/** 
	* ERP单据创建时间
	 */
	private Date orderCreateTime;

	/** 
	* 单据类型 1102 仓内加工作业单
	 */
	private Long orderType;

	/** 
	* 计划数量
	 */
	private Long planQty;

	/** 
	* ERP计划加工时间
	 */
	private Date planWorkTime;

	/** 
	* 成品商品列表
	 */
	private String productItems;

	/** 
	* 备注
	 */
	private String remark;

	/** 
	* 加工类型: 1:仓内组合加工、2:仓内组合拆分
	 */
	private Long serviceType;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getExtendFields() {
		return this.extendFields;
	}

	public void setMaterialItems(String materialItems) {
		this.materialItems = materialItems;
	}

	public void setMaterialItems(List<Materialitemswlbwmsstockpruductprocessingnotify> materialItems) {
		this.materialItems = new JSONWriter(false,true).write(materialItems);
	}

	public String getMaterialItems() {
		return this.materialItems;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}

	public void setOrderType(Long orderType) {
		this.orderType = orderType;
	}

	public Long getOrderType() {
		return this.orderType;
	}

	public void setPlanQty(Long planQty) {
		this.planQty = planQty;
	}

	public Long getPlanQty() {
		return this.planQty;
	}

	public void setPlanWorkTime(Date planWorkTime) {
		this.planWorkTime = planWorkTime;
	}

	public Date getPlanWorkTime() {
		return this.planWorkTime;
	}

	public void setProductItems(String productItems) {
		this.productItems = productItems;
	}

	public void setProductItems(List<Productitemswlbwmsstockpruductprocessingnotify> productItems) {
		this.productItems = new JSONWriter(false,true).write(productItems);
	}

	public String getProductItems() {
		return this.productItems;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public Long getServiceType() {
		return this.serviceType;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.stock.pruduct.processing.notify";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("extend_fields", this.extendFields);
		txtParams.put("material_items", this.materialItems);
		txtParams.put("order_code", this.orderCode);
		txtParams.put("order_create_time", this.orderCreateTime);
		txtParams.put("order_type", this.orderType);
		txtParams.put("plan_qty", this.planQty);
		txtParams.put("plan_work_time", this.planWorkTime);
		txtParams.put("product_items", this.productItems);
		txtParams.put("remark", this.remark);
		txtParams.put("service_type", this.serviceType);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsStockPruductProcessingNotifyResponse> getResponseClass() {
		return WlbWmsStockPruductProcessingNotifyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(materialItems, 1000, "materialItems");
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkObjectMaxListSize(productItems, 1000, "productItems");
		RequestCheckUtils.checkNotEmpty(serviceType, "serviceType");
	}
	

}