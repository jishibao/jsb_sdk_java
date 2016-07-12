package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品视频关联记录
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Video extends TaobaoObject {

	private static final long serialVersionUID = 1465719922771151316L;

	/**
	 * 视频关联记录创建时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 视频关联记录的id，和商品相对应
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 视频记录关联的商品的数字id(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 视频关联记录修改时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 视频记录所关联的商品的数字id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * video的url连接地址。淘秀里视频记录里面存储的url地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * video的id，对应于视频在淘秀的存储记录
	 */
	@ApiField("video_id")
	private Long videoId;


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

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Long getVideoId() {
		return this.videoId;
	}
	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

}
