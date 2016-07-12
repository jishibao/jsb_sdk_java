package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品资料回告
 *
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsSkuInfoConfirm extends TaobaoObject {

	private static final long serialVersionUID = 3667639781498581762L;

	/**
	 * 条形码，多条码请用”；”分隔
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * 毛重，单位克
	 */
	@ApiField("gross_weight")
	private Long grossWeight;

	/**
	 * 高度，单位厘米
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 后端商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 长度，单位厘米
	 */
	@ApiField("length")
	private Long length;

	/**
	 * 净重，单位克
	 */
	@ApiField("net_weight")
	private Long netWeight;

	/**
	 * 体积，单位立方厘米
	 */
	@ApiField("volume")
	private Long volume;

	/**
	 * 宽度，单位厘米
	 */
	@ApiField("width")
	private Long width;


	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Long getGrossWeight() {
		return this.grossWeight;
	}
	public void setGrossWeight(Long grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getLength() {
		return this.length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	public Long getNetWeight() {
		return this.netWeight;
	}
	public void setNetWeight(Long netWeight) {
		this.netWeight = netWeight;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
