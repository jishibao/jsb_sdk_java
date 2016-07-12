package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 属性值
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PropValue extends TaobaoObject {

	private static final long serialVersionUID = 5339423457214998561L;

	/**
	 * 类目ID
	 */
	@ApiField("cid")
	private Long cid;

	/**
	 * 属性值feature
	 */
	@ApiListField("features")
	@ApiField("feature")
	private List<Feature> features;

	/**
	 * 是否为父类目属性
	 */
	@ApiField("is_parent")
	private Boolean isParent;

	/**
	 * 修改时间（类目增量专用）
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 三种枚举类型：modify，add，delete (增量类目专用)
	 */
	@ApiField("modified_type")
	private String modifiedType;

	/**
	 * 属性值
	 */
	@ApiField("name")
	private String name;

	/**
	 * 属性值别名
	 */
	@ApiField("name_alias")
	private String nameAlias;

	/**
	 * 属性 ID
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * 属性名
	 */
	@ApiField("prop_name")
	private String propName;

	/**
	 * 排列序号。取值范围:大于零的整数
	 */
	@ApiField("sort_order")
	private Long sortOrder;

	/**
	 * 状态。可选值:normal(正常),deleted(删除)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 属性值ID
	 */
	@ApiField("vid")
	private Long vid;


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

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getModifiedType() {
		return this.modifiedType;
	}
	public void setModifiedType(String modifiedType) {
		this.modifiedType = modifiedType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNameAlias() {
		return this.nameAlias;
	}
	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPropName() {
		return this.propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
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

	public Long getVid() {
		return this.vid;
	}
	public void setVid(Long vid) {
		this.vid = vid;
	}

}
