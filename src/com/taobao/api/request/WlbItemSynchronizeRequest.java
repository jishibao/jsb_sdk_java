package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemSynchronizeResponse;

/**
 * TOP API: taobao.wlb.item.synchronize request
 * 
 * @author top auto create
 * @since 1.0, 2015.03.06
 */
public class WlbItemSynchronizeRequest extends BaseTaobaoRequest<WlbItemSynchronizeResponse> {
	
	

	/** 
	* 外部实体ID
	 */
	private Long extEntityId;

	/** 
	* 外部实体类型.存如下值
IC_ITEM   --表示IC商品
IC_SKU    --表示IC最小单位商品
若输入其他值，则按IC_ITEM处理
	 */
	private String extEntityType;

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 商品所有人淘宝nick
	 */
	private String userNick;

	public void setExtEntityId(Long extEntityId) {
		this.extEntityId = extEntityId;
	}

	public Long getExtEntityId() {
		return this.extEntityId;
	}

	public void setExtEntityType(String extEntityType) {
		this.extEntityType = extEntityType;
	}

	public String getExtEntityType() {
		return this.extEntityType;
	}

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
		return "taobao.wlb.item.synchronize";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ext_entity_id", this.extEntityId);
		txtParams.put("ext_entity_type", this.extEntityType);
		txtParams.put("item_id", this.itemId);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemSynchronizeResponse> getResponseClass() {
		return WlbItemSynchronizeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(extEntityId, "extEntityId");
		RequestCheckUtils.checkNotEmpty(extEntityType, "extEntityType");
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(userNick, "userNick");
		RequestCheckUtils.checkMaxLength(userNick, 64, "userNick");
	}
	

}