package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 普通二维码样式参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public class QrCodeStyle extends TaobaoObject {

	private static final long serialVersionUID = 5281988299695863124L;

	/**
	 * 可选参数，二维背景色颜色值，接入业务点配置为准，未配置，默认为白
	 */
	@ApiField("bg_color")
	private Long bgColor;

	/**
	 * 可选参数，二维码深色点颜色值，接入业务点配置为准，未配置，默认为黑
	 */
	@ApiField("color")
	private Long color;

	/**
	 * 可选参数，二维码纠错级别 0=~7%,1=~15%,2=~25%,3=~30%
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 可选参数，logo的淘宝tfs地址，默认无
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 可选参数，二维码的边框，默认大小1个单位点，便于扫码
	 */
	@ApiField("margin")
	private Long margin;

	/**
	 * 可选参数，二维码大小，值60～600，默认185pix
	 */
	@ApiField("size")
	private Long size;


	public Long getBgColor() {
		return this.bgColor;
	}
	public void setBgColor(Long bgColor) {
		this.bgColor = bgColor;
	}

	public Long getColor() {
		return this.color;
	}
	public void setColor(Long color) {
		this.color = color;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Long getMargin() {
		return this.margin;
	}
	public void setMargin(Long margin) {
		this.margin = margin;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

}
