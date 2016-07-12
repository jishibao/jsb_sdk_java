package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PackageItemItemsWlbWmsStockOutOrderConfirm extends TaobaoObject {

	private static final long serialVersionUID = 2474855538732652525L;

	/**
	 * 货品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 此包裹里该商品的数量
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;


	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

}
