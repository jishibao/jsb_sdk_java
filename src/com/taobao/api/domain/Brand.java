package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 品牌
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Brand extends TaobaoObject {

	private static final long serialVersionUID = 4315188947742329793L;

	/**
	 * vid的值
	 */
	@ApiField("name")
	private String name;

	/**
	 * 品牌的属性id
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * 品牌的属性名
	 */
	@ApiField("prop_name")
	private String propName;

	/**
	 * 对应属性的 pid:vid 串中的vid
	 */
	@ApiField("vid")
	private Long vid;


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public Long getVid() {
		return this.vid;
	}
	public void setVid(Long vid) {
		this.vid = vid;
	}

}
