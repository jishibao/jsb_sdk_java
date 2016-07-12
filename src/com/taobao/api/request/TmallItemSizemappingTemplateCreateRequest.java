package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemSizemappingTemplateCreateResponse;

/**
 * TOP API: tmall.item.sizemapping.template.create request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.23
 */
public class TmallItemSizemappingTemplateCreateRequest extends BaseTaobaoRequest<TmallItemSizemappingTemplateCreateResponse> {
	
	

	/** 
	* 尺码表模板内容，格式为"尺码值:维度名称:数值,尺码值:维度名称:数值"。其中，数值的单位，长度单位为厘米（cm），体重单位为公斤（kg）。尺码值，维度数据不能包含数字，特殊字符。数值为0-999.9的数字，且最多一位小数。
	 */
	private String templateContent;

	/** 
	* 尺码表模板名称
	 */
	private String templateName;

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

	public String getTemplateContent() {
		return this.templateContent;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public String getApiMethodName() {
		return "tmall.item.sizemapping.template.create";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("template_content", this.templateContent);
		txtParams.put("template_name", this.templateName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemSizemappingTemplateCreateResponse> getResponseClass() {
		return TmallItemSizemappingTemplateCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(templateContent, "templateContent");
		RequestCheckUtils.checkMaxLength(templateContent, 8000, "templateContent");
		RequestCheckUtils.checkNotEmpty(templateName, "templateName");
		RequestCheckUtils.checkMaxLength(templateName, 20, "templateName");
	}
	

}