package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 门票商品电子凭证信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class TicketEtc extends TaobaoObject {

	private static final long serialVersionUID = 2117873592894744768L;

	/**
	 * 商品电子凭证是否关联本地商户-在门票商品为电子凭证时必选
	 */
	@ApiField("association_status")
	private Boolean associationStatus;

	/**
	 * 商品电子凭证的自动退款比例-在门票商品为电子凭证时必选
	 */
	@ApiField("auto_refund")
	private Long autoRefund;

	/**
	 * 商品电子凭证的码商-在门票商品为电子凭证时必选
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商品电子凭证的码商名-在门票商品为电子凭证时必选
	 */
	@ApiField("merchant_nick")
	private String merchantNick;

	/**
	 * 商品电子凭证的码商-在门票商品为电子凭证时必选
	 */
	@ApiField("network_id")
	private String networkId;

	/**
	 * 商品电子凭证的过期退款比例-在门票商品为电子凭证时必选
	 */
	@ApiField("overdue_pay")
	private Long overduePay;

	/**
	 * 商品电子凭证是否核销打款-在门票商品为电子凭证时必选
	 */
	@ApiField("verification_pay")
	private Boolean verificationPay;


	public Boolean getAssociationStatus() {
		return this.associationStatus;
	}
	public void setAssociationStatus(Boolean associationStatus) {
		this.associationStatus = associationStatus;
	}

	public Long getAutoRefund() {
		return this.autoRefund;
	}
	public void setAutoRefund(Long autoRefund) {
		this.autoRefund = autoRefund;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantNick() {
		return this.merchantNick;
	}
	public void setMerchantNick(String merchantNick) {
		this.merchantNick = merchantNick;
	}

	public String getNetworkId() {
		return this.networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	public Long getOverduePay() {
		return this.overduePay;
	}
	public void setOverduePay(Long overduePay) {
		this.overduePay = overduePay;
	}

	public Boolean getVerificationPay() {
		return this.verificationPay;
	}
	public void setVerificationPay(Boolean verificationPay) {
		this.verificationPay = verificationPay;
	}

}
