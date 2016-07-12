package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.SellercatsListAddResponse;

/**
 * TOP API: taobao.sellercats.list.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.11
 */
public class SellercatsListAddRequest extends BaseTaobaoRequest<SellercatsListAddResponse> {
	
	

	/** 
	* 卖家自定义类目名称。不超过20个字符
	 */
	private String name;

	/** 
	* 父类目编号，如果类目为店铺下的一级类目：值等于0，如果类目为子类目，调用获取taobao.sellercats.list.get父类目编号
	 */
	private Long parentCid;

	/** 
	* 链接图片URL地址。(绝对地址，格式：http://host/image_path)
	 */
	private String pictUrl;

	/** 
	* 该类目在页面上的排序位置,取值范围:大于零的整数
	 */
	private Long sortOrder;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setParentCid(Long parentCid) {
		this.parentCid = parentCid;
	}

	public Long getParentCid() {
		return this.parentCid;
	}

	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}

	public String getPictUrl() {
		return this.pictUrl;
	}

	public void setSortOrder(Long sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getSortOrder() {
		return this.sortOrder;
	}

	public String getApiMethodName() {
		return "taobao.sellercats.list.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("name", this.name);
		txtParams.put("parent_cid", this.parentCid);
		txtParams.put("pict_url", this.pictUrl);
		txtParams.put("sort_order", this.sortOrder);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SellercatsListAddResponse> getResponseClass() {
		return SellercatsListAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(name, "name");
	}
	

}