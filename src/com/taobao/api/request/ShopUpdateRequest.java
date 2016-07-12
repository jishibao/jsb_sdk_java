package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ShopUpdateResponse;

/**
 * TOP API: taobao.shop.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.21
 */
public class ShopUpdateRequest extends BaseTaobaoRequest<ShopUpdateResponse> {
	
	

	/** 
	* 店铺公告。不超过1024个字符
	 */
	private String bulletin;

	/** 
	* 店铺描述。10～2000个字符以内
	 */
	private String desc;

	/** 
	* 店铺标题。不超过30个字符；过滤敏感词，如淘咖啡、阿里巴巴等。title, bulletin和desc至少必须传一个
	 */
	private String title;

	public void setBulletin(String bulletin) {
		this.bulletin = bulletin;
	}

	public String getBulletin() {
		return this.bulletin;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public String getApiMethodName() {
		return "taobao.shop.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("bulletin", this.bulletin);
		txtParams.put("desc", this.desc);
		txtParams.put("title", this.title);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ShopUpdateResponse> getResponseClass() {
		return ShopUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}