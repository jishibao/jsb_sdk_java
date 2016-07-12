package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 分销商等级
 *
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoGrade extends TaobaoObject {

	private static final long serialVersionUID = 5777433476594611377L;

	/**
	 * 记录创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 主键
	 */
	@ApiField("grade_id")
	private Long gradeId;

	/**
	 * 记录最后修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 分销商等级名称
	 */
	@ApiField("name")
	private String name;


	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getGradeId() {
		return this.gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
