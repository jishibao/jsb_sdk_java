package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 组合子商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Destitemlistwlbwmsskucombinationcreateupdate extends TaobaoObject {

	private static final long serialVersionUID = 3357229399172675752L;

	/**
	 * 组合子商品
	 */
	@ApiField("dest_item")
	private Destitemwlbwmsskucombinationcreateupdate destItem;


	public Destitemwlbwmsskucombinationcreateupdate getDestItem() {
		return this.destItem;
	}
	public void setDestItem(Destitemwlbwmsskucombinationcreateupdate destItem) {
		this.destItem = destItem;
	}

}
