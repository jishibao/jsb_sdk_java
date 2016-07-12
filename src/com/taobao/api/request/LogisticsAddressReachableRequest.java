package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.LogisticsAddressReachableResponse;

/**
 * TOP API: taobao.logistics.address.reachable request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.16
 */
public class LogisticsAddressReachableRequest extends BaseTaobaoRequest<LogisticsAddressReachableResponse> {
	
	

	/** 
	* 详细地址
	 */
	private String address;

	/** 
	* 标准区域编码(三级行政区编码或是四级行政区)，可以通过taobao.areas.get获取，如北京市朝阳区为110105
	 */
	private String areaCode;

	/** 
	* 物流公司编码ID，可以从这个接口获取所有物流公司的标准编码taobao.logistics.companies.get，可以传入多个值，以英文逗号分隔，如“1000000952,1000000953”
	 */
	private String partnerIds;

	/** 
	* 服务对应的数字编码，如揽派范围对应88
	 */
	private Long serviceType;

	/** 
	* 发货地，标准区域编码(四级行政)，可以通过taobao.areas.get获取，如浙江省杭州市余杭区闲林街道为 330110011
	 */
	private String sourceAreaCode;

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setPartnerIds(String partnerIds) {
		this.partnerIds = partnerIds;
	}

	public String getPartnerIds() {
		return this.partnerIds;
	}

	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public Long getServiceType() {
		return this.serviceType;
	}

	public void setSourceAreaCode(String sourceAreaCode) {
		this.sourceAreaCode = sourceAreaCode;
	}

	public String getSourceAreaCode() {
		return this.sourceAreaCode;
	}

	public String getApiMethodName() {
		return "taobao.logistics.address.reachable";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("address", this.address);
		txtParams.put("area_code", this.areaCode);
		txtParams.put("partner_ids", this.partnerIds);
		txtParams.put("service_type", this.serviceType);
		txtParams.put("source_area_code", this.sourceAreaCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LogisticsAddressReachableResponse> getResponseClass() {
		return LogisticsAddressReachableResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(partnerIds, "partnerIds");
		RequestCheckUtils.checkNotEmpty(serviceType, "serviceType");
	}
	

}