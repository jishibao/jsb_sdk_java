package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemIncrementUpdateSchemaGetResponse;

/**
 * TOP API: tmall.item.increment.update.schema.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.08.03
 */
public class TmallItemIncrementUpdateSchemaGetRequest extends BaseTaobaoRequest<TmallItemIncrementUpdateSchemaGetResponse> {
	
	

	/** 
	* 需要编辑的商品ID
	 */
	private Long itemId;

	/** 
	* 如果入参xml_data指定了更新的字段，则只返回指定字段的规则（ISV如果功能性很强，如明确更新Title，请拼装好此字段以提升API整体性能）
	 */
	private String xmlData;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	public String getXmlData() {
		return this.xmlData;
	}

	public String getApiMethodName() {
		return "tmall.item.increment.update.schema.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("xml_data", this.xmlData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemIncrementUpdateSchemaGetResponse> getResponseClass() {
		return TmallItemIncrementUpdateSchemaGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}