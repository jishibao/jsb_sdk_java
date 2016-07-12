package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 被更新SKU的发货时间
 *
 * @author top auto create
 * @since 1.0, null
 */
public class UpdateSkuShipTime extends TaobaoObject {

	private static final long serialVersionUID = 8569522695365672678L;

	/**
	 * Sku的商家外部id；如：2015_07_23_D_123
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 被更新发货时间；格式和具体设置的发货时间格式相关。绝对发货时间填写yyyy-MM-dd;相对发货时间填写数字
	 */
	@ApiField("ship_time")
	private String shipTime;

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

	public String getShipTime() {
		return this.shipTime;
	}
	public void setShipTime(String shipTime) {
		this.shipTime = shipTime;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

}
