package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 限时打折
 *
 * @author top auto create
 * @since 1.0, null
 */
public class LimitDiscount extends TaobaoObject {

	private static final long serialVersionUID = 5381367348273611551L;

	/**
	 * 限时打折结束时间。
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 该限时打折宝贝数量。
	 */
	@ApiField("item_num")
	private Long itemNum;

	/**
	 * 限时打折ID。
	 */
	@ApiField("limit_discount_id")
	private Long limitDiscountId;

	/**
	 * 限时打折名称。
	 */
	@ApiField("limit_discount_name")
	private String limitDiscountName;

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

	public Long getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}

	public Long getLimitDiscountId() {
		return this.limitDiscountId;
	}
	public void setLimitDiscountId(Long limitDiscountId) {
		this.limitDiscountId = limitDiscountId;
	}

	public String getLimitDiscountName() {
		return this.limitDiscountName;
	}
	public void setLimitDiscountName(String limitDiscountName) {
		this.limitDiscountName = limitDiscountName;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
