package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsItemCombinationCreateResponse;

/**
 * TOP API: taobao.wlb.wms.item.combination.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.17
 */
public class WlbWmsItemCombinationCreateRequest extends BaseTaobaoRequest<WlbWmsItemCombinationCreateResponse> {
	
	

	/** 
	* 组合商品ID
	 */
	private Long itemId;

	/** 
	* 子货品列表
	 */
	private String subItemList;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setSubItemList(String subItemList) {
		this.subItemList = subItemList;
	}

	public void setSubItemList(List<SubItemList> subItemList) {
		this.subItemList = new JSONWriter(false,true).write(subItemList);
	}

	public String getSubItemList() {
		return this.subItemList;
	}

	public String getApiMethodName() {
		return "taobao.wlb.wms.item.combination.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("sub_item_list", this.subItemList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbWmsItemCombinationCreateResponse> getResponseClass() {
		return WlbWmsItemCombinationCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(subItemList, 20, "subItemList");
	}
	
	/**
	 * 子货品
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubItem extends TaobaoObject {
		private static final long serialVersionUID = 8774822915489993931L;
		/**
		 * 子货品数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 子货品ID
		 */
		@ApiField("sub_item_id")
		private Long subItemId;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Long getSubItemId() {
			return this.subItemId;
		}
		public void setSubItemId(Long subItemId) {
			this.subItemId = subItemId;
		}
	}
	
	/**
	 * 子货品列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SubItemList extends TaobaoObject {
		private static final long serialVersionUID = 6439888225253458548L;
		/**
		 * 子货品
		 */
		@ApiField("sub_item")
		private SubItem subItem;
	
		public SubItem getSubItem() {
			return this.subItem;
		}
		public void setSubItem(SubItem subItem) {
			this.subItem = subItem;
		}
	}
	

}