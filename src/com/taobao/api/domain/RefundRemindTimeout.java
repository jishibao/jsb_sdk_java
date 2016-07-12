package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 退款超时
 *
 * @author top auto create
 * @since 1.0, null
 */
public class RefundRemindTimeout extends TaobaoObject {

	private static final long serialVersionUID = 5211883115375246185L;

	/**
	 * 是否存在超时。可选值:true(是),false(否)
	 */
	@ApiField("exist_timeout")
	private Boolean existTimeout;

	/**
	 * 提醒的类型（退款详情中提示信息的类型）
	 */
	@ApiField("remind_type")
	private Long remindType;

	/**
	 * 超时时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("timeout")
	private Date timeout;


	public Boolean getExistTimeout() {
		return this.existTimeout;
	}
	public void setExistTimeout(Boolean existTimeout) {
		this.existTimeout = existTimeout;
	}

	public Long getRemindType() {
		return this.remindType;
	}
	public void setRemindType(Long remindType) {
		this.remindType = remindType;
	}

	public Date getTimeout() {
		return this.timeout;
	}
	public void setTimeout(Date timeout) {
		this.timeout = timeout;
	}

}
