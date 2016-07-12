package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 更新SKU价格时候的SKU价格对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class UpdateSkuPrice extends TaobaoObject {

	private static final long serialVersionUID = 8674512452682377889L;

	/**
	 * Sku的商家外部id
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 属于这个sku的商品的价格 取值范围:0-100000000;精确到2位小数;单位:元。如:200.07，表示:200元7分。
	 */
	@ApiField("price")
	private String price;

	/**
	 * Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * SkuID
	 */
	@ApiField("sku_id")
	private Long skuId;


	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

}
