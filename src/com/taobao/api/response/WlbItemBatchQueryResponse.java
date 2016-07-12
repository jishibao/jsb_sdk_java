package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.WlbItemBatchInventory;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.batch.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemBatchQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8611157592319626352L;

	/** 
	 * 商品库存及批次信息查询结果
	 */
	@ApiListField("item_inventory_batch_list")
	@ApiField("wlb_item_batch_inventory")
	private List<WlbItemBatchInventory> itemInventoryBatchList;

	/** 
	 * 返回结果记录的数量
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setItemInventoryBatchList(List<WlbItemBatchInventory> itemInventoryBatchList) {
		this.itemInventoryBatchList = itemInventoryBatchList;
	}
	public List<WlbItemBatchInventory> getItemInventoryBatchList( ) {
		return this.itemInventoryBatchList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}
