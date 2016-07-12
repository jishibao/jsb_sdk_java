package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 卖家设置售后服务对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AfterSale extends TaobaoObject {

	private static final long serialVersionUID = 1382216794893756888L;

	/**
	 * id
	 */
	@ApiField("after_sale_id")
	private Long afterSaleId;

	/**
	 * 名称
	 */
	@ApiField("after_sale_name")
	private String afterSaleName;

	/**
	 * tfs地址
	 */
	@ApiField("after_sale_path")
	private String afterSalePath;


	public Long getAfterSaleId() {
		return this.afterSaleId;
	}
	public void setAfterSaleId(Long afterSaleId) {
		this.afterSaleId = afterSaleId;
	}

	public String getAfterSaleName() {
		return this.afterSaleName;
	}
	public void setAfterSaleName(String afterSaleName) {
		this.afterSaleName = afterSaleName;
	}

	public String getAfterSalePath() {
		return this.afterSalePath;
	}
	public void setAfterSalePath(String afterSalePath) {
		this.afterSalePath = afterSalePath;
	}

}
