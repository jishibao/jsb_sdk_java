package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class QrcodeDO extends TaobaoObject {

	private static final long serialVersionUID = 1212152597647922384L;

	/**
	 * 二维码所属渠道ID
	 */
	@ApiField("channel_id")
	private Long channelId;

	/**
	 * 二维码对应的渠道名
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 二维码的矢量图下载地址，只有设置入参need_eps为true且style不为官方模板时，才返回值
	 */
	@ApiField("eps_url")
	private String epsUrl;

	/**
	 * 二维码id
	 */
	@ApiField("qrcode_id")
	private Long qrcodeId;

	/**
	 * 二维码图片链接
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	/**
	 * 二维码的短地址，每一个原始地址都会生成一个短地址
	 */
	@ApiField("short_url")
	private String shortUrl;

	/**
	 * 二维码扫码后访问的目的地址
	 */
	@ApiField("url")
	private String url;


	public Long getChannelId() {
		return this.channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getEpsUrl() {
		return this.epsUrl;
	}
	public void setEpsUrl(String epsUrl) {
		this.epsUrl = epsUrl;
	}

	public Long getQrcodeId() {
		return this.qrcodeId;
	}
	public void setQrcodeId(Long qrcodeId) {
		this.qrcodeId = qrcodeId;
	}

	public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

	public String getShortUrl() {
		return this.shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
