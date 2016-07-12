package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 拍卖商品相关信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PaimaiInfo extends TaobaoObject {

	private static final long serialVersionUID = 7667614661254491781L;

	/**
	 * 用户自定义的固定保证金。如果用户未传则说明用户选择使用淘宝默认的保证金模式10%，此时deposit等于0.
	 */
	@ApiField("deposit")
	private Long deposit;

	/**
	 * 降价拍中的降价间隔
	 */
	@ApiField("interval")
	private Long interval;

	/**
	 * 拍卖类型，目前包括增加拍，荷兰拍和降价拍。
	 */
	@ApiField("mode")
	private Long mode;

	/**
	 * 降价拍的保留价
	 */
	@ApiField("reserve")
	private String reserve;

	/**
	 * 对于拍卖来说可以设定有效期，这里是有效期的小时数。
	 */
	@ApiField("valid_hour")
	private Long validHour;

	/**
	 * 对于拍卖来说可以设定有效期，这里是有效期的分钟数。
	 */
	@ApiField("valid_minute")
	private Long validMinute;


	public Long getDeposit() {
		return this.deposit;
	}
	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}

	public Long getInterval() {
		return this.interval;
	}
	public void setInterval(Long interval) {
		this.interval = interval;
	}

	public Long getMode() {
		return this.mode;
	}
	public void setMode(Long mode) {
		this.mode = mode;
	}

	public String getReserve() {
		return this.reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public Long getValidHour() {
		return this.validHour;
	}
	public void setValidHour(Long validHour) {
		this.validHour = validHour;
	}

	public Long getValidMinute() {
		return this.validMinute;
	}
	public void setValidMinute(Long validMinute) {
		this.validMinute = validMinute;
	}

}
