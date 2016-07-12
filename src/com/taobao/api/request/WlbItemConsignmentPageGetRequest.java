package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.WlbItemConsignmentPageGetResponse;

/**
 * TOP API: taobao.wlb.item.consignment.page.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.05
 */
public class WlbItemConsignmentPageGetRequest extends BaseTaobaoRequest<WlbItemConsignmentPageGetResponse> {
	
	

	/** 
	* 代销商宝贝id
	 */
	private Long icItemId;

	/** 
	* 供应商商品id
	 */
	private Long ownerItemId;

	/** 
	* 供应商用户昵称
	 */
	private String ownerUserNick;

	public void setIcItemId(Long icItemId) {
		this.icItemId = icItemId;
	}

	public Long getIcItemId() {
		return this.icItemId;
	}

	public void setOwnerItemId(Long ownerItemId) {
		this.ownerItemId = ownerItemId;
	}

	public Long getOwnerItemId() {
		return this.ownerItemId;
	}

	public void setOwnerUserNick(String ownerUserNick) {
		this.ownerUserNick = ownerUserNick;
	}

	public String getOwnerUserNick() {
		return this.ownerUserNick;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.consignment.page.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ic_item_id", this.icItemId);
		txtParams.put("owner_item_id", this.ownerItemId);
		txtParams.put("owner_user_nick", this.ownerUserNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbItemConsignmentPageGetResponse> getResponseClass() {
		return WlbItemConsignmentPageGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}