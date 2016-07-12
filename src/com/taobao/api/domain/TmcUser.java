package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 消息通道的用户结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TmcUser extends TaobaoObject {

	private static final long serialVersionUID = 4783118122379758761L;

	/**
	 * 用户首次开通时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 接收用户消息的组名
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 用户授权是否有效，true表示授权有效，false表示授权过期
	 */
	@ApiField("is_valid")
	private Boolean isValid;

	/**
	 * 用户最后开通时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 用户开通的消息类型列表。如果为空表示应用开通的所有类型
	 */
	@ApiListField("topics")
	@ApiField("string")
	private List<String> topics;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private Long userId;

	/**
	 * 用户昵称
	 */
	@ApiField("user_nick")
	private String userNick;

	/**
	 * 用户所属的平台类型，tbUIC:淘宝用户; icbu: icbu用户
	 */
	@ApiField("user_platform")
	private String userPlatform;


	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Boolean getIsValid() {
		return this.isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public List<String> getTopics() {
		return this.topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
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

	public String getUserPlatform() {
		return this.userPlatform;
	}
	public void setUserPlatform(String userPlatform) {
		this.userPlatform = userPlatform;
	}

}
