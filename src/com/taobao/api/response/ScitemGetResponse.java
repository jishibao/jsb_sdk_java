package com.taobao.api.response;

import com.taobao.api.domain.ScItem;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.scitem.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1586181287464916718L;

	/** 
	 * 后端商品
	 */
	@ApiField("sc_item")
	private ScItem scItem;


	public void setScItem(ScItem scItem) {
		this.scItem = scItem;
	}
	public ScItem getScItem( ) {
		return this.scItem;
	}
	


}
