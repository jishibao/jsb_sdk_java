package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemAnchorGetResponse;

/**
 * TOP API: taobao.item.anchor.get request
 * 
 * @author top auto create
 * @since 1.0, 2014.02.28
 */
public class ItemAnchorGetRequest extends BaseTaobaoRequest<ItemAnchorGetResponse> {
	
	

	/** 
	* 对应类目编号
	 */
	private Long catId;

	/** 
	* 宝贝模板类型是人工打标还是自动打标：人工打标为1，自动打标为0.人工和自动打标为-1.
	 */
	private Long type;

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public Long getCatId() {
		return this.catId;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.item.anchor.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cat_id", this.catId);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemAnchorGetResponse> getResponseClass() {
		return ItemAnchorGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(catId, "catId");
		RequestCheckUtils.checkNotEmpty(type, "type");
		RequestCheckUtils.checkMaxValue(type, 1L, "type");
		RequestCheckUtils.checkMinValue(type, -1L, "type");
	}
	

}