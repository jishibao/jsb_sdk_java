package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 删除延迟消息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class RemoveDelayMessageRequest extends TaobaoObject {

	private static final long serialVersionUID = 6594359359177912196L;

	/**
	 * appKey
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 业务域
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 延迟发送id
	 */
	@ApiField("delay_task_id")
	private String delayTaskId;

	/**
	 * 用于场景隔离，如果外部id可以保证唯一，可以忽略此字段
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 外部id，如果发送时指定了外部id，删除可以使用之前的id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private Long userId;


	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public String getDelayTaskId() {
		return this.delayTaskId;
	}
	public void setDelayTaskId(String delayTaskId) {
		this.delayTaskId = delayTaskId;
	}

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
