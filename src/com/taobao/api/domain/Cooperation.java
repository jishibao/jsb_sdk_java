package com.taobao.api.domain;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 合作分销关系
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Cooperation extends TaobaoObject {

	private static final long serialVersionUID = 4729343336226831337L;

	/**
	 * 供应商授权的支付方式：ALIPAY(支付宝)、OFFPREPAY(预付款)、OFFTRANSFER(转帐)、OFFSETTLEMENT(后期结算)
	 */
	@ApiListField("auth_payway")
	@ApiField("string")
	private List<String> authPayway;

	/**
	 * 合作关系ID
	 */
	@ApiField("cooperate_id")
	private Long cooperateId;

	/**
	 * 分销商ID
	 */
	@ApiField("distributor_id")
	private Long distributorId;

	/**
	 * 分销商nick
	 */
	@ApiField("distributor_nick")
	private String distributorNick;

	/**
	 * 合作终止时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 等级ID
	 */
	@ApiField("grade_id")
	private Long gradeId;

	/**
	 * 授权产品线
	 */
	@ApiField("product_line")
	private String productLine;

	/**
	 * 授权产品线名称，和product_line中的值按序对应
	 */
	@ApiListField("product_line_name")
	@ApiField("string")
	private List<String> productLineName;

	/**
	 * 合作起始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 合作状态： NORMAL(合作中)、 ENDING(终止中) 、END (终止)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 供应商ID
	 */
	@ApiField("supplier_id")
	private Long supplierId;

	/**
	 * 供应商NICK
	 */
	@ApiField("supplier_nick")
	private String supplierNick;

	/**
	 * 分销方式： AGENT(代销) 、DEALER(经销)
	 */
	@ApiField("trade_type")
	private String tradeType;


	public List<String> getAuthPayway() {
		return this.authPayway;
	}
	public void setAuthPayway(List<String> authPayway) {
		this.authPayway = authPayway;
	}

	public Long getCooperateId() {
		return this.cooperateId;
	}
	public void setCooperateId(Long cooperateId) {
		this.cooperateId = cooperateId;
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

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getGradeId() {
		return this.gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public String getProductLine() {
		return this.productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public List<String> getProductLineName() {
		return this.productLineName;
	}
	public void setProductLineName(List<String> productLineName) {
		this.productLineName = productLineName;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierNick() {
		return this.supplierNick;
	}
	public void setSupplierNick(String supplierNick) {
		this.supplierNick = supplierNick;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
