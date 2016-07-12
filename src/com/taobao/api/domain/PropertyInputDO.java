package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 属性输入特征DO
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PropertyInputDO extends TaobaoObject {

	private static final long serialVersionUID = 6713148758723811679L;

	/**
	 * property_id对应的属性是否可输入
	 */
	@ApiField("is_allow_input")
	private Boolean isAllowInput;

	/**
	 * 如果property_id对应的属性是子属性，is_root_allow_input标识该子属性的顶级父属性是否可输入。否则is_root_allow_input和is_allow_input
值是一样的。目前只有品牌会出现父属性不可输入，子属性可输入的情况
	 */
	@ApiField("is_root_allow_input")
	private Boolean isRootAllowInput;

	/**
	 * property_id对应的属性是不是子属性
	 */
	@ApiField("is_sub_property")
	private Boolean isSubProperty;

	/**
	 * 属性ID
	 */
	@ApiField("property_id")
	private Long propertyId;


	public Boolean getIsAllowInput() {
		return this.isAllowInput;
	}
	public void setIsAllowInput(Boolean isAllowInput) {
		this.isAllowInput = isAllowInput;
	}

	public Boolean getIsRootAllowInput() {
		return this.isRootAllowInput;
	}
	public void setIsRootAllowInput(Boolean isRootAllowInput) {
		this.isRootAllowInput = isRootAllowInput;
	}

	public Boolean getIsSubProperty() {
		return this.isSubProperty;
	}
	public void setIsSubProperty(Boolean isSubProperty) {
		this.isSubProperty = isSubProperty;
	}

	public Long getPropertyId() {
		return this.propertyId;
	}
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

}
