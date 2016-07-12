package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.sizemapping.template.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemSizemappingTemplateDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3599983953351498617L;

	/** 
	 * 尺码表模板ID
	 */
	@ApiField("template_id")
	private Long templateId;


	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}
	public Long getTemplateId( ) {
		return this.templateId;
	}
	


}
