package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.IpcInventoryDetailDo;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.inventory.ipc.inventorydetail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class InventoryIpcInventorydetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8246937686963221758L;

	/** 
	 * 库存明细列表
	 */
	@ApiListField("inventory_details")
	@ApiField("ipc_inventory_detail_do")
	private List<IpcInventoryDetailDo> inventoryDetails;


	public void setInventoryDetails(List<IpcInventoryDetailDo> inventoryDetails) {
		this.inventoryDetails = inventoryDetails;
	}
	public List<IpcInventoryDetailDo> getInventoryDetails( ) {
		return this.inventoryDetails;
	}
	


}
