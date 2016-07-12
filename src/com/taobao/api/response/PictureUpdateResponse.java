package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2767825787625212964L;

	/** 
	 * 更新是否成功
	 */
	@ApiField("done")
	private Boolean done;


	public void setDone(Boolean done) {
		this.done = done;
	}
	public Boolean getDone( ) {
		return this.done;
	}
	


}
