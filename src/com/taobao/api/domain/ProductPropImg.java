package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 产品属性图片
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ProductPropImg extends TaobaoObject {

	private static final long serialVersionUID = 4699777765517346219L;

	/**
	 * 添加时间.格式:yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 产品属性图片ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 修改时间.格式:yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 图片序号。产品里的图片展示顺序，数据越小越靠前。要求是正整数。
	 */
	@ApiField("position")
	private Long position;

	/**
	 * 图片所属产品的ID
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 属性串(pid:vid),目前只有颜色属性.如:颜色:红色表示为　1627207:28326
	 */
	@ApiField("props")
	private String props;

	/**
	 * 图片地址.(绝对地址,格式:http://host/image_path)
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

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProps() {
		return this.props;
	}
	public void setProps(String props) {
		this.props = props;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
