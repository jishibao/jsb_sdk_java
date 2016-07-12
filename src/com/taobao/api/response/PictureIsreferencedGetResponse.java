package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.isreferenced.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureIsreferencedGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1291579726286845138L;

	/** 
	 * 图片是否被引用
	 */
	@ApiField("is_referenced")
	private Boolean isReferenced;


	public void setIsReferenced(Boolean isReferenced) {
		this.isReferenced = isReferenced;
	}
	public Boolean getIsReferenced( ) {
		return this.isReferenced;
	}
	


}
