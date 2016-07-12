package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 宝贝详情页面信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemTemplate extends TaobaoObject {

	private static final long serialVersionUID = 3445837552735381936L;

	/**
	 * 用于区分宝贝模板属于内店和外店
	 */
	@ApiField("shop_type")
	private Long shopType;

	/**
	 * 宝贝模板的id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 宝贝详情模板的名称
	 */
	@ApiField("template_name")
	private String templateName;


	public Long getShopType() {
		return this.shopType;
	}
	public void setShopType(Long shopType) {
		this.shopType = shopType;
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
