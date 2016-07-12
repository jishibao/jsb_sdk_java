package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 图片
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Picture extends TaobaoObject {

	private static final long serialVersionUID = 8814287192596473332L;

	/**
	 * 图片上传的来源，有电脑版本宝贝发布，手机版本宝贝发布
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 图片的创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 图片是否删除的标记
	 */
	@ApiField("deleted")
	private String deleted;

	/**
	 * 上传时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 图片在后台处理之后的md5值当md5值为32位长度的字符串时为图片搬家后的文件md5验证码md5值为长整数时为图片替换后的时间戳
	 */
	@ApiField("md5")
	private String md5;

	/**
	 * 图片的修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 图片分类ID
	 */
	@ApiField("picture_category_id")
	private Long pictureCategoryId;

	/**
	 * 图片ID
	 */
	@ApiField("picture_id")
	private Long pictureId;

	/**
	 * 返回的是绝对路径如：http://img07.taobaocdn.com/imgextra/i7/22670458/T2dD0kXb4cXXXXXXXX_!!22670458.jpg
	 */
	@ApiField("picture_path")
	private String picturePath;

	/**
	 * 图片相素,格式:长x宽，如450x150
	 */
	@ApiField("pixel")
	private String pixel;

	/**
	 * 图片是否被引用
	 */
	@ApiField("referenced")
	private Boolean referenced;

	/**
	 * 图片大小,bite单位
	 */
	@ApiField("sizes")
	private Long sizes;

	/**
	 * 图片状态,unfroze代表没有被冻结，froze代表被冻结,pass代表排查通过
	 */
	@ApiField("status")
	private String status;

	/**
	 * 是否删除
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 图片标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 卖家ID
	 */
	@ApiField("uid")
	private Long uid;


	public String getClientType() {
		return this.clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getDeleted() {
		return this.deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

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

	public String getMd5() {
		return this.md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
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

	public Long getPictureCategoryId() {
		return this.pictureCategoryId;
	}
	public void setPictureCategoryId(Long pictureCategoryId) {
		this.pictureCategoryId = pictureCategoryId;
	}

	public Long getPictureId() {
		return this.pictureId;
	}
	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}

	public String getPicturePath() {
		return this.picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public String getPixel() {
		return this.pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public Boolean getReferenced() {
		return this.referenced;
	}
	public void setReferenced(Boolean referenced) {
		this.referenced = referenced;
	}

	public Long getSizes() {
		return this.sizes;
	}
	public void setSizes(Long sizes) {
		this.sizes = sizes;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getUid() {
		return this.uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}

}
