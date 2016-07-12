package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemDeleteResponse;

/**
 * TOP API: taobao.item.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.01
 */
public class ItemDeleteRequest extends BaseTaobaoRequest<ItemDeleteResponse> {
	
	

	/** 
	* 商品数字ID，该参数必须
	 */
	private Long numIid;

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public String getApiMethodName() {
		return "taobao.item.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("num_iid", this.numIid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemDeleteResponse> getResponseClass() {
		return ItemDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
	}
	

}