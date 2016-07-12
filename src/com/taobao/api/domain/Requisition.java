package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 合作申请
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Requisition extends TaobaoObject {

	private static final long serialVersionUID = 3788935864193275681L;

	/**
	 * 好评率
	 */
	@ApiField("dist_appraise")
	private Long distAppraise;

	/**
	 * 主营类目
	 */
	@ApiField("dist_category")
	private Long distCategory;

	/**
	 * 主营类目名称
	 */
	@ApiField("dist_category_name")
	private String distCategoryName;

	/**
	 * 是否消保(0-不是、1-是)
	 */
	@ApiField("dist_is_xiaobao")
	private Long distIsXiaobao;

	/**
	 * 店铺星级
	 */
	@ApiField("dist_level")
	private Long distLevel;

	/**
	 * 分销申请加盟时，给供应商的留言
	 */
	@ApiField("dist_message")
	private String distMessage;

	/**
	 * 开店时间
	 */
	@ApiField("dist_open_date")
	private Date distOpenDate;

	/**
	 * 店铺地址
	 */
	@ApiField("dist_shop_address")
	private String distShopAddress;

	/**
	 * 分销商id
	 */
	@ApiField("distributor_id")
	private Long distributorId;

	/**
	 * 分销商nick
	 */
	@ApiField("distributor_nick")
	private String distributorNick;

	/**
	 * 申请时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 合作申请ID
	 */
	@ApiField("requisition_id")
	private Long requisitionId;

	/**
	 * 申请状态（1-申请中、2-成功、3-被退回、4-已撤消、5-过期）
	 */
	@ApiField("status")
	private Long status;


	public Long getDistAppraise() {
		return this.distAppraise;
	}
	public void setDistAppraise(Long distAppraise) {
		this.distAppraise = distAppraise;
	}

	public Long getDistCategory() {
		return this.distCategory;
	}
	public void setDistCategory(Long distCategory) {
		this.distCategory = distCategory;
	}

	public String getDistCategoryName() {
		return this.distCategoryName;
	}
	public void setDistCategoryName(String distCategoryName) {
		this.distCategoryName = distCategoryName;
	}

	public Long getDistIsXiaobao() {
		return this.distIsXiaobao;
	}
	public void setDistIsXiaobao(Long distIsXiaobao) {
		this.distIsXiaobao = distIsXiaobao;
	}

	public Long getDistLevel() {
		return this.distLevel;
	}
	public void setDistLevel(Long distLevel) {
		this.distLevel = distLevel;
	}

	public String getDistMessage() {
		return this.distMessage;
	}
	public void setDistMessage(String distMessage) {
		this.distMessage = distMessage;
	}

	public Date getDistOpenDate() {
		return this.distOpenDate;
	}
	public void setDistOpenDate(Date distOpenDate) {
		this.distOpenDate = distOpenDate;
	}

	public String getDistShopAddress() {
		return this.distShopAddress;
	}
	public void setDistShopAddress(String distShopAddress) {
		this.distShopAddress = distShopAddress;
	}

	public Long getDistributorId() {
		return this.distributorId;
	}
	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorNick() {
		return this.distributorNick;
	}
	public void setDistributorNick(String distributorNick) {
		this.distributorNick = distributorNick;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getRequisitionId() {
		return this.requisitionId;
	}
	public void setRequisitionId(Long requisitionId) {
		this.requisitionId = requisitionId;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
