package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.HotelGetResponse;

/**
 * TOP API: taobao.hotel.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.06.04
 */
public class HotelGetRequest extends BaseTaobaoRequest<HotelGetResponse> {
	
	

	/** 
	* true表示查询酒店审核状态，false表示查询已审核通过酒店详细信息
	 */
	private Boolean checkAudit;

	/** 
	* 要查询的酒店id。必须为数字
	 */
	private Long hid;

	/** 
	* 是否需要返回该酒店的房型列表。可选值：true，false。
	 */
	private Boolean needRoomType;

	public void setCheckAudit(Boolean checkAudit) {
		this.checkAudit = checkAudit;
	}

	public Boolean getCheckAudit() {
		return this.checkAudit;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setNeedRoomType(Boolean needRoomType) {
		this.needRoomType = needRoomType;
	}

	public Boolean getNeedRoomType() {
		return this.needRoomType;
	}

	public String getApiMethodName() {
		return "taobao.hotel.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("check_audit", this.checkAudit);
		txtParams.put("hid", this.hid);
		txtParams.put("need_room_type", this.needRoomType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<HotelGetResponse> getResponseClass() {
		return HotelGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(hid, "hid");
	}
	

}