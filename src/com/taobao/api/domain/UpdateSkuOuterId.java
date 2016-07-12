package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品SKU更新OuterId时候用的数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public class UpdateSkuOuterId extends TaobaoObject {

	private static final long serialVersionUID = 5446281876776625751L;

	/**
	 * 被更新的Sku的商家外部id；如果清空，传空串
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * SKU的ID
	 */
	@ApiField("sku_id")
	private Long skuId;


	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
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
