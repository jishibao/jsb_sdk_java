package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.OutEntityItem;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.map.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbItemMapGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2158744216858255647L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 外部商品实体
	 */
	@ApiListField("out_entity_item_list")
	@ApiField("out_entity_item")
	private List<OutEntityItem> outEntityItemList;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setOutEntityItemList(List<OutEntityItem> outEntityItemList) {
		this.outEntityItemList = outEntityItemList;
	}
	public List<OutEntityItem> getOutEntityItemList( ) {
		return this.outEntityItemList;
	}
	


}
