package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 产品资质认证文本信息，包括认证类型以及文本信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CertTxtInfo extends TaobaoObject {

	private static final long serialVersionUID = 6456263589176186125L;

	/**
	 * 认证类型的数值id
	 */
	@ApiField("cert_type")
	private Long certType;

	/**
	 * 认证文本信息
	 */
	@ApiField("text")
	private String text;


	public Long getCertType() {
		return this.certType;
	}
	public void setCertType(Long certType) {
		this.certType = certType;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
