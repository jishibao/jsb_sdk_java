package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.domain.ReciverAddressDo;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbImportsResourceTransferstoreGetResponse;

/**
 * TOP API: taobao.wlb.imports.resource.transferstore.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.01.27
 */
public class WlbImportsResourceTransferstoreGetRequest extends BaseTaobaoRequest<WlbImportsResourceTransferstoreGetResponse> {
	
	

	/** 
	* 商品前台叶子类目ID
	 */
	private String cids;

	/** 
	* 卖家发货地址的区域ID，如果不填则为默认发货地址ID
	 */
	private Long fromId;

	/** 
	* 通过taobao.wlb.imports.resource.get接口查询出来的资源ID
	 */
	private Long resourceId;

	/** 
	* 买家收货地信息
	 */
	private String toAddress;

	public void setCids(String cids) {
		this.cids = cids;
	}

	public String getCids() {
		return this.cids;
	}

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	public Long getFromId() {
		return this.fromId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public Long getResourceId() {
		return this.resourceId;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public void setToAddress(ReciverAddressDo toAddress) {
		this.toAddress = new JSONWriter(false,true).write(toAddress);
	}

	public String getToAddress() {
		return this.toAddress;
	}

	public String getApiMethodName() {
		return "taobao.wlb.imports.resource.transferstore.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cids", this.cids);
		txtParams.put("from_id", this.fromId);
		txtParams.put("resource_id", this.resourceId);
		txtParams.put("to_address", this.toAddress);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<WlbImportsResourceTransferstoreGetResponse> getResponseClass() {
		return WlbImportsResourceTransferstoreGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cids, "cids");
		RequestCheckUtils.checkMaxListSize(cids, 20, "cids");
		RequestCheckUtils.checkNotEmpty(resourceId, "resourceId");
	}
	

}