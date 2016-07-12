package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 商品类目结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemCat extends TaobaoObject {

	private static final long serialVersionUID = 2515861786164498737L;

	/**
	 * 商品所属类目ID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * Feature对象列表
目前已有的属性：
若Attr_key为 udsaleprop，attr_value为1 则允许卖家在改类目新增自定义销售属性,不然为不允许
	 */
	@ApiListField("features")
	@ApiField("feature")
	private List<Feature> features;

	/**
	 * 该类目是否为父类目(即：该类目是否还有子类目)
	 */
	@ApiField("is_parent")
	private Boolean isParent;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父类目ID=0时，代表的是一级的类目
	 */
	@ApiField("parent_cid")
	private Long parentCid;

	/**
	 * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * 状态。可选值:normal(正常),deleted(删除)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 是否度量衡类目
	 */
	@ApiField("taosir_cat")
	private Boolean taosirCat;


	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}

	public List<Feature> getFeatures() {
		return this.features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public Boolean getIsParent() {
		return this.isParent;
	}
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getParentCid() {
		return this.parentCid;
	}
	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getTaosirCat() {
		return this.taosirCat;
	}
	public void setTaosirCat(Boolean taosirCat) {
		this.taosirCat = taosirCat;
	}

}
