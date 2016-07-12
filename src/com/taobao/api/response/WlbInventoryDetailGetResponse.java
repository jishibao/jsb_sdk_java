package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbInventory;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.inventory.detail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbInventoryDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3582826645451774441L;

	/** 
	 * 库存详情对象。其中包括货主ID，仓库编码，库存，库存类型等属性
	 */
	@ApiListField("inventory_list")
	@ApiField("wlb_inventory")
	private List<WlbInventory> inventoryList;

	/** 
	 * 入参的item_id
	 */
	@ApiField("item_id")
	private Long itemId;


	public void setInventoryList(List<WlbInventory> inventoryList) {
		this.inventoryList = inventoryList;
	}
	public List<WlbInventory> getInventoryList( ) {
		return this.inventoryList;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId( ) {
		return this.itemId;
	}
	


}
