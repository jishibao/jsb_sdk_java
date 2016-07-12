package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 产品资质认证图片信息，包括认证类型以及图片url
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CertPicInfo extends TaobaoObject {

	private static final long serialVersionUID = 6223497588889442841L;

	/**
	 * 认证类型的数值id
	 */
	@ApiField("cert_type")
	private Long certType;

	/**
	 * 认证图片的url地址
	 */
	@ApiField("pic_url")
	private String picUrl;


	public Long getCertType() {
		return this.certType;
	}
	public void setCertType(Long certType) {
		this.certType = certType;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

}
