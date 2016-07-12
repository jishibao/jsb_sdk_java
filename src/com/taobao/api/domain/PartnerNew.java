package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 物流服务商信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PartnerNew extends TaobaoObject {

	private static final long serialVersionUID = 2577382649729695975L;

	/**
	 * 是否虚拟物流商
	 */
	@ApiField("is_virtual_tp")
	private Boolean isVirtualTp;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private Long serviceType;

	/**
	 * 物流商编码
	 */
	@ApiField("tp_code")
	private String tpCode;

	/**
	 * 物流商名称
	 */
	@ApiField("tp_name")
	private String tpName;


	public Boolean getIsVirtualTp() {
		return this.isVirtualTp;
	}
	public void setIsVirtualTp(Boolean isVirtualTp) {
		this.isVirtualTp = isVirtualTp;
	}

	public Long getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public String getTpCode() {
		return this.tpCode;
	}
	public void setTpCode(String tpCode) {
		this.tpCode = tpCode;
	}

	public String getTpName() {
		return this.tpName;
	}
	public void setTpName(String tpName) {
		this.tpName = tpName;
	}

}
