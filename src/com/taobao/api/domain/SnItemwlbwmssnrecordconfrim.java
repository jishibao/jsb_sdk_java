package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SnItemwlbwmssnrecordconfrim extends TaobaoObject {

	private static final long serialVersionUID = 7298357188572927867L;

	/**
	 * 商家商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 菜鸟商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品序列号
	 */
	@ApiField("sn_code")
	private String snCode;


	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSnCode() {
		return this.snCode;
	}
	public void setSnCode(String snCode) {
		this.snCode = snCode;
	}

}
