package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 子订单的帐务数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OrderAmount extends TaobaoObject {

	private static final long serialVersionUID = 7614872611743852413L;

	/**
	 * 卖家手工调整的子订单的优惠金额.格式为:1.01;单位:元;精确到小数点后两位.
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * 子订单的系统优惠金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 分摊之后的实付金额
	 */
	@ApiField("divide_order_fee")
	private String divideOrderFee;

	/**
	 * 子交易订单中购买商品的数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 子订单对应的商品数字id
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 子交易订单编号
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 优惠分摊
	 */
	@ApiField("part_mjz_discount")
	private String partMjzDiscount;

	/**
	 * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。计算公式如下：payment = price * num + adjust_fee - discount_fee + post_fee(邮费，单笔子订单时子订单实付金额包含邮费，多笔子订单时不包含邮费)；对于退款成功的子订单，由于主订单的优惠分摊金额，会造成该字段可能不为0.00元。建议使用退款前的实付金额减去退款单中的实际退款金额计算。
	 */
	@ApiField("payment")
	private String payment;

	/**
	 * 商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 子订单的系统优惠的名称，对应于discount_fee的名称
	 */
	@ApiField("promotion_name")
	private String promotionName;

	/**
	 * 子订单对应的商品的sku_id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
	 */
	@ApiField("sku_properties_name")
	private String skuPropertiesName;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;


	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public String getDivideOrderFee() {
		return this.divideOrderFee;
	}
	public void setDivideOrderFee(String divideOrderFee) {
		this.divideOrderFee = divideOrderFee;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getPartMjzDiscount() {
		return this.partMjzDiscount;
	}
	public void setPartMjzDiscount(String partMjzDiscount) {
		this.partMjzDiscount = partMjzDiscount;
	}

	public String getPayment() {
		return this.payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPromotionName() {
		return this.promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuPropertiesName() {
		return this.skuPropertiesName;
	}
	public void setSkuPropertiesName(String skuPropertiesName) {
		this.skuPropertiesName = skuPropertiesName;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
