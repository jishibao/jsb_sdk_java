package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TipInfo;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.InventorySum;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.inventory.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class InventoryQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2642213686533872869L;

	/** 
	 * 商品总体库存信息
	 */
	@ApiListField("item_inventorys")
	@ApiField("inventory_sum")
	private List<InventorySum> itemInventorys;

	/** 
	 * 提示信息，提示不存在的后端商品
	 */
	@ApiListField("tip_infos")
	@ApiField("tip_info")
	private List<TipInfo> tipInfos;


	public void setItemInventorys(List<InventorySum> itemInventorys) {
		this.itemInventorys = itemInventorys;
	}
	public List<InventorySum> getItemInventorys( ) {
		return this.itemInventorys;
	}

	public void setTipInfos(List<TipInfo> tipInfos) {
		this.tipInfos = tipInfos;
	}
	public List<TipInfo> getTipInfos( ) {
		return this.tipInfos;
	}
	


}
