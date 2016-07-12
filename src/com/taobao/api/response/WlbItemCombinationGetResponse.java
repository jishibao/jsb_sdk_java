package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.combination.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemCombinationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5363113898514779654L;

	/** 
	 * 组合子商品id列表
	 */
	@ApiListField("item_id_list")
	@ApiField("number")
	private List<Long> itemIdList;


	public void setItemIdList(List<Long> itemIdList) {
		this.itemIdList = itemIdList;
	}
	public List<Long> getItemIdList( ) {
		return this.itemIdList;
	}
	


}
