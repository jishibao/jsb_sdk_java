package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.pictures.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PicturePicturesCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6412153186275173138L;

	/** 
	 * 查询的文件总数
	 */
	@ApiField("totals")
	private Long totals;


	public void setTotals(Long totals) {
		this.totals = totals;
	}
	public Long getTotals( ) {
		return this.totals;
	}
	


}
