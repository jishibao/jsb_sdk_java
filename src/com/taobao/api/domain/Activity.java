package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 活动数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Activity extends TaobaoObject {

	private static final long serialVersionUID = 3525223971284131889L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 领用优惠券的链接
	 */
	@ApiField("activity_url")
	private String activityUrl;

	/**
	 * 已经领取的优惠券的数量
	 */
	@ApiField("applied_count")
	private Long appliedCount;

	/**
	 * 活动对应的优惠券ID
	 */
	@ApiField("coupon_id")
	private Long couponId;

	/**
	 * self代表自己创建，other他人创建
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 每个买家限领取优惠券的数量，1～5张
	 */
	@ApiField("person_limit_count")
	private Long personLimitCount;

	/**
	 * enabled代表有效，invalid代表失效。other代表空值
	 */
	@ApiField("status")
	private String status;

	/**
	 * 卖家设置优惠券领取的总领用量
	 */
	@ApiField("total_count")
	private Long totalCount;


	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getActivityUrl() {
		return this.activityUrl;
	}
	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public Long getAppliedCount() {
		return this.appliedCount;
	}
	public void setAppliedCount(Long appliedCount) {
		this.appliedCount = appliedCount;
	}

	public Long getCouponId() {
		return this.couponId;
	}
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Long getPersonLimitCount() {
		return this.personLimitCount;
	}
	public void setPersonLimitCount(Long personLimitCount) {
		this.personLimitCount = personLimitCount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
