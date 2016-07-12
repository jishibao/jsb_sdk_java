package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemPropimgDeleteResponse;

/**
 * TOP API: taobao.item.propimg.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.13
 */
public class ItemPropimgDeleteRequest extends BaseTaobaoRequest<ItemPropimgDeleteResponse> {
	
	

	/** 
	* 商品属性图片ID
	 */
	private Long id;

	/** 
	* 商品数字ID，必选
	 */
	private Long numIid;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public String getApiMethodName() {
		return "taobao.item.propimg.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		txtParams.put("num_iid", this.numIid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemPropimgDeleteResponse> getResponseClass() {
		return ItemPropimgDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(id, "id");
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
	}
	

}