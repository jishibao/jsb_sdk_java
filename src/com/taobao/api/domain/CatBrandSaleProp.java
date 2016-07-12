package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 被管控的品牌和类目的所对应的销售属性
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CatBrandSaleProp extends TaobaoObject {

	private static final long serialVersionUID = 8449616884725878254L;

	/**
	 * 被管控的品牌的Id
	 */
	@ApiField("brand_id")
	private Long brandId;

	/**
	 * 被管控的类目ID
	 */
	@ApiField("cat_id")
	private Long catId;

	/**
	 * 如果该属性为营销属性，则获取默认值
	 */
	@ApiField("def_market_prop_value")
	private Long defMarketPropValue;

	/**
	 * true表示：不是产品的规格属性
false表示：是产品的规格属性。
	 */
	@ApiField("is_not_spec")
	private Boolean isNotSpec;

	/**
	 * 被管控的销售属性ID
	 */
	@ApiField("property_id")
	private Long propertyId;


	public Long getBrandId() {
		return this.brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getCatId() {
		return this.catId;
	}
	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public Long getDefMarketPropValue() {
		return this.defMarketPropValue;
	}
	public void setDefMarketPropValue(Long defMarketPropValue) {
		this.defMarketPropValue = defMarketPropValue;
	}

	public Boolean getIsNotSpec() {
		return this.isNotSpec;
	}
	public void setIsNotSpec(Boolean isNotSpec) {
		this.isNotSpec = isNotSpec;
	}

	public Long getPropertyId() {
		return this.propertyId;
	}
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

}
