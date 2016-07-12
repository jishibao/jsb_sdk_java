package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 宝贝主图视频数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class MpicVideo extends TaobaoObject {

	private static final long serialVersionUID = 6443171368223911135L;

	/**
	 * 主图视频记录所关联的商品的数字id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 主图视频的时长，单位：秒
	 */
	@ApiField("video_duaration")
	private Long videoDuaration;

	/**
	 * 主图视频的在淘视频中的ID
	 */
	@ApiField("video_id")
	private Long videoId;

	/**
	 * 主图视频的缩略图URL
	 */
	@ApiField("video_pic")
	private String videoPic;

	/**
	 * 主图视频的状态
	 */
	@ApiField("video_status")
	private Long videoStatus;


	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getVideoDuaration() {
		return this.videoDuaration;
	}
	public void setVideoDuaration(Long videoDuaration) {
		this.videoDuaration = videoDuaration;
	}

	public Long getVideoId() {
		return this.videoId;
	}
	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public String getVideoPic() {
		return this.videoPic;
	}
	public void setVideoPic(String videoPic) {
		this.videoPic = videoPic;
	}

	public Long getVideoStatus() {
		return this.videoStatus;
	}
	public void setVideoStatus(Long videoStatus) {
		this.videoStatus = videoStatus;
	}

}
