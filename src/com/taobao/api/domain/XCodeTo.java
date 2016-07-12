package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 二维码数据对像
 *
 * @author top auto create
 * @since 1.0, null
 */
public class XCodeTo extends TaobaoObject {

	private static final long serialVersionUID = 3133521721375164938L;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 最后修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 记录ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 二维码图片地址
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 有效期结束时间，使用短链接跳转的，结束后不再可以访问
	 */
	@ApiField("life_end")
	private Date lifeEnd;

	/**
	 * 有效期开始时间
	 */
	@ApiField("life_start")
	private Date lifeStart;

	/**
	 * 短连接关键字符
	 */
	@ApiField("short_name")
	private String shortName;

	/**
	 * 短连接
	 */
	@ApiField("short_url")
	private String shortUrl;

	/**
	 * 码的状态，1-生效，0-未生效，-1-逻辑删除。
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 所属用户ID，如果入参没有用户登录信息，则随机生成
	 */
	@ApiField("user_id")
	private Long userId;


	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Date getLifeEnd() {
		return this.lifeEnd;
	}
	public void setLifeEnd(Date lifeEnd) {
		this.lifeEnd = lifeEnd;
	}

	public Date getLifeStart() {
		return this.lifeStart;
	}
	public void setLifeStart(Date lifeStart) {
		this.lifeStart = lifeStart;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getShortUrl() {
		return this.shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
