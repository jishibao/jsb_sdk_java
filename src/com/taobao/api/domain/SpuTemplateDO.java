package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * SPU发布模板，定义了产品发布需要那些关键属性，绑定属性。
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SpuTemplateDO extends TaobaoObject {

	private static final long serialVersionUID = 7537562968455691774L;

	/**
	 * 产品绑定属性，内容为属性ID(PID)的列表,绑定属性肯定在类目上有，对应属性的类目特征，子属性请根据PID到类目上去取
	 */
	@ApiListField("affect_properties")
	@ApiField("number")
	private List<Long> affectProperties;

	/**
	 * 类目ID
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 品类ID，和类目ID类似
	 */
	@ApiField("commodity_id")
	private Long commodityId;

	/**
	 * 过滤属性，内容有属性ID(PID)列表，很重要的属性，filter_properties包含的属性，必须填写
	 */
	@ApiListField("filter_properties")
	@ApiField("number")
	private List<Long> filterProperties;

	/**
	 * 产品关键属性，内容为属性ID(PID)的列表，注意关键属性可以在类目上不存在。不存在的PID，默认为输入，没有子属性。属性名称在prop_name_str中取
	 */
	@ApiListField("key_properties")
	@ApiField("number")
	private List<Long> keyProperties;

	/**
	 * 预留
	 */
	@ApiField("prop_features")
	private String propFeatures;

	/**
	 * 属性名称扁平化结构，只保证不在类目上的CP有值
	 */
	@ApiField("prop_name_str")
	private String propNameStr;

	/**
	 * 模板ID，发布产品，必须放到Product中
	 */
	@ApiField("template_id")
	private Long templateId;


	public List<Long> getAffectProperties() {
		return this.affectProperties;
	}
	public void setAffectProperties(List<Long> affectProperties) {
		this.affectProperties = affectProperties;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(Long commodityId) {
		this.commodityId = commodityId;
	}

	public List<Long> getFilterProperties() {
		return this.filterProperties;
	}
	public void setFilterProperties(List<Long> filterProperties) {
		this.filterProperties = filterProperties;
	}

	public List<Long> getKeyProperties() {
		return this.keyProperties;
	}
	public void setKeyProperties(List<Long> keyProperties) {
		this.keyProperties = keyProperties;
	}

	public String getPropFeatures() {
		return this.propFeatures;
	}
	public void setPropFeatures(String propFeatures) {
		this.propFeatures = propFeatures;
	}

	public String getPropNameStr() {
		return this.propNameStr;
	}
	public void setPropNameStr(String propNameStr) {
		this.propNameStr = propNameStr;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

}
