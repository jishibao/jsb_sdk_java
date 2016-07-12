package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SizeMappingTemplate;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.sizemapping.template.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemSizemappingTemplateUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5547281143399374288L;

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
