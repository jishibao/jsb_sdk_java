package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.CainiaoInventoryProfitlossProfitlossinfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.profitloss.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsInventoryProfitlossGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3151331144182513935L;

	/** 
	 * 损益信息
	 */
	@ApiField("profit_loss_info")
	private CainiaoInventoryProfitlossProfitlossinfo profitLossInfo;


	public void setProfitLossInfo(CainiaoInventoryProfitlossProfitlossinfo profitLossInfo) {
		this.profitLossInfo = profitLossInfo;
	}
	public CainiaoInventoryProfitlossProfitlossinfo getProfitLossInfo( ) {
		return this.profitLossInfo;
	}
	


}
