package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDiscountUpdateResponse;

/**
 * TOP API: taobao.fenxiao.discount.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class FenxiaoDiscountUpdateRequest extends BaseTaobaoRequest<FenxiaoDiscountUpdateResponse> {
	
	

	/** 
	* 详情ID，例如：”0,1002,1003”
	 */
	private String detailIds;

	/** 
	* ADD(新增)、UPDATE（更新）、DEL（删除，对应的target_type等信息填NULL），例如：”UPDATE,DEL,DEL”
	 */
	private String detailStatuss;

	/** 
	* 折扣ID
	 */
	private Long discountId;

	/** 
	* 折扣名称，长度不能超过25字节
	 */
	private String discountName;

	/** 
	* 状态DEL（删除）UPDATE(更新)
	 */
	private String discountStatus;

	/** 
	* PERCENT（按折扣优惠）、PRICE（按减价优惠），例如"PERCENT,PRICE,PERCENT"
	 */
	private String discountTypes;

	/** 
	* 优惠比率或者优惠价格，例如：”8000,-2300,7000”,大小为-100000000到100000000之间（单位：分）
	 */
	private String discountValues;

	/** 
	* 会员等级的id或者分销商id，例如：”1001,2001,1002”
	 */
	private String targetIds;

	/** 
	* GRADE（按会员等级优惠）、DISTRIBUTOR（按分销商优惠），例如"GRADE,DISTRIBUTOR"
	 */
	private String targetTypes;

	public void setDetailIds(String detailIds) {
		this.detailIds = detailIds;
	}

	public String getDetailIds() {
		return this.detailIds;
	}

	public void setDetailStatuss(String detailStatuss) {
		this.detailStatuss = detailStatuss;
	}

	public String getDetailStatuss() {
		return this.detailStatuss;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Long getDiscountId() {
		return this.discountId;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountName() {
		return this.discountName;
	}

	public void setDiscountStatus(String discountStatus) {
		this.discountStatus = discountStatus;
	}

	public String getDiscountStatus() {
		return this.discountStatus;
	}

	public void setDiscountTypes(String discountTypes) {
		this.discountTypes = discountTypes;
	}

	public String getDiscountTypes() {
		return this.discountTypes;
	}

	public void setDiscountValues(String discountValues) {
		this.discountValues = discountValues;
	}

	public String getDiscountValues() {
		return this.discountValues;
	}

	public void setTargetIds(String targetIds) {
		this.targetIds = targetIds;
	}

	public String getTargetIds() {
		return this.targetIds;
	}

	public void setTargetTypes(String targetTypes) {
		this.targetTypes = targetTypes;
	}

	public String getTargetTypes() {
		return this.targetTypes;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.discount.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("detail_ids", this.detailIds);
		txtParams.put("detail_statuss", this.detailStatuss);
		txtParams.put("discount_id", this.discountId);
		txtParams.put("discount_name", this.discountName);
		txtParams.put("discount_status", this.discountStatus);
		txtParams.put("discount_types", this.discountTypes);
		txtParams.put("discount_values", this.discountValues);
		txtParams.put("target_ids", this.targetIds);
		txtParams.put("target_types", this.targetTypes);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDiscountUpdateResponse> getResponseClass() {
		return FenxiaoDiscountUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}