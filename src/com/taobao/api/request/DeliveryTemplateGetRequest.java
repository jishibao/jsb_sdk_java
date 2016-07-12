package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.DeliveryTemplateGetResponse;

/**
 * TOP API: taobao.delivery.template.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.19
 */
public class DeliveryTemplateGetRequest extends BaseTaobaoRequest<DeliveryTemplateGetResponse> {
	
	

	/** 
	* 需返回的字段列表。 <br/> 
<B>
可选值:示例中的值;各字段之间用","隔开
</B>
<br/><br/> 
<font color=blue>
template_id：查询模板ID <br/> 
template_name:查询模板名称 <br/> 
assumer：查询服务承担放 <br/> 
valuation:查询计价规则 <br/> 
supports:查询增值服务列表 <br/> 
created:查询模板创建时间 <br/> 
modified:查询修改时间<br/> 
consign_area_id:运费模板上设置的卖家发货地址最小级别ID<br/> 
address:卖家地址信息
</font>
<br/><br/> 
<font color=bule>
query_cod:查询货到付款运费信息<br/> 
query_post:查询平邮运费信息 <br/> 
query_express:查询快递公司运费信息 <br/> 
query_ems:查询EMS运费信息<br/> 
query_bzsd:查询普通保障速递运费信息<br/> 
query_wlb:查询物流宝保障速递运费信息<br/> 
query_furniture:查询家装物流运费信息
<font color=blue>
<br/><br/>
<font color=red>不能有空格</font>
	 */
	private String fields;

	/** 
	* 需要查询的运费模板ID列表
	 */
	private String templateIds;

	/** 
	* 在没有登录的情况下根据淘宝用户昵称查询指定的模板
	 */
	private String userNick;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setTemplateIds(String templateIds) {
		this.templateIds = templateIds;
	}

	public String getTemplateIds() {
		return this.templateIds;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserNick() {
		return this.userNick;
	}

	public String getApiMethodName() {
		return "taobao.delivery.template.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("template_ids", this.templateIds);
		txtParams.put("user_nick", this.userNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DeliveryTemplateGetResponse> getResponseClass() {
		return DeliveryTemplateGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
		RequestCheckUtils.checkNotEmpty(templateIds, "templateIds");
		RequestCheckUtils.checkMaxListSize(templateIds, 20, "templateIds");
	}
	

}