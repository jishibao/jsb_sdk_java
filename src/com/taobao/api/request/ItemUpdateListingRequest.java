package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemUpdateListingResponse;

/**
 * TOP API: taobao.item.update.listing request
 * 
 * @author top auto create
 * @since 1.0, 2015.11.04
 */
public class ItemUpdateListingRequest extends BaseTaobaoRequest<ItemUpdateListingResponse> {
	
	

	/** 
	* 需要上架的商品的数量。取值范围:大于零的整数。如果商品有sku，则上架数量默认为所有sku数量总和，不可修改。否则商品数量根据设置数量调整为num
	 */
	private Long num;

	/** 
	* 商品数字ID，该参数必须
	 */
	private Long numIid;

	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNum() {
		return this.num;
	}

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getNumIid() {
		return this.numIid;
	}

	public String getApiMethodName() {
		return "taobao.item.update.listing";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("num", this.num);
		txtParams.put("num_iid", this.numIid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemUpdateListingResponse> getResponseClass() {
		return ItemUpdateListingResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(num, "num");
		RequestCheckUtils.checkMinValue(num, 0L, "num");
		RequestCheckUtils.checkNotEmpty(numIid, "numIid");
		RequestCheckUtils.checkMinValue(numIid, 0L, "numIid");
	}
	

}