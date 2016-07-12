package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.HotelTypeAddResponse;

/**
 * TOP API: taobao.hotel.type.add request
 * 
 * @author top auto create
 * @since 1.0, 2015.06.04
 */
public class HotelTypeAddRequest extends BaseTaobaoRequest<HotelTypeAddResponse> {
	
	

	/** 
	* 酒店id。必须为数字
	 */
	private Long hid;

	/** 
	* 房型名称。长度不能超过30
	 */
	private String name;

	/** 
	* 房型ID, 这是卖家自己系统中的ID
	 */
	private String outerId;

	/** 
	* 接入卖家数据主键,格式为“接入方酒店id-接入方房型id”
	 */
	private String siteParam;

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setSiteParam(String siteParam) {
		this.siteParam = siteParam;
	}

	public String getSiteParam() {
		return this.siteParam;
	}

	public String getApiMethodName() {
		return "taobao.hotel.type.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("hid", this.hid);
		txtParams.put("name", this.name);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("site_param", this.siteParam);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<HotelTypeAddResponse> getResponseClass() {
		return HotelTypeAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(hid, "hid");
		RequestCheckUtils.checkMinValue(hid, 0L, "hid");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 30, "name");
		RequestCheckUtils.checkMaxLength(siteParam, 100, "siteParam");
	}
	

}