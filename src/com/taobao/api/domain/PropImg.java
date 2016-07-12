package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品属性图片结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PropImg extends TaobaoObject {

	private static final long serialVersionUID = 2799975183143911166L;

	/**
	 * 图片创建时间 时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 属性图片的id，和商品相对应
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 图片放在第几张（多图时可设置）
	 */
	@ApiField("position")
	private Long position;

	/**
	 * 图片所对应的属性组合的字符串
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 图片链接地址
	 */
	@ApiField("url")
	private String url;


	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
