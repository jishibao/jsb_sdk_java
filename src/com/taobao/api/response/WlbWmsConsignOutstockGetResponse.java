package com.taobao.api.response;

import com.taobao.api.domain.CainiaoConsignOutstockOutstockinfolist;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.consign.outstock.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsConsignOutstockGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1691446898596588416L;

	/** 
	 * 商品发货信息列表
	 */
	@ApiListField("out_stock_info_list")
	@ApiField("cainiao_consign_outstock_outstockinfolist")
	private List<CainiaoConsignOutstockOutstockinfolist> outStockInfoList;


	public void setOutStockInfoList(List<CainiaoConsignOutstockOutstockinfolist> outStockInfoList) {
		this.outStockInfoList = outStockInfoList;
	}
	public List<CainiaoConsignOutstockOutstockinfolist> getOutStockInfoList( ) {
		return this.outStockInfoList;
	}
	


}
