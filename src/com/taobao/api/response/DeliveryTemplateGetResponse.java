package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.DeliveryTemplate;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.delivery.template.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryTemplateGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2594183141764364266L;

	/** 
	 * 运费模板列表
	 */
	@ApiListField("delivery_templates")
	@ApiField("delivery_template")
	private List<DeliveryTemplate> deliveryTemplates;

	/** 
	 * 获得到符合条件的结果总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setDeliveryTemplates(List<DeliveryTemplate> deliveryTemplates) {
		this.deliveryTemplates = deliveryTemplates;
	}
	public List<DeliveryTemplate> getDeliveryTemplates( ) {
		return this.deliveryTemplates;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}
