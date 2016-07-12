package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 子商品
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Destitemwlbwmsskucombinationcreateupdate extends TaobaoObject {

	private static final long serialVersionUID = 2145848719539117919L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;


	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
