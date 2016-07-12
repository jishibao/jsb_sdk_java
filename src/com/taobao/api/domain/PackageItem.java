package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 包裹里面的商品类型
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PackageItem extends TaobaoObject {

	private static final long serialVersionUID = 4675837532676126644L;

	/**
	 * 商品数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;


	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
