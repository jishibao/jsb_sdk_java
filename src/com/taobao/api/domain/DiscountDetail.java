package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 折扣详情信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class DiscountDetail extends TaobaoObject {

	private static final long serialVersionUID = 1267784325387369338L;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 折扣详情ID
	 */
	@ApiField("detail_id")
	private Long detailId;

	/**
	 * 优惠方式:PERCENT（按折扣优惠）、PRICE（按减价优惠）
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 优惠比率或者优惠价格 10%或10
	 */
	@ApiField("discount_value")
	private Long discountValue;

	/**
	 * 修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 会员等级的id或者分销商id
	 */
	@ApiField("target_id")
	private Long targetId;

	/**
	 * 等级名称或者分销商名称
	 */
	@ApiField("target_name")
	private String targetName;

	/**
	 * 折扣类型:GRADE（按会员等级优惠）、DISTRIBUTOR（按分销商优惠）
	 */
	@ApiField("target_type")
	private String targetType;


	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getDetailId() {
		return this.detailId;
	}
	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public Long getDiscountValue() {
		return this.discountValue;
	}
	public void setDiscountValue(Long discountValue) {
		this.discountValue = discountValue;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getTargetId() {
		return this.targetId;
	}
	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}

	public String getTargetName() {
		return this.targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
