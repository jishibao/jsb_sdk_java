package com.taobao.api.response;

import java.util.List;
import com.taobao.api.domain.LogisticsPartner;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.partners.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsPartnersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4724482695434363766L;

	/** 
	 * 查询揽送范围之内的物流公司信息
	 */
	@ApiListField("logistics_partners")
	@ApiField("logistics_partner")
	private List<LogisticsPartner> logisticsPartners;


	public void setLogisticsPartners(List<LogisticsPartner> logisticsPartners) {
		this.logisticsPartners = logisticsPartners;
	}
	public List<LogisticsPartner> getLogisticsPartners( ) {
		return this.logisticsPartners;
	}
	


}
