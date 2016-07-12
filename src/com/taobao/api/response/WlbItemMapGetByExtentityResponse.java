package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.map.get.by.extentity response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemMapGetByExtentityResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3347665359871853751L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 物流宝商品id
	 */
	@ApiField("item_id")
	private Long itemId;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId( ) {
		return this.itemId;
	}
	


}
