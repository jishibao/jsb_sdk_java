package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DeliveryTemplateDeleteResponse;

/**
 * TOP API: taobao.delivery.template.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class DeliveryTemplateDeleteRequest extends BaseTaobaoRequest<DeliveryTemplateDeleteResponse> {
	
	

	/** 
	* 运费模板ID
	 */
	private Long templateId;

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public String getApiMethodName() {
		return "taobao.delivery.template.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("template_id", this.templateId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DeliveryTemplateDeleteResponse> getResponseClass() {
		return DeliveryTemplateDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(templateId, "templateId");
	}
	

}