package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 发送结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SendMessageResult extends TaobaoObject {

	private static final long serialVersionUID = 4372376962683192735L;

	/**
	 * 延迟发送任务的唯一号
	 */
	@ApiField("delay_task_id")
	private String delayTaskId;

	/**
	 * 短信条数
	 */
	@ApiField("sms_size")
	private Long smsSize;

	/**
	 * 发送的唯一号
	 */
	@ApiField("task_id")
	private Long taskId;


	public String getDelayTaskId() {
		return this.delayTaskId;
	}
	public void setDelayTaskId(String delayTaskId) {
		this.delayTaskId = delayTaskId;
	}

	public Long getSmsSize() {
		return this.smsSize;
	}
	public void setSmsSize(Long smsSize) {
		this.smsSize = smsSize;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
