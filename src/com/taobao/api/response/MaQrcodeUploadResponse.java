package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TopResultCode;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ma.qrcode.upload response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class MaQrcodeUploadResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8797234381659347143L;

	/** 
	 * 图片链接
	 */
	@ApiField("img_url")
	private String imgUrl;

	/** 
	 * 上传二维码图片是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 出错code,只有is_success=false才有值
	 */
	@ApiField("reult_code")
	private TopResultCode reultCode;


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgUrl( ) {
		return this.imgUrl;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setReultCode(TopResultCode reultCode) {
		this.reultCode = reultCode;
	}
	public TopResultCode getReultCode( ) {
		return this.reultCode;
	}
	


}
