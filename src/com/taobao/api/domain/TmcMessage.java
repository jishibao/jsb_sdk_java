package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 消息通道的通用消息结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessage extends TaobaoObject {

	private static final long serialVersionUID = 1523668749959597245L;

	/**
	 * 消息详细内容，格式为JSON/XML
	 */
	@ApiField("content")
	private String content;

	/**
	 * 消息ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 消息发布者的AppKey
	 */
	@ApiField("pub_app_key")
	private String pubAppKey;

	/**
	 * 消息发布时间
	 */
	@ApiField("pub_time")
	private Date pubTime;

	/**
	 * 消息所属主题
	 */
	@ApiField("topic")
	private String topic;

	/**
	 * 消息所属的用户编号
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 用户的昵称
	 */
	@ApiField("user_nick")
	private String userNick;


	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPubAppKey() {
		return this.pubAppKey;
	}
	public void setPubAppKey(String pubAppKey) {
		this.pubAppKey = pubAppKey;
	}

	public Date getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

}
