package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TicketItemsGetResponse;

/**
 * TOP API: taobao.ticket.items.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.07
 */
public class TicketItemsGetRequest extends BaseTaobaoRequest<TicketItemsGetResponse> {
	
	

	/** 
	* 需要返回的门票商品（TicketItem）对象字段，如title,price,skus等。<br>可选值：TicketItem商品结构体中所有字段均可返回；多个字段用“,”分隔。
	 */
	private String fields;

	/** 
	* 批量获取信息的商品标识。最多不能超过20个。
	 */
	private String itemIds;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public String getItemIds() {
		return this.itemIds;
	}

	public String getApiMethodName() {
		return "taobao.ticket.items.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("item_ids", this.itemIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TicketItemsGetResponse> getResponseClass() {
		return TicketItemsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(itemIds, "itemIds");
	}
	

}