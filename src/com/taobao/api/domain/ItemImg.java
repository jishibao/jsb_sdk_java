package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * ItemImg结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemImg extends TaobaoObject {

	private static final long serialVersionUID = 1125873215354447295L;

	/**
	 * 图片创建时间 时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 商品图片的id，和商品相对应（主图id默认为0）
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 图片放在第几张（多图时可设置）
	 */
	@ApiField("position")
	private Long position;

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

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
