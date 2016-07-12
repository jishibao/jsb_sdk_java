package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SpuTemplateDO;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.product.template.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductTemplateGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8617741573422488496L;

	/** 
	 * 见SpuTemplateDO说明
	 */
	@ApiField("template")
	private SpuTemplateDO template;


	public void setTemplate(SpuTemplateDO template) {
		this.template = template;
	}
	public SpuTemplateDO getTemplate( ) {
		return this.template;
	}
	


}
