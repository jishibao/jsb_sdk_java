package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WmsInventoryQueryItemlist;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wms.inventory.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsInventoryQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5762285679772431495L;

	/** 
	 * 商品详情列表
	 */
	@ApiListField("item_list")
	@ApiField("wms_inventory_query_itemlist")
	private List<WmsInventoryQueryItemlist> itemList;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 错误代码
	 */
	@ApiField("wl_error_code")
	private String wlErrorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("wl_error_msg")
	private String wlErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("wl_success")
	private Boolean wlSuccess;


	public void setItemList(List<WmsInventoryQueryItemlist> itemList) {
		this.itemList = itemList;
	}
	public List<WmsInventoryQueryItemlist> getItemList( ) {
		return this.itemList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setWlErrorCode(String wlErrorCode) {
		this.wlErrorCode = wlErrorCode;
	}
	public String getWlErrorCode( ) {
		return this.wlErrorCode;
	}

	public void setWlErrorMsg(String wlErrorMsg) {
		this.wlErrorMsg = wlErrorMsg;
	}
	public String getWlErrorMsg( ) {
		return this.wlErrorMsg;
	}

	public void setWlSuccess(Boolean wlSuccess) {
		this.wlSuccess = wlSuccess;
	}
	public Boolean getWlSuccess( ) {
		return this.wlSuccess;
	}
	


}
