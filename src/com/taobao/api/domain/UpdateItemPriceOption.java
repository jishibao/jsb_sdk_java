package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品价格更新时候的可选参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public class UpdateItemPriceOption extends TaobaoObject {

	private static final long serialVersionUID = 8344518857338535294L;

	/**
	 * 目标币种，非必填，仅用于天猫国际官网同购商家将外币价格修改成人民币价格
	 */
	@ApiField("currency_type")
	private String currencyType;

	/**
	 * 是否忽略涉嫌炒信警告信息
	 */
	@ApiField("ignore_fake_credit")
	private Boolean ignoreFakeCredit;


	public String getCurrencyType() {
		return this.currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public Boolean getIgnoreFakeCredit() {
		return this.ignoreFakeCredit;
	}
	public void setIgnoreFakeCredit(Boolean ignoreFakeCredit) {
		this.ignoreFakeCredit = ignoreFakeCredit;
	}

}
