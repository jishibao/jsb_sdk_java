package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.CainiaoStockOutBillStockoutinfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.stock.out.bill.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsStockOutBillGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7689639794828216166L;

	/** 
	 * 出库信息
	 */
	@ApiField("stock_out_info")
	private CainiaoStockOutBillStockoutinfo stockOutInfo;


	public void setStockOutInfo(CainiaoStockOutBillStockoutinfo stockOutInfo) {
		this.stockOutInfo = stockOutInfo;
	}
	public CainiaoStockOutBillStockoutinfo getStockOutInfo( ) {
		return this.stockOutInfo;
	}
	


}
