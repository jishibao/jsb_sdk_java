package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 天猫商品尺码表模板
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SizeMappingTemplate extends TaobaoObject {

	private static final long serialVersionUID = 4781121472332673688L;

	/**
	 * 尺码表模板内容，格式为"尺码值:维度名称:数值,尺码值:维度名称:数值"。其中，数值的单位，长度单位为厘米（cm），体重单位为公斤（kg）。
	 */
	@ApiField("template_content")
	private String templateContent;

	/**
	 * 尺码表模板ID
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 尺码表模板名称
	 */
	@ApiField("template_name")
	private String templateName;


	public String getTemplateContent() {
		return this.templateContent;
	}
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
