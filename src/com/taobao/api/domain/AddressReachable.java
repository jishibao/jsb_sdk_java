package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 筛单用户输入地址结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class AddressReachable extends TaobaoObject {

	private static final long serialVersionUID = 5449723543913566391L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 标准区域编码(三级行政区编码或是四级行政区)，可以通过taobao.areas.get获取，如北京市朝阳区为110105
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 物流公司编码ID，可以从这个接口获取所有物流公司的标准编码taobao.logistics.companies.get，可以传入多个值，以英文逗号分隔，如“1000000952,1000000953”
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 服务对应的数字编码，如揽派范围对应88
	 */
	@ApiField("service_type")
	private Long serviceType;

	/**
	 * 发货地，标准区域编码(四级行政)，可以通过taobao.areas.get获取，如浙江省杭州市余杭区闲林街道为 330110011
	 */
	@ApiField("source_area_code")
	private String sourceAreaCode;


	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Long getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public String getSourceAreaCode() {
		return this.sourceAreaCode;
	}
	public void setSourceAreaCode(String sourceAreaCode) {
		this.sourceAreaCode = sourceAreaCode;
	}

}
