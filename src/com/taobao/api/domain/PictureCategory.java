package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 图片分类
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PictureCategory extends TaobaoObject {

	private static final long serialVersionUID = 3451729349615226631L;

	/**
	 * 图片类目的创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 图片分类的修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 一级分类的parent_id为0
二级分类的则为其父分类的picture_category_id
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * 图片分类ID
	 */
	@ApiField("picture_category_id")
	private Long pictureCategoryId;

	/**
	 * 图片分类名
	 */
	@ApiField("picture_category_name")
	private String pictureCategoryName;

	/**
	 * 图片分类排序
	 */
	@ApiField("position")
	private Long position;

	/**
	 * 分类下的图片数
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 图片分类型别，sys-fixture代表店铺装修分类(系统分类)，sys-auction代表宝贝图片分类(系统分类)，user-define代表用户自定义分类
	 */
	@ApiField("type")
	private String type;


	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}
	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}

	public String getPictureCategoryName() {
		return this.pictureCategoryName;
	}
	public void setPictureCategoryName(String pictureCategoryName) {
		this.pictureCategoryName = pictureCategoryName;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
