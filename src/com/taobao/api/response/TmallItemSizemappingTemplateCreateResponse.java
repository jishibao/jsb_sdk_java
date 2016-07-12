package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SizeMappingTemplate;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.sizemapping.template.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemSizemappingTemplateCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4737196582829162334L;

	/** 
	 * 尺码表模板
	 */
	@ApiField("size_mapping_template")
	private SizeMappingTemplate sizeMappingTemplate;


	public void setSizeMappingTemplate(SizeMappingTemplate sizeMappingTemplate) {
		this.sizeMappingTemplate = sizeMappingTemplate;
	}
	public SizeMappingTemplate getSizeMappingTemplate( ) {
		return this.sizeMappingTemplate;
	}
	


}
