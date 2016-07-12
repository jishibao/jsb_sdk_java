package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ModularDescInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.desc.modules.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemDescModulesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4154327516642497333L;

	/** 
	 * 返回描述模块信息
	 */
	@ApiField("modular_desc_info")
	private ModularDescInfo modularDescInfo;


	public void setModularDescInfo(ModularDescInfo modularDescInfo) {
		this.modularDescInfo = modularDescInfo;
	}
	public ModularDescInfo getModularDescInfo( ) {
		return this.modularDescInfo;
	}
	


}
