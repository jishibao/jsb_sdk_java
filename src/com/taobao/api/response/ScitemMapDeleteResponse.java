package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.scitem.map.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemMapDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7191159415328991827L;

	/** 
	 * 失效条数
	 */
	@ApiField("module")
	private Long module;


	public void setModule(Long module) {
		this.module = module;
	}
	public Long getModule( ) {
		return this.module;
	}
	


}
