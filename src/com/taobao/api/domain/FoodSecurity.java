package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 食品安全信息，包括：
生产许可证号、产品标准号、厂名、厂址等
 *
 * @author top auto create
 * @since 1.0, null
 */
public class FoodSecurity extends TaobaoObject {

	private static final long serialVersionUID = 8171792146315336689L;

	/**
	 * 厂家联系方式
	 */
	@ApiField("contact")
	private String contact;

	/**
	 * 产品标准号
	 */
	@ApiField("design_code")
	private String designCode;

	/**
	 * 厂名
	 */
	@ApiField("factory")
	private String factory;

	/**
	 * 厂址
	 */
	@ApiField("factory_site")
	private String factorySite;

	/**
	 * 食品添加剂
	 */
	@ApiField("food_additive")
	private String foodAdditive;

	/**
	 * 健字号，保健品/膳食营养补充剂 这个类目下特有的信息，此类目下无需填写生产许可证编号（QS），如果填写了生产许可证编号（QS）将被忽略不保存；保存宝贝时，标题前会自动加上健字号产品名称一起作为宝贝标题；
	 */
	@ApiField("health_product_no")
	private String healthProductNo;

	/**
	 * 配料表
	 */
	@ApiField("mix")
	private String mix;

	/**
	 * 保质期
	 */
	@ApiField("period")
	private String period;

	/**
	 * 储藏方法
	 */
	@ApiField("plan_storage")
	private String planStorage;

	/**
	 * 生产许可证号
	 */
	@ApiField("prd_license_no")
	private String prdLicenseNo;

	/**
	 * 生产结束日期
	 */
	@ApiField("product_date_end")
	private String productDateEnd;

	/**
	 * 生产开始日期
	 */
	@ApiField("product_date_start")
	private String productDateStart;

	/**
	 * 进货结束日期，要在生产日期之后
	 */
	@ApiField("stock_date_end")
	private String stockDateEnd;

	/**
	 * 进货开始日期，要在生产日期之后
	 */
	@ApiField("stock_date_start")
	private String stockDateStart;

	/**
	 * 供货商
	 */
	@ApiField("supplier")
	private String supplier;


	public String getContact() {
		return this.contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDesignCode() {
		return this.designCode;
	}
	public void setDesignCode(String designCode) {
		this.designCode = designCode;
	}

	public String getFactory() {
		return this.factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getFactorySite() {
		return this.factorySite;
	}
	public void setFactorySite(String factorySite) {
		this.factorySite = factorySite;
	}

	public String getFoodAdditive() {
		return this.foodAdditive;
	}
	public void setFoodAdditive(String foodAdditive) {
		this.foodAdditive = foodAdditive;
	}

	public String getHealthProductNo() {
		return this.healthProductNo;
	}
	public void setHealthProductNo(String healthProductNo) {
		this.healthProductNo = healthProductNo;
	}

	public String getMix() {
		return this.mix;
	}
	public void setMix(String mix) {
		this.mix = mix;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPlanStorage() {
		return this.planStorage;
	}
	public void setPlanStorage(String planStorage) {
		this.planStorage = planStorage;
	}

	public String getPrdLicenseNo() {
		return this.prdLicenseNo;
	}
	public void setPrdLicenseNo(String prdLicenseNo) {
		this.prdLicenseNo = prdLicenseNo;
	}

	public String getProductDateEnd() {
		return this.productDateEnd;
	}
	public void setProductDateEnd(String productDateEnd) {
		this.productDateEnd = productDateEnd;
	}

	public String getProductDateStart() {
		return this.productDateStart;
	}
	public void setProductDateStart(String productDateStart) {
		this.productDateStart = productDateStart;
	}

	public String getStockDateEnd() {
		return this.stockDateEnd;
	}
	public void setStockDateEnd(String stockDateEnd) {
		this.stockDateEnd = stockDateEnd;
	}

	public String getStockDateStart() {
		return this.stockDateStart;
	}
	public void setStockDateStart(String stockDateStart) {
		this.stockDateStart = stockDateStart;
	}

	public String getSupplier() {
		return this.supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

}
