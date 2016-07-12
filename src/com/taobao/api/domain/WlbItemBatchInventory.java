package com.taobao.api.domain;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;


/**
 * 商品的库存信息和批次信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemBatchInventory extends TaobaoObject {

	private static final long serialVersionUID = 1258394966959655443L;

	/**
	 * 批次库存查询结果
	 */
	@ApiListField("item_batch")
	@ApiField("wlb_item_batch")
	private List<WlbItemBatch> itemBatch;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 商品库存查询结果
	 */
	@ApiListField("item_inventorys")
	@ApiField("wlb_item_inventory")
	private List<WlbItemInventory> itemInventorys;

	/**
	 * 商品在所有仓库的可销库存总数
	 */
	@ApiField("total_quantity")
	private Long totalQuantity;


	public List<WlbItemBatch> getItemBatch() {
		return this.itemBatch;
	}
	public void setItemBatch(List<WlbItemBatch> itemBatch) {
		this.itemBatch = itemBatch;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public List<WlbItemInventory> getItemInventorys() {
		return this.itemInventorys;
	}
	public void setItemInventorys(List<WlbItemInventory> itemInventorys) {
		this.itemInventorys = itemInventorys;
	}

	public Long getTotalQuantity() {
		return this.totalQuantity;
	}
	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
