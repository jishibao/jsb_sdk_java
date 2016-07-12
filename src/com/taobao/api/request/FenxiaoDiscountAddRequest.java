package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoDiscountAddResponse;

/**
 * TOP API: taobao.fenxiao.discount.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class FenxiaoDiscountAddRequest extends BaseTaobaoRequest<FenxiaoDiscountAddResponse> {
	
	

	/** 
	* 折扣名称,长度不能超过25字节
	 */
	private String discountName;

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

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountName() {
		return this.discountName;
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
		return "taobao.fenxiao.discount.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("discount_name", this.discountName);
		txtParams.put("discount_types", this.discountTypes);
		txtParams.put("discount_values", this.discountValues);
		txtParams.put("target_ids", this.targetIds);
		txtParams.put("target_types", this.targetTypes);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDiscountAddResponse> getResponseClass() {
		return FenxiaoDiscountAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(discountName, "discountName");
		RequestCheckUtils.checkNotEmpty(discountTypes, "discountTypes");
		RequestCheckUtils.checkNotEmpty(discountValues, "discountValues");
		RequestCheckUtils.checkNotEmpty(targetIds, "targetIds");
		RequestCheckUtils.checkNotEmpty(targetTypes, "targetTypes");
	}
	

}