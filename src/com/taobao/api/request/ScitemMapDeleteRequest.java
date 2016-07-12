package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ScitemMapDeleteResponse;

/**
 * TOP API: taobao.scitem.map.delete request
 * 
 * @author top auto create
 * @since 1.0, 2013.04.09
 */
public class ScitemMapDeleteRequest extends BaseTaobaoRequest<ScitemMapDeleteResponse> {
	
	

	/** 
	* 后台商品ID
	 */
	private Long scItemId;

	/** 
	* 店铺用户nick。 如果该参数为空则删除后端商品与当前调用人的商品映射关系;如果不为空则删除指定用户与后端商品的映射关系
	 */
	private String userNick;

	public void setScItemId(Long scItemId) {
		this.scItemId = scItemId;
	}

	public Long getScItemId() {
		return this.scItemId;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.scitem.map.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("sc_item_id", this.scItemId);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ScitemMapDeleteResponse> getResponseClass() {
		return ScitemMapDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(scItemId, "scItemId");
	}
	

}