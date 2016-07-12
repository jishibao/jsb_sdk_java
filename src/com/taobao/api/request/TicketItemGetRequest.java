package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TicketItemGetResponse;

/**
 * TOP API: taobao.ticket.item.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.15
 */
public class TicketItemGetRequest extends BaseTaobaoRequest<TicketItemGetResponse> {
	
	

	/** 
	* 需要返回的门票商品（TicketItem）对象字段，如title,price,skus等。<br>可选值：TicketItem商品结构体中所有字段均可返回；多个字段用“,”分隔。
	 */
	private String fields;

	/** 
	* 新门票类目商品的标识（非日历价格库存商品）
	 */
	private Long itemId;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "taobao.ticket.item.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TicketItemGetResponse> getResponseClass() {
		return TicketItemGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}