package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ItemTemplate;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.templates.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemTemplatesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6677375152214757858L;

	/** 
	 * 返回宝贝模板对象。包含模板id，模板name，还有模板的类别（0表示外店，1表示内店）
	 */
	@ApiListField("item_template_list")
	@ApiField("item_template")
	private List<ItemTemplate> itemTemplateList;


	public void setItemTemplateList(List<ItemTemplate> itemTemplateList) {
		this.itemTemplateList = itemTemplateList;
	}
	public List<ItemTemplate> getItemTemplateList( ) {
		return this.itemTemplateList;
	}
	


}
