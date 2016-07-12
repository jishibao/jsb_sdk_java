package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 店铺类目
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ShopCat extends TaobaoObject {

	private static final long serialVersionUID = 7457116748316937668L;

	/**
	 * 类目编号
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 该类目是否为父类目。即：该类目是否还有子类目
	 */
	@ApiField("is_parent")
	private Boolean isParent;

	/**
	 * 类目名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父类目编号，注：此类目指前台类目，值等于0：表示此类目为一级类目，值不等于0：表示此类目有父类目
	 */
	@ApiField("parent_cid")
	private Long parentCid;


	public Long getCid() {
		return this.cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
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

}
