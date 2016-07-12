package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ResourceResult;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.imports.resource.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbImportsResourceGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2274781716423744875L;

	/** 
	 * 一般进口所有服务商列表
	 */
	@ApiListField("resources")
	@ApiField("resource_result")
	private List<ResourceResult> resources;


	public void setResources(List<ResourceResult> resources) {
		this.resources = resources;
	}
	public List<ResourceResult> getResources( ) {
		return this.resources;
	}
	


}
