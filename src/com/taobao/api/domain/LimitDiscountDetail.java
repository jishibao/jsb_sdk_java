package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 限时打折详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public class LimitDiscountDetail extends TaobaoObject {

	private static final long serialVersionUID = 7252611421144835972L;

	/**
	 * 限时打折结束时间。
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 该商品限时折扣
	 */
	@ApiField("item_discount")
	private String itemDiscount;

	/**
	 * 商品的id(数字类型)
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 限时打折名称
	 */
	@ApiField("limit_discount_name")
	private String limitDiscountName;

	/**
	 * 每人限购数量，1、2、5、10000(不限)。
	 */
	@ApiField("limit_num")
	private Long limitNum;

	/**
	 * 限时打折开始时间。
	 */
	@ApiField("start_time")
	private Date startTime;


	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getItemDiscount() {
		return this.itemDiscount;
	}
	public void setItemDiscount(String itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getLimitDiscountName() {
		return this.limitDiscountName;
	}
	public void setLimitDiscountName(String limitDiscountName) {
		this.limitDiscountName = limitDiscountName;
	}

	public Long getLimitNum() {
		return this.limitNum;
	}
	public void setLimitNum(Long limitNum) {
		this.limitNum = limitNum;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
