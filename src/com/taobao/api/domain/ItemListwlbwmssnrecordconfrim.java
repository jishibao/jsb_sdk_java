package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class ItemListwlbwmssnrecordconfrim extends TaobaoObject {

	private static final long serialVersionUID = 3694477973988459445L;

	/**
	 * 商品信息
	 */
	@ApiField("sn_item")
	private SnItemwlbwmssnrecordconfrim snItem;


	public SnItemwlbwmssnrecordconfrim getSnItem() {
		return this.snItem;
	}
	public void setSnItem(SnItemwlbwmssnrecordconfrim snItem) {
		this.snItem = snItem;
	}

}
