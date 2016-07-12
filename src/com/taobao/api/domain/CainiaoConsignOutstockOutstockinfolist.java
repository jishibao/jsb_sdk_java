package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 发货失败信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoConsignOutstockOutstockinfolist extends TaobaoObject {

	private static final long serialVersionUID = 1826527281392831827L;

	/**
	 * 信息
	 */
	@ApiField("out_stock_info")
	private CainiaoConsignOutstockOutstockinfo outStockInfo;


	public CainiaoConsignOutstockOutstockinfo getOutStockInfo() {
		return this.outStockInfo;
	}
	public void setOutStockInfo(CainiaoConsignOutstockOutstockinfo outStockInfo) {
		this.outStockInfo = outStockInfo;
	}

}
