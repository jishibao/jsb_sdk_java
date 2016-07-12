package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemDeleteResponse;

/**
 * TOP API: taobao.wlb.item.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbItemDeleteRequest extends BaseTaobaoRequest<WlbItemDeleteResponse> {
	
	

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 商品所有人淘宝nick
	 */
	private String userNick;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemDeleteResponse> getResponseClass() {
		return WlbItemDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(userNick, "userNick");
	}
	

}