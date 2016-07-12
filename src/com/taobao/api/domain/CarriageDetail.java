package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流公司资费相关信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CarriageDetail extends TaobaoObject {

	private static final long serialVersionUID = 7722368369215177579L;

	/**
	 * 续费（单位：元）
	 */
	@ApiField("add_fee")
	private Long addFee;

	/**
	 * 续重（单位：千克）
	 */
	@ApiField("add_weight")
	private Long addWeight;

	/**
	 * 破损赔付
	 */
	@ApiField("damage_payment")
	private String damagePayment;

	/**
	 * 物流公司揽收时间段
	 */
	@ApiField("got_time")
	private String gotTime;

	/**
	 * 首费（单位：元）
	 */
	@ApiField("initial_fee")
	private Long initialFee;

	/**
	 * 首重（单位：千克）
	 */
	@ApiField("initial_weight")
	private Long initialWeight;

	/**
	 * 丢单赔付
	 */
	@ApiField("lost_payment")
	private String lostPayment;

	/**
	 * 快件送达所需的时间(单位：天)
	 */
	@ApiField("way_day")
	private String wayDay;


	public Long getAddFee() {
		return this.addFee;
	}
	public void setAddFee(Long addFee) {
		this.addFee = addFee;
	}

	public Long getAddWeight() {
		return this.addWeight;
	}
	public void setAddWeight(Long addWeight) {
		this.addWeight = addWeight;
	}

	public String getDamagePayment() {
		return this.damagePayment;
	}
	public void setDamagePayment(String damagePayment) {
		this.damagePayment = damagePayment;
	}

	public String getGotTime() {
		return this.gotTime;
	}
	public void setGotTime(String gotTime) {
		this.gotTime = gotTime;
	}

	public Long getInitialFee() {
		return this.initialFee;
	}
	public void setInitialFee(Long initialFee) {
		this.initialFee = initialFee;
	}

	public Long getInitialWeight() {
		return this.initialWeight;
	}
	public void setInitialWeight(Long initialWeight) {
		this.initialWeight = initialWeight;
	}

	public String getLostPayment() {
		return this.lostPayment;
	}
	public void setLostPayment(String lostPayment) {
		this.lostPayment = lostPayment;
	}

	public String getWayDay() {
		return this.wayDay;
	}
	public void setWayDay(String wayDay) {
		this.wayDay = wayDay;
	}

}
