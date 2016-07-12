package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 家装分阶段价格数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class MsPayment extends TaobaoObject {

	private static final long serialVersionUID = 6484743527612287395L;

	/**
	 * 订金
	 */
	@ApiField("price")
	private String price;

	/**
	 * 参考价
	 */
	@ApiField("reference_price")
	private String referencePrice;

	/**
	 * 尾款可抵扣金额
	 */
	@ApiField("voucher_price")
	private String voucherPrice;


	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getReferencePrice() {
		return this.referencePrice;
	}
	public void setReferencePrice(String referencePrice) {
		this.referencePrice = referencePrice;
	}

	public String getVoucherPrice() {
		return this.voucherPrice;
	}
	public void setVoucherPrice(String voucherPrice) {
		this.voucherPrice = voucherPrice;
	}

}
