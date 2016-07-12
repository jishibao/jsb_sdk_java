package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 批量更新商品/SKU发货时间的备选项
 *
 * @author top auto create
 * @since 1.0, null
 */
public class UpdateItemShipTimeOption extends TaobaoObject {

	private static final long serialVersionUID = 2387773168753468656L;

	/**
	 * 0代表清空所有发货时间数据；1代表：固定发货时间；2代表：相对发货时间
	 */
	@ApiField("ship_time_type")
	private Long shipTimeType;

	/**
	 * 更新类型，默认更新sku，0表示更新sku，1表示更新商品维度，其他值均非法
	 */
	@ApiField("update_type")
	private Long updateType;


	public Long getShipTimeType() {
		return this.shipTimeType;
	}
	public void setShipTimeType(Long shipTimeType) {
		this.shipTimeType = shipTimeType;
	}

	public Long getUpdateType() {
		return this.updateType;
	}
	public void setUpdateType(Long updateType) {
		this.updateType = updateType;
	}

}
